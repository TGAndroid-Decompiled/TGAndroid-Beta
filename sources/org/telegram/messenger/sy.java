package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class sy implements Runnable {
    public final int f17970a;
    public final boolean f17971b;
    public final Object f17972c;
    public final Object d;
    public final Object e;
    public final Object f17973f;
    public final Object h;

    public sy(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f17970a = i10;
        this.f17972c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17973f = obj4;
        this.h = obj5;
        this.f17971b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.sy.run():void");
    }

    public sy(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f17970a = 1;
        this.f17972c = i5Var;
        this.f17971b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f17973f = hashMap2;
        this.h = arrayList2;
    }

    public sy(vp vpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f17970a = 3;
        this.f17972c = vpVar;
        this.d = tL_messages_dialogs;
        this.e = hVar;
        this.f17973f = hVar2;
        this.f17971b = z10;
        this.h = longSparseIntArray;
    }
}
