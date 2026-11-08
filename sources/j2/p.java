package j2;
public final class p implements g {
    public d0 f16468b;
    public String f16469c;
    public boolean f16471f;
    public final wf.b f16467a = new wf.b(24);
    public final int d = 8000;
    public final int f16470e = 8000;

    @Override
    public final h createDataSource() {
        s sVar = new s(this.f16469c, this.d, this.f16470e, this.f16471f, this.f16467a);
        d0 d0Var = this.f16468b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
