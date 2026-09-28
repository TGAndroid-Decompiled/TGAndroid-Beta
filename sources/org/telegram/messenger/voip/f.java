package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.pr;
import yh.r5;
import yh.s5;
public final class f implements Runnable {
    public final int f17897a;
    public final long f17898b;
    public final Object f17899c;
    public final Object d;
    public final Object e;
    public final Object f17900f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17897a = i10;
        this.d = obj;
        this.f17898b = j3;
        this.f17899c = obj2;
        this.e = obj3;
        this.f17900f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f17897a = i10;
        this.d = obj;
        this.f17899c = obj2;
        this.f17898b = j3;
        this.e = obj3;
        this.f17900f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f17897a = i10;
        this.d = obj;
        this.f17899c = obj2;
        this.e = obj3;
        this.f17898b = j3;
        this.f17900f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f17897a = i10;
        this.d = obj;
        this.f17899c = obj2;
        this.e = obj3;
        this.f17900f = obj4;
        this.f17898b = j3;
    }

    public f(pr prVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f17897a = i10;
        this.d = prVar;
        this.f17898b = j3;
        this.e = tLObject;
        this.f17900f = str;
        this.f17899c = tLObject2;
    }

    public f(yh.o oVar, a2 a2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f17897a = 9;
        this.d = oVar;
        this.e = a2Var;
        this.f17899c = tLObject;
        this.f17898b = j3;
        this.f17900f = callback;
    }

    public f(r5 r5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f17897a = 14;
        this.d = r5Var;
        this.f17899c = tLObject;
        this.f17900f = messagesController;
        this.e = tL_error;
        this.f17898b = j3;
    }

    public f(s5 s5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f17897a = 11;
        this.d = s5Var;
        this.e = callback2;
        this.f17898b = j3;
        this.f17899c = tLObject;
        this.f17900f = tL_textWithEntities;
    }
}
