package defpackage;
public final class pz4 {
    public static final pz4 E;
    public static final pz4 F;
    public static final pz4 G;
    public static final pz4 H;
    public static final pz4 I;
    public static final pz4 J;
    public static final pz4 K;
    public static final pz4 L;
    public static final pz4 M;
    public static final pz4 N;
    public static final pz4 O;
    public static final pz4 P;
    public static final pz4 Q;
    public static final pz4 R;
    public static final pz4[] S;
    public static final pz4 f;
    public static final pz4 h;
    public static final pz4 n;
    public static final pz4 r;
    public static final pz4 s;
    public static final pz4 w;
    public static final pz4 x;
    public static final pz4 y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    pz4 EF1;
    pz4 EF2;
    pz4 EF9;
    pz4 EF1;

    static {
        pz4 pz4Var = new pz4("CONTACTS", 0, 2131624254);
        f = pz4Var;
        pz4 pz4Var2 = new pz4("NEWS", 1, 2131624269);
        pz4 pz4Var3 = new pz4("CALLS", 2, 2131624248);
        pz4 pz4Var4 = new pz4("CHATS", 3, 2131624249);
        h = pz4Var4;
        pz4 pz4Var5 = new pz4("SETTINGS", 4, 2131624274);
        n = pz4Var5;
        pz4 pz4Var6 = new pz4(5, 2131624250, 2131624251, "CHECKLIST");
        r = pz4Var6;
        pz4 pz4Var7 = new pz4(6, 2131624252, 2131624253, "COLORS");
        s = pz4Var7;
        pz4 pz4Var8 = new pz4(7, 2131624257, 2131624258, "FILES");
        w = pz4Var8;
        pz4 pz4Var9 = new pz4(8, 2131624259, 2131624260, "GALLERY");
        x = pz4Var9;
        pz4 pz4Var10 = new pz4(9, 2131624261, 2131624262, "GIFT");
        pz4 pz4Var11 = new pz4(10, 2131624263, 2131624264, "LOCATION");
        y = pz4Var11;
        pz4 pz4Var12 = new pz4(11, 2131624275, 2131624276, "STICKER");
        E = pz4Var12;
        pz4 pz4Var13 = new pz4(12, 2131624255, 2131624256, "EMOJI");
        F = pz4Var13;
        pz4 pz4Var14 = new pz4(13, 2131624265, 2131624266, "MODELS");
        G = pz4Var14;
        pz4 pz4Var15 = new pz4(14, 2131624267, 2131624268, "MUSIC");
        H = pz4Var15;
        pz4 pz4Var16 = new pz4(15, 2131624270, 2131624271, "POLL");
        I = pz4Var16;
        pz4 pz4Var17 = new pz4(16, 2131624277, 2131624278, "SYMBOLS");
        J = pz4Var17;
        pz4 pz4Var18 = new pz4(17, 2131624272, 2131624273, "REPLIES");
        K = pz4Var18;
        pz4 pz4Var19 = new pz4(18, 2131624279, 2131624280, "WALLET");
        pz4 pz4Var20 = new pz4();
        L = pz4Var20;
        pz4 pz4Var21 = new pz4(20, 2131624246, 2131624247, "ARTICLE");
        M = pz4Var21;
        pz4 pz4Var22 = new pz4(21, 2131624041, 2131624042, "GRAM");
        N = pz4Var22;
        pz4 pz4Var23 = new pz4(22, 2131623944, 25, 49, "BOOSTS");
        O = pz4Var23;
        pz4 pz4Var24 = new pz4(23, 2131624091, 19, 45, "MONETIZATION");
        P = pz4Var24;
        pz4 pz4Var25 = new pz4(24, 2131624102, 20, 40, "STORIES_SAVED");
        Q = pz4Var25;
        pz4 pz4Var26 = new pz4("STORIES_ARCHIVE", 25, 2131624101);
        R = pz4Var26;
        S = new pz4[]{pz4Var, pz4Var2, pz4Var3, pz4Var4, pz4Var5, pz4Var6, pz4Var7, pz4Var8, pz4Var9, pz4Var10, pz4Var11, pz4Var12, pz4Var13, pz4Var14, pz4Var15, pz4Var16, pz4Var17, pz4Var18, pz4Var19, pz4Var20, pz4Var21, pz4Var22, pz4Var23, pz4Var24, pz4Var25, pz4Var26};
    }

    public pz4() {
        this.c = 2131232789;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public static pz4 valueOf(String str) {
        return (pz4) Enum.valueOf(pz4.class, str);
    }

    public static pz4[] values() {
        return (pz4[]) S.clone();
    }

    public pz4(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.c = -1;
    }

    public pz4(String str, int i, int i2) {
        this.a = i2;
        this.b = i2;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    public pz4(int i, int i2, int i3, String str) {
        this.a = i2;
        this.b = i3;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
