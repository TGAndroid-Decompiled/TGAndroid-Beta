package defpackage;
public final class t21 {
    public static final t21 E;
    public static final t21 F;
    public static final t21 G;
    public static final t21 H;
    public static final t21 I;
    public static final t21 J;
    public static final t21[] K;
    public static final t21 e;
    public static final t21 f;
    public static final t21 h;
    public static final t21 n;
    public static final t21 r;
    public static final t21 s;
    public static final t21 w;
    public static final t21 x;
    public static final t21 y;
    public final String a;
    public final int b;
    public final boolean c;
    public final s21 d;

    static {
        s21 s21Var = s21.SAVED_TO_GALLERY;
        t21 t21Var = new t21("PHOTO", 0, "PhotoSavedHint", 2131747071, s21Var);
        e = t21Var;
        t21 t21Var2 = new t21("PHOTOS", 1, "PhotosSavedHint", s21Var);
        f = t21Var2;
        t21 t21Var3 = new t21("VIDEO", 2, "VideoSavedHint", 2131743343, s21Var);
        h = t21Var3;
        t21 t21Var4 = new t21("VIDEOS", 3, "VideosSavedHint", s21Var);
        n = t21Var4;
        t21 t21Var5 = new t21("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748642, s21Var);
        r = t21Var5;
        t21 t21Var6 = new t21("LIVEPHOTOS", 5, "LivePhotosSavedHint", s21Var);
        s = t21Var6;
        t21 t21Var7 = new t21("MEDIA", 6, "MediaSavedHint", s21Var);
        w = t21Var7;
        s21 s21Var2 = s21.SAVED_TO_DOWNLOADS;
        t21 t21Var8 = new t21("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131747070, s21Var2);
        x = t21Var8;
        t21 t21Var9 = new t21("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743342, s21Var2);
        y = t21Var9;
        t21 t21Var10 = new t21("GIF", 9, "GifSavedHint", 2131750454, s21.SAVED_TO_GIFS);
        E = t21Var10;
        t21 t21Var11 = new t21("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750453, s21Var2);
        F = t21Var11;
        s21 s21Var3 = s21.SAVED_TO_MUSIC;
        t21 t21Var12 = new t21("AUDIO", 11, "AudioSavedHint", 2131753905, s21Var3);
        G = t21Var12;
        t21 t21Var13 = new t21("AUDIOS", 12, "AudiosSavedHint", s21Var3);
        H = t21Var13;
        t21 t21Var14 = new t21("UNKNOWN", 13, "FileSavedHintLinked", 2131750816, s21Var2);
        I = t21Var14;
        t21 t21Var15 = new t21("UNKNOWNS", 14, "FilesSavedHintLinked", s21Var2);
        J = t21Var15;
        K = new t21[]{t21Var, t21Var2, t21Var3, t21Var4, t21Var5, t21Var6, t21Var7, t21Var8, t21Var9, t21Var10, t21Var11, t21Var12, t21Var13, t21Var14, t21Var15};
    }

    public t21(String str, int i, String str2, s21 s21Var) {
        this.a = str2;
        this.d = s21Var;
        this.b = 0;
        this.c = true;
    }

    public static t21 valueOf(String str) {
        return (t21) Enum.valueOf(t21.class, str);
    }

    public static t21[] values() {
        return (t21[]) K.clone();
    }

    public t21(String str, int i, String str2, int i2, s21 s21Var) {
        this.a = str2;
        this.b = i2;
        this.d = s21Var;
        this.c = false;
    }
}
