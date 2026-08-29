package eg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.fy;
import org.telegram.ui.hd;
public final class d1 implements Utilities.Callback {
    public final int f5963a;
    public final Object f5964b;
    public final Object f5965c;
    public final Object d;
    public final Object f5966e;

    public d1(ih.h2 h2Var, ye.c cVar, Utilities.Callback callback, ih.s1 s1Var) {
        this.f5963a = 2;
        this.f5964b = h2Var;
        this.f5966e = cVar;
        this.f5965c = callback;
        this.d = s1Var;
    }

    @Override
    public final void run(java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: eg.d1.run(java.lang.Object):void");
    }

    public d1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5963a = i10;
        this.f5964b = obj;
        this.f5965c = obj2;
        this.d = obj3;
        this.f5966e = obj4;
    }

    public d1(Object obj, String str, Object obj2, Object obj3, int i10) {
        this.f5963a = i10;
        this.f5964b = obj;
        this.d = str;
        this.f5965c = obj2;
        this.f5966e = obj3;
    }

    public d1(fy fyVar, Long l10, hd hdVar, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f5963a = 12;
        this.f5964b = fyVar;
        this.d = l10;
        this.f5966e = hdVar;
        this.f5965c = o2Var;
    }
}
