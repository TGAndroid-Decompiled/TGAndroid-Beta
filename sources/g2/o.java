package g2;
public final class o implements g {
    public c0 f10282b;
    public String f10283c;
    public boolean f10285f;
    public final n4.x f10281a = new n4.x(17);
    public final int d = 8000;
    public final int f10284e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10283c, this.d, this.f10284e, this.f10285f, this.f10281a);
        c0 c0Var = this.f10282b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
