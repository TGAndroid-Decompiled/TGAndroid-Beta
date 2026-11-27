package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hk3 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public hk3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, m62 m62Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = m62Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hk3.run():void");
    }

    public hk3(qy6 qy6Var, ry6 ry6Var, int i, py6 py6Var, boolean z) {
        this.a = (byte) 2;
        this.f = qy6Var;
        this.c = ry6Var;
        this.b = i;
        this.e = py6Var;
        this.d = z;
    }

    public hk3(uc7 uc7Var, TLRPC.Chat chat, boolean z, int i, tm1 tm1Var) {
        this.a = (byte) 3;
        this.f = uc7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = tm1Var;
    }

    public hk3(nx7 nx7Var, j18 j18Var, int i, boolean z, yp5 yp5Var) {
        this.a = (byte) 4;
        this.f = nx7Var;
        this.c = j18Var;
        this.b = i;
        this.d = z;
        this.e = yp5Var;
    }

    public hk3(r7a r7aVar, TLObject tLObject, d7a d7aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = r7aVar;
        this.e = tLObject;
        this.c = d7aVar;
        this.d = z;
        this.b = i;
    }

    public hk3(l9c l9cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l9cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public hk3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
