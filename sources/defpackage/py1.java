package defpackage;
public final class py1 {
    public static final py1 d;
    public static final py1 e;
    public static final py1[] f;
    public final oy1 a;
    public final oy1 b;
    public final int c;

    static {
        oy1 oy1Var = oy1.a;
        oy1 oy1Var2 = oy1.b;
        py1 py1Var = new py1("VOICE_TO_VIDEO", 0, oy1Var, oy1Var2, 2131624325);
        d = py1Var;
        oy1 oy1Var3 = oy1.c;
        oy1 oy1Var4 = oy1.d;
        py1 py1Var2 = new py1("STICKER_TO_KEYBOARD", 1, oy1Var3, oy1Var4, 2131624224);
        oy1 oy1Var5 = oy1.e;
        py1 py1Var3 = new py1("SMILE_TO_KEYBOARD", 2, oy1Var5, oy1Var4, 2131624191);
        py1 py1Var4 = new py1("VIDEO_TO_VOICE", 3, oy1Var2, oy1Var, 2131624325);
        e = py1Var4;
        py1 py1Var5 = new py1("KEYBOARD_TO_STICKER", 4, oy1Var4, oy1Var3, 2131624076);
        oy1 oy1Var6 = oy1.f;
        f = new py1[]{py1Var, py1Var2, py1Var3, py1Var4, py1Var5, new py1("KEYBOARD_TO_GIF", 5, oy1Var4, oy1Var6, 2131624074), new py1("KEYBOARD_TO_SMILE", 6, oy1Var4, oy1Var5, 2131624075), new py1("GIF_TO_KEYBOARD", 7, oy1Var6, oy1Var4, 2131624032), new py1("GIF_TO_SMILE", 8, oy1Var6, oy1Var5, 2131624033), new py1("SMILE_TO_GIF", 9, oy1Var5, oy1Var6, 2131624190), new py1("SMILE_TO_STICKER", 10, oy1Var5, oy1Var3, 2131624192), new py1("STICKER_TO_SMILE", 11, oy1Var3, oy1Var5, 2131624225)};
    }

    public py1(String str, int i, oy1 oy1Var, oy1 oy1Var2, int i2) {
        this.a = oy1Var;
        this.b = oy1Var2;
        this.c = i2;
    }

    public static py1 valueOf(String str) {
        return (py1) Enum.valueOf(py1.class, str);
    }

    public static py1[] values() {
        return (py1[]) f.clone();
    }
}
