package defpackage;
public final class wba implements Runnable {
    public final byte a;
    public final iea b;
    public final int c;

    public wba(iea ieaVar, int i, byte b) {
        this.a = b;
        this.b = ieaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        iea ieaVar = this.b;
        switch (b) {
            case 0:
                ieaVar.h.scrollBy(0, i);
                return;
            case 1:
                ieaVar.h.scrollBy(0, i);
                return;
            default:
                ieaVar.h.scrollBy(0, i);
                return;
        }
    }
}
