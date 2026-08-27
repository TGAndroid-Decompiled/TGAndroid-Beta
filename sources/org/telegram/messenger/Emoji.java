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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cq;

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

    public static class DrawableInfo {
        public int emojiIndex;
        public byte page;
        public short page2;

        public DrawableInfo(byte b10, short s10, int i10) {
            this.page = b10;
            this.page2 = s10;
            this.emojiIndex = i10;
        }
    }

    public static class EmojiSpanRange {
        public CharSequence code;
        public int end;
        public int start;

        public EmojiSpanRange(int i10, int i11, CharSequence charSequence) {
            this.start = i10;
            this.end = i11;
            this.code = charSequence;
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
        invalidateUiRunnable = new w1(8);
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        bigImgSize = AndroidUtilities.dp(AndroidUtilities.isTablet() ? 40.0f : 34.0f);
        int i10 = 0;
        while (true) {
            Bitmap[][] bitmapArr = emojiBmp;
            if (i10 >= bitmapArr.length) {
                break;
            }
            int i11 = emojiCounts[i10];
            bitmapArr[i10] = new Bitmap[i11];
            loadingEmoji[i10] = new boolean[i11];
            i10++;
        }
        for (int i12 = 0; i12 < EmojiData.data.length; i12++) {
            int i13 = 0;
            while (true) {
                String[] strArr2 = EmojiData.data[i12];
                if (i13 < strArr2.length) {
                    rects.put(strArr2[i13], new DrawableInfo((byte) i12, (short) i13, i13));
                    i13++;
                }
            }
        }
        Paint paint = new Paint();
        placeholderPaint = paint;
        paint.setColor(0);
    }

    public static void addRecentEmoji(String str) {
        HashMap<String, Integer> map = emojiUseHistory;
        Integer num = map.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && map.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            map.remove((String) i0.a.i(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        map.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145;
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 55356 || cCharAt > 55358) {
                if (cCharAt == 8419) {
                    return str;
                }
                if (cCharAt >= 8252 && cCharAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(cCharAt))) {
                    StringBuilder sb2 = new StringBuilder();
                    i10++;
                    sb2.append(str.substring(0, i10));
                    sb2.append("️");
                    sb2.append(str.substring(i10));
                    str = sb2.toString();
                    length++;
                }
            } else if (cCharAt != 55356 || i10 >= length - 1) {
                i10++;
            } else {
                int i11 = i10 + 1;
                char cCharAt2 = str.charAt(i11);
                if (cCharAt2 == 56879 || cCharAt2 == 56324 || cCharAt2 == 56858 || cCharAt2 == 56703) {
                    StringBuilder sb3 = new StringBuilder();
                    i10 += 2;
                    sb3.append(str.substring(0, i10));
                    sb3.append("️");
                    sb3.append(str.substring(i10));
                    str = sb3.toString();
                    length++;
                } else {
                    i10 = i11;
                }
            }
            i10++;
        }
        return str;
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        return iArr[0] > 0;
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

    public static Drawable getEmojiBigDrawable(String str) {
        CharSequence charSequence;
        EmojiDrawable compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(str);
        if (compoundEmojiDrawable != null) {
            int i10 = drawImgSize;
            compoundEmojiDrawable.setBounds(0, 0, i10, i10);
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
        int i11 = bigImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i11, i11);
        compoundEmojiDrawable.fullSize = true;
        return compoundEmojiDrawable;
    }

    public static EmojiDrawable getEmojiDrawable(CharSequence charSequence) {
        CompoundEmoji.CompoundEmojiDrawable compoundEmojiDrawable;
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
            int i10 = drawImgSize;
            simpleEmojiDrawable.setBounds(0, 0, i10, i10);
            return simpleEmojiDrawable;
        }
        if (charSequence == null || (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) == null) {
            return null;
        }
        int i11 = drawImgSize;
        compoundEmojiDrawable.setBounds(0, 0, i11, i11);
        return compoundEmojiDrawable;
    }

    public static void invalidateAll(View view) {
        if (!(view instanceof ViewGroup)) {
            if (view instanceof TextView) {
                view.invalidate();
            }
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                invalidateAll(viewGroup.getChildAt(i10));
            }
        }
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

    public static void lambda$loadEmoji$1(byte b10, short s10) {
        Locale locale = Locale.US;
        Bitmap bitmapLoadBitmap = loadBitmap("emoji/".concat(((int) b10) + "_" + ((int) s10) + ".png"));
        try {
            if (emojiAlphaMasks == null) {
                emojiAlphaMasks = loadEmojiAlphaMasks();
            }
            SparseIntArray sparseIntArray = emojiAlphaMasks;
            int i10 = sparseIntArray != null ? sparseIntArray.get((b10 * 4096) + s10, -1) : -1;
            if (bitmapLoadBitmap != null && i10 != -1) {
                Bitmap bitmapLoadBitmap2 = loadBitmap("emoji/masks/".concat(i10 + ".png"));
                if (bitmapLoadBitmap2 != null) {
                    int width = bitmapLoadBitmap.getWidth();
                    int height = bitmapLoadBitmap.getHeight();
                    int i11 = width * height;
                    int[] iArr = new int[i11];
                    int[] iArr2 = new int[i11];
                    bitmapLoadBitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                    bitmapLoadBitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
                    bitmapLoadBitmap2.recycle();
                    for (int i12 = 0; i12 < i11; i12++) {
                        iArr[i12] = (iArr[i12] & 16777215) | ((iArr2[i12] & 255) << 24);
                    }
                    bitmapLoadBitmap.recycle();
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                    try {
                        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                        bitmapLoadBitmap = bitmapCreateBitmap;
                    } catch (Exception e9) {
                        e = e9;
                        bitmapLoadBitmap = bitmapCreateBitmap;
                        FileLog.e(e);
                    }
                }
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (bitmapLoadBitmap != null) {
            emojiBmp[b10][s10] = bitmapLoadBitmap;
            Runnable runnable = invalidateUiRunnable;
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(runnable);
        }
        loadingEmoji[b10][s10] = false;
    }

    public static int lambda$sortEmoji$3(String str, String str2) {
        Integer num = 0;
        HashMap<String, Integer> map = emojiUseHistory;
        Integer num2 = map.get(str);
        Integer num3 = map.get(str2);
        if (num2 == null) {
            num2 = num;
        }
        num = num3 != null ? num3 : 0;
        if (num2.intValue() > num.intValue()) {
            return -1;
        }
        return num2.intValue() < num.intValue() ? 1 : 0;
    }

    public static void lambda$static$0() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static Bitmap loadBitmap(String str) {
        Bitmap bitmapDecodeStream;
        try {
            int i10 = AndroidUtilities.density <= 1.0f ? 2 : 1;
            try {
                InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i10;
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

    public static void loadEmoji(final byte b10, final short s10) {
        if (emojiBmp[b10][s10] == null) {
            boolean[] zArr = loadingEmoji[b10];
            if (zArr[s10]) {
                return;
            }
            zArr[s10] = true;
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    Emoji.lambda$loadEmoji$1(b10, s10);
                }
            });
        }
    }

    private static SparseIntArray loadEmojiAlphaMasks() {
        try {
            InputStream inputStreamOpen = ApplicationLoader.applicationContext.getAssets().open("emoji/metadata.bin");
            try {
                ArrayList arrayList = new ArrayList();
                byte[] bArr = new byte[8192];
                int i10 = 0;
                while (true) {
                    int i11 = inputStreamOpen.read(bArr);
                    if (i11 == -1) {
                        break;
                    }
                    byte[] bArr2 = new byte[i11];
                    System.arraycopy(bArr, 0, bArr2, 0, i11);
                    arrayList.add(bArr2);
                    i10 += i11;
                    FileLog.e(e);
                    return null;
                }
                byte[] bArr3 = new byte[i10];
                int size = arrayList.size();
                int length = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    byte[] bArr4 = (byte[]) obj;
                    System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                    length += bArr4.length;
                }
                ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr3).order(ByteOrder.LITTLE_ENDIAN);
                int i13 = i10 / 4;
                SparseIntArray sparseIntArray = new SparseIntArray(i13);
                for (int i14 = 0; i14 < i13; i14++) {
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
        } catch (Exception e9) {
            FileLog.e(e9);
            return null;
        }
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
                            StringBuilder sb2 = new StringBuilder();
                            for (int i10 = 0; i10 < 4; i10++) {
                                sb2.insert(0, (char) jLongValue);
                                jLongValue >>= 16;
                                if (jLongValue == 0) {
                                    break;
                                }
                            }
                            if (sb2.length() > 0) {
                                emojiUseHistory.put(sb2.toString(), Utilities.parseInt((CharSequence) strArrSplit[1]));
                            }
                        }
                    }
                    globalEmojiSettings.edit().remove("emojis").commit();
                    saveRecentEmoji();
                } catch (Exception e9) {
                    e = e9;
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
                int i11 = 0;
                while (true) {
                    String[] strArr = DEFAULT_RECENT;
                    if (i11 >= strArr.length) {
                        break;
                    }
                    emojiUseHistory.put(strArr[i11], Integer.valueOf(strArr.length - i11));
                    i11++;
                }
                globalEmojiSettings.edit().putBoolean("filled_default", true).commit();
                saveRecentEmoji();
            }
            sortEmoji();
        } catch (Exception e10) {
            e = e10;
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
        } catch (Exception e11) {
            FileLog.e(e11);
        }
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence) {
        return parseEmojis(charSequence, null);
    }

    public static void preloadEmoji(CharSequence charSequence) {
        DrawableInfo drawableInfo = getDrawableInfo(charSequence);
        if (drawableInfo != null) {
            loadEmoji(drawableInfo.page, drawableInfo.page2);
        }
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

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, (int[]) null);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, TextView textView, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, textView.getPaint().getFontMetricsInt(), runnable);
    }

    public static void saveEmojiColors() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, String> entry : emojiColor.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("color", sb2.toString()).commit();
    }

    public static void saveRecentEmoji() {
        SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            if (sb2.length() != 0) {
                sb2.append(",");
            }
            sb2.append(entry.getKey());
            sb2.append("=");
            sb2.append(entry.getValue());
        }
        globalEmojiSettings.edit().putString("emojis2", sb2.toString()).commit();
    }

    public static void sortEmoji() {
        recentEmoji.clear();
        Iterator<Map.Entry<String, Integer>> it = emojiUseHistory.entrySet().iterator();
        while (it.hasNext()) {
            recentEmoji.add(it.next().getKey());
        }
        Collections.sort(recentEmoji, new q(4));
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() <= 48) {
                return;
            } else {
                a9.p.s(1, arrayList);
            }
        }
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

        public EmojiSpan(Drawable drawable, int i10, Paint.FontMetricsInt fontMetricsInt) {
            super(drawable, i10);
            this.scale = 1.0f;
            this.size = AndroidUtilities.dp(20.0f);
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int iAbs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = iAbs;
                if (iAbs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }

        private static void expandFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            int i11 = fontMetricsInt.descent;
            int i12 = fontMetricsInt.ascent;
            int i13 = i11 - i12;
            if (i10 <= i13) {
                return;
            }
            int i14 = i10 - i13;
            int i15 = (i14 + 1) / 2;
            int i16 = i12 - i15;
            fontMetricsInt.ascent = i16;
            fontMetricsInt.descent = i11 + (i14 - i15);
            fontMetricsInt.top = Math.min(fontMetricsInt.top, i16);
            fontMetricsInt.bottom = Math.max(fontMetricsInt.bottom, fontMetricsInt.descent);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            boolean z10;
            this.lastDrawX = a9.p.d(this.scale, this.size, 2.0f, f10);
            this.lastDrawY = ((i14 - i12) / 2.0f) + i12;
            boolean z11 = true;
            this.drawn = true;
            if (paint.getAlpha() == 255 || !Emoji.emojiDrawingUseAlpha) {
                z10 = false;
            } else {
                getDrawable().setAlpha(paint.getAlpha());
                z10 = true;
            }
            float f11 = Emoji.emojiDrawingYOffset;
            int i15 = this.size;
            float f12 = f11 - ((i15 - (this.scale * i15)) / 2.0f);
            if (f12 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f12);
            } else {
                z11 = false;
            }
            super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                getDrawable().setAlpha(255);
            }
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

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            boolean z10 = this.preserveFontMetrics && fontMetricsInt2 != null;
            int i12 = z10 ? fontMetricsInt2.top : 0;
            int i13 = z10 ? fontMetricsInt2.ascent : 0;
            int i14 = z10 ? fontMetricsInt2.descent : 0;
            int i15 = z10 ? fontMetricsInt2.bottom : 0;
            int i16 = z10 ? fontMetricsInt2.leading : 0;
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i17 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 != null) {
                fontMetricsInt3.ascent = fontMetricsInt4.ascent;
                fontMetricsInt3.descent = fontMetricsInt4.descent;
                fontMetricsInt3.top = fontMetricsInt4.top;
                fontMetricsInt3.bottom = fontMetricsInt4.bottom;
                if (getDrawable() != null) {
                    getDrawable().setBounds(0, 0, i17, i17);
                }
                if (z10) {
                    fontMetricsInt3.top = i12;
                    fontMetricsInt3.ascent = i13;
                    fontMetricsInt3.descent = i14;
                    fontMetricsInt3.bottom = i15;
                    fontMetricsInt3.leading = i16;
                    expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
                }
                return i17;
            }
            int size = super.getSize(paint, charSequence, i10, i11, fontMetricsInt3);
            int iDp = AndroidUtilities.dp(8.0f);
            int iDp2 = AndroidUtilities.dp(10.0f);
            int i18 = (-iDp2) - iDp;
            fontMetricsInt3.top = i18;
            int i19 = iDp2 - iDp;
            fontMetricsInt3.bottom = i19;
            fontMetricsInt3.ascent = i18;
            fontMetricsInt3.leading = 0;
            fontMetricsInt3.descent = i19;
            if (z10) {
                fontMetricsInt3.top = i12;
                fontMetricsInt3.ascent = i13;
                fontMetricsInt3.descent = i14;
                fontMetricsInt3.bottom = i15;
                fontMetricsInt3.leading = i16;
                expandFontMetrics(fontMetricsInt3, this.minimumLineHeight);
            }
            return size;
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
            this.fontMetrics = fontMetricsInt;
            this.size = i10;
        }

        public EmojiSpan setMinimumLineHeight(int i10) {
            this.minimumLineHeight = i10;
            return this;
        }

        public EmojiSpan setPreserveFontMetrics(boolean z10) {
            this.preserveFontMetrics = z10;
            return this;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            if (getDrawable() instanceof EmojiDrawable) {
                ((EmojiDrawable) getDrawable()).placeholderColor = 285212671 & textPaint.getColor();
            }
            super.updateDrawState(textPaint);
        }

        public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
            this.fontMetrics = fontMetricsInt;
            if (fontMetricsInt != null) {
                int iAbs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = iAbs;
                if (iAbs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }
    }

    public static ArrayList<EmojiSpanRange> parseEmojis(CharSequence charSequence, int[] iArr) {
        boolean z10;
        char cCharAt;
        boolean z11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt2;
        int i16;
        int i17;
        char cCharAt3;
        boolean z12;
        int i18;
        ArrayList<EmojiSpanRange> arrayList = new ArrayList<>();
        if (charSequence != null && charSequence.length() > 0) {
            StringBuilder sb2 = new StringBuilder(16);
            int length = charSequence.length();
            int i19 = -1;
            int[] iArr2 = iArr;
            int i20 = 0;
            int i21 = 0;
            long j10 = 0;
            int i22 = -1;
            int i23 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i21 < length) {
                try {
                    char cCharAt4 = charSequence.charAt(i21);
                    if ((cCharAt4 < 55356 || cCharAt4 > 55358) && (j10 == 0 || (j10 & (-4294967296L)) != 0 || (j10 & 65535) != 55356 || cCharAt4 < 56806 || cCharAt4 > 56831)) {
                        if ((sb2.length() > 0 && (cCharAt4 == 9792 || cCharAt4 == 9794 || cCharAt4 == 9877)) || (j10 > 0 && (61440 & cCharAt4) == 53248)) {
                            sb2.append(cCharAt4);
                            i23++;
                            j10 = 0;
                        } else if (cCharAt4 != 8419) {
                            if (cCharAt4 == 169 || cCharAt4 == 174 || (cCharAt4 >= 8252 && cCharAt4 <= 12953)) {
                                if (EmojiData.dataCharsMap.containsKey(Character.valueOf(cCharAt4))) {
                                    if (i22 == -1) {
                                        i22 = i21;
                                    } else if (z13) {
                                        i22 = i21;
                                        i23 = 0;
                                        z13 = false;
                                    }
                                    i23++;
                                    sb2.append(cCharAt4);
                                }
                                if (z14 || (i18 = i21 + 2) >= length) {
                                    z11 = z10;
                                } else {
                                    int i24 = i21 + 1;
                                    char cCharAt5 = charSequence.charAt(i24);
                                    z11 = z10;
                                    if (cCharAt5 == 55356) {
                                        char cCharAt6 = charSequence.charAt(i18);
                                        if (cCharAt6 >= 57339 && cCharAt6 <= 57343) {
                                            sb2.append(charSequence.subSequence(i24, i21 + 3));
                                            i23 += 2;
                                            i10 = i18;
                                        }
                                        i11 = i10;
                                        i12 = 0;
                                        while (i12 < 3) {
                                            i16 = i11 + 1;
                                            if (i16 < length) {
                                                cCharAt3 = charSequence.charAt(i16);
                                                i17 = i10;
                                                if (i12 == 1) {
                                                    if (cCharAt3 != 8205 && sb2.length() > 0) {
                                                        sb2.append(cCharAt3);
                                                        i23++;
                                                        i11 = i16;
                                                        z14 = false;
                                                        z11 = false;
                                                    }
                                                } else if (cCharAt4 != '*' || cCharAt4 == '#' || (cCharAt4 >= '0' && cCharAt4 <= '9')) {
                                                    if (cCharAt3 >= 65024) {
                                                        if (cCharAt3 <= 65039) {
                                                            i23++;
                                                            if (!z14) {
                                                                if (i11 + 2 >= length) {
                                                                    z12 = true;
                                                                } else {
                                                                    z12 = false;
                                                                }
                                                                z14 = z12;
                                                            }
                                                            i11 = i16;
                                                            i22 = i17;
                                                            z13 = true;
                                                        }
                                                    }
                                                } else if (i22 != -1 && cCharAt3 >= 65024) {
                                                    if (cCharAt3 <= 65039) {
                                                        i23++;
                                                        if (!z14) {
                                                            z14 = i11 + 2 >= length;
                                                        }
                                                        i11 = i16;
                                                    }
                                                }
                                                i12++;
                                                i10 = i17;
                                            } else {
                                                i17 = i10;
                                            }
                                            i12++;
                                            i10 = i17;
                                        }
                                        int i25 = i10;
                                        if (z11 && iArr2 != null) {
                                            iArr2[0] = 0;
                                            iArr2 = null;
                                        }
                                        if (z14 && (i14 = i11 + 2) < length) {
                                            i15 = i11 + 1;
                                            if (charSequence.charAt(i15) == 55356 && (cCharAt2 = charSequence.charAt(i14)) >= 57339 && cCharAt2 <= 57343) {
                                                sb2.append(charSequence.subSequence(i15, i11 + 3));
                                                i23 += 2;
                                                i11 = i14;
                                            }
                                        }
                                        if (z14) {
                                            if (iArr2 != null) {
                                                iArr2[0] = iArr2[0] + 1;
                                            }
                                            if (i22 >= 0 && (i13 = i23 + i22) <= length) {
                                                arrayList.add(new EmojiSpanRange(i22, i13, sb2.subSequence(0, sb2.length())));
                                            }
                                            sb2.setLength(0);
                                            i22 = -1;
                                            i23 = 0;
                                            z13 = false;
                                            z14 = false;
                                        }
                                        i21 = i11 + 1;
                                        i20 = i25;
                                        i19 = -1;
                                    } else if (sb2.length() >= 2 && sb2.charAt(0) == 55356 && sb2.charAt(1) == 57332 && cCharAt5 == 56128) {
                                        while (true) {
                                            if (i24 < charSequence.length()) {
                                                sb2.append(charSequence.charAt(i24));
                                            }
                                            int i26 = i24 + 1;
                                            if (i26 < charSequence.length()) {
                                                sb2.append(charSequence.charAt(i26));
                                            }
                                            i23 += 2;
                                            int i27 = i24 + 2;
                                            if (i27 >= charSequence.length() || charSequence.charAt(i27) != 56128) {
                                                break;
                                                break;
                                            }
                                            i24 = i27;
                                        }
                                        i21 = i24 + 1;
                                    }
                                }
                                i10 = i21;
                                i11 = i10;
                                i12 = 0;
                                while (i12 < 3) {
                                    i16 = i11 + 1;
                                    if (i16 < length) {
                                        cCharAt3 = charSequence.charAt(i16);
                                        i17 = i10;
                                        if (i12 == 1) {
                                            if (cCharAt3 != 8205) {
                                            }
                                        } else if (cCharAt4 != '*') {
                                            if (cCharAt3 >= 65024) {
                                                if (cCharAt3 <= 65039) {
                                                    i23++;
                                                    if (!z14) {
                                                        if (i11 + 2 >= length) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        z14 = z12;
                                                    }
                                                    i11 = i16;
                                                    i22 = i17;
                                                    z13 = true;
                                                }
                                            }
                                        } else if (cCharAt3 >= 65024) {
                                            if (cCharAt3 <= 65039) {
                                                i23++;
                                                if (!z14) {
                                                    if (i11 + 2 >= length) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    z14 = z12;
                                                }
                                                i11 = i16;
                                                i22 = i17;
                                                z13 = true;
                                            }
                                        }
                                        i12++;
                                        i10 = i17;
                                    } else {
                                        i17 = i10;
                                    }
                                    i12++;
                                    i10 = i17;
                                }
                                int i28 = i10;
                                if (z11) {
                                    iArr2[0] = 0;
                                    iArr2 = null;
                                }
                                if (z14) {
                                    i15 = i11 + 1;
                                    if (charSequence.charAt(i15) == 55356) {
                                        sb2.append(charSequence.subSequence(i15, i11 + 3));
                                        i23 += 2;
                                        i11 = i14;
                                    }
                                }
                                if (z14) {
                                    if (iArr2 != null) {
                                        iArr2[0] = iArr2[0] + 1;
                                    }
                                    if (i22 >= 0) {
                                        arrayList.add(new EmojiSpanRange(i22, i13, sb2.subSequence(0, sb2.length())));
                                    }
                                    sb2.setLength(0);
                                    i22 = -1;
                                    i23 = 0;
                                    z13 = false;
                                    z14 = false;
                                }
                                i21 = i11 + 1;
                                i20 = i28;
                                i19 = -1;
                            }
                            if (i22 != -1) {
                                sb2.setLength(0);
                                z10 = false;
                                i22 = -1;
                                i23 = 0;
                                z13 = false;
                                z14 = false;
                            } else if (cCharAt4 != 65039 && cCharAt4 != '\n' && cCharAt4 != ' ' && cCharAt4 != '\t') {
                                z10 = true;
                            }
                            if (z14) {
                                z11 = z10;
                                i10 = i21;
                            } else {
                                z11 = z10;
                                i10 = i21;
                            }
                            i11 = i10;
                            i12 = 0;
                            while (i12 < 3) {
                                i16 = i11 + 1;
                                if (i16 < length) {
                                    cCharAt3 = charSequence.charAt(i16);
                                    i17 = i10;
                                    if (i12 == 1) {
                                        if (cCharAt3 != 8205) {
                                        }
                                    } else if (cCharAt4 != '*') {
                                        if (cCharAt3 >= 65024) {
                                            if (cCharAt3 <= 65039) {
                                                i23++;
                                                if (!z14) {
                                                    if (i11 + 2 >= length) {
                                                        z12 = true;
                                                    } else {
                                                        z12 = false;
                                                    }
                                                    z14 = z12;
                                                }
                                                i11 = i16;
                                                i22 = i17;
                                                z13 = true;
                                            }
                                        }
                                    } else if (cCharAt3 >= 65024) {
                                        if (cCharAt3 <= 65039) {
                                            i23++;
                                            if (!z14) {
                                                if (i11 + 2 >= length) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                z14 = z12;
                                            }
                                            i11 = i16;
                                            i22 = i17;
                                            z13 = true;
                                        }
                                    }
                                    i12++;
                                    i10 = i17;
                                } else {
                                    i17 = i10;
                                }
                                i12++;
                                i10 = i17;
                            }
                            int i29 = i10;
                            if (z11) {
                                iArr2[0] = 0;
                                iArr2 = null;
                            }
                            if (z14) {
                                i15 = i11 + 1;
                                if (charSequence.charAt(i15) == 55356) {
                                    sb2.append(charSequence.subSequence(i15, i11 + 3));
                                    i23 += 2;
                                    i11 = i14;
                                }
                            }
                            if (z14) {
                                if (iArr2 != null) {
                                    iArr2[0] = iArr2[0] + 1;
                                }
                                if (i22 >= 0) {
                                    arrayList.add(new EmojiSpanRange(i22, i13, sb2.subSequence(0, sb2.length())));
                                }
                                sb2.setLength(0);
                                i22 = -1;
                                i23 = 0;
                                z13 = false;
                                z14 = false;
                            }
                            i21 = i11 + 1;
                            i20 = i29;
                            i19 = -1;
                        } else if (i21 > 0 && (((cCharAt = charSequence.charAt(i20)) >= '0' && cCharAt <= '9') || cCharAt == '#' || cCharAt == '*')) {
                            i23 = (i21 - i20) + 1;
                            sb2.append(cCharAt);
                            sb2.append(cCharAt4);
                            i22 = i20;
                            z13 = false;
                            z14 = true;
                        }
                        z10 = false;
                        z14 = true;
                        if (z14) {
                            z11 = z10;
                            i10 = i21;
                        } else {
                            z11 = z10;
                            i10 = i21;
                        }
                        i11 = i10;
                        i12 = 0;
                        while (i12 < 3) {
                            i16 = i11 + 1;
                            if (i16 < length) {
                                cCharAt3 = charSequence.charAt(i16);
                                i17 = i10;
                                if (i12 == 1) {
                                    if (cCharAt3 != 8205) {
                                    }
                                } else if (cCharAt4 != '*') {
                                    if (cCharAt3 >= 65024) {
                                        if (cCharAt3 <= 65039) {
                                            i23++;
                                            if (!z14) {
                                                if (i11 + 2 >= length) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                z14 = z12;
                                            }
                                            i11 = i16;
                                            i22 = i17;
                                            z13 = true;
                                        }
                                    }
                                } else if (cCharAt3 >= 65024) {
                                    if (cCharAt3 <= 65039) {
                                        i23++;
                                        if (!z14) {
                                            if (i11 + 2 >= length) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z14 = z12;
                                        }
                                        i11 = i16;
                                        i22 = i17;
                                        z13 = true;
                                    }
                                }
                                i12++;
                                i10 = i17;
                            } else {
                                i17 = i10;
                            }
                            i12++;
                            i10 = i17;
                        }
                        int i210 = i10;
                        if (z11) {
                            iArr2[0] = 0;
                            iArr2 = null;
                        }
                        if (z14) {
                            i15 = i11 + 1;
                            if (charSequence.charAt(i15) == 55356) {
                                sb2.append(charSequence.subSequence(i15, i11 + 3));
                                i23 += 2;
                                i11 = i14;
                            }
                        }
                        if (z14) {
                            if (iArr2 != null) {
                                iArr2[0] = iArr2[0] + 1;
                            }
                            if (i22 >= 0) {
                                arrayList.add(new EmojiSpanRange(i22, i13, sb2.subSequence(0, sb2.length())));
                            }
                            sb2.setLength(0);
                            i22 = -1;
                            i23 = 0;
                            z13 = false;
                            z14 = false;
                        }
                        i21 = i11 + 1;
                        i20 = i210;
                        i19 = -1;
                    } else {
                        if (i22 == i19) {
                            i22 = i21;
                        } else if (z13) {
                            i22 = i21;
                            i23 = 0;
                            z13 = false;
                        }
                        sb2.append(cCharAt4);
                        i23++;
                        j10 = (j10 << 16) | ((long) cCharAt4);
                    }
                    z10 = false;
                    if (z14) {
                        z11 = z10;
                        i10 = i21;
                    } else {
                        z11 = z10;
                        i10 = i21;
                    }
                    i11 = i10;
                    i12 = 0;
                    while (i12 < 3) {
                        i16 = i11 + 1;
                        if (i16 < length) {
                            cCharAt3 = charSequence.charAt(i16);
                            i17 = i10;
                            if (i12 == 1) {
                                if (cCharAt3 != 8205) {
                                }
                            } else if (cCharAt4 != '*') {
                                if (cCharAt3 >= 65024) {
                                    if (cCharAt3 <= 65039) {
                                        i23++;
                                        if (!z14) {
                                            if (i11 + 2 >= length) {
                                                z12 = true;
                                            } else {
                                                z12 = false;
                                            }
                                            z14 = z12;
                                        }
                                        i11 = i16;
                                        i22 = i17;
                                        z13 = true;
                                    }
                                }
                            } else if (cCharAt3 >= 65024) {
                                if (cCharAt3 <= 65039) {
                                    i23++;
                                    if (!z14) {
                                        if (i11 + 2 >= length) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        z14 = z12;
                                    }
                                    i11 = i16;
                                    i22 = i17;
                                    z13 = true;
                                }
                            }
                            i12++;
                            i10 = i17;
                        } else {
                            i17 = i10;
                        }
                        i12++;
                        i10 = i17;
                    }
                    int i211 = i10;
                    if (z11) {
                        iArr2[0] = 0;
                        iArr2 = null;
                    }
                    if (z14) {
                        i15 = i11 + 1;
                        if (charSequence.charAt(i15) == 55356) {
                            sb2.append(charSequence.subSequence(i15, i11 + 3));
                            i23 += 2;
                            i11 = i14;
                        }
                    }
                    if (z14) {
                        if (iArr2 != null) {
                            iArr2[0] = iArr2[0] + 1;
                        }
                        if (i22 >= 0) {
                            arrayList.add(new EmojiSpanRange(i22, i13, sb2.subSequence(0, sb2.length())));
                        }
                        sb2.setLength(0);
                        i22 = -1;
                        i23 = 0;
                        z13 = false;
                        z14 = false;
                    }
                    i21 = i11 + 1;
                    i20 = i211;
                    i19 = -1;
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            if (iArr2 != null && sb2.length() != 0) {
                iArr2[0] = 0;
            }
        }
        return arrayList;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, null, 0, f10, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i10, Runnable runnable) {
        Spannable spannableNewSpannable;
        TLRPC.Document document;
        org.telegram.ui.Components.t5 t5Var;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i11 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i11).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new z0(runnable, 1));
        if (charSequence instanceof Spannable) {
            spannableNewSpannable = (Spannable) charSequence;
        } else {
            spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> emojis = parseEmojis(spannableNewSpannable, null);
        if (emojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), org.telegram.ui.Components.t5.class);
        int i12 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i13 = 0; i13 < emojis.size(); i13++) {
            try {
                EmojiSpanRange emojiSpanRange = emojis.get(i13);
                try {
                    if (t5VarArr != null) {
                        int i14 = 0;
                        while (true) {
                            if (i14 < t5VarArr.length) {
                                org.telegram.ui.Components.t5 t5Var2 = t5VarArr[i14];
                                if (t5Var2 == null || spannableNewSpannable.getSpanStart(t5Var2) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(t5Var2) != emojiSpanRange.end) {
                                    i14++;
                                }
                            }
                        }
                    }
                    t5Var.cacheType = i10;
                    spannableNewSpannable.setSpan(t5Var, emojiSpanRange.start, emojiSpanRange.end, 33);
                } catch (Exception e9) {
                    e = e9;
                    FileLog.e(e);
                }
                if (stickerSet == null) {
                    document = null;
                    break;
                }
                ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                int size = arrayList.size();
                int i15 = 0;
                do {
                    if (i15 >= size) {
                        document = null;
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i15);
                    i15++;
                    document = document2;
                } while (!MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code));
                if (document != null) {
                    t5Var = new org.telegram.ui.Components.t5(document, fontMetricsInt);
                } else {
                    t5Var = new org.telegram.ui.Components.t5(0L, fontMetricsInt);
                }
                t5Var.emoji = emojiSpanRange.code.toString();
            } catch (Exception e10) {
                e = e10;
            }
            int i16 = Build.VERSION.SDK_INT;
            if ((i16 < 23 || i16 >= 29) && i13 + 1 >= i12) {
                break;
            }
        }
        return spannableNewSpannable;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, i10, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10, float f10, int i11) {
        Spannable spannableNewSpannable;
        int i12;
        EmojiDrawable emojiDrawable;
        CharSequence charSequence2;
        String string;
        int i13;
        cq cqVar;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z10 && (charSequence instanceof Spannable)) {
            spannableNewSpannable = (Spannable) charSequence;
        } else {
            spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> emojis = parseEmojis(spannableNewSpannable, iArr);
        if (emojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.t5[] t5VarArr = (org.telegram.ui.Components.t5[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), org.telegram.ui.Components.t5.class);
        cq[] cqVarArr = (cq[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), cq.class);
        int i14 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i11;
        for (int i15 = 0; i15 < emojis.size(); i15++) {
            try {
                EmojiSpanRange emojiSpanRange = emojis.get(i15);
                if (t5VarArr == null || t5VarArr.length <= 0) {
                    if (cqVarArr != null && cqVarArr.length > 0) {
                        i13 = 0;
                        while (true) {
                            if (i13 < cqVarArr.length) {
                                cqVar = cqVarArr[i13];
                                if (cqVar != null || spannableNewSpannable.getSpanStart(cqVar) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(cqVar) != emojiSpanRange.end) {
                                    i13++;
                                }
                            }
                        }
                    }
                    emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                    if (emojiDrawable != null) {
                        EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i10, fontMetricsInt);
                        charSequence2 = emojiSpanRange.code;
                        if (charSequence2 == null) {
                            string = null;
                        } else {
                            string = charSequence2.toString();
                        }
                        emojiSpan.emoji = string;
                        emojiSpan.scale = f10;
                        spannableNewSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                    }
                    i12 = Build.VERSION.SDK_INT;
                    if ((i12 < 23 || i12 >= 29) && i15 + 1 >= i14) {
                        break;
                    }
                } else {
                    int i16 = 0;
                    while (true) {
                        if (i16 < t5VarArr.length) {
                            org.telegram.ui.Components.t5 t5Var = t5VarArr[i16];
                            if (t5Var == null || spannableNewSpannable.getSpanStart(t5Var) != emojiSpanRange.start || spannableNewSpannable.getSpanEnd(t5Var) != emojiSpanRange.end) {
                                i16++;
                            }
                        } else {
                            if (cqVarArr != null) {
                                i13 = 0;
                                while (true) {
                                    if (i13 < cqVarArr.length) {
                                        cqVar = cqVarArr[i13];
                                        if (cqVar != null) {
                                        }
                                        i13++;
                                    }
                                }
                            }
                            emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                            if (emojiDrawable != null) {
                                EmojiSpan emojiSpan2 = new EmojiSpan(emojiDrawable, i10, fontMetricsInt);
                                charSequence2 = emojiSpanRange.code;
                                if (charSequence2 == null) {
                                    string = null;
                                } else {
                                    string = charSequence2.toString();
                                }
                                emojiSpan2.emoji = string;
                                emojiSpan2.scale = f10;
                                spannableNewSpannable.setSpan(emojiSpan2, emojiSpanRange.start, emojiSpanRange.end, 33);
                            }
                            i12 = Build.VERSION.SDK_INT;
                            if (i12 < 23) {
                                break;
                                break;
                            }
                            break;
                            break;
                        }
                    }
                }
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        return spannableNewSpannable;
    }

    public static abstract class EmojiDrawable extends Drawable {
        public boolean fullSize = false;
        int placeholderColor = 268435456;

        public boolean isLoaded() {
            return false;
        }

        public void preload() {
        }
    }

    public static class SimpleEmojiDrawable extends EmojiDrawable {
        private static Paint paint = new Paint(2);
        private static Rect rect = new Rect();
        private DrawableInfo info;
        private boolean invert;

        public SimpleEmojiDrawable(DrawableInfo drawableInfo, boolean z10) {
            this.info = drawableInfo;
            this.invert = z10;
        }

        @Override
        public void draw(Canvas canvas) {
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
                Emoji.placeholderPaint.setColor(this.placeholderColor);
                Rect bounds = getBounds();
                canvas.drawCircle(bounds.centerX(), bounds.centerY(), bounds.width() * 0.4f, Emoji.placeholderPaint);
                return;
            }
            Rect drawRect = this.fullSize ? getDrawRect() : getBounds();
            if (canvas.quickReject(drawRect.left, drawRect.top, drawRect.right, drawRect.bottom, Canvas.EdgeType.AA)) {
                return;
            }
            if (this.invert) {
                canvas.save();
                canvas.scale(-1.0f, 1.0f, drawRect.centerX(), drawRect.centerY());
            }
            Bitmap[][] bitmapArr = Emoji.emojiBmp;
            DrawableInfo drawableInfo2 = this.info;
            canvas.drawBitmap(bitmapArr[drawableInfo2.page][drawableInfo2.page2], (Rect) null, drawRect, paint);
            if (this.invert) {
                canvas.restore();
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

        public DrawableInfo getDrawableInfo() {
            return this.info;
        }

        @Override
        public int getOpacity() {
            return -2;
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

        @Override
        public void setAlpha(int i10) {
            paint.setAlpha(i10);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
