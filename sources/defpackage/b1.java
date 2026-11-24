package defpackage;
public final class b1 implements Runnable {
    public final byte a;
    public final Object b;

    public b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        ux uxVar = (ux) this.b;
        synchronized (uxVar.a) {
            if (uxVar.m) {
                return;
            }
            long j = uxVar.l - 1;
            uxVar.l = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                uxVar.c(new IllegalStateException());
            } else {
                uxVar.a();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.run():void");
    }
}
