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
    public final int f19375a;
    public final long f19376b;
    public final Object f19377c;
    public final Object d;
    public final Object f19378e;
    public final Object f19379f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19375a = i10;
        this.d = obj;
        this.f19376b = j3;
        this.f19377c = obj2;
        this.f19378e = obj3;
        this.f19379f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19375a = i10;
        this.d = obj;
        this.f19377c = obj2;
        this.f19376b = j3;
        this.f19378e = obj3;
        this.f19379f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19375a = i10;
        this.d = obj;
        this.f19377c = obj2;
        this.f19378e = obj3;
        this.f19376b = j3;
        this.f19379f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19375a = i10;
        this.d = obj;
        this.f19377c = obj2;
        this.f19378e = obj3;
        this.f19379f = obj4;
        this.f19376b = j3;
    }

    public f(vr vrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19375a = i10;
        this.d = vrVar;
        this.f19376b = j3;
        this.f19378e = tLObject;
        this.f19379f = str;
        this.f19377c = tLObject2;
    }

    public f(zh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19375a = 9;
        this.d = oVar;
        this.f19378e = b2Var;
        this.f19377c = tLObject;
        this.f19376b = j3;
        this.f19379f = callback;
    }

    public f(r5 r5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19375a = 14;
        this.d = r5Var;
        this.f19377c = tLObject;
        this.f19379f = messagesController;
        this.f19378e = tL_error;
        this.f19376b = j3;
    }

    public f(s5 s5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19375a = 11;
        this.d = s5Var;
        this.f19378e = callback2;
        this.f19376b = j3;
        this.f19377c = tLObject;
        this.f19379f = tL_textWithEntities;
    }
}
