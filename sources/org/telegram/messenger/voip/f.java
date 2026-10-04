package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.rr;
import yh.s5;
import yh.t5;
public final class f implements Runnable {
    public final int f19538a;
    public final long f19539b;
    public final Object f19540c;
    public final Object d;
    public final Object f19541e;
    public final Object f19542f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19538a = i10;
        this.d = obj;
        this.f19539b = j3;
        this.f19540c = obj2;
        this.f19541e = obj3;
        this.f19542f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19538a = i10;
        this.d = obj;
        this.f19540c = obj2;
        this.f19539b = j3;
        this.f19541e = obj3;
        this.f19542f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19538a = i10;
        this.d = obj;
        this.f19540c = obj2;
        this.f19541e = obj3;
        this.f19539b = j3;
        this.f19542f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19538a = i10;
        this.d = obj;
        this.f19540c = obj2;
        this.f19541e = obj3;
        this.f19542f = obj4;
        this.f19539b = j3;
    }

    public f(rr rrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19538a = i10;
        this.d = rrVar;
        this.f19539b = j3;
        this.f19541e = tLObject;
        this.f19542f = str;
        this.f19540c = tLObject2;
    }

    public f(yh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19538a = 9;
        this.d = oVar;
        this.f19541e = b2Var;
        this.f19540c = tLObject;
        this.f19539b = j3;
        this.f19542f = callback;
    }

    public f(s5 s5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19538a = 14;
        this.d = s5Var;
        this.f19540c = tLObject;
        this.f19542f = messagesController;
        this.f19541e = tL_error;
        this.f19539b = j3;
    }

    public f(t5 t5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19538a = 11;
        this.d = t5Var;
        this.f19541e = callback2;
        this.f19539b = j3;
        this.f19540c = tLObject;
        this.f19542f = tL_textWithEntities;
    }
}
