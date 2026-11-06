package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class iy implements Runnable {
    public final int f23359a;
    public final boolean f23360b;
    public final Object f23361c;
    public final Object d;
    public final Object f23362e;
    public final Object f23363f;
    public final Object h;

    public iy(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z9) {
        this.f23359a = i7;
        this.f23361c = obj;
        this.d = obj2;
        this.f23362e = obj3;
        this.f23363f = obj4;
        this.h = obj5;
        this.f23360b = z9;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.iy.run():void");
    }

    public iy(g5 g5Var, boolean z9, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f23359a = 1;
        this.f23361c = g5Var;
        this.f23360b = z9;
        this.d = arrayList;
        this.f23362e = hashMap;
        this.f23363f = hashMap2;
        this.h = arrayList2;
    }

    public iy(qp qpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z9, LongSparseIntArray longSparseIntArray) {
        this.f23359a = 3;
        this.f23361c = qpVar;
        this.d = tL_messages_dialogs;
        this.f23362e = hVar;
        this.f23363f = hVar2;
        this.f23360b = z9;
        this.h = longSparseIntArray;
    }
}
