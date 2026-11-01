package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f15284a;
    public final int f15285b;
    public final long f15286c;
    public final Object d;
    public final Object e;
    public final Object f15287f;

    public d2(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.f15284a = i11;
        this.d = obj;
        this.f15285b = i10;
        this.f15286c = j10;
        this.e = obj2;
        this.f15287f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d2.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d2.run():void");
    }

    public d2(j2 j2Var, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f15284a = 0;
        this.d = j2Var;
        this.e = jArr;
        this.f15286c = j10;
        this.f15285b = i10;
        this.f15287f = runnable;
    }

    public d2(vi viVar, TLObject tLObject, int i10, r20 r20Var, long j10) {
        this.f15284a = 1;
        this.d = viVar;
        this.e = tLObject;
        this.f15285b = i10;
        this.f15287f = r20Var;
        this.f15286c = j10;
    }

    public d2(is isVar, long j10, int i10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, xk xkVar) {
        this.f15284a = 3;
        this.d = isVar;
        this.f15286c = j10;
        this.f15285b = i10;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f15287f = xkVar;
    }

    public d2(is isVar, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f15284a = 4;
        this.d = isVar;
        this.e = arrayList;
        this.f15287f = arrayList2;
        this.f15285b = i10;
        this.f15286c = j10;
    }

    public d2(rz rzVar, kj kjVar, TLRPC.Message message, long j10, int i10) {
        this.f15284a = 5;
        this.d = rzVar;
        this.e = kjVar;
        this.f15287f = message;
        this.f15286c = j10;
        this.f15285b = i10;
    }

    public d2(y00 y00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f15284a = i11;
        this.d = y00Var;
        this.e = messages_saveddialogs;
        this.f15286c = j10;
        this.f15287f = hVar;
        this.f15285b = i10;
    }
}
