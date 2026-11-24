package defpackage;
public final class nx4 {
    public static final nx4 E;
    public static final nx4 F;
    public static final nx4 G;
    public static final nx4 H;
    public static final nx4 I;
    public static final nx4 J;
    public static final nx4 K;
    public static final nx4 L;
    public static final nx4 M;
    public static final nx4 N;
    public static final nx4 O;
    public static final nx4 P;
    public static final nx4 Q;
    public static final nx4 R;
    public static final nx4 S;
    public static final nx4[] T;
    public static final nx4 f;
    public static final nx4 h;
    public static final nx4 n;
    public static final nx4 r;
    public static final nx4 s;
    public static final nx4 w;
    public static final nx4 x;
    public static final nx4 y;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    nx4 EF7;
    nx4 EF0;

    static {
        nx4 nx4Var = new nx4("CONTACTS", 0, 2131624255);
        f = nx4Var;
        nx4 nx4Var2 = new nx4("CALLS", 1, 2131624249);
        h = nx4Var2;
        nx4 nx4Var3 = new nx4("CHATS", 2, 2131624250);
        n = nx4Var3;
        nx4 nx4Var4 = new nx4("SETTINGS", 3, 2131624274);
        r = nx4Var4;
        nx4 nx4Var5 = new nx4(4, 2131624251, 2131624252, "CHECKLIST");
        s = nx4Var5;
        nx4 nx4Var6 = new nx4(5, 2131624253, 2131624254, "COLORS");
        w = nx4Var6;
        nx4 nx4Var7 = new nx4(6, 2131624258, 2131624259, "FILES");
        x = nx4Var7;
        nx4 nx4Var8 = new nx4(7, 2131624260, 2131624261, "GALLERY");
        y = nx4Var8;
        nx4 nx4Var9 = new nx4(8, 2131624262, 2131624263, "GIFT");
        nx4 nx4Var10 = new nx4(9, 2131624264, 2131624265, "LOCATION");
        E = nx4Var10;
        nx4 nx4Var11 = new nx4(10, 2131624275, 2131624276, "STICKER");
        F = nx4Var11;
        nx4 nx4Var12 = new nx4(11, 2131624256, 2131624257, "EMOJI");
        G = nx4Var12;
        nx4 nx4Var13 = new nx4(12, 2131624266, 2131624267, "MODELS");
        H = nx4Var13;
        nx4 nx4Var14 = new nx4(13, 2131624268, 2131624269, "MUSIC");
        I = nx4Var14;
        nx4 nx4Var15 = new nx4(14, 2131624270, 2131624271, "POLL");
        J = nx4Var15;
        nx4 nx4Var16 = new nx4(15, 2131624277, 2131624278, "SYMBOLS");
        K = nx4Var16;
        nx4 nx4Var17 = new nx4(16, 2131624272, 2131624273, "REPLIES");
        L = nx4Var17;
        nx4 nx4Var18 = new nx4(17, 2131624279, 2131624280, "WALLET");
        nx4 nx4Var19 = new nx4();
        M = nx4Var19;
        nx4 nx4Var20 = new nx4(19, 2131624247, 2131624248, "ARTICLE");
        N = nx4Var20;
        nx4 nx4Var21 = new nx4(20, 2131624041, 2131624042, "GRAM");
        O = nx4Var21;
        nx4 nx4Var22 = new nx4(21, 2131623944, 25, 49, "BOOSTS");
        P = nx4Var22;
        nx4 nx4Var23 = new nx4(22, 2131624091, 19, 45, "MONETIZATION");
        Q = nx4Var23;
        nx4 nx4Var24 = new nx4(23, 2131624102, 20, 40, "STORIES_SAVED");
        R = nx4Var24;
        nx4 nx4Var25 = new nx4("STORIES_ARCHIVE", 24, 2131624101);
        S = nx4Var25;
        T = new nx4[]{nx4Var, nx4Var2, nx4Var3, nx4Var4, nx4Var5, nx4Var6, nx4Var7, nx4Var8, nx4Var9, nx4Var10, nx4Var11, nx4Var12, nx4Var13, nx4Var14, nx4Var15, nx4Var16, nx4Var17, nx4Var18, nx4Var19, nx4Var20, nx4Var21, nx4Var22, nx4Var23, nx4Var24, nx4Var25};
    }

    public nx4() {
        this.c = 2131232777;
        this.a = -1;
        this.b = -1;
        this.d = -1;
        this.e = -1;
    }

    public static nx4 valueOf(String str) {
        return (nx4) Enum.valueOf(nx4.class, str);
    }

    public static nx4[] values() {
        return (nx4[]) T.clone();
    }

    public nx4(int i, int i2, int i3, int i4, String str) {
        this.a = i2;
        this.b = i2;
        this.d = i3;
        this.e = i4;
        this.c = -1;
    }

    public nx4(String str, int i, int i2) {
        this.a = i2;
        this.b = i2;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }

    public nx4(int i, int i2, int i3, String str) {
        this.a = i2;
        this.b = i3;
        this.d = -1;
        this.e = -1;
        this.c = -1;
    }
}
