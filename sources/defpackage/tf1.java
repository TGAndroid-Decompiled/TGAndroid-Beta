package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class tf1 extends j79 {
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public final wf1 n;

    public tf1(wf1 wf1Var, Context context) {
        this.n = wf1Var;
        this.c = context;
        C(true);
    }

    public final void D(boolean z) {
        this.d = 0;
        wf1 wf1Var = this.n;
        ArrayList arrayList = wf1Var.p0;
        if (!arrayList.isEmpty()) {
            if (!wf1Var.r0) {
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
            return ((r47) arrayList.get((arrayList.size() - (i - this.f)) - 1)).m1;
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
            return ((r47) arrayList.get((arrayList.size() - (i - this.f)) - 1)).U;
        }
        return 4;
    }

    @Override
    public final void f() {
        D(true);
        try {
            super.f();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void g(int i) {
        D(false);
        try {
            super.g(i);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void j(int i, int i2) {
        D(false);
        try {
            super.j(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void l(int i, int i2) {
        D(false);
        try {
            super.l(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void p(int i, int i2) {
        D(false);
        try {
            super.p(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void q(int i, int i2) {
        D(false);
        try {
            super.q(i, i2);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void t(defpackage.f89 r21, int r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf1.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        ec2 ec2Var;
        int i2;
        View view;
        wf1 wf1Var = this.n;
        ArrayList arrayList = wf1Var.h;
        Context context = this.c;
        if (i == 0) {
            if (arrayList.isEmpty()) {
                i2 = ((e) wf1Var).currentAccount;
                view = new wb2(context, i2);
            } else {
                arrayList.remove(0);
                view = (View) arrayList.get(0);
            }
            wb2 wb2Var = (wb2) view;
            wb2Var.setDelegate(new of1(this));
            wb2Var.setAllowAssistant(true);
            ec2Var = view;
        } else if (i == 1) {
            dl1 dl1Var = new dl1(context);
            dl1Var.setDelegate(new rf1(this));
            ec2Var = dl1Var;
        } else if (i == 2) {
            ec2Var = new bf2(context, null);
        } else if (i == 10) {
            vnbVar = ((e) wf1Var).resourceProvider;
            ec2 ec2Var2 = new ec2(context, vnbVar);
            ec2Var2.setDelegate(new z8d(this, (byte) 17));
            ec2Var = ec2Var2;
        } else {
            ec2Var = new cb2(context, null);
        }
        return qu6.h(ec2Var, ec2Var, -1, -2);
    }

    @Override
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        if ((view instanceof wb2) || (view instanceof dl1)) {
            view.getViewTreeObserver().addOnPreDrawListener(new sf1(this, view, f89Var));
        }
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            wb2Var.getMessageObject();
            wb2Var.setBackgroundDrawable(null);
            wb2Var.n3(true, false);
            wb2Var.setHighlighted(false);
        }
    }
}
