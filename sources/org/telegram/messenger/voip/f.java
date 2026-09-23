package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.qr;
import yh.s5;
import yh.t5;
public final class f implements Runnable {
    public final int f17628a;
    public final long f17629b;
    public final Object f17630c;
    public final Object d;
    public final Object e;
    public final Object f17631f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17628a = i10;
        this.d = obj;
        this.f17629b = j3;
        this.f17630c = obj2;
        this.e = obj3;
        this.f17631f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f17628a = i10;
        this.d = obj;
        this.f17630c = obj2;
        this.f17629b = j3;
        this.e = obj3;
        this.f17631f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f17628a = i10;
        this.d = obj;
        this.f17630c = obj2;
        this.e = obj3;
        this.f17629b = j3;
        this.f17631f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f17628a = i10;
        this.d = obj;
        this.f17630c = obj2;
        this.e = obj3;
        this.f17631f = obj4;
        this.f17629b = j3;
    }

    public f(qr qrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f17628a = i10;
        this.d = qrVar;
        this.f17629b = j3;
        this.e = tLObject;
        this.f17631f = str;
        this.f17630c = tLObject2;
    }

    public f(yh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f17628a = 9;
        this.d = oVar;
        this.e = b2Var;
        this.f17630c = tLObject;
        this.f17629b = j3;
        this.f17631f = callback;
    }

    public f(s5 s5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f17628a = 14;
        this.d = s5Var;
        this.f17630c = tLObject;
        this.f17631f = messagesController;
        this.e = tL_error;
        this.f17629b = j3;
    }

    public f(t5 t5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f17628a = 11;
        this.d = t5Var;
        this.e = callback2;
        this.f17629b = j3;
        this.f17630c = tLObject;
        this.f17631f = tL_textWithEntities;
    }
}
