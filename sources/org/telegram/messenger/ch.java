package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p21;
import org.telegram.ui.Components.z60;
public final class ch implements Runnable {
    public final int f15149a;
    public final boolean f15150b;
    public final long f15151c;
    public final Object d;
    public final Object e;
    public final Object f15152f;
    public final Object h;
    public final Object f15153n;

    public ch(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, boolean z10, long j10, Object obj4, int i10) {
        this.f15149a = i10;
        this.d = obj;
        this.e = tL_error;
        this.f15152f = obj2;
        this.h = obj3;
        this.f15150b = z10;
        this.f15151c = j10;
        this.f15153n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ch.run():void");
    }

    public ch(vi viVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.f15149a = 0;
        this.d = viVar;
        this.e = arrayList;
        this.f15150b = z10;
        this.f15152f = arrayList2;
        this.h = arrayList3;
        this.f15153n = hVar;
        this.f15151c = j10;
    }

    public ch(u10 u10Var, q10 q10Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j10, HashSet hashSet) {
        this.f15149a = 2;
        this.d = u10Var;
        this.e = q10Var;
        this.f15152f = tLObject;
        this.f15150b = z10;
        this.h = tL_error;
        this.f15151c = j10;
        this.f15153n = hashSet;
    }

    public ch(p21 p21Var, boolean z10, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f15149a = 3;
        this.d = p21Var;
        this.f15150b = z10;
        this.e = b1Var;
        this.f15152f = z60Var;
        this.f15151c = j10;
        this.h = user;
        this.f15153n = chat;
    }
}
