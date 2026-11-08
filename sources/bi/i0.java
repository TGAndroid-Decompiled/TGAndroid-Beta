package bi;

import android.content.Context;
import org.telegram.messenger.c20;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.messenger.qr;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.an;
import org.telegram.ui.oq;
public final class i0 implements Runnable {
    public final int f4021a;
    public final Object f4022b;
    public final long f4023c;
    public final Object d;
    public final Object f4024e;
    public final Object f4025f;

    public i0(long j3, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.f4021a = 8;
        this.d = conferenceCall;
        this.f4023c = j3;
        this.f4022b = tLObject;
        this.f4024e = tL_error;
        this.f4025f = runnable;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.i0.run():void");
    }

    public i0(ca caVar, TLObject tLObject, qp qpVar, TLRPC.TL_error tL_error, long j3) {
        this.f4021a = 6;
        this.d = caVar;
        this.f4022b = tLObject;
        this.f4024e = qpVar;
        this.f4025f = tL_error;
        this.f4023c = j3;
    }

    public i0(ea eaVar, TLObject tLObject, ij ijVar, long j3, Runnable runnable) {
        this.f4021a = 2;
        this.d = eaVar;
        this.f4022b = tLObject;
        this.f4024e = ijVar;
        this.f4023c = j3;
        this.f4025f = runnable;
    }

    public i0(ce ceVar, long j3, ea eaVar, ij ijVar, an anVar) {
        this.f4021a = 7;
        this.d = ceVar;
        this.f4023c = j3;
        this.f4024e = eaVar;
        this.f4022b = ijVar;
        this.f4025f = anVar;
    }

    public i0(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i7) {
        this.f4021a = i7;
        this.d = obj;
        this.f4024e = obj2;
        this.f4023c = j3;
        this.f4022b = obj3;
        this.f4025f = obj4;
    }

    public i0(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i7) {
        this.f4021a = i7;
        this.d = obj;
        this.f4024e = obj2;
        this.f4022b = obj3;
        this.f4023c = j3;
        this.f4025f = obj4;
    }

    public i0(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i7) {
        this.f4021a = i7;
        this.d = obj;
        this.f4024e = obj2;
        this.f4022b = obj3;
        this.f4025f = obj4;
        this.f4023c = j3;
    }

    public i0(org.telegram.ui.ActionBar.u1 u1Var, TLObject tLObject, long j3, org.telegram.messenger.c cVar, qr qrVar) {
        this.f4021a = 13;
        this.f4024e = u1Var;
        this.f4022b = tLObject;
        this.f4023c = j3;
        this.d = cVar;
        this.f4025f = qrVar;
    }

    public i0(oq oqVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i7) {
        this.f4021a = i7;
        this.d = oqVar;
        this.f4023c = j3;
        this.f4024e = tLObject;
        this.f4025f = str;
        this.f4022b = tLObject2;
    }

    public i0(zh.g1 g1Var, v9 v9Var, long j3, c20 c20Var, Context context) {
        this.f4021a = 17;
        this.d = g1Var;
        this.f4024e = v9Var;
        this.f4023c = j3;
        this.f4025f = c20Var;
        this.f4022b = context;
    }
}
