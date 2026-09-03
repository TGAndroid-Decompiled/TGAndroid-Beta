package j3;
public final class n extends t1 {
    public final int f8688c;
    public final String d;
    public final int e;
    public final n0 f8689f;
    public final int h;
    public final o4.u f8690n;
    public final boolean f8691r;

    static {
        int i10 = h5.d0.f6924a;
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

    public final n a(o4.u uVar) {
        String message = getMessage();
        int i10 = h5.d0.f6924a;
        return new n(message, getCause(), this.f8809a, this.f8688c, this.d, this.e, this.f8689f, this.h, uVar, this.f8810b, this.f8691r);
    }

    public n(String str, Throwable th2, int i10, int i11, String str2, int i12, n0 n0Var, int i13, o4.u uVar, long j10, boolean z4) {
        super(str, th2, i10, j10);
        boolean z10 = false;
        h5.a.f(!z4 || i11 == 1);
        h5.a.f((th2 != null || i11 == 3) ? true : true);
        this.f8688c = i11;
        this.d = str2;
        this.e = i12;
        this.f8689f = n0Var;
        this.h = i13;
        this.f8690n = uVar;
        this.f8691r = z4;
    }

    public n(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, j3.n0 r19, int r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: j3.n.<init>(int, java.lang.Throwable, int, java.lang.String, int, j3.n0, int, boolean):void");
    }
}
