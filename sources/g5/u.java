package g5;
public final class u implements l {
    public v0 f6944b;
    public String f6945c;
    public boolean f6947f;
    public final f7.b f6943a = new f7.b(5, (byte) 0);
    public final int d = 8000;
    public final int f6946e = 8000;

    @Override
    public final m createDataSource() {
        x xVar = new x(this.f6945c, this.d, this.f6946e, this.f6947f, this.f6943a);
        v0 v0Var = this.f6944b;
        if (v0Var != null) {
            xVar.addTransferListener(v0Var);
        }
        return xVar;
    }
}
