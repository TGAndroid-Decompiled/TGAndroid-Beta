package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.vr;
import zh.r5;
import zh.s5;
public final class f implements Runnable {
    public final int f19348a;
    public final long f19349b;
    public final Object f19350c;
    public final Object d;
    public final Object f19351e;
    public final Object f19352f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19348a = i10;
        this.d = obj;
        this.f19349b = j3;
        this.f19350c = obj2;
        this.f19351e = obj3;
        this.f19352f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19348a = i10;
        this.d = obj;
        this.f19350c = obj2;
        this.f19349b = j3;
        this.f19351e = obj3;
        this.f19352f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19348a = i10;
        this.d = obj;
        this.f19350c = obj2;
        this.f19351e = obj3;
        this.f19349b = j3;
        this.f19352f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19348a = i10;
        this.d = obj;
        this.f19350c = obj2;
        this.f19351e = obj3;
        this.f19352f = obj4;
        this.f19349b = j3;
    }

    public f(vr vrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19348a = i10;
        this.d = vrVar;
        this.f19349b = j3;
        this.f19351e = tLObject;
        this.f19352f = str;
        this.f19350c = tLObject2;
    }

    public f(zh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19348a = 9;
        this.d = oVar;
        this.f19351e = b2Var;
        this.f19350c = tLObject;
        this.f19349b = j3;
        this.f19352f = callback;
    }

    public f(r5 r5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19348a = 14;
        this.d = r5Var;
        this.f19350c = tLObject;
        this.f19352f = messagesController;
        this.f19351e = tL_error;
        this.f19349b = j3;
    }

    public f(s5 s5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19348a = 11;
        this.d = s5Var;
        this.f19351e = callback2;
        this.f19349b = j3;
        this.f19350c = tLObject;
        this.f19352f = tL_textWithEntities;
    }
}
