package defpackage;
public final class tz4 {
    public static final tz4 E;
    public static final tz4 F;
    public static final tz4 G;
    public static final tz4 H;
    public static final tz4 I;
    public static final tz4 J;
    public static final tz4 K;
    public static final tz4 L;
    public static final tz4 M;
    public static final tz4 N;
    public static final tz4 O;
    public static final tz4 P;
    public static final tz4 Q;
    public static final tz4 R;
    public static final tz4 S;
    public static final tz4 T;
    public static final tz4[] U;
    public static final tz4 f;
    public static final tz4 h;
    public static final tz4 n;
    public static final tz4 r;
    public static final tz4 s;
    public static final tz4 w;
    public static final tz4 x;
    public static final tz4 y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    tz4 EF9;
    tz4 EF1;

    static {
        tz4 tz4Var = new tz4("CONTACTS", 0, 2131624254);
        f = tz4Var;
        tz4 tz4Var2 = new tz4("NEWS", 1, 2131624269);
        h = tz4Var2;
        tz4 tz4Var3 = new tz4("CALLS", 2, 2131624248);
        n = tz4Var3;
        tz4 tz4Var4 = new tz4("CHATS", 3, 2131624249);
        r = tz4Var4;
        tz4 tz4Var5 = new tz4("SETTINGS", 4, 2131624274);
        s = tz4Var5;
        tz4 tz4Var6 = new tz4(5, 2131624250, 2131624251, "CHECKLIST");
        w = tz4Var6;
        tz4 tz4Var7 = new tz4(6, 2131624252, 2131624253, "COLORS");
        x = tz4Var7;
        tz4 tz4Var8 = new tz4(7, 2131624257, 2131624258, "FILES");
        y = tz4Var8;
        tz4 tz4Var9 = new tz4(8, 2131624259, 2131624260, "GALLERY");
        E = tz4Var9;
        tz4 tz4Var10 = new tz4(9, 2131624261, 2131624262, "GIFT");
        tz4 tz4Var11 = new tz4(10, 2131624263, 2131624264, "LOCATION");
        F = tz4Var11;
        tz4 tz4Var12 = new tz4(11, 2131624275, 2131624276, "STICKER");
        G = tz4Var12;
        tz4 tz4Var13 = new tz4(12, 2131624255, 2131624256, "EMOJI");
        H = tz4Var13;
        tz4 tz4Var14 = new tz4(13, 2131624265, 2131624266, "MODELS");
        I = tz4Var14;
        tz4 tz4Var15 = new tz4(14, 2131624267, 2131624268, "MUSIC");
        J = tz4Var15;
        tz4 tz4Var16 = new tz4(15, 2131624270, 2131624271, "POLL");
        K = tz4Var16;
        tz4 tz4Var17 = new tz4(16, 2131624277, 2131624278, "SYMBOLS");
        L = tz4Var17;
        tz4 tz4Var18 = new tz4(17, 2131624272, 2131624273, "REPLIES");
        M = tz4Var18;
        tz4 tz4Var19 = new tz4(18, 2131624279, 2131624280, "WALLET");
        tz4 tz4Var20 = new tz4();
        N = tz4Var20;
        tz4 tz4Var21 = new tz4(20, 2131624246, 2131624247, "ARTICLE");
        O = tz4Var21;
        tz4 tz4Var22 = new tz4(21, 2131624041, 2131624042, "GRAM");
        P = tz4Var22;
        tz4 tz4Var23 = new tz4(22, 2131623944, 25, 49, "BOOSTS");
        Q = tz4Var23;
        tz4 tz4Var24 = new tz4(23, 2131624091, 19, 45, "MONETIZATION");
        R = tz4Var24;
        tz4 tz4Var25 = new tz4(24, 2131624102, 20, 40, "STORIES_SAVED");
        S = tz4Var25;
        tz4 tz4Var26 = new tz4("STORIES_ARCHIVE", 25, 2131624101);
        T = tz4Var26;
        U = new tz4[]{tz4Var, tz4Var2, tz4Var3, tz4Var4, tz4Var5, tz4Var6, tz4Var7, tz4Var8, tz4Var9, tz4Var10, tz4Var11, tz4Var12, tz4Var13, tz4Var14, tz4Var15, tz4Var16, tz4Var17, tz4Var18, tz4Var19, tz4Var20, tz4Var21, tz4Var22, tz4Var23, tz4Var24, tz4Var25, tz4Var26};
    }

    public tz4() {
        this.c = 2131232795;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public static tz4 valueOf(String str) {
        return (tz4) Enum.valueOf(tz4.class, str);
    }

    public static tz4[] values() {
        return (tz4[]) U.clone();
    }

    public tz4(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.c = -1;
    }

    public tz4(String str, int i, int i2) {
        this.a = i2;
        this.b = i2;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    public tz4(int i, int i2, int i3, String str) {
        this.a = i2;
        this.b = i3;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
