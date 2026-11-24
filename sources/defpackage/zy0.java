package defpackage;

import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zy0 implements Runnable {
    public final byte a;
    public final Object b;
    public final int c;
    public final int d;
    public final Object e;
    public final Object f;

    public zy0(int i, TLRPC.User user, TLRPC.Document document, int i2, pt0 pt0Var) {
        this.a = (byte) 9;
        this.c = i;
        this.b = user;
        this.f = document;
        this.d = i2;
        this.e = pt0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zy0.run():void");
    }

    public zy0(pz0 pz0Var, int i, Object obj, int i2, gz0 gz0Var, byte b) {
        this.a = b;
        this.b = pz0Var;
        this.c = i;
        this.f = obj;
        this.d = i2;
        this.e = gz0Var;
    }

    public zy0(Object obj, Object obj2, int i, Object obj3, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.f = obj2;
        this.c = i;
        this.e = obj3;
        this.d = i2;
    }

    public zy0(MediaController mediaController, int i, TLRPC.TL_error tL_error, TLObject tLObject, int i2) {
        this.a = (byte) 2;
        this.b = mediaController;
        this.c = i;
        this.f = tL_error;
        this.e = tLObject;
        this.d = i2;
    }
}
