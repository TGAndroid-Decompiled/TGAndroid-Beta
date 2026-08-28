package h3;
public final class n extends v1 {
    public final int f9598c;
    public final String d;
    public final int f9599e;
    public final t0 f9600f;
    public final int h;
    public final j4.b0 f9601n;
    public final boolean f9602r;

    static {
        int i9 = d5.f0.f4349a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public n(int i9, Exception exc, int i10) {
        this(i9, exc, i10, null, -1, null, 4, false);
    }

    public final n a(j4.b0 b0Var) {
        String message = getMessage();
        int i9 = d5.f0.f4349a;
        return new n(message, getCause(), this.f9785a, this.f9598c, this.d, this.f9599e, this.f9600f, this.h, b0Var, this.f9786b, this.f9602r);
    }

    public n(String str, Throwable th, int i9, int i10, String str2, int i11, t0 t0Var, int i12, j4.b0 b0Var, long j10, boolean z10) {
        super(str, th, i9, j10);
        boolean z11 = false;
        d5.a.f(!z10 || i10 == 1);
        d5.a.f((th != null || i10 == 3) ? true : true);
        this.f9598c = i10;
        this.d = str2;
        this.f9599e = i11;
        this.f9600f = t0Var;
        this.h = i12;
        this.f9601n = b0Var;
        this.f9602r = z10;
    }

    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, h3.t0 r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: h3.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, h3.t0, int, boolean):void");
    }
}
