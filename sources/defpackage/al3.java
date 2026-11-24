package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class al3 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public al3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, h72 h72Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = h72Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al3.run():void");
    }

    public al3(ly6 ly6Var, my6 my6Var, int i, ky6 ky6Var, boolean z) {
        this.a = (byte) 2;
        this.f = ly6Var;
        this.c = my6Var;
        this.b = i;
        this.e = ky6Var;
        this.d = z;
    }

    public al3(oc7 oc7Var, TLRPC.Chat chat, boolean z, int i, io1 io1Var) {
        this.a = (byte) 3;
        this.f = oc7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = io1Var;
    }

    public al3(hw7 hw7Var, f08 f08Var, int i, boolean z, vp5 vp5Var) {
        this.a = (byte) 4;
        this.f = hw7Var;
        this.c = f08Var;
        this.b = i;
        this.d = z;
        this.e = vp5Var;
    }

    public al3(a6a a6aVar, TLObject tLObject, m5a m5aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = a6aVar;
        this.e = tLObject;
        this.c = m5aVar;
        this.d = z;
        this.b = i;
    }

    public al3(l7c l7cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l7cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public al3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
