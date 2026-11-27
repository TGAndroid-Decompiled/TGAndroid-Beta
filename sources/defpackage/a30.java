package defpackage;
public final class a30 implements Runnable {
    public final byte a;
    public final Object b;
    public final Object c;

    public a30(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final void a() {
        boolean z;
        g01 g01Var = (g01) this.b;
        Runnable runnable = (Runnable) this.c;
        synchronized (g01Var.g) {
            z = g01Var.h;
        }
        if (!z) {
            runnable.run();
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a30.run():void");
    }
}
