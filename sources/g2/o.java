package g2;
public final class o implements g {
    public c0 f9388b;
    public String f9389c;
    public boolean f9390f;
    public final n4.y f9387a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9389c, this.d, this.e, this.f9390f, this.f9387a);
        c0 c0Var = this.f9388b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
