package defpackage;
public final class b41 {
    public static final b41 E;
    public static final b41 F;
    public static final b41 G;
    public static final b41 H;
    public static final b41 I;
    public static final b41 J;
    public static final b41[] K;
    public static final b41 e;
    public static final b41 f;
    public static final b41 h;
    public static final b41 n;
    public static final b41 r;
    public static final b41 s;
    public static final b41 w;
    public static final b41 x;
    public static final b41 y;
    public final String a;
    public final int b;
    public final boolean c;
    public final a41 d;

    static {
        a41 a41Var = a41.SAVED_TO_GALLERY;
        b41 b41Var = new b41("PHOTO", 0, "PhotoSavedHint", 2131746997, a41Var);
        e = b41Var;
        b41 b41Var2 = new b41("PHOTOS", 1, "PhotosSavedHint", a41Var);
        f = b41Var2;
        b41 b41Var3 = new b41("VIDEO", 2, "VideoSavedHint", 2131743269, a41Var);
        h = b41Var3;
        b41 b41Var4 = new b41("VIDEOS", 3, "VideosSavedHint", a41Var);
        n = b41Var4;
        b41 b41Var5 = new b41("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748591, a41Var);
        r = b41Var5;
        b41 b41Var6 = new b41("LIVEPHOTOS", 5, "LivePhotosSavedHint", a41Var);
        s = b41Var6;
        b41 b41Var7 = new b41("MEDIA", 6, "MediaSavedHint", a41Var);
        w = b41Var7;
        a41 a41Var2 = a41.SAVED_TO_DOWNLOADS;
        b41 b41Var8 = new b41("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131746996, a41Var2);
        x = b41Var8;
        b41 b41Var9 = new b41("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743268, a41Var2);
        y = b41Var9;
        b41 b41Var10 = new b41("GIF", 9, "GifSavedHint", 2131750403, a41.SAVED_TO_GIFS);
        E = b41Var10;
        b41 b41Var11 = new b41("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750402, a41Var2);
        F = b41Var11;
        a41 a41Var3 = a41.SAVED_TO_MUSIC;
        b41 b41Var12 = new b41("AUDIO", 11, "AudioSavedHint", 2131753873, a41Var3);
        G = b41Var12;
        b41 b41Var13 = new b41("AUDIOS", 12, "AudiosSavedHint", a41Var3);
        H = b41Var13;
        b41 b41Var14 = new b41("UNKNOWN", 13, "FileSavedHintLinked", 2131750765, a41Var2);
        I = b41Var14;
        b41 b41Var15 = new b41("UNKNOWNS", 14, "FilesSavedHintLinked", a41Var2);
        J = b41Var15;
        K = new b41[]{b41Var, b41Var2, b41Var3, b41Var4, b41Var5, b41Var6, b41Var7, b41Var8, b41Var9, b41Var10, b41Var11, b41Var12, b41Var13, b41Var14, b41Var15};
    }

    public b41(String str, int i, String str2, a41 a41Var) {
        this.a = str2;
        this.d = a41Var;
        this.b = 0;
        this.c = true;
    }

    public static b41 valueOf(String str) {
        return (b41) Enum.valueOf(b41.class, str);
    }

    public static b41[] values() {
        return (b41[]) K.clone();
    }

    public b41(String str, int i, String str2, int i2, a41 a41Var) {
        this.a = str2;
        this.b = i2;
        this.d = a41Var;
        this.c = false;
    }
}
