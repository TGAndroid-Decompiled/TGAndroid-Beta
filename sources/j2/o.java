package j2;
public final class o implements g {
    public c0 f16819b;
    public String f16820c;
    public boolean f16822f;
    public final q4.q f16818a = new q4.q(28);
    public final int d = 8000;
    public final int f16821e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f16820c, this.d, this.f16821e, this.f16822f, this.f16818a);
        c0 c0Var = this.f16819b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
