package j2;
public final class o implements g {
    public c0 f17292b;
    public String f17293c;
    public boolean f17295f;
    public final q4.q f17291a = new q4.q(29);
    public final int d = 8000;
    public final int f17294e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17293c, this.d, this.f17294e, this.f17295f, this.f17291a);
        c0 c0Var = this.f17292b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
