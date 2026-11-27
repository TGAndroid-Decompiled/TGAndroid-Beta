package defpackage;
public final class jfa implements Runnable {
    public final byte a;
    public final zha b;
    public final int c;

    public jfa(zha zhaVar, int i, byte b) {
        this.a = b;
        this.b = zhaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        zha zhaVar = this.b;
        switch (b) {
            case 0:
                zhaVar.h.scrollBy(0, i);
                return;
            case 1:
                zhaVar.h.scrollBy(0, i);
                return;
            default:
                zhaVar.h.scrollBy(0, i);
                return;
        }
    }
}
