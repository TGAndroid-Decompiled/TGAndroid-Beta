package defpackage;

import org.telegram.tgnet.TLObject;
public final class b16 implements Runnable {
    public final byte a;
    public final TLObject b;
    public final int c;

    public b16(int i, TLObject tLObject) {
        this.a = (byte) 2;
        this.c = i;
        this.b = tLObject;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b16.run():void");
    }

    public b16(TLObject tLObject, int i, byte b) {
        this.a = b;
        this.b = tLObject;
        this.c = i;
    }
}
