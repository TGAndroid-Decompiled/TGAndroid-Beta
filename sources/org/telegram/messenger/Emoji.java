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
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import j$.util.Objects;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nq;
public class Emoji {
    private static final String[] DEFAULT_RECENT;
    private static final int MAX_RECENT_EMOJI_COUNT = 48;
    public static int bigImgSize;
    public static int drawImgSize;
    private static Bitmap[][] emojiBmp;
    public static final HashMap<String, String> emojiColor;
    private static final int[] emojiCounts;
    public static boolean emojiDrawingUseAlpha;
    public static float emojiDrawingYOffset;
    public static final HashMap<String, Integer> emojiUseHistory;
    public static final Runnable invalidateUiRunnable;
    private static boolean[][] loadingEmoji;
    private static int memoryUsage;
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
        float f7;
        String[][] strArr = EmojiData.data;
        emojiCounts = new int[]{strArr[0].length, strArr[1].length, strArr[2].length, strArr[3].length, strArr[4].length, strArr[5].length, strArr[6].length, strArr[7].length};
        emojiBmp = new Bitmap[8];
        loadingEmoji = new boolean[8];
        emojiUseHistory = new HashMap<>();
        recentEmoji = new ArrayList<>();
        emojiColor = new HashMap<>();
        invalidateUiRunnable = new u1(8);
        emojiDrawingUseAlpha = true;
        DEFAULT_RECENT = new String[]{"😂", "😘", "❤", "😍", "😊", "😁", "👍", "☺", "😔", "😄", "😭", "💋", "😒", "😳", "😜", "🙈", "😉", "😃", "😢", "😝", "😱", "😡", "😏", "😞", "😅", "😚", "🙊", "😌", "😀", "😋", "😆", "👌", "😐", "😕"};
        drawImgSize = AndroidUtilities.dp(20.0f);
        if (AndroidUtilities.isTablet()) {
            f7 = 40.0f;
        } else {
            f7 = 34.0f;
        }
        bigImgSize = AndroidUtilities.dp(f7);
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
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num = hashMap.get(str);
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 && hashMap.size() >= 48) {
            ArrayList<String> arrayList = recentEmoji;
            hashMap.remove((String) i2.g.h(1, arrayList));
            arrayList.set(arrayList.size() - 1, str);
        }
        hashMap.put(str, Integer.valueOf(num.intValue() + 1));
    }

    public static void clearRecentEmoji() {
        MessagesController.getGlobalEmojiSettings().edit().putBoolean("filled_default", true).commit();
        emojiUseHistory.clear();
        recentEmoji.clear();
        saveRecentEmoji();
    }

    public static boolean endsWithRightArrow(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 2 && charSequence.charAt(charSequence.length() - 2) == 8205 && charSequence.charAt(charSequence.length() - 1) == 10145) {
            return true;
        }
        return false;
    }

    public static String fixEmoji(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 55356 && charAt <= 55358) {
                if (charAt == 55356 && i10 < length - 1) {
                    int i11 = i10 + 1;
                    char charAt2 = str.charAt(i11);
                    if (charAt2 != 56879 && charAt2 != 56324 && charAt2 != 56858 && charAt2 != 56703) {
                        i10 = i11;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        i10 += 2;
                        sb2.append(str.substring(0, i10));
                        sb2.append("️");
                        sb2.append(str.substring(i10));
                        str = sb2.toString();
                        length++;
                    }
                } else {
                    i10++;
                }
            } else if (charAt == 8419) {
                return str;
            } else {
                if (charAt >= 8252 && charAt <= 12953 && EmojiData.emojiToFE0FMap.containsKey(Character.valueOf(charAt))) {
                    StringBuilder sb3 = new StringBuilder();
                    i10++;
                    sb3.append(str.substring(0, i10));
                    sb3.append("️");
                    sb3.append(str.substring(i10));
                    str = sb3.toString();
                    length++;
                }
            }
            i10++;
        }
        return str;
    }

    public static boolean fullyConsistsOfEmojis(CharSequence charSequence) {
        int[] iArr = new int[1];
        parseEmojis(charSequence, iArr);
        if (iArr[0] > 0) {
            return true;
        }
        return false;
    }

    private static DrawableInfo getDrawableInfo(CharSequence charSequence) {
        CharSequence charSequence2;
        if (endsWithRightArrow(charSequence)) {
            charSequence = charSequence.subSequence(0, charSequence.length() - 2);
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            return hashMap.get(charSequence2);
        }
        return drawableInfo;
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
        if (drawableInfo == null) {
            if (charSequence != null && (compoundEmojiDrawable = CompoundEmoji.getCompoundEmojiDrawable(charSequence.toString())) != null) {
                int i10 = drawImgSize;
                compoundEmojiDrawable.setBounds(0, 0, i10, i10);
                return compoundEmojiDrawable;
            }
            return null;
        }
        SimpleEmojiDrawable simpleEmojiDrawable = new SimpleEmojiDrawable(drawableInfo, endsWithRightArrow(charSequence));
        int i11 = drawImgSize;
        simpleEmojiDrawable.setBounds(0, 0, i11, i11);
        return simpleEmojiDrawable;
    }

    public static void invalidateAll(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                invalidateAll(viewGroup.getChildAt(i10));
            }
        } else if (view instanceof TextView) {
            view.invalidate();
        }
    }

    public static boolean isValidEmoji(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        HashMap<CharSequence, DrawableInfo> hashMap = rects;
        DrawableInfo drawableInfo = hashMap.get(charSequence);
        if (drawableInfo == null && (charSequence2 = EmojiData.emojiAliasMap.get(charSequence)) != null) {
            drawableInfo = hashMap.get(charSequence2);
        }
        if (drawableInfo == null) {
            return false;
        }
        return true;
    }

    public static void lambda$loadEmoji$1(byte r13, short r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.Emoji.lambda$loadEmoji$1(byte, short):void");
    }

    public static int lambda$sortEmoji$3(String str, String str2) {
        Integer num = 0;
        HashMap<String, Integer> hashMap = emojiUseHistory;
        Integer num2 = hashMap.get(str);
        Integer num3 = hashMap.get(str2);
        if (num2 == null) {
            num2 = num;
        }
        if (num3 != null) {
            num = num3;
        }
        if (num2.intValue() > num.intValue()) {
            return -1;
        }
        if (num2.intValue() >= num.intValue()) {
            return 0;
        }
        return 1;
    }

    public static void lambda$static$0() {
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.emojiLoaded, new Object[0]);
    }

    public static Bitmap loadBitmap(String str) {
        int i10;
        Bitmap bitmap;
        try {
            if (AndroidUtilities.density <= 1.0f) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            try {
                InputStream open = ApplicationLoader.applicationContext.getAssets().open(str);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = false;
                options.inSampleSize = i10;
                bitmap = BitmapFactory.decodeStream(open, null, options);
                try {
                    open.close();
                    return bitmap;
                } catch (Throwable th2) {
                    th = th2;
                    FileLog.e(th);
                    return bitmap;
                }
            } catch (Throwable th3) {
                th = th3;
                bitmap = null;
            }
        } catch (Throwable th4) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("Error loading emoji", th4);
            }
            return null;
        }
    }

    public static void loadEmoji(final byte b10, final short s10) {
        if (emojiBmp[b10][s10] == null) {
            boolean[] zArr = loadingEmoji[b10];
            if (!zArr[s10]) {
                zArr[s10] = true;
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        Emoji.lambda$loadEmoji$1(b10, s10);
                    }
                });
            }
        }
    }

    public static void loadRecentEmoji() {
        String string;
        if (!recentEmojiLoaded) {
            recentEmojiLoaded = true;
            SharedPreferences globalEmojiSettings = MessagesController.getGlobalEmojiSettings();
            try {
                emojiUseHistory.clear();
                if (globalEmojiSettings.contains("emojis")) {
                    try {
                        String string2 = globalEmojiSettings.getString("emojis", "");
                        if (string2 != null && string2.length() > 0) {
                            for (String str : string2.split(",")) {
                                String[] split = str.split("=");
                                long longValue = Utilities.parseLong(split[0]).longValue();
                                StringBuilder sb2 = new StringBuilder();
                                for (int i10 = 0; i10 < 4; i10++) {
                                    sb2.insert(0, (char) longValue);
                                    longValue >>= 16;
                                    if (longValue == 0) {
                                        break;
                                    }
                                }
                                if (sb2.length() > 0) {
                                    emojiUseHistory.put(sb2.toString(), Utilities.parseInt((CharSequence) split[1]));
                                }
                            }
                        }
                        globalEmojiSettings.edit().remove("emojis").commit();
                        saveRecentEmoji();
                    } catch (Exception e7) {
                        e = e7;
                        FileLog.e(e);
                        string = globalEmojiSettings.getString("color", "");
                        if (string == null) {
                        }
                        return;
                    }
                } else {
                    String string3 = globalEmojiSettings.getString("emojis2", "");
                    if (string3 != null && string3.length() > 0) {
                        for (String str2 : string3.split(",")) {
                            String[] split2 = str2.split("=");
                            emojiUseHistory.put(split2[0], Utilities.parseInt((CharSequence) split2[1]));
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
                string = globalEmojiSettings.getString("color", "");
                if (string == null && string.length() > 0) {
                    for (String str3 : string.split(",")) {
                        String[] split3 = str3.split("=");
                        emojiColor.put(split3[0], split3[1]);
                    }
                }
            } catch (Exception e11) {
                FileLog.e(e11);
            }
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
        HashMap<String, Integer> hashMap = emojiUseHistory;
        hashMap.remove(str);
        ArrayList<String> arrayList = recentEmoji;
        arrayList.remove(str);
        if (!hashMap.isEmpty() && !arrayList.isEmpty()) {
            return;
        }
        addRecentEmoji(DEFAULT_RECENT[0]);
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
        for (Map.Entry<String, Integer> entry : emojiUseHistory.entrySet()) {
            recentEmoji.add(entry.getKey());
        }
        Collections.sort(recentEmoji, new d(4));
        while (true) {
            ArrayList<String> arrayList = recentEmoji;
            if (arrayList.size() > 48) {
                a4.a.x(1, arrayList);
            } else {
                return;
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
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
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
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
            boolean z10;
            this.lastDrawX = a4.a.A(this.scale, this.size, 2.0f, f7);
            this.lastDrawY = ((i14 - i12) / 2.0f) + i12;
            boolean z11 = true;
            this.drawn = true;
            if (paint.getAlpha() != 255 && Emoji.emojiDrawingUseAlpha) {
                getDrawable().setAlpha(paint.getAlpha());
                z10 = true;
            } else {
                z10 = false;
            }
            float f10 = Emoji.emojiDrawingYOffset;
            int i15 = this.size;
            float f11 = f10 - ((i15 - (this.scale * i15)) / 2.0f);
            if (f11 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, f11);
            } else {
                z11 = false;
            }
            super.draw(canvas, charSequence, i10, i11, f7, i12, i13, i14, paint);
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
            boolean z10;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
            if (this.preserveFontMetrics && fontMetricsInt2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i12 = fontMetricsInt2.top;
            } else {
                i12 = 0;
            }
            if (z10) {
                i13 = fontMetricsInt2.ascent;
            } else {
                i13 = 0;
            }
            if (z10) {
                i14 = fontMetricsInt2.descent;
            } else {
                i14 = 0;
            }
            if (z10) {
                i15 = fontMetricsInt2.bottom;
            } else {
                i15 = 0;
            }
            if (z10) {
                i16 = fontMetricsInt2.leading;
            } else {
                i16 = 0;
            }
            if (fontMetricsInt2 == null) {
                fontMetricsInt2 = new Paint.FontMetricsInt();
            }
            Paint.FontMetricsInt fontMetricsInt3 = fontMetricsInt2;
            int i17 = (int) (this.scale * this.size);
            Paint.FontMetricsInt fontMetricsInt4 = this.fontMetrics;
            if (fontMetricsInt4 == null) {
                int size = super.getSize(paint, charSequence, i10, i11, fontMetricsInt3);
                int dp = AndroidUtilities.dp(8.0f);
                int dp2 = AndroidUtilities.dp(10.0f);
                int i18 = (-dp2) - dp;
                fontMetricsInt3.top = i18;
                int i19 = dp2 - dp;
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
                int abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
                this.size = abs;
                if (abs == 0) {
                    this.size = AndroidUtilities.dp(20.0f);
                }
            }
        }
    }

    public static java.util.ArrayList<org.telegram.messenger.Emoji.EmojiSpanRange> parseEmojis(java.lang.CharSequence r28, int[] r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.Emoji.parseEmojis(java.lang.CharSequence, int[]):java.util.ArrayList");
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, float f7) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, null, 0, f7, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, Runnable runnable) {
        return replaceWithRestrictedEmoji(charSequence, fontMetricsInt, 20, runnable);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, 0);
    }

    public static CharSequence replaceWithRestrictedEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, int i10, Runnable runnable) {
        Spannable newSpannable;
        int i11;
        EmojiSpanRange emojiSpanRange;
        TLRPC.Document document;
        org.telegram.ui.Components.z5 z5Var;
        int i12;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        int i13 = UserConfig.selectedAccount;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i13).getStickerSet(tL_inputStickerSetShortName, 0, false, true, runnable == null ? null : new z0(runnable, 1));
        if (charSequence instanceof Spannable) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence.toString());
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, null);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.z5.class);
        int i14 = SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50;
        for (int i15 = 0; i15 < parseEmojis.size(); i15++) {
            try {
                emojiSpanRange = parseEmojis.get(i15);
                if (z5VarArr != null) {
                    while (i12 < z5VarArr.length) {
                        org.telegram.ui.Components.z5 z5Var2 = z5VarArr[i12];
                        i12 = (z5Var2 != null && newSpannable.getSpanStart(z5Var2) == emojiSpanRange.start && newSpannable.getSpanEnd(z5Var2) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                if (stickerSet != null) {
                    ArrayList<TLRPC.Document> arrayList = stickerSet.documents;
                    int size = arrayList.size();
                    int i16 = 0;
                    while (i16 < size) {
                        TLRPC.Document document2 = arrayList.get(i16);
                        i16++;
                        document = document2;
                        if (MessageObject.findAnimatedEmojiEmoticon(document, null).contains(emojiSpanRange.code)) {
                            break;
                        }
                    }
                }
                document = null;
                if (document != null) {
                    z5Var = new org.telegram.ui.Components.z5(document, fontMetricsInt);
                } else {
                    z5Var = new org.telegram.ui.Components.z5(0L, fontMetricsInt);
                }
                z5Var.emoji = emojiSpanRange.code.toString();
            } catch (Exception e7) {
                e = e7;
            }
            try {
                z5Var.cacheType = i10;
                newSpannable.setSpan(z5Var, emojiSpanRange.start, emojiSpanRange.end, 33);
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
                i11 = Build.VERSION.SDK_INT;
                if (i11 >= 23) {
                }
                break;
                return newSpannable;
            }
            i11 = Build.VERSION.SDK_INT;
            if ((i11 >= 23 || i11 >= 29) && i15 + 1 >= i14) {
                break;
            }
        }
        return newSpannable;
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10) {
        return replaceEmoji(charSequence, fontMetricsInt, z10, iArr, i10, 1.0f, 0);
    }

    public static CharSequence replaceEmoji(CharSequence charSequence, Paint.FontMetricsInt fontMetricsInt, boolean z10, int[] iArr, int i10, float f7, int i11) {
        Spannable newSpannable;
        int i12;
        int i13;
        if (SharedConfig.useSystemEmoji || charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        if (!z10 && (charSequence instanceof Spannable)) {
            newSpannable = (Spannable) charSequence;
        } else {
            newSpannable = Spannable.Factory.getInstance().newSpannable(charSequence);
        }
        ArrayList<EmojiSpanRange> parseEmojis = parseEmojis(newSpannable, iArr);
        if (parseEmojis.isEmpty()) {
            return charSequence;
        }
        org.telegram.ui.Components.z5[] z5VarArr = (org.telegram.ui.Components.z5[]) newSpannable.getSpans(0, newSpannable.length(), org.telegram.ui.Components.z5.class);
        nq[] nqVarArr = (nq[]) newSpannable.getSpans(0, newSpannable.length(), nq.class);
        int i14 = (SharedConfig.getDevicePerformanceClass() >= 2 ? 100 : 50) - i11;
        for (int i15 = 0; i15 < parseEmojis.size(); i15++) {
            try {
                EmojiSpanRange emojiSpanRange = parseEmojis.get(i15);
                if (z5VarArr != null && z5VarArr.length > 0) {
                    while (i13 < z5VarArr.length) {
                        org.telegram.ui.Components.z5 z5Var = z5VarArr[i13];
                        i13 = (z5Var != null && newSpannable.getSpanStart(z5Var) == emojiSpanRange.start && newSpannable.getSpanEnd(z5Var) == emojiSpanRange.end) ? 0 : i13 + 1;
                    }
                }
                if (nqVarArr != null && nqVarArr.length > 0) {
                    while (i12 < nqVarArr.length) {
                        nq nqVar = nqVarArr[i12];
                        i12 = (nqVar != null && newSpannable.getSpanStart(nqVar) == emojiSpanRange.start && newSpannable.getSpanEnd(nqVar) == emojiSpanRange.end) ? 0 : i12 + 1;
                    }
                }
                EmojiDrawable emojiDrawable = getEmojiDrawable(emojiSpanRange.code);
                if (emojiDrawable != null) {
                    EmojiSpan emojiSpan = new EmojiSpan(emojiDrawable, i10, fontMetricsInt);
                    CharSequence charSequence2 = emojiSpanRange.code;
                    emojiSpan.emoji = charSequence2 == null ? null : charSequence2.toString();
                    emojiSpan.scale = f7;
                    newSpannable.setSpan(emojiSpan, emojiSpanRange.start, emojiSpanRange.end, 33);
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            int i16 = Build.VERSION.SDK_INT;
            if ((i16 < 23 || i16 >= 29) && i15 + 1 >= i14) {
                break;
            }
        }
        return newSpannable;
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
            if (!canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
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
        }

        public Rect getDrawRect() {
            int i10;
            int i11;
            int i12;
            int i13;
            Rect bounds = getBounds();
            int centerX = bounds.centerX();
            int centerY = bounds.centerY();
            Rect rect2 = rect;
            boolean z10 = this.fullSize;
            if (z10) {
                i10 = Emoji.bigImgSize;
            } else {
                i10 = Emoji.drawImgSize;
            }
            rect2.left = centerX - (i10 / 2);
            Rect rect3 = rect;
            if (z10) {
                i11 = Emoji.bigImgSize;
            } else {
                i11 = Emoji.drawImgSize;
            }
            rect3.right = (i11 / 2) + centerX;
            Rect rect4 = rect;
            if (z10) {
                i12 = Emoji.bigImgSize;
            } else {
                i12 = Emoji.drawImgSize;
            }
            rect4.top = centerY - (i12 / 2);
            Rect rect5 = rect;
            if (z10) {
                i13 = Emoji.bigImgSize;
            } else {
                i13 = Emoji.drawImgSize;
            }
            rect5.bottom = (i13 / 2) + centerY;
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
            if (bitmapArr[drawableInfo.page][drawableInfo.page2] != null) {
                return true;
            }
            return false;
        }

        @Override
        public void preload() {
            if (!isLoaded()) {
                DrawableInfo drawableInfo = this.info;
                Emoji.loadEmoji(drawableInfo.page, drawableInfo.page2);
            }
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
