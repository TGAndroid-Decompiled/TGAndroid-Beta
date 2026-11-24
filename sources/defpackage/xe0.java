package defpackage;
public final class xe0 implements Runnable {
    public final byte a;
    public final kp b;
    public final Object c;

    public xe0(kp kpVar, Object obj, byte b) {
        this.a = b;
        this.b = kpVar;
        this.c = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        kp kpVar = this.b;
        switch (b) {
            case 0:
                if (kpVar.a == 0) {
                    kpVar.p(obj);
                    return;
                }
                return;
            default:
                int i = kpVar.a - 1;
                kpVar.a = i;
                if (i == 0) {
                    kpVar.p(obj);
                    return;
                }
                return;
        }
    }
}
