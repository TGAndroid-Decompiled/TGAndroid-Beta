package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.tt0;
public final class ob extends LinearLayout implements gs {
    public final int f9464a;
    public final j71 f9465b;
    public final nb f9466c;
    public final FrameLayout d;
    public final tt0 f9467e;
    public final long f9468f;

    public ob(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.h6 h6Var, tt0 tt0Var) {
        super(context);
        j71 gk0Var;
        gk0 gk0Var2;
        int i11;
        this.f9467e = tt0Var;
        this.f9464a = i7;
        this.f9468f = j3;
        setOrientation(1);
        if (tt0Var == null) {
            gk0Var = new j71(context, null);
        } else {
            gk0Var = new gk0(context, h6Var, tt0Var);
        }
        j71 j71Var = gk0Var;
        this.f9465b = j71Var;
        nb nbVar = new nb(context, i7, z10, j3, i10, h6Var);
        this.f9466c = nbVar;
        if (tt0Var == null) {
            gk0Var2 = null;
        } else {
            gk0Var2 = (gk0) j71Var;
        }
        nbVar.f9391g = gk0Var2;
        j71Var.setAdapter(nbVar);
        if (tt0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View i12 = j71Var.i(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29348d7, view, h6Var);
        if (tt0Var == null) {
            this.d = null;
            addView(i12, c8.na.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.na.z(-1.0f), c8.na.z(1.0f / org.telegram.messenger.g0.f24009p)));
            setBackgroundColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29420h5, h6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i12, c8.na.e(-1, 48, 48));
        }
        addView(j71Var, c8.na.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i7;
        nb nbVar = this.f9466c;
        j71 j71Var = this.f9465b;
        tt0 tt0Var = this.f9467e;
        if (tt0Var == null) {
            nbVar.i();
            j71Var.j(z10);
            return;
        }
        ArrayList arrayList = nbVar.f9392i;
        ArrayList arrayList2 = nbVar.f9392i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((o41) arrayList.get(i11)).A;
        }
        View currentView = j71Var.getCurrentView();
        if (currentView instanceof mb) {
            i7 = ((mb) currentView).d;
        } else {
            i7 = 0;
        }
        nbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((o41) arrayList2.get(i13)).A;
        }
        if (i10 != i12) {
            j71Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((o41) arrayList2.get(i14)).A == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            j71Var.setPosition(i14);
            j71Var.F();
            j71Var.j(false);
            tt0Var.p();
        } else if (!z10) {
            j71Var.j(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ls.B3;
        long j3 = this.f9468f;
        if ((i7 == i11 && j3 == 0) || (i7 == ls.F3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public ek0 getCurrentListView() {
        View currentView = this.f9465b.getCurrentView();
        if (!(currentView instanceof mb)) {
            return null;
        }
        return ((mb) currentView).f9326a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public j71 getViewPager() {
        return this.f9465b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        ls f10 = ls.f(this.f9464a);
        if (this.f9468f == 0) {
            i7 = ls.B3;
        } else {
            i7 = ls.F3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        ls f10 = ls.f(this.f9464a);
        if (this.f9468f == 0) {
            i7 = ls.B3;
        } else {
            i7 = ls.F3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            nb nbVar = this.f9466c;
            if (nbVar.h != qVar) {
                nbVar.h = qVar;
                j71 j71Var = this.f9465b;
                qVar.c(j71Var);
                for (View view : j71Var.getViewPages()) {
                    if (view instanceof mb) {
                        qVar.b(((mb) view).f9326a);
                    }
                }
            }
        }
    }
}
