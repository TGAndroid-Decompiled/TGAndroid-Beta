package defpackage;
public final class hz1 {
    public static final hz1 d;
    public static final hz1 e;
    public static final hz1[] f;
    public final gz1 a;
    public final gz1 b;
    public final int c;

    static {
        gz1 gz1Var = gz1.a;
        gz1 gz1Var2 = gz1.b;
        hz1 hz1Var = new hz1("VOICE_TO_VIDEO", 0, gz1Var, gz1Var2, 2131624326);
        d = hz1Var;
        gz1 gz1Var3 = gz1.c;
        gz1 gz1Var4 = gz1.d;
        hz1 hz1Var2 = new hz1("STICKER_TO_KEYBOARD", 1, gz1Var3, gz1Var4, 2131624224);
        gz1 gz1Var5 = gz1.e;
        hz1 hz1Var3 = new hz1("SMILE_TO_KEYBOARD", 2, gz1Var5, gz1Var4, 2131624191);
        hz1 hz1Var4 = new hz1("VIDEO_TO_VOICE", 3, gz1Var2, gz1Var, 2131624326);
        e = hz1Var4;
        hz1 hz1Var5 = new hz1("KEYBOARD_TO_STICKER", 4, gz1Var4, gz1Var3, 2131624076);
        gz1 gz1Var6 = gz1.f;
        f = new hz1[]{hz1Var, hz1Var2, hz1Var3, hz1Var4, hz1Var5, new hz1("KEYBOARD_TO_GIF", 5, gz1Var4, gz1Var6, 2131624074), new hz1("KEYBOARD_TO_SMILE", 6, gz1Var4, gz1Var5, 2131624075), new hz1("GIF_TO_KEYBOARD", 7, gz1Var6, gz1Var4, 2131624032), new hz1("GIF_TO_SMILE", 8, gz1Var6, gz1Var5, 2131624033), new hz1("SMILE_TO_GIF", 9, gz1Var5, gz1Var6, 2131624190), new hz1("SMILE_TO_STICKER", 10, gz1Var5, gz1Var3, 2131624192), new hz1("STICKER_TO_SMILE", 11, gz1Var3, gz1Var5, 2131624225)};
    }

    public hz1(String str, int i, gz1 gz1Var, gz1 gz1Var2, int i2) {
        this.a = gz1Var;
        this.b = gz1Var2;
        this.c = i2;
    }

    public static hz1 valueOf(String str) {
        return (hz1) Enum.valueOf(hz1.class, str);
    }

    public static hz1[] values() {
        return (hz1[]) f.clone();
    }
}
