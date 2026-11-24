package defpackage;
public final class xd0 implements Runnable {
    public final byte a;
    public final ko b;
    public final Object c;

    public xd0(ko koVar, Object obj, byte b) {
        this.a = b;
        this.b = koVar;
        this.c = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        ko koVar = this.b;
        switch (b) {
            case 0:
                if (koVar.a == 0) {
                    koVar.p(obj);
                    return;
                }
                return;
            default:
                int i = koVar.a - 1;
                koVar.a = i;
                if (i == 0) {
                    koVar.p(obj);
                    return;
                }
                return;
        }
    }
}
