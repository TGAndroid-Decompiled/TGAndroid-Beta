package g2;
public final class o implements g {
    public c0 f9387b;
    public String f9388c;
    public boolean f9389f;
    public final n4.y f9386a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9388c, this.d, this.e, this.f9389f, this.f9386a);
        c0 c0Var = this.f9387b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
