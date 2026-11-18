package j2;
public final class o implements g {
    public c0 f17204b;
    public String f17205c;
    public boolean f17207f;
    public final q4.q f17203a = new q4.q(28);
    public final int d = 8000;
    public final int f17206e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17205c, this.d, this.f17206e, this.f17207f, this.f17203a);
        c0 c0Var = this.f17204b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
