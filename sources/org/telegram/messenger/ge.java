package org.telegram.messenger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.re0;
public final class ge implements Runnable {
    public final int f15881a;
    public final int f15882b;
    public final Object f15883c;
    public final Object d;
    public final Object e;
    public final Object f15884f;
    public final Object h;
    public final Object f15885n;

    public ge(int i10, ArrayList arrayList, ArrayList arrayList2, Integer num, xe xeVar, xe xeVar2, xe xeVar3) {
        this.f15881a = 0;
        this.f15882b = i10;
        this.f15883c = arrayList;
        this.d = arrayList2;
        this.e = num;
        this.f15884f = xeVar;
        this.h = xeVar2;
        this.f15885n = xeVar3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ge.run():void");
    }

    public ge(Object obj, int i10, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15881a = i11;
        this.f15883c = obj;
        this.f15882b = i10;
        this.d = obj2;
        this.e = obj3;
        this.f15884f = obj4;
        this.h = obj5;
        this.f15885n = obj6;
    }

    public ge(Object obj, Object obj2, int i10, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15881a = i11;
        this.f15883c = obj;
        this.d = obj2;
        this.f15882b = i10;
        this.e = obj3;
        this.f15884f = obj4;
        this.h = obj5;
        this.f15885n = obj6;
    }

    public ge(Object obj, Object obj2, Object obj3, int i10, Object obj4, Object obj5, Object obj6, int i11) {
        this.f15881a = i11;
        this.f15883c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f15882b = i10;
        this.f15884f = obj4;
        this.h = obj5;
        this.f15885n = obj6;
    }

    public ge(vs vsVar, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i10, String str, int i11) {
        this.f15881a = i11;
        this.f15883c = vsVar;
        this.d = tLObject;
        this.e = obj;
        this.f15884f = tLObject2;
        this.h = obj2;
        this.f15882b = i10;
        this.f15885n = str;
    }

    public ge(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i10, AtomicInteger atomicInteger, ArrayList arrayList2, org.telegram.ui.qq qqVar) {
        this.f15881a = 5;
        this.e = tL_error;
        this.f15884f = tLObject;
        this.f15883c = arrayList;
        this.f15882b = i10;
        this.h = atomicInteger;
        this.d = arrayList2;
        this.f15885n = qqVar;
    }

    public ge(re0 re0Var, String str, c5.g gVar, List list, String str2, String str3, int i10) {
        this.f15881a = 12;
        this.f15883c = re0Var;
        this.d = str;
        this.e = gVar;
        this.f15884f = list;
        this.h = str2;
        this.f15885n = str3;
        this.f15882b = i10;
    }

    public ge(org.telegram.ui.web.z0 z0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i10, org.telegram.ui.web.v0 v0Var, org.telegram.ui.web.x0 x0Var) {
        this.f15881a = 16;
        this.f15883c = z0Var;
        this.d = str;
        this.e = tLObject;
        this.f15884f = tL_error;
        this.f15882b = i10;
        this.h = v0Var;
        this.f15885n = x0Var;
    }

    public ge(zf.s0 s0Var, int i10, ArrayList arrayList, a0.h hVar, TLRPC.TL_error tL_error, TLObject tLObject, wp wpVar) {
        this.f15881a = 18;
        this.d = s0Var;
        this.f15882b = i10;
        this.f15883c = arrayList;
        this.e = hVar;
        this.f15884f = tL_error;
        this.h = tLObject;
        this.f15885n = wpVar;
    }
}
