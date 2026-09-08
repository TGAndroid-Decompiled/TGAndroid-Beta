package g2;
public final class o implements g {
    public c0 f10373b;
    public String f10374c;
    public boolean f10376f;
    public final n4.y f10372a = new n4.y(15);
    public final int d = 8000;
    public final int f10375e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10374c, this.d, this.f10375e, this.f10376f, this.f10372a);
        c0 c0Var = this.f10373b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
