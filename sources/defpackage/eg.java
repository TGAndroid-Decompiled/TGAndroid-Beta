package defpackage;
public final class eg implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public eg(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg.run():void");
    }

    public eg(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
