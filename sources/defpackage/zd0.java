package defpackage;
public final class zd0 implements Runnable {
    public final byte a;
    public final lo b;
    public final Object c;

    public zd0(lo loVar, Object obj, byte b) {
        this.a = b;
        this.b = loVar;
        this.c = obj;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.c;
        lo loVar = this.b;
        switch (b) {
            case 0:
                if (loVar.a == 0) {
                    loVar.p(obj);
                    return;
                }
                return;
            default:
                int i = loVar.a - 1;
                loVar.a = i;
                if (i == 0) {
                    loVar.p(obj);
                    return;
                }
                return;
        }
    }
}
