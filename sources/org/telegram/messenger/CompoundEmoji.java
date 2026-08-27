package org.telegram.messenger;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.Pair;
import android.util.SparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.ui.Components.er;

public class CompoundEmoji {
    public static List<String> skinTones = Arrays.asList("🏻", "🏼", "🏽", "🏾", "🏿");
    private static Paint placeholderPaint = new Paint(2);

    public static class DrawableInfo {
        private static final SparseArray<Bitmap> bitmaps = new SparseArray<>();
        private static final ArrayList<Integer> loading = new ArrayList<>();
        int emoji;
        int hash;
        int place;
        boolean placeholder;
        int skin;

        public DrawableInfo(int i10, int i11, int i12) {
            if (i11 == -2) {
                this.placeholder = true;
                i11 = -1;
            }
            this.emoji = i10;
            Integer numValueOf = Integer.valueOf(i10);
            this.skin = i11;
            Integer numValueOf2 = Integer.valueOf(i11);
            this.place = i12;
            this.hash = Objects.hash(numValueOf, numValueOf2, Integer.valueOf(i12));
        }

        public void lambda$load$0() {
            Bitmap bitmapLoadBitmap = Emoji.loadBitmap("emoji/compound/" + this.emoji + "_" + this.skin + "_" + this.place + ".png");
            if (bitmapLoadBitmap != null) {
                bitmaps.put(this.hash, bitmapLoadBitmap);
                Runnable runnable = Emoji.invalidateUiRunnable;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
            }
            loading.remove(Integer.valueOf(this.hash));
        }

        public Bitmap getBitmap() {
            return bitmaps.get(this.hash);
        }

        public int hashCode() {
            return this.hash;
        }

        public boolean isLoaded() {
            return bitmaps.indexOfKey(this.hash) >= 0;
        }

        public void load() {
            if (isLoaded()) {
                return;
            }
            ArrayList<Integer> arrayList = loading;
            if (arrayList.contains(Integer.valueOf(this.hash))) {
                return;
            }
            arrayList.add(Integer.valueOf(this.hash));
            Utilities.globalQueue.postRunnable(new d1(this, 0));
        }

        public DrawableInfo updateSkin(int i10) {
            return this.skin == i10 ? this : new DrawableInfo(this.emoji, i10, this.place);
        }
    }

    public static String applyColor(String str, String str2) {
        if (isHandshake(str) == null) {
            return str;
        }
        if (str2 == null) {
            return "🤝";
        }
        if (!str2.contains("\u200d")) {
            return "🤝".concat(str2);
        }
        String[] strArrSplit = str2.split("\u200d");
        StringBuilder sb2 = new StringBuilder("🫱");
        sb2.append(strArrSplit.length >= 1 ? strArrSplit[0] : "");
        sb2.append("\u200d🫲");
        sb2.append(strArrSplit.length >= 2 ? strArrSplit[1] : "");
        return sb2.toString();
    }

    public static CompoundEmojiDrawable getCompoundEmojiDrawable(String str) {
        return getCompoundEmojiDrawable(str, null, null);
    }

    public static int getSkinTone(String str) {
        if (str == null) {
            return -1;
        }
        return skinTones.indexOf(str.substring(str.length() - 2));
    }

    public static boolean isCompound(String str) {
        return getCompoundEmojiDrawable(str) != null;
    }

