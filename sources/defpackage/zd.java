package defpackage;
public final class zd implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;

    public zd(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.run():void");
    }

    public zd(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
