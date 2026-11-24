package defpackage;
public final class eh implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public eh(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eh.run():void");
    }

    public eh(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
