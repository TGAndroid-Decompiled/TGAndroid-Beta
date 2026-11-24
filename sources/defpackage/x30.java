package defpackage;
public final class x30 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public x30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        f11 f11Var = (f11) this.b;
        Runnable runnable = (Runnable) this.c;
        synchronized (f11Var.g) {
            z = f11Var.h;
        }
        if (!z) {
            runnable.run();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x30.run():void");
    }
}
