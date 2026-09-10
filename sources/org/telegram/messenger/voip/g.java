package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.wr;
import xh.u5;
import xh.v5;
public final class g implements Runnable {
    public final int f16721a;
    public final long f16722b;
    public final Object f16723c;
    public final Object d;
    public final Object e;
    public final Object f16724f;

    public g(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16721a = i10;
        this.d = obj;
        this.f16722b = j3;
        this.f16723c = obj2;
        this.e = obj3;
        this.f16724f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.g.run():void");
    }

    public g(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f16721a = i10;
        this.d = obj;
        this.f16723c = obj2;
        this.f16722b = j3;
        this.e = obj3;
        this.f16724f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f16721a = i10;
        this.d = obj;
        this.f16723c = obj2;
        this.e = obj3;
        this.f16722b = j3;
        this.f16724f = obj4;
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f16721a = i10;
        this.d = obj;
        this.f16723c = obj2;
        this.e = obj3;
        this.f16724f = obj4;
        this.f16722b = j3;
    }

    public g(wr wrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f16721a = i10;
        this.d = wrVar;
        this.f16722b = j3;
        this.e = tLObject;
        this.f16724f = str;
        this.f16723c = tLObject2;
    }

    public g(xh.p pVar, d2 d2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f16721a = 9;
        this.d = pVar;
        this.e = d2Var;
        this.f16723c = tLObject;
        this.f16722b = j3;
        this.f16724f = callback;
    }

    public g(u5 u5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f16721a = 14;
        this.d = u5Var;
        this.f16723c = tLObject;
        this.f16724f = messagesController;
        this.e = tL_error;
        this.f16722b = j3;
    }

    public g(v5 v5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f16721a = 11;
        this.d = v5Var;
        this.e = callback2;
        this.f16722b = j3;
        this.f16723c = tLObject;
        this.f16724f = tL_textWithEntities;
    }
}
