package defpackage;
public final class ex1 implements Runnable {
    public final byte a;
    public final byte b;
    public final Object c;

    public ex1(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ex1.run():void");
    }
}
