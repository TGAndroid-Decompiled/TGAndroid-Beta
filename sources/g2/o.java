package g2;
public final class o implements g {
    public c0 f10281b;
    public String f10282c;
    public boolean f10284f;
    public final n4.x f10280a = new n4.x(17);
    public final int d = 8000;
    public final int f10283e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10282c, this.d, this.f10283e, this.f10284f, this.f10280a);
        c0 c0Var = this.f10281b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
