package j2;
public final class p implements g {
    public d0 f16465b;
    public String f16466c;
    public boolean f16468f;
    public final wf.b f16464a = new wf.b(24);
    public final int d = 8000;
    public final int f16467e = 8000;

    @Override
    public final h createDataSource() {
        s sVar = new s(this.f16466c, this.d, this.f16467e, this.f16468f, this.f16464a);
        d0 d0Var = this.f16465b;
        if (d0Var != null) {
            sVar.addTransferListener(d0Var);
        }
        return sVar;
    }
}
