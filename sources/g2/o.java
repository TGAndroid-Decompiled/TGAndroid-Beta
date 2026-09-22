package g2;
public final class o implements g {
    public c0 f9390b;
    public String f9391c;
    public boolean f9392f;
    public final n4.y f9389a = new n4.y(15);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f9391c, this.d, this.e, this.f9392f, this.f9389a);
        c0 c0Var = this.f9390b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
