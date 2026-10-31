package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d2 implements Runnable {
    public final int f15143a;
    public final int f15144b;
    public final long f15145c;
    public final Object d;
    public final Object e;
    public final Object f15146f;

    public d2(Object obj, int i10, long j10, Object obj2, Serializable serializable, int i11) {
        this.f15143a = i11;
        this.d = obj;
        this.f15144b = i10;
        this.f15145c = j10;
        this.e = obj2;
        this.f15146f = serializable;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d2.a():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.d2.run():void");
    }

    public d2(j2 j2Var, long[] jArr, long j10, int i10, Runnable runnable) {
        this.f15143a = 0;
        this.d = j2Var;
        this.e = jArr;
        this.f15145c = j10;
        this.f15144b = i10;
        this.f15146f = runnable;
    }

    public d2(ui uiVar, TLObject tLObject, int i10, q20 q20Var, long j10) {
        this.f15143a = 1;
        this.d = uiVar;
        this.e = tLObject;
        this.f15144b = i10;
        this.f15146f = q20Var;
        this.f15145c = j10;
    }

    public d2(hs hsVar, long j10, int i10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong, wk wkVar) {
        this.f15143a = 3;
        this.d = hsVar;
        this.f15145c = j10;
        this.f15144b = i10;
        this.e = tL_updates_channelDifferenceTooLong;
        this.f15146f = wkVar;
    }

    public d2(hs hsVar, ArrayList arrayList, ArrayList arrayList2, int i10, long j10) {
        this.f15143a = 4;
        this.d = hsVar;
        this.e = arrayList;
        this.f15146f = arrayList2;
        this.f15144b = i10;
        this.f15145c = j10;
    }

    public d2(qz qzVar, jj jjVar, TLRPC.Message message, long j10, int i10) {
        this.f15143a = 5;
        this.d = qzVar;
        this.e = jjVar;
        this.f15146f = message;
        this.f15145c = j10;
        this.f15144b = i10;
    }

    public d2(x00 x00Var, TLRPC.messages_SavedDialogs messages_saveddialogs, long j10, a0.h hVar, int i10, int i11) {
        this.f15143a = i11;
        this.d = x00Var;
        this.e = messages_saveddialogs;
        this.f15145c = j10;
        this.f15146f = hVar;
        this.f15144b = i10;
    }
}
