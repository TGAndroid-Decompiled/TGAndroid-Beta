package defpackage;
public final class ssa implements Runnable {
    public final byte a;
    public final wua b;

    public ssa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.b2();
                return;
            case 1:
                wuaVar.onBackPressed();
                return;
            default:
                new xd5(wuaVar.getContext()).show();
                return;
        }
    }
}
