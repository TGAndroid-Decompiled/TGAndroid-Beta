package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cg implements Runnable {
    public final int f22868a;
    public final int f22869b;
    public final Object f22870c;
    public final Object d;
    public final Object f22871e;

    public cg(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f22868a = i10;
        this.f22870c = obj;
        this.f22869b = i7;
        this.d = obj2;
        this.f22871e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cg.run():void");
    }

    public cg(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f22868a = i10;
        this.f22870c = obj;
        this.d = obj2;
        this.f22869b = i7;
        this.f22871e = obj3;
    }

    public cg(c1 c1Var, Object obj, Object obj2, int i7, int i10) {
        this.f22868a = i10;
        this.f22870c = c1Var;
        this.d = obj;
        this.f22871e = obj2;
        this.f22869b = i7;
    }

    public cg(np npVar, int i7, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.f22868a = i10;
        this.f22870c = npVar;
        this.f22869b = i7;
        this.f22871e = tLObject;
        this.d = tL_error;
    }

    public cg(np npVar, TLObject tLObject, int i7, po poVar) {
        this.f22868a = 10;
        this.f22870c = npVar;
        this.f22871e = tLObject;
        this.f22869b = i7;
        this.d = poVar;
    }
}
