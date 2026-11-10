package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x31;
public final class cd extends LinearLayout implements ls {
    public final int f3612a;
    public final v61 f3613b;
    public final bd f3614c;
    public final FrameLayout d;
    public final it0 f3615e;
    public final long f3616f;

    public cd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var, it0 it0Var) {
        super(context);
        v61 rj0Var;
        rj0 rj0Var2;
        int i11;
        this.f3615e = it0Var;
        this.f3612a = i7;
        this.f3616f = j3;
        setOrientation(1);
        if (it0Var == null) {
            rj0Var = new v61(context, null);
        } else {
            rj0Var = new rj0(context, h6Var, it0Var);
        }
        v61 v61Var = rj0Var;
        this.f3613b = v61Var;
        bd bdVar = new bd(context, i7, z9, j3, i10, h6Var);
        this.f3614c = bdVar;
        if (it0Var == null) {
            rj0Var2 = null;
        } else {
            rj0Var2 = (rj0) v61Var;
        }
        bdVar.f3536g = rj0Var2;
        v61Var.setAdapter(bdVar);
        if (it0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View n10 = v61Var.n(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27891d7, view, h6Var);
        if (it0Var == null) {
            this.d = null;
            addView(n10, c8.ha.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(1.0f / org.telegram.messenger.g0.f22566p)));
            setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27963h5, h6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(n10, c8.ha.e(-1, 48, 48));
        }
        addView(v61Var, c8.ha.o(-1, -1));
    }

    public final void a(boolean z9) {
        int i7;
        bd bdVar = this.f3614c;
        v61 v61Var = this.f3613b;
        it0 it0Var = this.f3615e;
        if (it0Var == null) {
            bdVar.i();
            v61Var.o(z9);
            return;
        }
        ArrayList arrayList = bdVar.f3537i;
        ArrayList arrayList2 = bdVar.f3537i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((x31) arrayList.get(i11)).f40169z;
        }
        View currentView = v61Var.getCurrentView();
        if (currentView instanceof ad) {
            i7 = ((ad) currentView).d;
        } else {
            i7 = 0;
        }
        bdVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((x31) arrayList2.get(i13)).f40169z;
        }
        if (i10 != i12) {
            v61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((x31) arrayList2.get(i14)).f40169z == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            v61Var.setPosition(i14);
            v61Var.J();
            v61Var.o(false);
            it0Var.p();
        } else if (!z9) {
            v61Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25125z3;
        long j3 = this.f3616f;
        if ((i7 == i11 && j3 == 0) || (i7 == qs.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public pj0 getCurrentListView() {
        View currentView = this.f3613b.getCurrentView();
        if (!(currentView instanceof ad)) {
            return null;
        }
        return ((ad) currentView).f3471a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public v61 getViewPager() {
        return this.f3613b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        qs f10 = qs.f(this.f3612a);
        if (this.f3616f == 0) {
            i7 = qs.f25125z3;
        } else {
            i7 = qs.D3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        qs f10 = qs.f(this.f3612a);
        if (this.f3616f == 0) {
            i7 = qs.f25125z3;
        } else {
            i7 = qs.D3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(oi.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            bd bdVar = this.f3614c;
            if (bdVar.h != qVar) {
                bdVar.h = qVar;
                v61 v61Var = this.f3613b;
                qVar.c(v61Var);
                for (View view : v61Var.getViewPages()) {
                    if (view instanceof ad) {
                        qVar.b(((ad) view).f3471a);
                    }
                }
            }
        }
    }
}
