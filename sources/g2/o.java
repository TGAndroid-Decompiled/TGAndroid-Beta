package g2;
public final class o implements g {
    public c0 f9393b;
    public String f9394c;
    public boolean f9395f;
    public final n4.y f9392a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9394c, this.d, this.e, this.f9395f, this.f9392a);
        c0 c0Var = this.f9393b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
