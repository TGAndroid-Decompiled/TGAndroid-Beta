package defpackage;
public final class b1 implements Runnable {
    public final byte a;
    public final Object b;

    public b1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final void a() {
        vy vyVar = (vy) this.b;
        synchronized (vyVar.a) {
            if (vyVar.m) {
                return;
            }
            long j = vyVar.l - 1;
            vyVar.l = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                vyVar.c(new IllegalStateException());
            } else {
                vyVar.a();
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1.run():void");
    }
}
