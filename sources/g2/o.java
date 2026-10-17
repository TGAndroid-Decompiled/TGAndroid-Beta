package g2;
public final class o implements g {
    public c0 f10805b;
    public String f10806c;
    public boolean f10807f;
    public final n4.s f10804a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10806c, this.d, this.e, this.f10807f, this.f10804a);
        c0 c0Var = this.f10805b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
