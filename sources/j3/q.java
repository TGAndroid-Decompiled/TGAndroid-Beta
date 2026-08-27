package j3;

public final class q extends Exception {

    public final int f12400a;

    public final boolean f12401b;

    public final h3.t0 f12402c;

    public q(int i10, int i11, int i12, int i13, h3.t0 t0Var, boolean z10, RuntimeException runtimeException) {
        StringBuilder sbP = com.google.android.recaptcha.internal.a.p("AudioTrack init failed ", i10, " Config(", i11, ", ");
        i0.a.x(sbP, i12, ", ", i13, ")");
        sbP.append(z10 ? " (recoverable)" : "");
        super(sbP.toString(), runtimeException);
        this.f12400a = i10;
        this.f12401b = z10;
        this.f12402c = t0Var;
    }
}
