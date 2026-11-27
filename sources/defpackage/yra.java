package defpackage;
public final class yra implements fd {
    public final byte a;
    public final wua b;

    public yra(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.Y1();
                return;
            case 1:
                uqc.L0(wuaVar.a, wuaVar.J0, wuaVar.getContext());
                return;
            default:
                wuaVar.Y1();
                return;
        }
    }
}
