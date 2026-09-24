package g2;
public final class o implements g {
    public c0 f9375b;
    public String f9376c;
    public boolean f9377f;
    public final n4.y f9374a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9376c, this.d, this.e, this.f9377f, this.f9374a);
        c0 c0Var = this.f9375b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
