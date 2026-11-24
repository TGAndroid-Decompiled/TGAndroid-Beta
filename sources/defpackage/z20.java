package defpackage;
public final class z20 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public z20(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        yz0 yz0Var = (yz0) this.b;
        Runnable runnable = (Runnable) this.c;
        synchronized (yz0Var.g) {
            z = yz0Var.h;
        }
        if (!z) {
            runnable.run();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z20.run():void");
    }
}
