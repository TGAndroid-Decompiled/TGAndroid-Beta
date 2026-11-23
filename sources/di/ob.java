package di;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.st0;
public final class ob extends LinearLayout implements fs {
    public final int f9459a;
    public final k71 f9460b;
    public final nb f9461c;
    public final FrameLayout d;
    public final st0 f9462e;
    public final long f9463f;

    public ob(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var, st0 st0Var) {
        super(context);
        k71 gk0Var;
        gk0 gk0Var2;
        int i11;
        this.f9462e = st0Var;
        this.f9459a = i7;
        this.f9463f = j3;
        setOrientation(1);
        if (st0Var == null) {
            gk0Var = new k71(context, null);
        } else {
            gk0Var = new gk0(context, i6Var, st0Var);
        }
        k71 k71Var = gk0Var;
        this.f9460b = k71Var;
        nb nbVar = new nb(context, i7, z10, j3, i10, i6Var);
        this.f9461c = nbVar;
        if (st0Var == null) {
            gk0Var2 = null;
        } else {
            gk0Var2 = (gk0) k71Var;
        }
        nbVar.f9385g = gk0Var2;
        k71Var.setAdapter(nbVar);
        if (st0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View k10 = k71Var.k(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29452d7, view, i6Var);
        if (st0Var == null) {
            this.d = null;
            addView(k10, c8.na.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.na.z(-1.0f), c8.na.z(1.0f / org.telegram.messenger.g0.f24225p)));
            setBackgroundColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, i6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(k10, c8.na.e(-1, 48, 48));
        }
        addView(k71Var, c8.na.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i7;
        nb nbVar = this.f9461c;
        k71 k71Var = this.f9460b;
        st0 st0Var = this.f9462e;
        if (st0Var == null) {
            nbVar.i();
            k71Var.l(z10);
            return;
        }
        ArrayList arrayList = nbVar.f9386i;
        ArrayList arrayList2 = nbVar.f9386i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((n41) arrayList.get(i11)).A;
        }
        View currentView = k71Var.getCurrentView();
        if (currentView instanceof mb) {
            i7 = ((mb) currentView).d;
        } else {
            i7 = 0;
        }
        nbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((n41) arrayList2.get(i13)).A;
        }
        if (i10 != i12) {
            k71Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((n41) arrayList2.get(i14)).A == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            k71Var.setPosition(i14);
            k71Var.H();
            k71Var.l(false);
            st0Var.p();
        } else if (!z10) {
            k71Var.l(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = ks.B3;
        long j3 = this.f9463f;
        if ((i7 == i11 && j3 == 0) || (i7 == ks.F3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public ek0 getCurrentListView() {
        View currentView = this.f9460b.getCurrentView();
        if (!(currentView instanceof mb)) {
            return null;
        }
        return ((mb) currentView).f9322a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public k71 getViewPager() {
        return this.f9460b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        ks f10 = ks.f(this.f9459a);
        if (this.f9463f == 0) {
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
        ks f10 = ks.f(this.f9459a);
        if (this.f9463f == 0) {
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
            nb nbVar = this.f9461c;
            if (nbVar.h != qVar) {
                nbVar.h = qVar;
                k71 k71Var = this.f9460b;
                qVar.c(k71Var);
                for (View view : k71Var.getViewPages()) {
                    if (view instanceof mb) {
                        qVar.b(((mb) view).f9322a);
                    }
                }
            }
        }
    }
}
