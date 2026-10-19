package g2;
public final class o implements g {
    public c0 f10804b;
    public String f10805c;
    public boolean f10806f;
    public final n4.s f10803a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10805c, this.d, this.e, this.f10806f, this.f10803a);
        c0 c0Var = this.f10804b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
