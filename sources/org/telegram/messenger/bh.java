package org.telegram.messenger;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o21;
import org.telegram.ui.Components.z60;
public final class bh implements Runnable {
    public final int f14767a;
    public final boolean f14768b;
    public final long f14769c;
    public final Object d;
    public final Object e;
    public final Object f14770f;
    public final Object h;
    public final Object f14771n;

    public bh(Object obj, TLRPC.TL_error tL_error, Object obj2, Object obj3, boolean z10, long j10, Object obj4, int i10) {
        this.f14767a = i10;
        this.d = obj;
        this.e = tL_error;
        this.f14770f = obj2;
        this.h = obj3;
        this.f14768b = z10;
        this.f14769c = j10;
        this.f14771n = obj4;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.bh.run():void");
    }

    public bh(ui uiVar, ArrayList arrayList, boolean z10, ArrayList arrayList2, ArrayList arrayList3, a0.h hVar, long j10) {
        this.f14767a = 0;
        this.d = uiVar;
        this.e = arrayList;
        this.f14768b = z10;
        this.f14770f = arrayList2;
        this.h = arrayList3;
        this.f14771n = hVar;
        this.f14769c = j10;
    }

    public bh(t10 t10Var, p10 p10Var, TLObject tLObject, boolean z10, TLRPC.TL_error tL_error, long j10, HashSet hashSet) {
        this.f14767a = 2;
        this.d = t10Var;
        this.e = p10Var;
        this.f14770f = tLObject;
        this.f14768b = z10;
        this.h = tL_error;
        this.f14769c = j10;
        this.f14771n = hashSet;
    }

    public bh(o21 o21Var, boolean z10, org.telegram.ui.ActionBar.b1 b1Var, z60 z60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.f14767a = 3;
        this.d = o21Var;
        this.f14768b = z10;
        this.e = b1Var;
        this.f14770f = z60Var;
        this.f14769c = j10;
        this.h = user;
        this.f14771n = chat;
    }
}
