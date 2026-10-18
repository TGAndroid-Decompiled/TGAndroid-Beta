package g2;
public final class o implements g {
    public c0 f10807b;
    public String f10808c;
    public boolean f10809f;
    public final n4.s f10806a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10808c, this.d, this.e, this.f10809f, this.f10806a);
        c0 c0Var = this.f10807b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
