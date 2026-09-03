package gg;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.pd;
import org.telegram.ui.qy;
public final class c1 implements Utilities.Callback {
    public final int f6579a;
    public final Object f6580b;
    public final Object f6581c;
    public final Object d;
    public final Object e;

    public c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f6579a = i10;
        this.f6580b = obj;
        this.f6581c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: gg.c1.run(java.lang.Object):void");
    }

    public c1(Object obj, String str, ArrayList arrayList, Object obj2, int i10) {
        this.f6579a = i10;
        this.f6580b = obj;
        this.d = str;
        this.f6581c = arrayList;
        this.e = obj2;
    }

    public c1(kh.g2 g2Var, ze.c cVar, Utilities.Callback callback, kh.r1 r1Var) {
        this.f6579a = 2;
        this.f6580b = g2Var;
        this.e = cVar;
        this.f6581c = callback;
        this.d = r1Var;
    }

    public c1(qy qyVar, Long l10, pd pdVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f6579a = 12;
        this.f6580b = qyVar;
        this.d = l10;
        this.e = pdVar;
        this.f6581c = p2Var;
    }
}
