package g2;
public final class o implements g {
    public c0 f9376b;
    public String f9377c;
    public boolean f9378f;
    public final n4.y f9375a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9377c, this.d, this.e, this.f9378f, this.f9375a);
        c0 c0Var = this.f9376b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
