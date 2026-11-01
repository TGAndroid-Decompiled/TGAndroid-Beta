package g2;
public final class p implements g {
    public d0 f7329b;
    public String f7330c;
    public boolean f7331f;
    public final n4.q f7328a = new n4.q(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        s sVar = new s(this.f7330c, this.d, this.e, this.f7331f, this.f7328a);
        d0 d0Var = this.f7329b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
