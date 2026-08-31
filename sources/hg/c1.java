package hg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.nd;
import org.telegram.ui.py;
public final class c1 implements Utilities.Callback {
    public final int f7431a;
    public final Object f7432b;
    public final Object f7433c;
    public final Object d;
    public final Object f7434e;

    public c1(int i10, Object obj, Object obj2, Object obj3, String str) {
        this.f7431a = i10;
        this.f7432b = obj;
        this.d = str;
        this.f7433c = obj2;
        this.f7434e = obj3;
    }

    @Override
    public final void run(java.lang.Object r33) {
        throw new UnsupportedOperationException("Method not decompiled: hg.c1.run(java.lang.Object):void");
    }

    public c1(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f7431a = i10;
        this.f7432b = obj;
        this.f7433c = obj2;
        this.d = obj3;
        this.f7434e = obj4;
    }

    public c1(lh.g2 g2Var, af.f fVar, Utilities.Callback callback, lh.r1 r1Var) {
        this.f7431a = 2;
        this.f7432b = g2Var;
        this.f7434e = fVar;
        this.f7433c = callback;
        this.d = r1Var;
    }

    public c1(py pyVar, Long l10, nd ndVar, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f7431a = 12;
        this.f7432b = pyVar;
        this.d = l10;
        this.f7434e = ndVar;
        this.f7433c = p2Var;
    }
}
