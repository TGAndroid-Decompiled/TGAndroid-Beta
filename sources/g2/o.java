package g2;
public final class o implements g {
    public c0 f10209b;
    public String f10210c;
    public boolean f10212f;
    public final n4.y f10208a = new n4.y(15);
    public final int d = 8000;
    public final int f10211e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10210c, this.d, this.f10211e, this.f10212f, this.f10208a);
        c0 c0Var = this.f10209b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
