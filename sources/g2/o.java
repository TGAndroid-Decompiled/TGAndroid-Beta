package g2;
public final class o implements g {
    public c0 f10208b;
    public String f10209c;
    public boolean f10211f;
    public final n4.y f10207a = new n4.y(15);
    public final int d = 8000;
    public final int f10210e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10209c, this.d, this.f10210e, this.f10211f, this.f10207a);
        c0 c0Var = this.f10208b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
