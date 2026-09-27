package g2;
public final class o implements g {
    public c0 f9380b;
    public String f9381c;
    public boolean f9382f;
    public final n4.y f9379a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9381c, this.d, this.e, this.f9382f, this.f9379a);
        c0 c0Var = this.f9380b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
