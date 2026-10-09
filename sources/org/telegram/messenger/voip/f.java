package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.tr;
import yh.l5;
import yh.m5;
public final class f implements Runnable {
    public final int f19549a;
    public final long f19550b;
    public final Object f19551c;
    public final Object d;
    public final Object f19552e;
    public final Object f19553f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19549a = i10;
        this.d = obj;
        this.f19550b = j3;
        this.f19551c = obj2;
        this.f19552e = obj3;
        this.f19553f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19549a = i10;
        this.d = obj;
        this.f19551c = obj2;
        this.f19550b = j3;
        this.f19552e = obj3;
        this.f19553f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19549a = i10;
        this.d = obj;
        this.f19551c = obj2;
        this.f19552e = obj3;
        this.f19550b = j3;
        this.f19553f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19549a = i10;
        this.d = obj;
        this.f19551c = obj2;
        this.f19552e = obj3;
        this.f19553f = obj4;
        this.f19550b = j3;
    }

    public f(tr trVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19549a = i10;
        this.d = trVar;
        this.f19550b = j3;
        this.f19552e = tLObject;
        this.f19553f = str;
        this.f19551c = tLObject2;
    }

    public f(yh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19549a = 9;
        this.d = oVar;
        this.f19552e = b2Var;
        this.f19551c = tLObject;
        this.f19550b = j3;
        this.f19553f = callback;
    }

    public f(l5 l5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19549a = 14;
        this.d = l5Var;
        this.f19551c = tLObject;
        this.f19553f = messagesController;
        this.f19552e = tL_error;
        this.f19550b = j3;
    }

    public f(m5 m5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19549a = 11;
        this.d = m5Var;
        this.f19552e = callback2;
        this.f19550b = j3;
        this.f19551c = tLObject;
        this.f19553f = tL_textWithEntities;
    }
}
