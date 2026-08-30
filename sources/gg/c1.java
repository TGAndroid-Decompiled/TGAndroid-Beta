package gg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.nd;
import org.telegram.ui.oy;
public final class c1 implements Utilities.Callback {
    public final int f6592a;
    public final Object f6593b;
    public final Object f6594c;
    public final Object d;
    public final Object e;

    public c1(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.f6592a = i10;
        this.f6593b = obj;
        this.d = str;
        this.f6594c = obj2;
        this.e = obj3;
    }

    @Override
    public final void run(java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: gg.c1.run(java.lang.Object):void");
    }

    public c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6592a = i10;
        this.f6593b = obj;
        this.f6594c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public c1(kh.h2 h2Var, af.f fVar, Utilities.Callback callback, kh.r1 r1Var) {
        this.f6592a = 2;
        this.f6593b = h2Var;
        this.e = fVar;
        this.f6594c = callback;
        this.d = r1Var;
    }

    public c1(oy oyVar, Long l10, nd ndVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6592a = 12;
        this.f6593b = oyVar;
        this.d = l10;
        this.e = ndVar;
        this.f6594c = p2Var;
    }
}
