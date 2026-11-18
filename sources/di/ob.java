package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.qt0;
public final class ob extends LinearLayout implements fs {
    public final int f9482a;
    public final g71 f9483b;
    public final nb f9484c;
    public final FrameLayout d;
    public final qt0 f9485e;
    public final long f9486f;

    public ob(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, qt0 qt0Var) {
        super(context);
        g71 ek0Var;
        ek0 ek0Var2;
        int i11;
        this.f9485e = qt0Var;
        this.f9482a = i7;
        this.f9486f = j3;
        setOrientation(1);
        if (qt0Var == null) {
            ek0Var = new g71(context, null);
        } else {
            ek0Var = new ek0(context, i6Var, qt0Var);
        }
        g71 g71Var = ek0Var;
        this.f9483b = g71Var;
        nb nbVar = new nb(context, i7, z10, j3, i10, i6Var);
        this.f9484c = nbVar;
        if (qt0Var == null) {
            ek0Var2 = null;
        } else {
            ek0Var2 = (ek0) g71Var;
        }
        nbVar.f9396g = ek0Var2;
        g71Var.setAdapter(nbVar);
        if (qt0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View i12 = g71Var.i(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29397d7, view, i6Var);
        if (qt0Var == null) {
            this.d = null;
            addView(i12, c8.ma.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ma.z(-1.0f), c8.ma.z(1.0f / org.telegram.messenger.g0.f24120p)));
            setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, i6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(i12, c8.ma.e(-1, 48, 48));
        }
        addView(g71Var, c8.ma.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i7;
        nb nbVar = this.f9484c;
        g71 g71Var = this.f9483b;
        qt0 qt0Var = this.f9485e;
        if (qt0Var == null) {
            nbVar.i();
            g71Var.j(z10);
            return;
        }
        ArrayList arrayList = nbVar.f9397i;
        ArrayList arrayList2 = nbVar.f9397i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((l41) arrayList.get(i11)).A;
        }
        View currentView = g71Var.getCurrentView();
        if (currentView instanceof mb) {
            i7 = ((mb) currentView).d;
        } else {
            i7 = 0;
        }
        nbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((l41) arrayList2.get(i13)).A;
        }
        if (i10 != i12) {
            g71Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((l41) arrayList2.get(i14)).A == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            g71Var.setPosition(i14);
            g71Var.F();
            g71Var.j(false);
            qt0Var.p();
        } else if (!z10) {
            g71Var.j(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        long j3 = this.f9486f;
        if ((i7 == i11 && j3 == 0) || (i7 == ks.F3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public ck0 getCurrentListView() {
        View currentView = this.f9483b.getCurrentView();
        if (!(currentView instanceof mb)) {
            return null;
        }
        return ((mb) currentView).f9337a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public g71 getViewPager() {
        return this.f9483b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        ks f10 = ks.f(this.f9482a);
        if (this.f9486f == 0) {
            i7 = ks.B3;
        } else {
            i7 = ks.F3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        ks f10 = ks.f(this.f9482a);
        if (this.f9486f == 0) {
            i7 = ks.B3;
        } else {
            i7 = ks.F3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            nb nbVar = this.f9484c;
            if (nbVar.h != qVar) {
                nbVar.h = qVar;
                g71 g71Var = this.f9483b;
                qVar.c(g71Var);
                for (View view : g71Var.getViewPages()) {
                    if (view instanceof mb) {
                        qVar.b(((mb) view).f9337a);
                    }
                }
            }
        }
    }
}
