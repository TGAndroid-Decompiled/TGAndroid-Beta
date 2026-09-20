package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.sr;
import yh.t5;
import yh.u5;
public final class f implements Runnable {
    public final int f17868a;
    public final long f17869b;
    public final Object f17870c;
    public final Object d;
    public final Object e;
    public final Object f17871f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17868a = i10;
        this.d = obj;
        this.f17869b = j3;
        this.f17870c = obj2;
        this.e = obj3;
        this.f17871f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f17868a = i10;
        this.d = obj;
        this.f17870c = obj2;
        this.f17869b = j3;
        this.e = obj3;
        this.f17871f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f17868a = i10;
        this.d = obj;
        this.f17870c = obj2;
        this.e = obj3;
        this.f17869b = j3;
        this.f17871f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f17868a = i10;
        this.d = obj;
        this.f17870c = obj2;
        this.e = obj3;
        this.f17871f = obj4;
        this.f17869b = j3;
    }

    public f(sr srVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f17868a = i10;
        this.d = srVar;
        this.f17869b = j3;
        this.e = tLObject;
        this.f17871f = str;
        this.f17870c = tLObject2;
    }

    public f(yh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f17868a = 9;
        this.d = oVar;
        this.e = b2Var;
        this.f17870c = tLObject;
        this.f17869b = j3;
        this.f17871f = callback;
    }

    public f(t5 t5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f17868a = 14;
        this.d = t5Var;
        this.f17870c = tLObject;
        this.f17871f = messagesController;
        this.e = tL_error;
        this.f17869b = j3;
    }

    public f(u5 u5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f17868a = 11;
        this.d = u5Var;
        this.e = callback2;
        this.f17869b = j3;
        this.f17870c = tLObject;
        this.f17871f = tL_textWithEntities;
    }
}