    public static Pair<Integer, Integer> isHandshake(String str) {
        int skinTone;
        int skinTone2 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    skinTone = getSkinTone(str);
                    skinTone2 = skinTone >= 0 ? skinTone : -1;
                } else {
                    skinTone = -1;
                }
            }
            return new Pair<>(Integer.valueOf(skinTone2), Integer.valueOf(skinTone2));
        }
        skinTone = -1;
        String[] strArrSplit = str.split("\u200d");
        if (strArrSplit.length != 2 || !strArrSplit[0].startsWith("🫱") || !strArrSplit[1].startsWith("🫲")) {
            return null;
        }
        if (strArrSplit[0].length() != 2 && (strArrSplit[0].length() != 4 || (skinTone = getSkinTone(strArrSplit[0])) < 0)) {
            return null;
        }
        if (strArrSplit[1].length() == 2 || (strArrSplit[1].length() == 4 && (skinTone2 = getSkinTone(strArrSplit[1])) >= 0)) {
            return new Pair<>(Integer.valueOf(skinTone), Integer.valueOf(skinTone2));
        }
        return null;
    }

    public static void setPlaceholderColor(int i10) {
        placeholderPaint.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
    }

    public static CompoundEmojiDrawable getCompoundEmojiDrawable(String str, Integer num, Integer num2) {
        CompoundEmojiDrawable compoundEmojiDrawable = null;
        if (str == null) {
            return null;
        }
        Pair<Integer, Integer> pairIsHandshake = isHandshake(str);
        if (pairIsHandshake != null) {
            if (num == null) {
                num = (Integer) pairIsHandshake.first;
            }
            DrawableInfo drawableInfo = new DrawableInfo(0, num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) pairIsHandshake.second;
            }
            compoundEmojiDrawable = new CompoundEmojiDrawable(drawableInfo, new DrawableInfo(0, num2.intValue(), 1));
        }
        return compoundEmojiDrawable;
    }

    public static class CompoundEmojiDrawable extends Emoji.EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo left;
        private org.telegram.ui.Components.y5 leftUpdateT;
        private DrawableInfo newLeft;
        private DrawableInfo newRight;
        private View parent;
        private DrawableInfo right;
        private org.telegram.ui.Components.y5 rightUpdateT;

        public CompoundEmojiDrawable(DrawableInfo drawableInfo, DrawableInfo drawableInfo2) {
            this.left = drawableInfo;
            this.right = drawableInfo2;
        }

        private void drawDrawableInfo(Canvas canvas, DrawableInfo drawableInfo, Rect rect2, float f10) {
            int alpha;
            Bitmap bitmap = drawableInfo.getBitmap();
            if (bitmap != null) {
                Paint paint2 = drawableInfo.placeholder ? CompoundEmoji.placeholderPaint : paint;
                if (f10 < 1.0f) {
                    alpha = paint2.getAlpha();
                    paint2.setAlpha((int) (alpha * f10));
                } else {
                    alpha = 255;
                }
                canvas.drawBitmap(bitmap, (Rect) null, rect2, paint2);
                if (f10 < 1.0f) {
                    paint2.setAlpha(alpha);
                }
            }
        }

        public void invalidate() {
            View view = this.parent;
            if (view != null) {
                view.invalidate();
            }
            invalidateSelf();
        }

        @Override
        public void draw(Canvas canvas) {
            if (!isLoaded()) {
                preload();
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            Rect drawRect = this.fullSize ? getDrawRect() : getBounds();
            if (canvas.quickReject(drawRect.left, drawRect.top, drawRect.right, drawRect.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.newLeft != null) {
                if (this.leftUpdateT == null) {
                    this.leftUpdateT = new org.telegram.ui.Components.y5(0.0f, new d1(this, 16), 0L, 320L, er.f28123g);
                }
                float fD = this.leftUpdateT.d(1.0f, false);
                drawDrawableInfo(canvas, this.newLeft, drawRect, Math.min(1.0f, fD * 1.5f));
                drawDrawableInfo(canvas, this.left, drawRect, 1.0f - fD);
                if (fD >= 1.0f) {
                    this.left = this.newLeft;
                    this.newLeft = null;
                }
            } else {
                drawDrawableInfo(canvas, this.left, drawRect, 1.0f);
            }
            if (this.newRight == null) {
                drawDrawableInfo(canvas, this.right, drawRect, 1.0f);
                return;
            }
            if (this.rightUpdateT == null) {
                this.rightUpdateT = new org.telegram.ui.Components.y5(0.0f, new d1(this, 16), 0L, 320L, er.f28123g);
            }
            float fD2 = this.rightUpdateT.d(1.0f, false);
            drawDrawableInfo(canvas, this.newRight, drawRect, Math.min(1.0f, 1.5f * fD2));
            drawDrawableInfo(canvas, this.right, drawRect, 1.0f - fD2);
            if (fD2 >= 1.0f) {
                this.right = this.newRight;
                this.newRight = null;
            }
        }

        public Rect getDrawRect() {
            Rect bounds = getBounds();
            int iCenterX = bounds.centerX();
            int iCenterY = bounds.centerY();
            Rect rect2 = rect;
            boolean z10 = this.fullSize;
            rect2.left = iCenterX - ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.right = ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2) + iCenterX;
            rect.top = iCenterY - ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.bottom = ((z10 ? Emoji.bigImgSize : Emoji.drawImgSize) / 2) + iCenterY;
            return rect;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public boolean isLoaded() {
            return this.left.isLoaded() && this.right.isLoaded();
        }

        @Override
        public void preload() {
            if (isLoaded()) {
                return;
            }
            this.left.load();
            this.right.load();
        }

        @Override
        public void setAlpha(int i10) {
            paint.setAlpha(i10);
        }

        public void update(int i10, int i11) {
            if (this.left.skin != i10) {
                DrawableInfo drawableInfo = this.newLeft;
                if (drawableInfo != null) {
                    this.left = drawableInfo;
                }
                this.newLeft = this.left.updateSkin(i10);
                org.telegram.ui.Components.y5 y5Var = this.leftUpdateT;
                if (y5Var != null) {
                    y5Var.d(0.0f, true);
                }
            }
            if (this.right.skin != i11) {
                DrawableInfo drawableInfo2 = this.newRight;
                if (drawableInfo2 != null) {
                    this.right = drawableInfo2;
                }
                this.newRight = this.right.updateSkin(i11);
                org.telegram.ui.Components.y5 y5Var2 = this.rightUpdateT;
                if (y5Var2 != null) {
                    y5Var2.d(0.0f, true);
                }
            }
            invalidate();
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
