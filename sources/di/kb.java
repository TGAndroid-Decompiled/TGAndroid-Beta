package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wj0;
public final class kb extends LinearLayout implements is {
    public final int f8929a;
    public final w61 f8930b;
    public final jb f8931c;
    public final FrameLayout d;
    public final it0 f8932e;
    public final long f8933f;

    public kb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var, it0 it0Var) {
        super(context);
        w61 wj0Var;
        wj0 wj0Var2;
        int i11;
        this.f8932e = it0Var;
        this.f8929a = i7;
        this.f8933f = j3;
        setOrientation(1);
        if (it0Var == null) {
            wj0Var = new w61(context, null);
        } else {
            wj0Var = new wj0(context, e6Var, it0Var);
        }
        w61 w61Var = wj0Var;
        this.f8930b = w61Var;
        jb jbVar = new jb(context, i7, z10, j3, i10, e6Var);
        this.f8931c = jbVar;
        if (it0Var == null) {
            wj0Var2 = null;
        } else {
            wj0Var2 = (wj0) w61Var;
        }
        jbVar.f8883g = wj0Var2;
        w61Var.setAdapter(jbVar);
        if (it0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View i12 = w61Var.i(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28850d7, view, e6Var);
        if (it0Var == null) {
            this.d = null;
            addView(i12, c8.ja.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ja.z(-1.0f), c8.ja.z(1.0f / org.telegram.messenger.g0.f23610p)));
            setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, e6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i12, c8.ja.e(-1, 48, 48));
        }
        addView(w61Var, c8.ja.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i7;
        jb jbVar = this.f8931c;
        w61 w61Var = this.f8930b;
        it0 it0Var = this.f8932e;
        if (it0Var == null) {
            jbVar.i();
            w61Var.k(z10);
            return;
        }
        ArrayList arrayList = jbVar.f8884i;
        ArrayList arrayList2 = jbVar.f8884i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((b41) arrayList.get(i11)).f33197z;
        }
        View currentView = w61Var.getCurrentView();
        if (currentView instanceof ib) {
            i7 = ((ib) currentView).d;
        } else {
            i7 = 0;
        }
        jbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((b41) arrayList2.get(i13)).f33197z;
        }
        if (i10 != i12) {
            w61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((b41) arrayList2.get(i14)).f33197z == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            w61Var.setPosition(i14);
            w61Var.H();
            w61Var.k(false);
            it0Var.p();
        } else if (!z10) {
            w61Var.k(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ns.f25618z3;
        long j3 = this.f8933f;
        if ((i7 == i11 && j3 == 0) || (i7 == ns.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public uj0 getCurrentListView() {
        View currentView = this.f8930b.getCurrentView();
        if (!(currentView instanceof ib)) {
            return null;
        }
        return ((ib) currentView).f8816a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w61 getViewPager() {
        return this.f8930b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        ns f10 = ns.f(this.f8929a);
        if (this.f8933f == 0) {
            i7 = ns.f25618z3;
        } else {
            i7 = ns.D3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        ns f10 = ns.f(this.f8929a);
        if (this.f8933f == 0) {
            i7 = ns.f25618z3;
        } else {
            i7 = ns.D3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            jb jbVar = this.f8931c;
            if (jbVar.h != qVar) {
                jbVar.h = qVar;
                w61 w61Var = this.f8930b;
                qVar.c(w61Var);
                for (View view : w61Var.getViewPages()) {
                    if (view instanceof ib) {
                        qVar.b(((ib) view).f8816a);
                    }
                }
            }
        }
    }
}
