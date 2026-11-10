package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class gy implements Runnable {
    public final int f22763a;
    public final boolean f22764b;
    public final Object f22765c;
    public final Object d;
    public final Object f22766e;
    public final Object f22767f;
    public final Object h;

    public gy(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z9) {
        this.f22763a = i7;
        this.f22765c = obj;
        this.d = obj2;
        this.f22766e = obj3;
        this.f22767f = obj4;
        this.h = obj5;
        this.f22764b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gy.run():void");
    }

    public gy(g5 g5Var, boolean z9, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f22763a = 1;
        this.f22765c = g5Var;
        this.f22764b = z9;
        this.d = arrayList;
        this.f22766e = hashMap;
        this.f22767f = hashMap2;
        this.h = arrayList2;
    }

    public gy(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z9, LongSparseIntArray longSparseIntArray) {
        this.f22763a = 3;
        this.f22765c = qpVar;
        this.d = tL_messages_dialogs;
        this.f22766e = hVar;
        this.f22767f = hVar2;
        this.f22764b = z9;
        this.h = longSparseIntArray;
    }
}
