package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cg implements Runnable {
    public final int f15019a;
    public final int f15020b;
    public final Object f15021c;
    public final Object d;
    public final Object e;

    public cg(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f15019a = i11;
        this.f15021c = obj;
        this.f15020b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.cg.run():void");
    }

    public cg(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f15019a = i11;
        this.f15021c = obj;
        this.d = obj2;
        this.f15020b = i10;
        this.e = obj3;
    }

    public cg(f1 f1Var, Object obj, Object obj2, int i10, int i11) {
        this.f15019a = i11;
        this.f15021c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f15020b = i10;
    }

    public cg(vp vpVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11) {
        this.f15019a = i11;
        this.f15021c = vpVar;
        this.f15020b = i10;
        this.e = tLObject;
        this.d = tL_error;
    }

    public cg(vp vpVar, TLObject tLObject, int i10, xo xoVar) {
        this.f15019a = 12;
        this.f15021c = vpVar;
        this.e = tLObject;
        this.f15020b = i10;
        this.d = xoVar;
    }
}
