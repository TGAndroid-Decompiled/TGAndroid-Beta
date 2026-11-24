package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class kf1 extends w39 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final nf1 n;

    public kf1(nf1 nf1Var, Context context) {
        this.n = nf1Var;
        this.c = context;
        C(true);
    }

    public final void D(boolean z) {
        this.d = 0;
        nf1 nf1Var = this.n;
        ArrayList arrayList = nf1Var.p0;
        if (!arrayList.isEmpty()) {
            if (!nf1Var.r0) {
                int i = this.d;
                this.d = i + 1;
                this.e = i;
            } else {
                this.e = -1;
            }
            int i2 = this.d;
            this.f = i2;
            int size = arrayList.size() + i2;
            this.d = size;
            this.h = size;
            return;
        }
        this.e = -1;
        this.f = -1;
        this.h = -1;
    }

    @Override
    public final int b() {
        return this.d;
    }

    @Override
    public final long c(int i) {
        if (i >= this.f && i < this.h) {
            ArrayList arrayList = this.n.p0;
            return ((k27) arrayList.get((arrayList.size() - (i - this.f)) - 1)).m1;
        } else if (i == this.e) {
            return 2L;
        } else {
            return 5L;
        }
    }

    @Override
    public final int d(int i) {
        if (i >= this.f && i < this.h) {
            ArrayList arrayList = this.n.p0;
            return ((k27) arrayList.get((arrayList.size() - (i - this.f)) - 1)).U;
        }
        return 4;
    }

    @Override
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void g(int i) {
        D(false);
        try {
            super.g(i);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void j(int i, int i2) {
        D(false);
        try {
            super.j(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        D(false);
        try {
            super.l(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void p(int i, int i2) {
        D(false);
        try {
            super.p(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void q(int i, int i2) {
        D(false);
        try {
            super.q(i, i2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void t(defpackage.s49 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf1.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        ob2 ob2Var;
        int i2;
        View view;
        nf1 nf1Var = this.n;
        ArrayList arrayList = nf1Var.h;
        Context context = this.c;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                i2 = ((d) nf1Var).currentAccount;
                view = new gb2(context, i2);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            gb2 gb2Var = (gb2) view;
            gb2Var.setDelegate(new ff1(this));
            gb2Var.setAllowAssistant(true);
            ob2Var = view;
        } else if (i == 1) {
            uk1 uk1Var = new uk1(context);
            uk1Var.setDelegate(new if1(this));
            ob2Var = uk1Var;
        } else if (i == 2) {
            ob2Var = new ke2(context, null);
        } else if (i == 10) {
            wjbVar = ((d) nf1Var).resourceProvider;
            ob2 ob2Var2 = new ob2(context, wjbVar);
            ob2Var2.setDelegate(new i4d(this));
            ob2Var = ob2Var2;
        } else {
            ob2Var = new ma2(context, null);
        }
        return ls6.h(ob2Var, ob2Var, -1, -2);
    }

    @Override
    public final void y(s49 s49Var) {
        View view = s49Var.a;
        if ((view instanceof gb2) || (view instanceof uk1)) {
            view.getViewTreeObserver().addOnPreDrawListener(new jf1(this, view, s49Var));
        }
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            gb2Var.getMessageObject();
            gb2Var.setBackgroundDrawable(null);
            gb2Var.n3(true, false);
            gb2Var.setHighlighted(false);
        }
    }
}
