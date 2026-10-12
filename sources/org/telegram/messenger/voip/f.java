package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.wr;
import yh.m5;
import yh.n5;
public final class f implements Runnable {
    public final int f19325a;
    public final long f19326b;
    public final Object f19327c;
    public final Object d;
    public final Object f19328e;
    public final Object f19329f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19325a = i10;
        this.d = obj;
        this.f19326b = j3;
        this.f19327c = obj2;
        this.f19328e = obj3;
        this.f19329f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19325a = i10;
        this.d = obj;
        this.f19327c = obj2;
        this.f19326b = j3;
        this.f19328e = obj3;
        this.f19329f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19325a = i10;
        this.d = obj;
        this.f19327c = obj2;
        this.f19328e = obj3;
        this.f19326b = j3;
        this.f19329f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19325a = i10;
        this.d = obj;
        this.f19327c = obj2;
        this.f19328e = obj3;
        this.f19329f = obj4;
        this.f19326b = j3;
    }

    public f(wr wrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19325a = i10;
        this.d = wrVar;
        this.f19326b = j3;
        this.f19328e = tLObject;
        this.f19329f = str;
        this.f19327c = tLObject2;
    }

    public f(yh.o oVar, a2 a2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19325a = 9;
        this.d = oVar;
        this.f19328e = a2Var;
        this.f19327c = tLObject;
        this.f19326b = j3;
        this.f19329f = callback;
    }

    public f(m5 m5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19325a = 14;
        this.d = m5Var;
        this.f19327c = tLObject;
        this.f19329f = messagesController;
        this.f19328e = tL_error;
        this.f19326b = j3;
    }

    public f(n5 n5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19325a = 11;
        this.d = n5Var;
        this.f19328e = callback2;
        this.f19326b = j3;
        this.f19327c = tLObject;
        this.f19329f = tL_textWithEntities;
    }
}
