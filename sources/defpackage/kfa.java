package defpackage;
public final class kfa implements Runnable {
    public final byte a;
    public final eja b;
    public final int c;

    public kfa(eja ejaVar, int i, byte b) {
        this.a = b;
        this.b = ejaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        eja ejaVar = this.b;
        switch (b) {
            case 0:
                ejaVar.U0(i, ejaVar.m1, ejaVar.y1);
                return;
            case 1:
                ejaVar.n1(i, false);
                return;
            case 2:
                ejaVar.o1(i);
                return;
            case 3:
                ejaVar.V0(i, ejaVar.m1, ejaVar.y1);
                return;
            default:
                ejaVar.o1(i);
                return;
        }
    }
}
