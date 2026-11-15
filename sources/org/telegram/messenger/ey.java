package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23384a;
    public final boolean f23385b;
    public final Object f23386c;
    public final Object d;
    public final Object f23387e;
    public final Object f23388f;
    public final Object h;

    public ey(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f23384a = i7;
        this.f23386c = obj;
        this.d = obj2;
        this.f23387e = obj3;
        this.f23388f = obj4;
        this.h = obj5;
        this.f23385b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ey.run():void");
    }

    public ey(g5 g5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f23384a = 1;
        this.f23386c = g5Var;
        this.f23385b = z10;
        this.d = arrayList;
        this.f23387e = hashMap;
        this.f23388f = hashMap2;
        this.h = arrayList2;
    }

    public ey(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f23384a = 3;
        this.f23386c = npVar;
        this.d = tL_messages_dialogs;
        this.f23387e = hVar;
        this.f23388f = hVar2;
        this.f23385b = z10;
        this.h = longSparseIntArray;
    }
}
