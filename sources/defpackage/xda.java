package defpackage;
public final class xda implements Runnable {
    public final byte a;
    public final iga b;
    public final int c;

    public xda(iga igaVar, int i, byte b) {
        this.a = b;
        this.b = igaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        iga igaVar = this.b;
        switch (b) {
            case 0:
                igaVar.h.scrollBy(0, i);
                return;
            case 1:
                igaVar.h.scrollBy(0, i);
                return;
            default:
                igaVar.h.scrollBy(0, i);
                return;
        }
    }
}
