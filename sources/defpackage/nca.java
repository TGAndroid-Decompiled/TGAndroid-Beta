package defpackage;
public final class nca implements Runnable {
    public final byte a;
    public final qca b;
    public final int c;
    public final String d;

    public nca(qca qcaVar, int i, String str) {
        this.a = (byte) 1;
        this.b = qcaVar;
        this.c = i;
        this.d = str;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nca.run():void");
    }

    public nca(qca qcaVar, String str, int i, byte b) {
        this.a = b;
        this.b = qcaVar;
        this.d = str;
        this.c = i;
    }
}
