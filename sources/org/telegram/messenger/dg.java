package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dg implements Runnable {
    public final int f15381a;
    public final int f15382b;
    public final Object f15383c;
    public final Object d;
    public final Object e;

    public dg(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f15381a = i11;
        this.f15383c = obj;
        this.f15382b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.dg.run():void");
    }

    public dg(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f15381a = i11;
        this.f15383c = obj;
        this.d = obj2;
        this.f15382b = i10;
        this.e = obj3;
    }

    public dg(f1 f1Var, Object obj, Object obj2, int i10, int i11) {
        this.f15381a = i11;
        this.f15383c = f1Var;
        this.d = obj;
        this.e = obj2;
        this.f15382b = i10;
    }

    public dg(wp wpVar, int i10, TLObject tLObject, TLRPC.TL_error tL_error, int i11) {
        this.f15381a = i11;
        this.f15383c = wpVar;
        this.f15382b = i10;
        this.e = tLObject;
        this.d = tL_error;
    }

    public dg(wp wpVar, TLObject tLObject, int i10, yo yoVar) {
        this.f15381a = 12;
        this.f15383c = wpVar;
        this.e = tLObject;
        this.f15382b = i10;
        this.d = yoVar;
    }
}
