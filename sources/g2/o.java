package g2;
public final class o implements g {
    public c0 f8521b;
    public String f8522c;
    public boolean f8523f;
    public final of.b f8520a = new of.b(14);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f8522c, this.d, this.e, this.f8523f, this.f8520a);
        c0 c0Var = this.f8521b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
