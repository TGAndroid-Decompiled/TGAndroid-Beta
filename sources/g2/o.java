package g2;
public final class o implements g {
    public c0 f12271b;
    public String f12272c;
    public boolean f12273f;
    public final n4.s f12270a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f12272c, this.d, this.e, this.f12273f, this.f12270a);
        c0 c0Var = this.f12271b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
