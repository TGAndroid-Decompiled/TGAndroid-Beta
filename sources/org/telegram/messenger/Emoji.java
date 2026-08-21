package org.telegram.messenger;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.ColoredImageSpan;

public class Emoji {
    private static final String[] DEFAULT_RECENT;
    private static final int MAX_RECENT_EMOJI_COUNT = 48;
    public static int bigImgSize;
    public static int drawImgSize;
    private static SparseIntArray emojiAlphaMasks;
    private static Bitmap[][] emojiBmp;
    public static final HashMap<String, String> emojiColor;
    private static final int[] emojiCounts;
    public static boolean emojiDrawingUseAlpha;
    public static float emojiDrawingYOffset;
    public static final HashMap<String, Integer> emojiUseHistory;
    public static final Runnable invalidateUiRunnable;
    private static boolean[][] loadingEmoji;
    public static Paint placeholderPaint;
    public static final ArrayList<String> recentEmoji;
    private static boolean recentEmojiLoaded;
    private static final HashMap<CharSequence, DrawableInfo> rects = new HashMap<>();
    private static boolean inited = false;

    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = 268435456;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    static {
        String[][] strArr = EmojiData.data;
        emojiCounts = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        emojiBmp = new Bitmap[8][];
        loadingEmoji = new boolean[8][];
        emojiUseHistory = new HashMap<>();
        recentEmoji = new ArrayList<>();
        emojiColor = new HashMap<>();
        invalidateUiRunnable = new Runnable() {
            @Override
            public final void run() {
                NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.emojiLoaded, new Object[0]);
            }
        };
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        bigImgSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 34.0f);
        int i = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i >= bitmapArr.length) {
                break;
            }
            int i2 = emojiCounts[i];
            bitmapArr[i] = new Bitmap[i2];
            loadingEmoji[i] = new boolean[i2];
            i++;
        }
        for (int i3 = 0; i3 < EmojiData.data.length; i3++) {
            int i4 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i3];
                if (i4 < strArr2.length) {
                    rects.put(strArr2[i4], new DrawableInfo((byte) i3, (short) i4, i4));
                    i4++;
                }
            }
        }
        Paint paint = new Paint();
        placeholderPaint = paint;
        paint.setColor(0);
    }

    public static void preloadEmoji(CharSequence charSequence) {
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
    }

    public static void loadEmoji(final byte b, final short s) {
        if (emojiBmp[b][s] == null) {
            boolean[] zArr = loadingEmoji[b];
            if (zArr[s]) {
                return;
            }
            zArr[s] = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    Emoji.$r8$lambda$GJCd0wAjo_k4MPoC4ervNAm2qe0(b, s);
                }
            });
        }
    }

    public static void $r8$lambda$GJCd0wAjo_k4MPoC4ervNAm2qe0(byte b, short s) {
        StringBuilder sb = new StringBuilder();
        sb.append("emoji/");
        Locale locale = Locale.US;
        sb.append(String.format(locale, "%d_%d.png", Byte.valueOf(b), Short.valueOf(s)));
        Bitmap bitmapLoadBitmap = loadBitmap(sb.toString());
        try {
            if (emojiAlphaMasks == null) {
                emojiAlphaMasks = loadEmojiAlphaMasks();
            }
            SparseIntArray sparseIntArray = emojiAlphaMasks;
            int i = sparseIntArray != null ? sparseIntArray.get((b * 4096) + s, -1) : -1;
            if (bitmapLoadBitmap != null && i != -1) {
                Bitmap bitmapLoadBitmap2 = loadBitmap("emoji/masks/" + String.format(locale, "%d.png", Integer.valueOf(i)));
                if (bitmapLoadBitmap2 != null) {
                    int width = bitmapLoadBitmap.getWidth();
                    int height = bitmapLoadBitmap.getHeight();
                    int i2 = width * height;
                    int[] iArr = new int[i2];
                    int[] iArr2 = new int[i2];
                    bitmapLoadBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapLoadBitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
                    bitmapLoadBitmap2.recycle();
                    for (int i3 = 0; i3 < i2; i3++) {
                        iArr[i3] = (iArr[i3] & 16777215) | ((iArr2[i3] & 255) << 24);
                    }
                    bitmapLoadBitmap.recycle();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                        bitmapLoadBitmap = bitmapCreateBitmap;
                    } catch (Exception e) {
                        e = e;
                        bitmapLoadBitmap = bitmapCreateBitmap;
                        FileLog.e(e);
                    }
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (bitmapLoadBitmap != null) {
            emojiBmp[b][s] = bitmapLoadBitmap;
            Runnable runnable = invalidateUiRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }
        loadingEmoji[b][s] = false;
    }

    private static SparseIntArray loadEmojiAlphaMasks() {
        try {
            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("emoji/metadata.bin");
            try {
                ArrayList arrayList = new ArrayList();
                byte[] bArr = new byte[8192];
                int i = 0;
                while (true) {
                    int i2 = inputStreamOpen.read(bArr);
                    if (i2 == -1) {
                        break;
                    }
                    byte[] bArr2 = new byte[i2];
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                    arrayList.add(bArr2);
                    i += i2;
                    FileLog.e(e);
                    return null;
                }
                byte[] bArr3 = new byte[i];
                int size = arrayList.size();
                int i3 = 0;
                int length = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    byte[] bArr4 = (byte[]) obj;
                    System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                    length += bArr4.length;
                }
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                int i4 = i / 4;
                SparseIntArray sparseIntArray = new SparseIntArray(i4);
                for (int i5 = 0; i5 < i4; i5++) {
                    sparseIntArray.put(byteBufferOrder.getShort() & 65535, 65535 & byteBufferOrder.getShort());
                }
                inputStreamOpen.close();
                return sparseIntArray;
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Bitmap loadBitmap(String str) {
        Bitmap bitmapDecodeStream;
        try {
            int i = AndroidUtilities.density <= 1.0f ? 2 : 1;
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i;
                bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen, null, options);
                try {
                    inputStreamOpen.close();
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    th = th;
                    FileLog.e(th);
                    return bitmapDecodeStream;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmapDecodeStream = null;
            }
        } catch (Throwable th3) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error loading emoji", th3);
            }
            return null;
        }
    }

    public static void invalidateAll(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                invalidateAll(viewGroup.getChildAt(i));
            }
            return;
        }
        if (view instanceof TextView) {
            view.invalidate();
        }
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt < 55356 || cCharAt > 55358) {
                if (cCharAt == 8419) {
                    return str;
                }
                if (cCharAt >= 8252 && cCharAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(cCharAt))) {
                    StringBuilder sb = new StringBuilder();
                    i++;
                    sb.append(str.substring(0, i));
                    sb.append("️");
                    sb.append(str.substring(i));
                    str = sb.toString();
                    length++;
                }
            } else if (cCharAt != 55356 || i >= length - 1) {
                i++;
            } else {
                int i2 = i + 1;
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 == 56879 || cCharAt2 == 56324 || cCharAt2 == 56858 || cCharAt2 == 56703) {
                    StringBuilder sb2 = new StringBuilder();
                    i += 2;
                    sb2.append(str.substring(0, i));
                    sb2.append("️");
                    sb2.append(str.substring(i));
                    str = sb2.toString();
                    length++;
                } else {
                    i = i2;
                }
            }
            i++;
        }
        return str;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
            int i = drawImgSize;
            simpleEmojiDrawable.setBounds(0, 0, i, i);
            return simpleEmojiDrawable;
        }
        if (charSequence == null || (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) == null) {
            return null;
        }
        int i2 = drawImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i2, i2);
        return compoundEmojiDrawable;
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    private static DrawableInfo getDrawableInfo(CharSequence charSequence) {
        CharSequence charSequence2;
        if (endsWithRightArrow(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap<CharSequence, DrawableInfo> map = rects;
        DrawableInfo drawableInfo = map.get(charSequence);
        return (drawableInfo != null || (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) == null) ? drawableInfo : map.get(charSequence2);
    }

    public static boolean isValidEmoji(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap<CharSequence, DrawableInfo> map = rects;
        DrawableInfo drawableInfo = map.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            drawableInfo = map.get(charSequence2);
        }
        return drawableInfo != null;
    }

    public static Drawable getEmojiBigDrawable(String str) {
        CharSequence charSequence;
        EmojiDrawable compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(str);
        if (compoundEmojiDrawable != null) {
            int i = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i, i);
        } else {
            compoundEmojiDrawable = null;
        }
        if (compoundEmojiDrawable == null) {
            compoundEmojiDrawable = getEmojiDrawable(str);
        }
        if (compoundEmojiDrawable == null && (charSequence = EmojiData.emojiAliasMap.get(str)) != null) {
            compoundEmojiDrawable = getEmojiDrawable(charSequence);
        }
        if (compoundEmojiDrawable == null) {
            return null;
        }
        int i2 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i2, i2);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static class SimpleEmojiDrawable extends EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo info;
        private boolean invert;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public SimpleEmojiDrawable(DrawableInfo drawableInfo, boolean z) {
            this.info = drawableInfo;
            this.invert = z;
        }

        public DrawableInfo getDrawableInfo() {
            return this.info;
        }

        public Rect getDrawRect() {
            Rect bounds = getBounds();
            int iCenterX = bounds.centerX();
            int iCenterY = bounds.centerY();
            Rect rect2 = rect;
            boolean z = this.fullSize;
            rect2.left = iCenterX - ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.right = iCenterX + ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.top = iCenterY - ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            rect.bottom = iCenterY + ((z ? Emoji.bigImgSize : Emoji.drawImgSize) / 2);
            return rect;
        }

        @Override
        public void draw(Canvas canvas) {
            Rect bounds;
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
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
            if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.invert) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
            }
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo2 = this.info;
            canvas.drawBitmap(bitmapArr[drawableInfo2.page][drawableInfo2.page2], (Rect) null, bounds, paint);
            if (this.invert) {
                canvas.restore();
            }
        }

        @Override
        public void setAlpha(int i) {
            paint.setAlpha(i);
        }

        @Override
        public boolean isLoaded() {
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo = this.info;
            return bitmapArr[drawableInfo.page][drawableInfo.page2] != null;
        }

        @Override
        public void preload() {
            if (isLoaded()) {
                return;
            }
            DrawableInfo drawableInfo = this.info;
            Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
    }

    private static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b, short s, int i) {
            this.page = b;
            this.page2 = s;
            this.emojiIndex = i;
        }
    }

    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i, int i2, CharSequence charSequence) {
            this.start = i;
            this.end = i2;
            this.code = charSequence;
        }
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        return iArr[0] > 0;
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence) {
        return parseEmojis(charSequence, null);
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence, int[] iArr) {
        boolean z;
        char cCharAt;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char cCharAt2;
        int i7;
        int i8;
        char cCharAt3;
        int i9;
        ArrayList<EmojiSpanRange> arrayList = new ArrayList<>();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb = new StringBuilder(16);
            int length = charSequence.length();
            int i10 = -1;
            int[] iArr2 = iArr;
            int i11 = 0;
            int i12 = 0;
            long j = 0;
            int i13 = -1;
            int i14 = 0;
            boolean z3 = false;
            boolean z4 = false;
            while (i12 < length) {
                try {
                    char cCharAt4 = charSequence.charAt(i12);
                    if ((cCharAt4 >= 55356 && cCharAt4 <= 55358) || (j != 0 && (j & (-4294967296L)) == 0 && (j & 65535) == 55356 && cCharAt4 >= 56806 && cCharAt4 <= 56831)) {
                        if (i13 == i10) {
                            i13 = i12;
                        } else if (z3) {
                            i13 = i12;
                            i14 = 0;
                            z3 = false;
                        }
                        sb.append(cCharAt4);
                        i14++;
                        j = (j << 16) | ((long) cCharAt4);
                    } else {
                        if ((sb.length() > 0 && (cCharAt4 == 9792 || cCharAt4 == 9794 || cCharAt4 == 9877)) || (j > 0 && (61440 & cCharAt4) == 53248)) {
                            sb.append(cCharAt4);
                            i14++;
                            j = 0;
                        } else if (cCharAt4 == 8419) {
                            if (i12 > 0 && (((cCharAt = charSequence.charAt(i11)) >= '0' && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*')) {
                                i14 = (i12 - i11) + 1;
                                sb.append(cCharAt);
                                sb.append(cCharAt4);
                                i13 = i11;
                                z = false;
                                z3 = false;
                                z4 = true;
                            }
                            if (!z4 && (i9 = i12 + 2) < length) {
                                int i15 = i12 + 1;
                                char cCharAt5 = charSequence.charAt(i15);
                                z2 = z;
                                if (cCharAt5 == 55356) {
                                    char cCharAt6 = charSequence.charAt(i9);
                                    if (cCharAt6 >= 57339 && cCharAt6 <= 57343) {
                                        sb.append(charSequence.subSequence(i15, i12 + 3));
                                        i14 += 2;
                                        i = i9;
                                    }
                                    i2 = i;
                                    i3 = 0;
                                    while (i3 < 3) {
                                        i7 = i2 + 1;
                                        if (i7 < length) {
                                            cCharAt3 = charSequence.charAt(i7);
                                            i8 = i;
                                            if (i3 == 1) {
                                                if (cCharAt3 != 8205 && sb.length() > 0) {
                                                    sb.append(cCharAt3);
                                                    i14++;
                                                    i2 = i7;
                                                    z4 = false;
                                                    z2 = false;
                                                }
                                            } else if (cCharAt4 != '*' || cCharAt4 == '#' || (cCharAt4 >= '0' && cCharAt4 <= '9')) {
                                                if (cCharAt3 >= 65024) {
                                                    if (cCharAt3 <= 65039) {
                                                        i14++;
                                                        if (!z4) {
                                                            if (i2 + 2 >= length) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                        }
                                                        i2 = i7;
                                                        i13 = i8;
                                                        z3 = true;
                                                    }
                                                }
                                            } else if (i13 != -1 && cCharAt3 >= 65024) {
                                                if (cCharAt3 <= 65039) {
                                                    i14++;
                                                    if (!z4) {
                                                        z4 = i2 + 2 >= length;
                                                    }
                                                    i2 = i7;
                                                }
                                            }
                                            i3++;
                                            i = i8;
                                        } else {
                                            i8 = i;
                                        }
                                        i3++;
                                        i = i8;
                                    }
                                    int i16 = i;
                                    if (z2 && iArr2 != null) {
                                        iArr2[0] = 0;
                                        iArr2 = null;
                                    }
                                    if (z4 && (i5 = i2 + 2) < length) {
                                        i6 = i2 + 1;
                                        if (charSequence.charAt(i6) == 55356 && (cCharAt2 = charSequence.charAt(i5)) >= 57339 && cCharAt2 <= 57343) {
                                            sb.append(charSequence.subSequence(i6, i2 + 3));
                                            i14 += 2;
                                            i2 = i5;
                                        }
                                    }
                                    if (!z4) {
                                        if (iArr2 != null) {
                                            iArr2[0] = iArr2[0] + 1;
                                        }
                                        if (i13 >= 0 && (i4 = i14 + i13) <= length) {
                                            arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                                        }
                                        sb.setLength(0);
                                        i13 = -1;
                                        i14 = 0;
                                        z3 = false;
                                        z4 = false;
                                    }
                                    i12 = i2 + 1;
                                    i11 = i16;
                                    i10 = -1;
                                } else if (sb.length() >= 2 && sb.charAt(0) == 55356 && sb.charAt(1) == 57332 && cCharAt5 == 56128) {
                                    do {
                                        if (i15 < charSequence.length()) {
                                            sb.append(charSequence.charAt(i15));
                                        }
                                        i12 = i15 + 1;
                                        if (i12 < charSequence.length()) {
                                            sb.append(charSequence.charAt(i12));
                                        }
                                        i14 += 2;
                                        i15 += 2;
                                        if (i15 >= charSequence.length()) {
                                            break;
                                        }
                                    } while (charSequence.charAt(i15) == 56128);
                                }
                            } else {
                                z2 = z;
                            }
                            i = i12;
                            i2 = i;
                            i3 = 0;
                            while (i3 < 3) {
                                i7 = i2 + 1;
                                if (i7 < length) {
                                    cCharAt3 = charSequence.charAt(i7);
                                    i8 = i;
                                    if (i3 == 1) {
                                        if (cCharAt3 != 8205) {
                                        }
                                    } else if (cCharAt4 != '*') {
                                        if (cCharAt3 >= 65024) {
                                            if (cCharAt3 <= 65039) {
                                                i14++;
                                                if (!z4) {
                                                    if (i2 + 2 >= length) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                i2 = i7;
                                                i13 = i8;
                                                z3 = true;
                                            }
                                        }
                                    } else if (cCharAt3 >= 65024) {
                                        if (cCharAt3 <= 65039) {
                                            i14++;
                                            if (!z4) {
                                                if (i2 + 2 >= length) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            i2 = i7;
                                            i13 = i8;
                                            z3 = true;
                                        }
                                    }
                                    i3++;
                                    i = i8;
                                } else {
                                    i8 = i;
                                }
                                i3++;
                                i = i8;
                            }
                            int i17 = i;
                            if (z2) {
                                iArr2[0] = 0;
                                iArr2 = null;
                            }
                            if (z4) {
                                i6 = i2 + 1;
                                if (charSequence.charAt(i6) == 55356) {
                                    sb.append(charSequence.subSequence(i6, i2 + 3));
                                    i14 += 2;
                                    i2 = i5;
                                }
                            }
                            if (!z4) {
                                if (iArr2 != null) {
                                    iArr2[0] = iArr2[0] + 1;
                                }
                                if (i13 >= 0) {
                                    arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                                }
                                sb.setLength(0);
                                i13 = -1;
                                i14 = 0;
                                z3 = false;
                                z4 = false;
                            }
                            i12 = i2 + 1;
                            i11 = i17;
                            i10 = -1;
                        } else {
                            if (cCharAt4 == 169 || cCharAt4 == 174 || (cCharAt4 >= 8252 && cCharAt4 <= 12953)) {
                                if (EmojiData.dataCharsMap.containsKey(Character.valueOf(cCharAt4))) {
                                    if (i13 == -1) {
                                        i13 = i12;
                                    } else if (z3) {
                                        i13 = i12;
                                        i14 = 0;
                                        z3 = false;
                                    }
                                    i14++;
                                    sb.append(cCharAt4);
                                }
                                if (!z4) {
                                    z2 = z;
                                    i = i12;
                                } else {
                                    z2 = z;
                                    i = i12;
                                }
                                i2 = i;
                                i3 = 0;
                                while (i3 < 3) {
                                    i7 = i2 + 1;
                                    if (i7 < length) {
                                        cCharAt3 = charSequence.charAt(i7);
                                        i8 = i;
                                        if (i3 == 1) {
                                            if (cCharAt3 != 8205) {
                                            }
                                        } else if (cCharAt4 != '*') {
                                            if (cCharAt3 >= 65024) {
                                                if (cCharAt3 <= 65039) {
                                                    i14++;
                                                    if (!z4) {
                                                        if (i2 + 2 >= length) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                    }
                                                    i2 = i7;
                                                    i13 = i8;
                                                    z3 = true;
                                                }
                                            }
                                        } else if (cCharAt3 >= 65024) {
                                            if (cCharAt3 <= 65039) {
                                                i14++;
                                                if (!z4) {
                                                    if (i2 + 2 >= length) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                i2 = i7;
                                                i13 = i8;
                                                z3 = true;
                                            }
                                        }
                                        i3++;
                                        i = i8;
                                    } else {
                                        i8 = i;
                                    }
                                    i3++;
                                    i = i8;
                                }
                                int i18 = i;
                                if (z2) {
                                    iArr2[0] = 0;
                                    iArr2 = null;
                                }
                                if (z4) {
                                    i6 = i2 + 1;
                                    if (charSequence.charAt(i6) == 55356) {
                                        sb.append(charSequence.subSequence(i6, i2 + 3));
                                        i14 += 2;
                                        i2 = i5;
                                    }
                                }
                                if (!z4) {
                                    if (iArr2 != null) {
                                        iArr2[0] = iArr2[0] + 1;
                                    }
                                    if (i13 >= 0) {
                                        arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                                    }
                                    sb.setLength(0);
                                    i13 = -1;
                                    i14 = 0;
                                    z3 = false;
                                    z4 = false;
                                }
                                i12 = i2 + 1;
                                i11 = i18;
                                i10 = -1;
                            }
                            if (i13 != -1) {
                                sb.setLength(0);
                                z = false;
                                i13 = -1;
                                i14 = 0;
                                z3 = false;
                                z4 = false;
                            } else if (cCharAt4 != 65039 && cCharAt4 != '\n' && cCharAt4 != ' ' && cCharAt4 != '\t') {
                                z = true;
                            }
                            if (!z4) {
                                z2 = z;
                                i = i12;
                            } else {
                                z2 = z;
                                i = i12;
                            }
                            i2 = i;
                            i3 = 0;
                            while (i3 < 3) {
                                i7 = i2 + 1;
                                if (i7 < length) {
                                    cCharAt3 = charSequence.charAt(i7);
                                    i8 = i;
                                    if (i3 == 1) {
                                        if (cCharAt3 != 8205) {
                                        }
                                    } else if (cCharAt4 != '*') {
                                        if (cCharAt3 >= 65024) {
                                            if (cCharAt3 <= 65039) {
                                                i14++;
                                                if (!z4) {
                                                    if (i2 + 2 >= length) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                }
                                                i2 = i7;
                                                i13 = i8;
                                                z3 = true;
                                            }
                                        }
                                    } else if (cCharAt3 >= 65024) {
                                        if (cCharAt3 <= 65039) {
                                            i14++;
                                            if (!z4) {
                                                if (i2 + 2 >= length) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            i2 = i7;
                                            i13 = i8;
                                            z3 = true;
                                        }
                                    }
                                    i3++;
                                    i = i8;
                                } else {
                                    i8 = i;
                                }
                                i3++;
                                i = i8;
                            }
                            int i19 = i;
                            if (z2) {
                                iArr2[0] = 0;
                                iArr2 = null;
                            }
                            if (z4) {
                                i6 = i2 + 1;
                                if (charSequence.charAt(i6) == 55356) {
                                    sb.append(charSequence.subSequence(i6, i2 + 3));
                                    i14 += 2;
                                    i2 = i5;
                                }
                            }
                            if (!z4) {
                                if (iArr2 != null) {
                                    iArr2[0] = iArr2[0] + 1;
                                }
                                if (i13 >= 0) {
                                    arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                                }
                                sb.setLength(0);
                                i13 = -1;
                                i14 = 0;
                                z3 = false;
                                z4 = false;
                            }
                            i12 = i2 + 1;
                            i11 = i19;
                            i10 = -1;
                        }
                        z = false;
                        z4 = true;
                        if (!z4) {
                            z2 = z;
                            i = i12;
                        } else {
                            z2 = z;
                            i = i12;
                        }
                        i2 = i;
                        i3 = 0;
                        while (i3 < 3) {
                            i7 = i2 + 1;
                            if (i7 < length) {
                                cCharAt3 = charSequence.charAt(i7);
                                i8 = i;
                                if (i3 == 1) {
                                    if (cCharAt3 != 8205) {
                                    }
                                } else if (cCharAt4 != '*') {
                                    if (cCharAt3 >= 65024) {
                                        if (cCharAt3 <= 65039) {
                                            i14++;
                                            if (!z4) {
                                                if (i2 + 2 >= length) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            }
                                            i2 = i7;
                                            i13 = i8;
                                            z3 = true;
                                        }
                                    }
                                } else if (cCharAt3 >= 65024) {
                                    if (cCharAt3 <= 65039) {
                                        i14++;
                                        if (!z4) {
                                            if (i2 + 2 >= length) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                        }
                                        i2 = i7;
                                        i13 = i8;
                                        z3 = true;
                                    }
                                }
                                i3++;
                                i = i8;
                            } else {
                                i8 = i;
                            }
                            i3++;
                            i = i8;
                        }
                        int i110 = i;
                        if (z2) {
                            iArr2[0] = 0;
                            iArr2 = null;
                        }
                        if (z4) {
                            i6 = i2 + 1;
                            if (charSequence.charAt(i6) == 55356) {
                                sb.append(charSequence.subSequence(i6, i2 + 3));
                                i14 += 2;
                                i2 = i5;
                            }
                        }
                        if (!z4) {
                            if (iArr2 != null) {
                                iArr2[0] = iArr2[0] + 1;
                            }
                            if (i13 >= 0) {
                                arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                            }
                            sb.setLength(0);
                            i13 = -1;
                            i14 = 0;
                            z3 = false;
                            z4 = false;
                        }
                        i12 = i2 + 1;
                        i11 = i110;
                        i10 = -1;
                    }
                    z = false;
                    if (!z4) {
                        z2 = z;
                        i = i12;
                    } else {
                        z2 = z;
                        i = i12;
                    }
                    i2 = i;
                    i3 = 0;
                    while (i3 < 3) {
                        i7 = i2 + 1;
                        if (i7 < length) {
                            cCharAt3 = charSequence.charAt(i7);
                            i8 = i;
                            if (i3 == 1) {
                                if (cCharAt3 != 8205) {
                                }
                            } else if (cCharAt4 != '*') {
                                if (cCharAt3 >= 65024) {
                                    if (cCharAt3 <= 65039) {
                                        i14++;
                                        if (!z4) {
                                            if (i2 + 2 >= length) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                        }
                                        i2 = i7;
                                        i13 = i8;
                                        z3 = true;
                                    }
                                }
                            } else if (cCharAt3 >= 65024) {
                                if (cCharAt3 <= 65039) {
                                    i14++;
                                    if (!z4) {
                                        if (i2 + 2 >= length) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    }
                                    i2 = i7;
                                    i13 = i8;
                                    z3 = true;
                                }
                            }
                            i3++;
                            i = i8;
                        } else {
                            i8 = i;
                        }
                        i3++;
                        i = i8;
                    }
                    int i111 = i;
                    if (z2) {
                        iArr2[0] = 0;
                        iArr2 = null;
                    }
                    if (z4) {
                        i6 = i2 + 1;
                        if (charSequence.charAt(i6) == 55356) {
                            sb.append(charSequence.subSequence(i6, i2 + 3));
                            i14 += 2;
                            i2 = i5;
                        }
                    }
                    if (!z4) {
                        if (iArr2 != null) {
                            iArr2[0] = iArr2[0] + 1;
                        }
                        if (i13 >= 0) {
                            arrayList.add(new EmojiSpanRange(i13, i4, sb.subSequence(0, sb.length())));
                        }
                        sb.setLength(0);
                        i13 = -1;
                        i14 = 0;
                        z3 = false;
                        z4 = false;
                    }
                    i12 = i2 + 1;
                    i11 = i111;
                    i10 = -1;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (iArr2 != null && sb.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z) {
        return replaceEmoji(charSequence, fontMetricsInt, z, (int[]) null);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, float f) {
        return replaceEmoji(charSequence, fontMetricsInt, z, null, 0, f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z, iArr, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i) {
        return replaceEmoji(charSequence, fontMetricsInt, z, iArr, i, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z, int[] iArr, int i, float f, int i2) {
        Spannable spannableNewSpannable;
        int i3;
        EmojiDrawable emojiDrawable;
        CharSequence charSequence2;
        String string;
        int i4;
        ColoredImageSpan coloredImageSpan;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z && (charSequence instanceof Spannable)) {
            spannableNewSpannable = (Spannable) charSequence;
        } else {
            spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> emojis = parseEmojis(spannableNewSpannable, iArr);
        if (emojis.isEmpty()) {
            return charSequence;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), AnimatedEmojiSpan.class);
        ColoredImageSpan[] coloredImageSpanArr = (ColoredImageSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), ColoredImageSpan.class);
        int i5 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i2;
        for (int i6 = 0; i6 < emojis.size(); i6++) {
            try {
                EmojiSpanRange emojiSpanRange = emojis.get(i6);
                if (animatedEmojiSpanArr == null || animatedEmojiSpanArr.length <= 0) {
                    if (coloredImageSpanArr != null && coloredImageSpanArr.length > 0) {
                        i4 = 0;
                        while (true) {
                            if (i4 < coloredImageSpanArr.length) {
                                coloredImageSpan = coloredImageSpanArr[i4];
                                if (coloredImageSpan != null || spannableNewSpannable.getSpanStart(coloredImageSpan) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(coloredImageSpan) != emojiSpanRange.end) {
                                    i4++;
                                }
                            }
                        }
                    }
                    emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                    if (emojiDrawable != null) {
                        EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i, fontMetricsInt);
                        charSequence2 = emojiSpanRange.code;
                        if (charSequence2 == null) {
                            string = null;
                        } else {
                            string = charSequence2.toString();
                        }
                        emojiSpan.emoji = string;
                        emojiSpan.scale = f;
                        spannableNewSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                    }
                    i3 = Build.VERSION.SDK_INT;
                    if ((i3 < 23 || i3 >= 29) && i6 + 1 >= i5) {
                        break;
                    }
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 < animatedEmojiSpanArr.length) {
                            AnimatedEmojiSpan animatedEmojiSpan = animatedEmojiSpanArr[i7];
                            if (animatedEmojiSpan == null || spannableNewSpannable.getSpanStart(animatedEmojiSpan) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(animatedEmojiSpan) != emojiSpanRange.end) {
                                i7++;
                            }
                        } else {
                            if (coloredImageSpanArr != null) {
                                i4 = 0;
                                while (true) {
                                    if (i4 < coloredImageSpanArr.length) {
                                        coloredImageSpan = coloredImageSpanArr[i4];
                                        if (coloredImageSpan != null) {
                                        }
                                        i4++;
                                    }
                                }
                            }
                            emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                            if (emojiDrawable != null) {
                                EmojiSpan emojiSpan2 = new EmojiSpan(emojiDrawable, i, fontMetricsInt);
                                charSequence2 = emojiSpanRange.code;
                                if (charSequence2 == null) {
                                    string = null;
                                } else {
                                    string = charSequence2.toString();
                                }
                                emojiSpan2.emoji = string;
                                emojiSpan2.scale = f;
                                spannableNewSpannable.setSpan(emojiSpan2, emojiSpanRange.start, emojiSpanRange.end, 33);
                            }
                            i3 = Build.VERSION.SDK_INT;
                            if (i3 < 23) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return spannableNewSpannable;
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, TextView textView, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, textView.getPaint().getFontMetricsInt(), runnable);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i, final Runnable runnable) {
        Spannable spannableNewSpannable;
        TLRPC.Document document;
        AnimatedEmojiSpan animatedEmojiSpan;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i2 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i2).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                runnable.run();
            }
        });
        if (charSequence instanceof Spannable) {
            spannableNewSpannable = (Spannable) charSequence;
        } else {
            spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> emojis = parseEmojis(spannableNewSpannable, null);
        if (emojis.isEmpty()) {
            return charSequence;
        }
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), AnimatedEmojiSpan.class);
        int i3 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i4 = 0; i4 < emojis.size(); i4++) {
            try {
                EmojiSpanRange emojiSpanRange = emojis.get(i4);
                try {
                    if (animatedEmojiSpanArr != null) {
                        int i5 = 0;
                        while (true) {
                            if (i5 < animatedEmojiSpanArr.length) {
                                AnimatedEmojiSpan animatedEmojiSpan2 = animatedEmojiSpanArr[i5];
                                if (animatedEmojiSpan2 == null || spannableNewSpannable.getSpanStart(animatedEmojiSpan2) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(animatedEmojiSpan2) != emojiSpanRange.end) {
                                    i5++;
                                }
                            }
                        }
                    }
                    animatedEmojiSpan.cacheType = i;
                    spannableNewSpannable.setSpan(animatedEmojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                }
                if (stickerSet == null) {
                    document = null;
                    break;
                }
                ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                int size = arrayList.size();
                int i6 = 0;
                do {
                    if (i6 >= size) {
                        document = null;
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i6);
                    i6++;
                    document = document2;
                } while (!MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code));
                if (document != null) {
                    animatedEmojiSpan = new AnimatedEmojiSpan(document, fontMetricsInt);
                } else {
                    animatedEmojiSpan = new AnimatedEmojiSpan(0L, fontMetricsInt);
                }
                animatedEmojiSpan.emoji = emojiSpanRange.code.toString();
            } catch (Exception e2) {
                e = e2;
            }
            int i7 = Build.VERSION.SDK_INT;
            if ((i7 < 23 || i7 >= 29) && i4 + 1 >= i3) {
                break;
            }
        }
        return spannableNewSpannable;
    }

    public static class EmojiSpan extends ImageSpan {
        public boolean drawn;
        public String emoji;
        public Paint.FontMetricsInt fontMetrics;
        public float lastDrawX;
        public float lastDrawY;
        private int minimumLineHeight;
        private boolean preserveFontMetrics;
        public float scale;
        public int size;

        public EmojiSpan(Drawable drawable, int i, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i);
            this.scale = 1.0f;
            this.size = AndroidUtilities.dp(20.0f);
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int iAbs = Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent);
                this.size = iAbs;
                if (iAbs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
            this.fontMetrics = fontMetricsInt;
            this.size = i;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int iAbs = Math.abs(fontMetricsInt.descent) + Math.abs(this.fontMetrics.ascent);
                this.size = iAbs;
                if (iAbs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        public EmojiSpan setPreserveFontMetrics(boolean z) {
            this.preserveFontMetrics = z;
            return this;
        }

        public EmojiSpan setMinimumLineHeight(int i) {
            this.minimumLineHeight = i;
            return this;
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            boolean z = this.preserveFontMetrics && fontMetricsInt2 != null;
            int i3 = z ? fontMetricsInt2.top : 0;
            int i4 = z ? fontMetricsInt2.ascent : 0;
            int i5 = z ? fontMetricsInt2.descent : 0;
            int i6 = z ? fontMetricsInt2.bottom : 0;
            int i7 = z ? fontMetricsInt2.leading : 0;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i8 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 == null) {
                int size = super.getSize(paint, charSequence, i, i2, fontMetricsInt3);
                int iDp = AndroidUtilities.dp(8.0f);
                int iDp2 = AndroidUtilities.dp(10.0f);
                int i9 = (-iDp2) - iDp;
                fontMetricsInt3.top = i9;
                int i10 = iDp2 - iDp;
                fontMetricsInt3.bottom = i10;
                fontMetricsInt3.ascent = i9;
                fontMetricsInt3.leading = 0;
                fontMetricsInt3.descent = i10;
                if (z) {
                    fontMetricsInt3.top = i3;
                    fontMetricsInt3.ascent = i4;
                    fontMetricsInt3.descent = i5;
                    fontMetricsInt3.bottom = i6;
                    fontMetricsInt3.leading = i7;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return size;
            }
            fontMetricsInt3.ascent = fontMetricsInt4.ascent;
            fontMetricsInt3.descent = fontMetricsInt4.descent;
            fontMetricsInt3.top = fontMetricsInt4.top;
            fontMetricsInt3.bottom = fontMetricsInt4.bottom;
            if (getDrawable() != null) {
                getDrawable().setBounds(0, 0, i8, i8);
            }
            if (z) {
                fontMetricsInt3.top = i3;
                fontMetricsInt3.ascent = i4;
                fontMetricsInt3.descent = i5;
                fontMetricsInt3.bottom = i6;
                fontMetricsInt3.leading = i7;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return i8;
        }

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i) {
            int i2 = fontMetricsInt.descent;
            int i3 = fontMetricsInt.ascent;
            int i4 = i2 - i3;
            if (i <= i4) {
                return;
            }
            int i5 = i - i4;
            int i6 = (i5 + 1) / 2;
            int i7 = i3 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.descent = i2 + (i5 - i6);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i7);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            boolean z;
            this.lastDrawX = ((this.scale * this.size) / 2.0f) + f;
            this.lastDrawY = i3 + ((i5 - i3) / 2.0f);
            boolean z2 = true;
            this.drawn = true;
            if (paint.getAlpha() == 255 || !Emoji.emojiDrawingUseAlpha) {
                z = false;
            } else {
                getDrawable().setAlpha(paint.getAlpha());
                z = true;
            }
            float f2 = Emoji.emojiDrawingYOffset;
            float f3 = this.size;
            float f4 = f2 - ((f3 - (this.scale * f3)) / 2.0f);
            if (f4 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f4);
            } else {
                z2 = false;
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
            if (z2) {
                canvas.restore();
            }
            if (z) {
                getDrawable().setAlpha(255);
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (getDrawable() instanceof EmojiDrawable) {
                ((EmojiDrawable) getDrawable()).placeholderColor = textPaint.getColor() & 285212671;
            }
            super.updateDrawState(textPaint);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                EmojiSpan emojiSpan = (EmojiSpan) obj;
                if (Float.compare(this.scale, emojiSpan.scale) == 0 && this.size == emojiSpan.size && Objects.equals(this.emoji, emojiSpan.emoji)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void addRecentEmoji(String str) {
        HashMap<String, Integer> map = emojiUseHistory;
        Integer num = map.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && map.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            map.remove(arrayList.get(arrayList.size() - 1));
            arrayList.set(arrayList.size() - 1, str);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void removeRecentEmoji(String str) {
        HashMap<String, Integer> map = emojiUseHistory;
        map.remove(str);
        ArrayList<String> arrayList = recentEmoji;
        arrayList.remove(str);
        if (map.isEmpty() || arrayList.isEmpty()) {
            addRecentEmoji(DEFAULT_RECENT[0]);
        }
    }

    public static void sortEmoji() {
        recentEmoji.clear();
        Iterator<Map.Entry<String, Integer>> it = emojiUseHistory.entrySet().iterator();
        while (it.hasNext()) {
            recentEmoji.add(it.next().getKey());
        }
        Collections.sort(recentEmoji, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return Emoji.m430$r8$lambda$tEFea3Q0DiBPnoNT35a881s2dE((String) obj, (String) obj2);
            }
        });
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() <= 48) {
                return;
            } else {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public static int m430$r8$lambda$tEFea3Q0DiBPnoNT35a881s2dE(String str, String str2) {
        HashMap<String, Integer> map = emojiUseHistory;
        Integer num = map.get(str);
        Integer num2 = map.get(str2);
        if (num == null) {
            num = 0;
        }
        if (num2 == null) {
            num2 = 0;
        }
        if (num.intValue() > num2.intValue()) {
            return -1;
        }
        return num.intValue() < num2.intValue() ? 1 : 0;
    }

    public static void saveRecentEmoji() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("emojis2", sb.toString()).commit();
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static void loadRecentEmoji() {
        if (recentEmojiLoaded) {
            return;
        }
        recentEmojiLoaded = true;
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        try {
            emojiUseHistory.clear();
            if (globalEmojiSettings.contains("emojis")) {
                try {
                    String string = globalEmojiSettings.getString("emojis", "");
                    if (string != null && string.length() > 0) {
                        for (String str : string.split(",")) {
                            String[] strArrSplit = str.split("=");
                            long jLongValue = Utilities.parseLong(strArrSplit[0]).longValue();
                            StringBuilder sb = new StringBuilder();
                            for (int i = 0; i < 4; i++) {
                                sb.insert(0, (char) jLongValue);
                                jLongValue >>= 16;
                                if (jLongValue == 0) {
                                    break;
                                }
                            }
                            if (sb.length() > 0) {
                                emojiUseHistory.put(sb.toString(), Utilities.parseInt((CharSequence) strArrSplit[1]));
                            }
                        }
                    }
                    globalEmojiSettings.edit().remove("emojis").commit();
                    saveRecentEmoji();
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                }
            } else {
                String string2 = globalEmojiSettings.getString("emojis2", "");
                if (string2 != null && string2.length() > 0) {
                    for (String str2 : string2.split(",")) {
                        String[] strArrSplit2 = str2.split("=");
                        emojiUseHistory.put(strArrSplit2[0], Utilities.parseInt((CharSequence) strArrSplit2[1]));
                    }
                }
            }
            if (emojiUseHistory.isEmpty() && !globalEmojiSettings.getBoolean("filled_default", false)) {
                int i2 = 0;
                while (true) {
                    String[] strArr = DEFAULT_RECENT;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    emojiUseHistory.put(strArr[i2], Integer.valueOf(strArr.length - i2));
                    i2++;
                }
                globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                saveRecentEmoji();
            }
            sortEmoji();
        } catch (Exception e2) {
            e = e2;
        }
        try {
            String string3 = globalEmojiSettings.getString("color", "");
            if (string3 == null || string3.length() <= 0) {
                return;
            }
            for (String str3 : string3.split(",")) {
                String[] strArrSplit3 = str3.split("=");
                emojiColor.put(strArrSplit3[0], strArrSplit3[1]);
            }
        } catch (Exception e3) {
            FileLog.e(e3);
        }
    }

    public static void saveEmojiColors() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : emojiColor.entrySet()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("color", sb.toString()).commit();
    }
}
