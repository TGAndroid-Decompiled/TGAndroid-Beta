package g2;
public final class o implements g {
    public c0 f10280b;
    public String f10281c;
    public boolean f10283f;
    public final n4.y f10279a = new n4.y(17);
    public final int d = 8000;
    public final int f10282e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10281c, this.d, this.f10282e, this.f10283f, this.f10279a);
        c0 c0Var = this.f10280b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
