package defpackage;
public final class c02 {
    public static final c02 d;
    public static final c02 e;
    public static final c02[] f;
    public final b02 a;
    public final b02 b;
    public final int c;

    static {
        b02 b02Var = b02.a;
        b02 b02Var2 = b02.b;
        c02 c02Var = new c02("VOICE_TO_VIDEO", 0, b02Var, b02Var2, 2131624326);
        d = c02Var;
        b02 b02Var3 = b02.c;
        b02 b02Var4 = b02.d;
        c02 c02Var2 = new c02("STICKER_TO_KEYBOARD", 1, b02Var3, b02Var4, 2131624224);
        b02 b02Var5 = b02.e;
        c02 c02Var3 = new c02("SMILE_TO_KEYBOARD", 2, b02Var5, b02Var4, 2131624191);
        c02 c02Var4 = new c02("VIDEO_TO_VOICE", 3, b02Var2, b02Var, 2131624326);
        e = c02Var4;
        c02 c02Var5 = new c02("KEYBOARD_TO_STICKER", 4, b02Var4, b02Var3, 2131624076);
        b02 b02Var6 = b02.f;
        f = new c02[]{c02Var, c02Var2, c02Var3, c02Var4, c02Var5, new c02("KEYBOARD_TO_GIF", 5, b02Var4, b02Var6, 2131624074), new c02("KEYBOARD_TO_SMILE", 6, b02Var4, b02Var5, 2131624075), new c02("GIF_TO_KEYBOARD", 7, b02Var6, b02Var4, 2131624032), new c02("GIF_TO_SMILE", 8, b02Var6, b02Var5, 2131624033), new c02("SMILE_TO_GIF", 9, b02Var5, b02Var6, 2131624190), new c02("SMILE_TO_STICKER", 10, b02Var5, b02Var3, 2131624192), new c02("STICKER_TO_SMILE", 11, b02Var3, b02Var5, 2131624225)};
    }

    public c02(String str, int i, b02 b02Var, b02 b02Var2, int i2) {
        this.a = b02Var;
        this.b = b02Var2;
        this.c = i2;
    }

    public static c02 valueOf(String str) {
        return (c02) Enum.valueOf(c02.class, str);
    }

    public static c02[] values() {
        return (c02[]) f.clone();
    }
}
