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
    public final int f19389a;
    public final long f19390b;
    public final Object f19391c;
    public final Object d;
    public final Object f19392e;
    public final Object f19393f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19389a = i10;
        this.d = obj;
        this.f19390b = j3;
        this.f19391c = obj2;
        this.f19392e = obj3;
        this.f19393f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19389a = i10;
        this.d = obj;
        this.f19391c = obj2;
        this.f19390b = j3;
        this.f19392e = obj3;
        this.f19393f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19389a = i10;
        this.d = obj;
        this.f19391c = obj2;
        this.f19392e = obj3;
        this.f19390b = j3;
        this.f19393f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19389a = i10;
        this.d = obj;
        this.f19391c = obj2;
        this.f19392e = obj3;
        this.f19393f = obj4;
        this.f19390b = j3;
    }

    public f(vr vrVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19389a = i10;
        this.d = vrVar;
        this.f19390b = j3;
        this.f19392e = tLObject;
        this.f19393f = str;
        this.f19391c = tLObject2;
    }

    public f(zh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19389a = 9;
        this.d = oVar;
        this.f19392e = b2Var;
        this.f19391c = tLObject;
        this.f19390b = j3;
        this.f19393f = callback;
    }

    public f(r5 r5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19389a = 14;
        this.d = r5Var;
        this.f19391c = tLObject;
        this.f19393f = messagesController;
        this.f19392e = tL_error;
        this.f19390b = j3;
    }

    public f(s5 s5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19389a = 11;
        this.d = s5Var;
        this.f19392e = callback2;
        this.f19390b = j3;
        this.f19391c = tLObject;
        this.f19393f = tL_textWithEntities;
    }
}
