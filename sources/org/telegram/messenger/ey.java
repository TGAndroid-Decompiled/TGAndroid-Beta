package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ey implements Runnable {
    public final int f23381a;
    public final boolean f23382b;
    public final Object f23383c;
    public final Object d;
    public final Object f23384e;
    public final Object f23385f;
    public final Object h;

    public ey(int i7, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z10) {
        this.f23381a = i7;
        this.f23383c = obj;
        this.d = obj2;
        this.f23384e = obj3;
        this.f23385f = obj4;
        this.h = obj5;
        this.f23382b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ey.run():void");
    }

    public ey(g5 g5Var, boolean z10, ArrayList arrayList, HashMap hashMap, HashMap hashMap2, ArrayList arrayList2) {
        this.f23381a = 1;
        this.f23383c = g5Var;
        this.f23382b = z10;
        this.d = arrayList;
        this.f23384e = hashMap;
        this.f23385f = hashMap2;
        this.h = arrayList2;
    }

    public ey(np npVar, TLRPC.TL_messages_dialogs tL_messages_dialogs, a0.h hVar, a0.h hVar2, boolean z10, LongSparseIntArray longSparseIntArray) {
        this.f23381a = 3;
        this.f23383c = npVar;
        this.d = tL_messages_dialogs;
        this.f23384e = hVar;
        this.f23385f = hVar2;
        this.f23382b = z10;
        this.h = longSparseIntArray;
    }
}
