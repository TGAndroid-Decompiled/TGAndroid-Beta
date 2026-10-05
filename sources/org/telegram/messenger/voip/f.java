package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.rr;
import yh.t5;
import yh.u5;
public final class f implements Runnable {
    public final int f19543a;
    public final long f19544b;
    public final Object f19545c;
    public final Object d;
    public final Object f19546e;
    public final Object f19547f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19543a = i10;
        this.d = obj;
        this.f19544b = j3;
        this.f19545c = obj2;
        this.f19546e = obj3;
        this.f19547f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19543a = i10;
        this.d = obj;
        this.f19545c = obj2;
        this.f19544b = j3;
        this.f19546e = obj3;
        this.f19547f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19543a = i10;
        this.d = obj;
        this.f19545c = obj2;
        this.f19546e = obj3;
        this.f19544b = j3;
        this.f19547f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19543a = i10;
        this.d = obj;
        this.f19545c = obj2;
        this.f19546e = obj3;
        this.f19547f = obj4;
        this.f19544b = j3;
    }

    public f(rr rrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19543a = i10;
        this.d = rrVar;
        this.f19544b = j3;
        this.f19546e = tLObject;
        this.f19547f = str;
        this.f19545c = tLObject2;
    }

    public f(yh.p pVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19543a = 9;
        this.d = pVar;
        this.f19546e = b2Var;
        this.f19545c = tLObject;
        this.f19544b = j3;
        this.f19547f = callback;
    }

    public f(t5 t5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19543a = 14;
        this.d = t5Var;
        this.f19545c = tLObject;
        this.f19547f = messagesController;
        this.f19546e = tL_error;
        this.f19544b = j3;
    }

    public f(u5 u5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19543a = 11;
        this.d = u5Var;
        this.f19546e = callback2;
        this.f19544b = j3;
        this.f19545c = tLObject;
        this.f19547f = tL_textWithEntities;
    }
}
