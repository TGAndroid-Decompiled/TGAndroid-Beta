package org.telegram.messenger.voip;

import org.telegram.messenger.j20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.pr;
import rh.c6;
import rh.e4;
import rh.e6;
public final class g implements Runnable {
    public final int f18644a;
    public final long f18645b;
    public final Object f18646c;
    public final Object d;
    public final Object e;
    public final Object f18647f;

    public g(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18644a = i10;
        this.d = obj;
        this.f18645b = j10;
        this.f18646c = obj2;
        this.e = obj3;
        this.f18647f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.g.run():void");
    }

    public g(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f18644a = i10;
        this.d = obj;
        this.f18646c = obj2;
        this.f18645b = j10;
        this.e = obj3;
        this.f18647f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f18644a = i10;
        this.d = obj;
        this.f18646c = obj2;
        this.e = obj3;
        this.f18645b = j10;
        this.f18647f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f18644a = i10;
        this.d = obj;
        this.f18646c = obj2;
        this.e = obj3;
        this.f18647f = obj4;
        this.f18645b = j10;
    }

    public g(pr prVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f18644a = i10;
        this.d = prVar;
        this.f18645b = j10;
        this.e = tLObject;
        this.f18647f = str;
        this.f18646c = tLObject2;
    }

    public g(rh.r rVar, x1 x1Var, TLObject tLObject, long j10, q20 q20Var) {
        this.f18644a = 10;
        this.d = rVar;
        this.e = x1Var;
        this.f18646c = tLObject;
        this.f18645b = j10;
        this.f18647f = q20Var;
    }

    public g(e4 e4Var, gf.e eVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        this.f18644a = 11;
        this.d = e4Var;
        this.f18647f = eVar;
        this.f18646c = tLObject;
        this.f18645b = j10;
        this.e = tL_error;
    }

    public g(c6 c6Var, TLObject tLObject, vp vpVar, TLRPC.TL_error tL_error, long j10) {
        this.f18644a = 16;
        this.d = c6Var;
        this.f18646c = tLObject;
        this.f18647f = vpVar;
        this.e = tL_error;
        this.f18645b = j10;
    }

    public g(e6 e6Var, j20 j20Var, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18644a = 13;
        this.d = e6Var;
        this.e = j20Var;
        this.f18645b = j10;
        this.f18646c = tLObject;
        this.f18647f = tL_textWithEntities;
    }
}
