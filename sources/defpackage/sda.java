package defpackage;
public final class sda implements Runnable {
    public final byte a;
    public final nha b;
    public final int c;

    public sda(nha nhaVar, int i, byte b) {
        this.a = b;
        this.b = nhaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        nha nhaVar = this.b;
        switch (b) {
            case 0:
                nhaVar.o1(i);
                return;
            case 1:
                nhaVar.U0(i, nhaVar.m1, nhaVar.y1);
                return;
            case 2:
                nhaVar.n1(i, false);
                return;
            case 3:
                nhaVar.o1(i);
                return;
            default:
                nhaVar.V0(i, nhaVar.m1, nhaVar.y1);
                return;
        }
    }
}
