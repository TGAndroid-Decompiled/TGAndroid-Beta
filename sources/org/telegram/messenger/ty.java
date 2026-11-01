package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ty implements Runnable {
    public final int f18321a;
    public final boolean f18322b;
    public final Object f18323c;
    public final Object d;
    public final Object e;
    public final Object f18324f;
    public final Object h;

    public ty(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10, int i10) {
        this.f18321a = i10;
        this.f18323c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18324f = obj4;
        this.h = obj5;
        this.f18322b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ty.run():void");
    }

    public ty(i5 i5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f18321a = 1;
        this.f18323c = i5Var;
        this.f18322b = z10;
        this.d = arrayList;
        this.e = hashMap;
        this.f18324f = hashMap2;
        this.h = arrayList2;
    }

    public ty(wp wpVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f18321a = 3;
        this.f18323c = wpVar;
        this.d = tL_messages_dialogs;
        this.e = hVar;
        this.f18324f = hVar2;
        this.f18322b = z10;
        this.h = longSparseIntArray;
    }
}
