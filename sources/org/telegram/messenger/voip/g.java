package org.telegram.messenger.voip;

import org.telegram.messenger.k20;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.pr;
import rh.c6;
import rh.e4;
import rh.e6;
public final class g implements Runnable {
    public final int f18804a;
    public final long f18805b;
    public final Object f18806c;
    public final Object d;
    public final Object e;
    public final Object f18807f;

    public g(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18804a = i10;
        this.d = obj;
        this.f18805b = j10;
        this.f18806c = obj2;
        this.e = obj3;
        this.f18807f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.g.run():void");
    }

    public g(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f18804a = i10;
        this.d = obj;
        this.f18806c = obj2;
        this.f18805b = j10;
        this.e = obj3;
        this.f18807f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f18804a = i10;
        this.d = obj;
        this.f18806c = obj2;
        this.e = obj3;
        this.f18805b = j10;
        this.f18807f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f18804a = i10;
        this.d = obj;
        this.f18806c = obj2;
        this.e = obj3;
        this.f18807f = obj4;
        this.f18805b = j10;
    }

    public g(pr prVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f18804a = i10;
        this.d = prVar;
        this.f18805b = j10;
        this.e = tLObject;
        this.f18807f = str;
        this.f18806c = tLObject2;
    }

    public g(rh.r rVar, x1 x1Var, TLObject tLObject, long j10, r20 r20Var) {
        this.f18804a = 10;
        this.d = rVar;
        this.e = x1Var;
        this.f18806c = tLObject;
        this.f18805b = j10;
        this.f18807f = r20Var;
    }

    public g(e4 e4Var, gf.e eVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        this.f18804a = 11;
        this.d = e4Var;
        this.f18807f = eVar;
        this.f18806c = tLObject;
        this.f18805b = j10;
        this.e = tL_error;
    }

    public g(c6 c6Var, TLObject tLObject, wp wpVar, TLRPC.TL_error tL_error, long j10) {
        this.f18804a = 16;
        this.d = c6Var;
        this.f18806c = tLObject;
        this.f18807f = wpVar;
        this.e = tL_error;
        this.f18805b = j10;
    }

    public g(e6 e6Var, k20 k20Var, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18804a = 13;
        this.d = e6Var;
        this.e = k20Var;
        this.f18805b = j10;
        this.f18806c = tLObject;
        this.f18807f = tL_textWithEntities;
    }
}
