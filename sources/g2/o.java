package g2;
public final class o implements g {
    public c0 f10345b;
    public String f10346c;
    public boolean f10348f;
    public final n4.y f10344a = new n4.y(15);
    public final int d = 8000;
    public final int f10347e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10346c, this.d, this.f10347e, this.f10348f, this.f10344a);
        c0 c0Var = this.f10345b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
