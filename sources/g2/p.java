package g2;
public final class p implements g {
    public d0 f7328b;
    public String f7329c;
    public boolean f7330f;
    public final n4.q f7327a = new n4.q(19);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final h createDataSource() {
        s sVar = new s(this.f7329c, this.d, this.e, this.f7330f, this.f7327a);
        d0 d0Var = this.f7328b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
