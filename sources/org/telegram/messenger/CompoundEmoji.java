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
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.gr;
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

        public DrawableInfo(int i9, int i10, int i11) {
            if (i10 == -2) {
                this.placeholder = true;
                i10 = -1;
            }
            this.emoji = i9;
            Integer valueOf = Integer.valueOf(i9);
            this.skin = i10;
            Integer valueOf2 = Integer.valueOf(i10);
            this.place = i11;
            this.hash = Objects.hash(valueOf, valueOf2, Integer.valueOf(i11));
        }

        public static void a(DrawableInfo drawableInfo) {
            drawableInfo.lambda$load$0();
        }

        public void lambda$load$0() {
            Bitmap loadBitmap = Emoji.loadBitmap("emoji/compound/" + this.emoji + "_" + this.skin + "_" + this.place + ".png");
            if (loadBitmap != null) {
                bitmaps.put(this.hash, loadBitmap);
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
            if (bitmaps.indexOfKey(this.hash) >= 0) {
                return true;
            }
            return false;
        }

        public void load() {
            if (!isLoaded()) {
                ArrayList<Integer> arrayList = loading;
                if (!arrayList.contains(Integer.valueOf(this.hash))) {
                    arrayList.add(Integer.valueOf(this.hash));
                    Utilities.globalQueue.postRunnable(new e1(this, 0));
                }
            }
        }

        public DrawableInfo updateSkin(int i9) {
            if (this.skin == i9) {
                return this;
            }
            return new DrawableInfo(this.emoji, i9, this.place);
        }
    }

    public static String applyColor(String str, String str2) {
        String str3;
        if (isHandshake(str) == null) {
            return str;
        }
        if (str2 == null) {
            return "🤝";
        }
        if (str2.contains("\u200d")) {
            String[] split = str2.split("\u200d");
            StringBuilder sb2 = new StringBuilder("🫱");
            String str4 = "";
            if (split.length < 1) {
                str3 = "";
            } else {
                str3 = split[0];
            }
            sb2.append(str3);
            sb2.append("\u200d🫲");
            if (split.length >= 2) {
                str4 = split[1];
            }
            sb2.append(str4);
            return sb2.toString();
        }
        return "🤝".concat(str2);
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
        if (getCompoundEmojiDrawable(str) != null) {
            return true;
        }
        return false;
    }

    public static Pair<Integer, Integer> isHandshake(String str) {
        int i9;
        String[] split;
        int i10 = -1;
        if (str.startsWith("🤝")) {
            if (str.length() != 2) {
                if (str.length() == 4) {
                    i9 = getSkinTone(str);
                    if (i9 >= 0) {
                        i10 = i9;
                    }
                    split = str.split("\u200d");
                    if (split.length != 2 && split[0].startsWith("🫱") && split[1].startsWith("🫲")) {
                        if (split[0].length() == 2 || (split[0].length() == 4 && (i9 = getSkinTone(split[0])) >= 0)) {
                            if (split[1].length() == 2 || (split[1].length() == 4 && (i10 = getSkinTone(split[1])) >= 0)) {
                                return new Pair<>(Integer.valueOf(i9), Integer.valueOf(i10));
                            }
                            return null;
                        }
                        return null;
                    }
                    return null;
                }
            }
            return new Pair<>(Integer.valueOf(i10), Integer.valueOf(i10));
        }
        i9 = -1;
        split = str.split("\u200d");
        return split.length != 2 ? null : null;
    }

    public static void setPlaceholderColor(int i9) {
        placeholderPaint.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
    }

    public static CompoundEmojiDrawable getCompoundEmojiDrawable(String str, Integer num, Integer num2) {
        CompoundEmojiDrawable compoundEmojiDrawable = null;
        if (str == null) {
            return null;
        }
        Pair<Integer, Integer> isHandshake = isHandshake(str);
        if (isHandshake != null) {
            if (num == null) {
                num = (Integer) isHandshake.first;
            }
            DrawableInfo drawableInfo = new DrawableInfo(0, num.intValue(), 0);
            if (num2 == null) {
                num2 = (Integer) isHandshake.second;
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

        public static void a(CompoundEmojiDrawable compoundEmojiDrawable) {
            compoundEmojiDrawable.invalidate();
        }

        private void drawDrawableInfo(Canvas canvas, DrawableInfo drawableInfo, Rect rect2, float f10) {
            Paint paint2;
            int i9;
            Bitmap bitmap = drawableInfo.getBitmap();
            if (bitmap != null) {
                if (drawableInfo.placeholder) {
                    paint2 = CompoundEmoji.placeholderPaint;
                } else {
                    paint2 = paint;
                }
                int i10 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
                if (i10 < 0) {
                    i9 = paint2.getAlpha();
                    paint2.setAlpha((int) (i9 * f10));
                } else {
                    i9 = 255;
                }
                canvas.drawBitmap(bitmap, (Rect) null, rect2, paint2);
                if (i10 < 0) {
                    paint2.setAlpha(i9);
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
            Rect bounds;
            if (!isLoaded()) {
                preload();
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            if (this.fullSize) {
                bounds = getDrawRect();
            } else {
                bounds = getBounds();
            }
            if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
                if (this.newLeft != null) {
                    if (this.leftUpdateT == null) {
                        this.leftUpdateT = new org.telegram.ui.Components.y5(0.0f, new e1(this, 16), 0L, 320L, gr.f28845g);
                    }
                    float d = this.leftUpdateT.d(1.0f, false);
                    drawDrawableInfo(canvas, this.newLeft, bounds, Math.min(1.0f, d * 1.5f));
                    drawDrawableInfo(canvas, this.left, bounds, 1.0f - d);
                    if (d >= 1.0f) {
                        this.left = this.newLeft;
                        this.newLeft = null;
                    }
                } else {
                    drawDrawableInfo(canvas, this.left, bounds, 1.0f);
                }
                if (this.newRight != null) {
                    if (this.rightUpdateT == null) {
                        this.rightUpdateT = new org.telegram.ui.Components.y5(0.0f, new e1(this, 16), 0L, 320L, gr.f28845g);
                    }
                    float d9 = this.rightUpdateT.d(1.0f, false);
                    drawDrawableInfo(canvas, this.newRight, bounds, Math.min(1.0f, 1.5f * d9));
                    drawDrawableInfo(canvas, this.right, bounds, 1.0f - d9);
                    if (d9 >= 1.0f) {
                        this.right = this.newRight;
                        this.newRight = null;
                        return;
                    }
                    return;
                }
                drawDrawableInfo(canvas, this.right, bounds, 1.0f);
            }
        }

        public Rect getDrawRect() {
            int i9;
            int i10;
            int i11;
            int i12;
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Rect rect2 = rect;
            boolean z10 = this.fullSize;
            if (z10) {
                i9 = Emoji.bigImgSize;
            } else {
                i9 = Emoji.drawImgSize;
            }
            rect2.left = centerX - (i9 / 2);
            Rect rect3 = rect;
            if (z10) {
                i10 = Emoji.bigImgSize;
            } else {
                i10 = Emoji.drawImgSize;
            }
            rect3.right = (i10 / 2) + centerX;
            Rect rect4 = rect;
            if (z10) {
                i11 = Emoji.bigImgSize;
            } else {
                i11 = Emoji.drawImgSize;
            }
            rect4.top = centerY - (i11 / 2);
            Rect rect5 = rect;
            if (z10) {
                i12 = Emoji.bigImgSize;
            } else {
                i12 = Emoji.drawImgSize;
            }
            rect5.bottom = (i12 / 2) + centerY;
            return rect;
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public boolean isLoaded() {
            if (this.left.isLoaded() && this.right.isLoaded()) {
                return true;
            }
            return false;
        }

        @Override
        public void preload() {
            if (!isLoaded()) {
                this.left.load();
                this.right.load();
            }
        }

        @Override
        public void setAlpha(int i9) {
            paint.setAlpha(i9);
        }

        public void update(int i9, int i10) {
            if (this.left.skin != i9) {
                DrawableInfo drawableInfo = this.newLeft;
                if (drawableInfo != null) {
                    this.left = drawableInfo;
                }
                this.newLeft = this.left.updateSkin(i9);
                org.telegram.ui.Components.y5 y5Var = this.leftUpdateT;
                if (y5Var != null) {
                    y5Var.d(0.0f, true);
                }
            }
            if (this.right.skin != i10) {
                DrawableInfo drawableInfo2 = this.newRight;
                if (drawableInfo2 != null) {
                    this.right = drawableInfo2;
                }
                this.newRight = this.right.updateSkin(i10);
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
