package defpackage;
public final class c31 {
    public static final c31 E;
    public static final c31 F;
    public static final c31 G;
    public static final c31 H;
    public static final c31 I;
    public static final c31 J;
    public static final c31[] K;
    public static final c31 e;
    public static final c31 f;
    public static final c31 h;
    public static final c31 n;
    public static final c31 r;
    public static final c31 s;
    public static final c31 w;
    public static final c31 x;
    public static final c31 y;
    public final String a;
    public final int b;
    public final boolean c;
    public final b31 d;

    static {
        b31 b31Var = b31.SAVED_TO_GALLERY;
        c31 c31Var = new c31("PHOTO", 0, "PhotoSavedHint", 2131746991, b31Var);
        e = c31Var;
        c31 c31Var2 = new c31("PHOTOS", 1, "PhotosSavedHint", b31Var);
        f = c31Var2;
        c31 c31Var3 = new c31("VIDEO", 2, "VideoSavedHint", 2131743237, b31Var);
        h = c31Var3;
        c31 c31Var4 = new c31("VIDEOS", 3, "VideosSavedHint", b31Var);
        n = c31Var4;
        c31 c31Var5 = new c31("LIVEPHOTO", 4, "LivePhotoSavedHint", 2131748588, b31Var);
        r = c31Var5;
        c31 c31Var6 = new c31("LIVEPHOTOS", 5, "LivePhotosSavedHint", b31Var);
        s = c31Var6;
        c31 c31Var7 = new c31("MEDIA", 6, "MediaSavedHint", b31Var);
        w = c31Var7;
        b31 b31Var2 = b31.SAVED_TO_DOWNLOADS;
        c31 c31Var8 = new c31("PHOTO_TO_DOWNLOADS", 7, "PhotoSavedToDownloadsHintLinked", 2131746990, b31Var2);
        x = c31Var8;
        c31 c31Var9 = new c31("VIDEO_TO_DOWNLOADS", 8, "VideoSavedToDownloadsHintLinked", 2131743236, b31Var2);
        y = c31Var9;
        c31 c31Var10 = new c31("GIF", 9, "GifSavedHint", 2131750431, b31.SAVED_TO_GIFS);
        E = c31Var10;
        c31 c31Var11 = new c31("GIF_TO_DOWNLOADS", 10, "GifSavedToDownloadsHintLinked", 2131750430, b31Var2);
        F = c31Var11;
        b31 b31Var3 = b31.SAVED_TO_MUSIC;
        c31 c31Var12 = new c31("AUDIO", 11, "AudioSavedHint", 2131753901, b31Var3);
        G = c31Var12;
        c31 c31Var13 = new c31("AUDIOS", 12, "AudiosSavedHint", b31Var3);
        H = c31Var13;
        c31 c31Var14 = new c31("UNKNOWN", 13, "FileSavedHintLinked", 2131750793, b31Var2);
        I = c31Var14;
        c31 c31Var15 = new c31("UNKNOWNS", 14, "FilesSavedHintLinked", b31Var2);
        J = c31Var15;
        K = new c31[]{c31Var, c31Var2, c31Var3, c31Var4, c31Var5, c31Var6, c31Var7, c31Var8, c31Var9, c31Var10, c31Var11, c31Var12, c31Var13, c31Var14, c31Var15};
    }

    public c31(String str, int i, String str2, b31 b31Var) {
        this.a = str2;
        this.d = b31Var;
        this.b = 0;
        this.c = true;
    }

    public static c31 valueOf(String str) {
        return (c31) Enum.valueOf(c31.class, str);
    }

    public static c31[] values() {
        return (c31[]) K.clone();
    }

    public c31(String str, int i, String str2, int i2, b31 b31Var) {
        this.a = str2;
        this.b = i2;
        this.d = b31Var;
        this.c = false;
    }
}
