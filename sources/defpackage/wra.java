package defpackage;
public final class wra implements Runnable {
    public final byte a;
    public final wua b;
    public final hw4 c;

    public wra(wua wuaVar, hw4 hw4Var, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = hw4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hw4 hw4Var = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                if (hw4Var != null) {
                    hw4Var.dismiss();
                    wuaVar.O0 = true;
                }
                wuaVar.dismiss();
                return;
            default:
                if (hw4Var != null) {
                    hw4Var.dismiss();
                    wuaVar.O0 = true;
                }
                wuaVar.dismiss();
                return;
        }
    }
}
