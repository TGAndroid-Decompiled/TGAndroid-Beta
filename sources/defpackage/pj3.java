package defpackage;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pj3 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final boolean d;
    public final Object e;
    public final Object f;

    public pj3(int i, String str, boolean z, TLRPC.WallPaper wallPaper, w52 w52Var) {
        this.a = (byte) 7;
        this.b = i;
        this.f = str;
        this.d = z;
        this.c = wallPaper;
        this.e = w52Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj3.run():void");
    }

    public pj3(lw6 lw6Var, mw6 mw6Var, int i, kw6 kw6Var, boolean z) {
        this.a = (byte) 2;
        this.f = lw6Var;
        this.c = mw6Var;
        this.b = i;
        this.e = kw6Var;
        this.d = z;
    }

    public pj3(na7 na7Var, TLRPC.Chat chat, boolean z, int i, sm1 sm1Var) {
        this.a = (byte) 3;
        this.f = na7Var;
        this.c = chat;
        this.d = z;
        this.b = i;
        this.e = sm1Var;
    }

    public pj3(gu7 gu7Var, dy7 dy7Var, int i, boolean z, vn5 vn5Var) {
        this.a = (byte) 4;
        this.f = gu7Var;
        this.c = dy7Var;
        this.b = i;
        this.d = z;
        this.e = vn5Var;
    }

    public pj3(z3a z3aVar, TLObject tLObject, k3a k3aVar, boolean z, int i) {
        this.a = (byte) 5;
        this.f = z3aVar;
        this.e = tLObject;
        this.c = k3aVar;
        this.d = z;
        this.b = i;
    }

    public pj3(l5c l5cVar, int i, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.f = l5cVar;
        this.b = i;
        this.c = tL_messages_searchGlobal;
        this.d = z;
        this.e = tLObject;
    }

    public pj3(boolean z, int i, String str, ImageReceiver imageReceiver, boolean[] zArr) {
        this.a = (byte) 6;
        this.d = z;
        this.b = i;
        this.f = str;
        this.c = imageReceiver;
        this.e = zArr;
    }
}
