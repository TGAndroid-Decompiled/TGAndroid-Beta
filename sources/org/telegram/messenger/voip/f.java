package org.telegram.messenger.voip;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.yr;
import zh.m5;
import zh.n5;
public final class f implements Runnable {
    public final int f18490a;
    public final long f18491b;
    public final Object f18492c;
    public final Object d;
    public final Object e;
    public final Object f18493f;

    public f(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18490a = i10;
        this.d = obj;
        this.f18491b = j10;
        this.f18492c = obj2;
        this.e = obj3;
        this.f18493f = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.f.run():void");
    }

    public f(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.f18490a = i10;
        this.d = obj;
        this.f18492c = obj2;
        this.f18491b = j10;
        this.e = obj3;
        this.f18493f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.f18490a = i10;
        this.d = obj;
        this.f18492c = obj2;
        this.e = obj3;
        this.f18491b = j10;
        this.f18493f = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.f18490a = i10;
        this.d = obj;
        this.f18492c = obj2;
        this.e = obj3;
        this.f18493f = obj4;
        this.f18491b = j10;
    }

    public f(yr yrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.f18490a = i10;
        this.d = yrVar;
        this.f18491b = j10;
        this.e = tLObject;
        this.f18493f = str;
        this.f18492c = tLObject2;
    }

    public f(zh.p pVar, a2 a2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.f18490a = 9;
        this.d = pVar;
        this.e = a2Var;
        this.f18492c = tLObject;
        this.f18491b = j10;
        this.f18493f = callback;
    }

    public f(m5 m5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.f18490a = 14;
        this.d = m5Var;
        this.f18492c = tLObject;
        this.f18493f = messagesController;
        this.e = tL_error;
        this.f18491b = j10;
    }

    public f(n5 n5Var, Utilities.Callback2 callback2, long j10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f18490a = 11;
        this.d = n5Var;
        this.e = callback2;
        this.f18491b = j10;
        this.f18492c = tLObject;
        this.f18493f = tL_textWithEntities;
    }
}
