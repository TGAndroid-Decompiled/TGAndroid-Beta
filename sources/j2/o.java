package j2;
public final class o implements g {
    public c0 f17226b;
    public String f17227c;
    public boolean f17229f;
    public final q4.q f17225a = new q4.q(28);
    public final int d = 8000;
    public final int f17228e = 8000;

    @Override
    public final h createDataSource() {
        r rVar = new r(this.f17227c, this.d, this.f17228e, this.f17229f, this.f17225a);
        c0 c0Var = this.f17226b;
        if (c0Var != null) {
            rVar.addTransferListener(c0Var);
        }
        return rVar;
    }
}
