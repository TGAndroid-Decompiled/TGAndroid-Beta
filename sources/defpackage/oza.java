package defpackage;
public final class oza implements Runnable {
    public final byte a;
    public final e0b b;

    public oza(e0b e0bVar, byte b) {
        this.a = b;
        this.b = e0bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        e0b e0bVar = this.b;
        switch (b) {
            case 0:
                e0bVar.N1 = true;
                e0bVar.F0(null);
                hl.d3(new oza(e0bVar, (byte) 1), 240L);
                return;
            case 1:
                e0bVar.dismiss();
                return;
            default:
                tza tzaVar = e0bVar.s1;
                tzaVar.G = false;
                tzaVar.invalidate();
                return;
        }
    }
}
