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
    public final int f19553a;
    public final long f19554b;
    public final Object f19555c;
    public final Object d;
    public final Object f19556e;
    public final Object f19557f;

    public f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19553a = i10;
        this.d = obj;
        this.f19554b = j3;
        this.f19555c = obj2;
        this.f19556e = obj3;
        this.f19557f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.f19553a = i10;
        this.d = obj;
        this.f19555c = obj2;
        this.f19554b = j3;
        this.f19556e = obj3;
        this.f19557f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.f19553a = i10;
        this.d = obj;
        this.f19555c = obj2;
        this.f19556e = obj3;
        this.f19554b = j3;
        this.f19557f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.f19553a = i10;
        this.d = obj;
        this.f19555c = obj2;
        this.f19556e = obj3;
        this.f19557f = obj4;
        this.f19554b = j3;
    }

    public f(tr trVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f19553a = i10;
        this.d = trVar;
        this.f19554b = j3;
        this.f19556e = tLObject;
        this.f19557f = str;
        this.f19555c = tLObject2;
    }

    public f(yh.o oVar, b2 b2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.f19553a = 9;
        this.d = oVar;
        this.f19556e = b2Var;
        this.f19555c = tLObject;
        this.f19554b = j3;
        this.f19557f = callback;
    }

    public f(l5 l5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.f19553a = 14;
        this.d = l5Var;
        this.f19555c = tLObject;
        this.f19557f = messagesController;
        this.f19556e = tL_error;
        this.f19554b = j3;
    }

    public f(m5 m5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f19553a = 11;
        this.d = m5Var;
        this.f19556e = callback2;
        this.f19554b = j3;
        this.f19555c = tLObject;
        this.f19557f = tL_textWithEntities;
    }
}
