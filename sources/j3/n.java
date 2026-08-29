package j3;
public final class n extends v1 {
    public final int f10635c;
    public final String d;
    public final int f10636e;
    public final t0 f10637f;
    public final int h;
    public final l4.a0 f10638n;
    public final boolean f10639r;

    static {
        int i10 = f5.d0.f6579a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public n(int i10, Exception exc, int i11) {
        this(i10, exc, i11, null, -1, null, 4, false);
    }

    public final n a(l4.a0 a0Var) {
        String message = getMessage();
        int i10 = f5.d0.f6579a;
        return new n(message, getCause(), this.f10822a, this.f10635c, this.d, this.f10636e, this.f10637f, this.h, a0Var, this.f10823b, this.f10639r);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, t0 t0Var, int i13, l4.a0 a0Var, long j10, boolean z10) {
        super(str, th2, i10, j10);
        boolean z11 = false;
        f5.a.f(!z10 || i11 == 1);
        f5.a.f((th2 != null || i11 == 3) ? true : true);
        this.f10635c = i11;
        this.d = str2;
        this.f10636e = i12;
        this.f10637f = t0Var;
        this.h = i13;
        this.f10638n = a0Var;
        this.f10639r = z10;
    }

    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, j3.t0 r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: j3.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, j3.t0, int, boolean):void");
    }
}
