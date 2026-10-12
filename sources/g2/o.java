package g2;
public final class o implements g {
    public c0 f9896b;
    public String f9897c;
    public boolean f9898f;
    public final n4.s f9895a = new n4.s(17);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9897c, this.d, this.e, this.f9898f, this.f9895a);
        c0 c0Var = this.f9896b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
