package defpackage;
public final class aoc implements Runnable {
    public final byte a;
    public final boc b;

    public aoc(boc bocVar, byte b) {
        this.a = b;
        this.b = bocVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boc bocVar = this.b;
        switch (b) {
            case 0:
                gm.c3(new aoc(bocVar, (byte) 1));
                return;
            default:
                bocVar.a();
                return;
        }
    }
}
