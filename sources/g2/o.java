package g2;
public final class o implements g {
    public c0 f10823b;
    public String f10824c;
    public boolean f10825f;
    public final n4.s f10822a = new n4.s(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f10824c, this.d, this.e, this.f10825f, this.f10822a);
        c0 c0Var = this.f10823b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
