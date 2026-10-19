package g2;
public final class o implements g {
    public c0 f10806b;
    public String f10807c;
    public boolean f10808f;
    public final n4.s f10805a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10807c, this.d, this.e, this.f10808f, this.f10805a);
        c0 c0Var = this.f10806b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
