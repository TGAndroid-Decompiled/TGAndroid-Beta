package defpackage;
public final class vra implements pcc {
    public final byte a;
    public final wua b;
    public final hw4 c;

    public vra(wua wuaVar, hw4 hw4Var, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = hw4Var;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        hw4 hw4Var = this.c;
        wua wuaVar = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                wuaVar.f2.setLoading(bool.booleanValue());
                if (hw4Var != null) {
                    hw4Var.G0(bool.booleanValue());
                    return;
                }
                return;
            default:
                wuaVar.f2.setLoading(bool.booleanValue());
                if (hw4Var != null) {
                    hw4Var.G0(bool.booleanValue());
                    return;
                }
                return;
        }
    }
}
