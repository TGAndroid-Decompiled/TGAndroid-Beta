package i2;
public final class p implements g {
    public d0 f14580b;
    public String f14581c;
    public boolean f14583f;
    public final p4.q f14579a = new p4.q(23);
    public final int d = 8000;
    public final int f14582e = 8000;

    @Override
    public final h createDataSource() {
        s sVar = new s(this.f14581c, this.d, this.f14582e, this.f14583f, this.f14579a);
        d0 d0Var = this.f14580b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
