package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class iy implements Runnable {
    public final int f23352a;
    public final boolean f23353b;
    public final Object f23354c;
    public final Object d;
    public final Object f23355e;
    public final Object f23356f;
    public final Object h;

    public iy(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z9) {
        this.f23352a = i7;
        this.f23354c = obj;
        this.d = obj2;
        this.f23355e = obj3;
        this.f23356f = obj4;
        this.h = obj5;
        this.f23353b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iy.run():void");
    }

    public iy(g5 g5Var, boolean z9, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f23352a = 1;
        this.f23354c = g5Var;
        this.f23353b = z9;
        this.d = arrayList;
        this.f23355e = hashMap;
        this.f23356f = hashMap2;
        this.h = arrayList2;
    }

    public iy(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z9, LongSparseIntArray longSparseIntArray) {
        this.f23352a = 3;
        this.f23354c = qpVar;
        this.d = tL_messages_dialogs;
        this.f23355e = hVar;
        this.f23356f = hVar2;
        this.f23353b = z9;
        this.h = longSparseIntArray;
    }
}
