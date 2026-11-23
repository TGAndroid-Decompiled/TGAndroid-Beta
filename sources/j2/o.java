package j2;
public final class o implements g {
    public c0 f17195b;
    public String f17196c;
    public boolean f17198f;
    public final q4.q f17194a = new q4.q(28);
    public final int d = 8000;
    public final int f17197e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17196c, this.d, this.f17197e, this.f17198f, this.f17194a);
        c0 c0Var = this.f17195b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
