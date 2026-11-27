package defpackage;
public final class eea implements Runnable {
    public final byte a;
    public final hea b;
    public final int c;
    public final String d;

    public eea(hea heaVar, int i, String str) {
        this.a = (byte) 1;
        this.b = heaVar;
        this.c = i;
        this.d = str;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eea.run():void");
    }

    public eea(hea heaVar, String str, int i, byte b) {
        this.a = b;
        this.b = heaVar;
        this.d = str;
        this.c = i;
    }
}
