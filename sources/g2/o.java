package g2;
public final class o implements g {
    public c0 f9899b;
    public String f9900c;
    public boolean f9901f;
    public final n4.s f9898a = new n4.s(17);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9900c, this.d, this.e, this.f9901f, this.f9898a);
        c0 c0Var = this.f9899b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
