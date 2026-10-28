package g2;
public final class o implements g {
    public c0 f12270b;
    public String f12271c;
    public boolean f12272f;
    public final n4.s f12269a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f12271c, this.d, this.e, this.f12272f, this.f12269a);
        c0 c0Var = this.f12270b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
