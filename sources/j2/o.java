package j2;
public final class o implements g {
    public c0 f17229b;
    public String f17230c;
    public boolean f17232f;
    public final q4.q f17228a = new q4.q(28);
    public final int d = 8000;
    public final int f17231e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17230c, this.d, this.f17231e, this.f17232f, this.f17228a);
        c0 c0Var = this.f17229b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
