package defpackage;
public final class c1 implements Runnable {
    public final byte a;
    public final Object b;

    public c1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        vx vxVar = (vx) this.b;
        synchronized (vxVar.a) {
            if (vxVar.m) {
                return;
            }
            long j = vxVar.l - 1;
            vxVar.l = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                vxVar.c(new IllegalStateException());
            } else {
                vxVar.a();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c1.run():void");
    }
}
