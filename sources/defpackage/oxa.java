package defpackage;
public final class oxa implements Runnable {
    public final byte a;
    public final eya b;

    public oxa(eya eyaVar, byte b) {
        this.a = b;
        this.b = eyaVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        eya eyaVar = this.b;
        switch (b) {
            case 0:
                eyaVar.N1 = true;
                eyaVar.E0(null);
                gm.d3(new oxa(eyaVar, (byte) 1), 240L);
                return;
            case 1:
                eyaVar.dismiss();
                return;
            default:
                txa txaVar = eyaVar.s1;
                txaVar.G = false;
                txaVar.invalidate();
                return;
        }
    }
}
