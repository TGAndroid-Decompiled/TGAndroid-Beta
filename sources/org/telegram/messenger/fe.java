package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.se0;
public final class fe implements Runnable {
    public final int f15540a;
    public final int f15541b;
    public final Object f15542c;
    public final Object d;
    public final Object e;
    public final Object f15543f;
    public final Object h;
    public final Object f15544n;

    public fe(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, we weVar, we weVar2, we weVar3) {
        this.f15540a = 0;
        this.f15541b = i10;
        this.f15542c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f15543f = weVar;
        this.h = weVar2;
        this.f15544n = weVar3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fe.run():void");
    }

    public fe(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15540a = i11;
        this.f15542c = obj;
        this.f15541b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f15543f = obj4;
        this.h = obj5;
        this.f15544n = obj6;
    }

    public fe(Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15540a = i11;
        this.f15542c = obj;
        this.d = obj2;
        this.f15541b = i10;
        this.e = obj3;
        this.f15543f = obj4;
        this.h = obj5;
        this.f15544n = obj6;
    }

    public fe(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15540a = i11;
        this.f15542c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15541b = i10;
        this.f15543f = obj4;
        this.h = obj5;
        this.f15544n = obj6;
    }

    public fe(us usVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i10, String str, int i11) {
        this.f15540a = i11;
        this.f15542c = usVar;
        this.d = tLObject;
        this.e = obj;
        this.f15543f = tLObject2;
        this.h = obj2;
        this.f15541b = i10;
        this.f15544n = str;
    }

    public fe(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, org.telegram.ui.qq qqVar) {
        this.f15540a = 5;
        this.e = tL_error;
        this.f15543f = tLObject;
        this.f15542c = arrayList;
        this.f15541b = i10;
        this.h = atomicInteger;
        this.d = arrayList2;
        this.f15544n = qqVar;
    }

    public fe(se0 se0Var, String str, c5.g gVar, List list, String str2, String str3, int i10) {
        this.f15540a = 12;
        this.f15542c = se0Var;
        this.d = str;
        this.e = gVar;
        this.f15543f = list;
        this.h = str2;
        this.f15544n = str3;
        this.f15541b = i10;
    }

    public fe(org.telegram.ui.web.z0 z0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.v0 v0Var, org.telegram.ui.web.x0 x0Var) {
        this.f15540a = 16;
        this.f15542c = z0Var;
        this.d = str;
        this.e = tLObject;
        this.f15543f = tL_error;
        this.f15541b = i10;
        this.h = v0Var;
        this.f15544n = x0Var;
    }

    public fe(zf.s0 s0Var, int i10, ArrayList arrayList, a0.h hVar, TLRPC.TL_error tL_error, TLObject tLObject, vp vpVar) {
        this.f15540a = 18;
        this.d = s0Var;
        this.f15541b = i10;
        this.f15542c = arrayList;
        this.e = hVar;
        this.f15543f = tL_error;
        this.h = tLObject;
        this.f15544n = vpVar;
    }
}
