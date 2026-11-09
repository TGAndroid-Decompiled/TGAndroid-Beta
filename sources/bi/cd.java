package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.y31;
public final class cd extends LinearLayout implements ls {
    public final int f3609a;
    public final w61 f3610b;
    public final bd f3611c;
    public final FrameLayout d;
    public final jt0 f3612e;
    public final long f3613f;

    public cd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.g6 g6Var, jt0 jt0Var) {
        super(context);
        w61 sj0Var;
        sj0 sj0Var2;
        int i11;
        this.f3612e = jt0Var;
        this.f3609a = i7;
        this.f3613f = j3;
        setOrientation(1);
        if (jt0Var == null) {
            sj0Var = new w61(context, null);
        } else {
            sj0Var = new sj0(context, g6Var, jt0Var);
        }
        w61 w61Var = sj0Var;
        this.f3610b = w61Var;
        bd bdVar = new bd(context, i7, z9, j3, i10, g6Var);
        this.f3611c = bdVar;
        if (jt0Var == null) {
            sj0Var2 = null;
        } else {
            sj0Var2 = (sj0) w61Var;
        }
        bdVar.f3533g = sj0Var2;
        w61Var.setAdapter(bdVar);
        if (jt0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View n10 = w61Var.n(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.f27866d7, view, g6Var);
        if (jt0Var == null) {
            this.d = null;
            addView(n10, c8.ha.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(1.0f / org.telegram.messenger.g0.f22562p)));
            setBackgroundColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, g6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(n10, c8.ha.e(-1, 48, 48));
        }
        addView(w61Var, c8.ha.o(-1, -1));
    }

    public final void a(boolean z9) {
        int i7;
        bd bdVar = this.f3611c;
        w61 w61Var = this.f3610b;
        jt0 jt0Var = this.f3612e;
        if (jt0Var == null) {
            bdVar.i();
            w61Var.o(z9);
            return;
        }
        ArrayList arrayList = bdVar.f3534i;
        ArrayList arrayList2 = bdVar.f3534i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((y31) arrayList.get(i11)).f40581z;
        }
        View currentView = w61Var.getCurrentView();
        if (currentView instanceof ad) {
            i7 = ((ad) currentView).d;
        } else {
            i7 = 0;
        }
        bdVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((y31) arrayList2.get(i13)).f40581z;
        }
        if (i10 != i12) {
            w61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((y31) arrayList2.get(i14)).f40581z == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            w61Var.setPosition(i14);
            w61Var.J();
            w61Var.o(false);
            jt0Var.p();
        } else if (!z9) {
            w61Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25121z3;
        long j3 = this.f3613f;
        if ((i7 == i11 && j3 == 0) || (i7 == qs.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public qj0 getCurrentListView() {
        View currentView = this.f3610b.getCurrentView();
        if (!(currentView instanceof ad)) {
            return null;
        }
        return ((ad) currentView).f3468a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w61 getViewPager() {
        return this.f3610b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        qs f10 = qs.f(this.f3609a);
        if (this.f3613f == 0) {
            i7 = qs.f25121z3;
        } else {
            i7 = qs.D3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        qs f10 = qs.f(this.f3609a);
        if (this.f3613f == 0) {
            i7 = qs.f25121z3;
        } else {
            i7 = qs.D3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(oi.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            bd bdVar = this.f3611c;
            if (bdVar.h != qVar) {
                bdVar.h = qVar;
                w61 w61Var = this.f3610b;
                qVar.c(w61Var);
                for (View view : w61Var.getViewPages()) {
                    if (view instanceof ad) {
                        qVar.b(((ad) view).f3468a);
                    }
                }
            }
        }
    }
}
