package j2;
public final class o implements g {
    public c0 f17201b;
    public String f17202c;
    public boolean f17204f;
    public final q4.q f17200a = new q4.q(28);
    public final int d = 8000;
    public final int f17203e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17202c, this.d, this.f17203e, this.f17204f, this.f17200a);
        c0 c0Var = this.f17201b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
