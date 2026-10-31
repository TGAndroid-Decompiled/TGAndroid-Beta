package gh;
public final class a {
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a O;
    public static final a P;
    public static final a Q;
    public static final a R;
    public static final a[] S;
    public static final a f7508f;
    public static final a h;
    public static final a f7509n;
    public static final a f7510r;
    public static final a f7511s;
    public static final a f7512w;
    public static final a f7513x;
    public static final a f7514y;
    public final int f7515a;
    public final int f7516b;
    public final int f7517c;
    public final int d;
    public final int e;
    a EF7;
    a EF0;

    static {
        a aVar = new a("CONTACTS", 0, 2131624257);
        f7508f = aVar;
        a aVar2 = new a("CALLS", 1, 2131624251);
        h = aVar2;
        a aVar3 = new a("CHATS", 2, 2131624252);
        f7509n = aVar3;
        a aVar4 = new a("SETTINGS", 3, 2131624276);
        f7510r = aVar4;
        a aVar5 = new a(4, 2131624253, "CHECKLIST", 2131624254);
        f7511s = aVar5;
        a aVar6 = new a(5, 2131624255, "COLORS", 2131624256);
        f7512w = aVar6;
        a aVar7 = new a(6, 2131624260, "FILES", 2131624261);
        f7513x = aVar7;
        a aVar8 = new a(7, 2131624262, "GALLERY", 2131624263);
        f7514y = aVar8;
        a aVar9 = new a(8, 2131624264, "GIFT", 2131624265);
        a aVar10 = new a(9, 2131624266, "LOCATION", 2131624267);
        D = aVar10;
        a aVar11 = new a(10, 2131624277, "STICKER", 2131624278);
        E = aVar11;
        a aVar12 = new a(11, 2131624258, "EMOJI", 2131624259);
        F = aVar12;
        a aVar13 = new a(12, 2131624268, "MODELS", 2131624269);
        G = aVar13;
        a aVar14 = new a(13, 2131624270, "MUSIC", 2131624271);
        H = aVar14;
        a aVar15 = new a(14, 2131624272, "POLL", 2131624273);
        I = aVar15;
        a aVar16 = new a(15, 2131624279, "SYMBOLS", 2131624280);
        J = aVar16;
        a aVar17 = new a(16, 2131624274, "REPLIES", 2131624275);
        K = aVar17;
        a aVar18 = new a(17, 2131624281, "WALLET", 2131624282);
        a aVar19 = new a();
        L = aVar19;
        a aVar20 = new a(19, 2131624249, "ARTICLE", 2131624250);
        M = aVar20;
        a aVar21 = new a(20, 2131624039, "GRAM", 2131624040);
        N = aVar21;
        a aVar22 = new a("BOOSTS", 21, 2131623944, 25, 49);
        O = aVar22;
        a aVar23 = new a("MONETIZATION", 22, 2131624088, 19, 45);
        P = aVar23;
        a aVar24 = new a("STORIES_SAVED", 23, 2131624099, 20, 40);
        Q = aVar24;
        a aVar25 = new a("STORIES_ARCHIVE", 24, 2131624098);
        R = aVar25;
        S = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17, aVar18, aVar19, aVar20, aVar21, aVar22, aVar23, aVar24, aVar25};
    }

    public a(String str, int i10, int i11, int i12, int i13) {
        this.f7515a = i11;
        this.f7516b = i11;
        this.d = i12;
        this.e = i13;
        this.f7517c = -1;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) S.clone();
    }

    public a() {
        this.f7517c = 2131232769;
        this.f7515a = -1;
        this.f7516b = -1;
        this.d = -1;
        this.e = -1;
    }

    public a(String str, int i10, int i11) {
        this.f7515a = i11;
        this.f7516b = i11;
        this.d = -1;
        this.e = -1;
        this.f7517c = -1;
    }

    public a(int i10, int i11, String str, int i12) {
        this.f7515a = i11;
        this.f7516b = i12;
        this.d = -1;
        this.e = -1;
        this.f7517c = -1;
    }
}
