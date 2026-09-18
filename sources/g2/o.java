package g2;
public final class o implements g {
    public c0 f9392b;
    public String f9393c;
    public boolean f9394f;
    public final n4.y f9391a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9393c, this.d, this.e, this.f9394f, this.f9391a);
        c0 c0Var = this.f9392b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
