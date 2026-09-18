package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ur;
import yh.u5;
import yh.v5;
public final class f implements Runnable {
    public final int f17653a;
    public final long f17654b;
    public final Object f17655c;
    public final Object d;
    public final Object e;
    public final Object f17656f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17653a = i10;
        this.d = obj;
        this.f17654b = j3;
        this.f17655c = obj2;
        this.e = obj3;
        this.f17656f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f17653a = i10;
        this.d = obj;
        this.f17655c = obj2;
        this.f17654b = j3;
        this.e = obj3;
        this.f17656f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f17653a = i10;
        this.d = obj;
        this.f17655c = obj2;
        this.e = obj3;
        this.f17654b = j3;
        this.f17656f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f17653a = i10;
        this.d = obj;
        this.f17655c = obj2;
        this.e = obj3;
        this.f17656f = obj4;
        this.f17654b = j3;
    }

    public f(ur urVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f17653a = i10;
        this.d = urVar;
        this.f17654b = j3;
        this.e = tLObject;
        this.f17656f = str;
        this.f17655c = tLObject2;
    }

    public f(yh.o oVar, c2 c2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f17653a = 9;
        this.d = oVar;
        this.e = c2Var;
        this.f17655c = tLObject;
        this.f17654b = j3;
        this.f17656f = callback;
    }

    public f(u5 u5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f17653a = 14;
        this.d = u5Var;
        this.f17655c = tLObject;
        this.f17656f = messagesController;
        this.e = tL_error;
        this.f17654b = j3;
    }

    public f(v5 v5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f17653a = 11;
        this.d = v5Var;
        this.e = callback2;
        this.f17654b = j3;
        this.f17655c = tLObject;
        this.f17656f = tL_textWithEntities;
    }
}
