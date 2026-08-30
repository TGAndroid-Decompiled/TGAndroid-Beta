package g5;
public final class u implements l {
    public v0 f6453b;
    public String f6454c;
    public boolean f6455f;
    public final f7.b f6452a = new f7.b(5, (byte) 0);
    public final int d = 8000;
    public final int e = 8000;

    @Override
    public final m createDataSource() {
        x xVar = new x(this.f6454c, this.d, this.e, this.f6455f, this.f6452a);
        v0 v0Var = this.f6453b;
        if (v0Var != null) {
            xVar.addTransferListener(v0Var);
        }
        return xVar;
    }
}
