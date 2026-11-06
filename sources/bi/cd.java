package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w31;
public final class cd extends LinearLayout implements ls {
    public final int f3609a;
    public final u61 f3610b;
    public final bd f3611c;
    public final FrameLayout d;
    public final ht0 f3612e;
    public final long f3613f;

    public cd(Context context, int i7, boolean z9, long j3, int i10, org.telegram.ui.ActionBar.f6 f6Var, ht0 ht0Var) {
        super(context);
        u61 rj0Var;
        rj0 rj0Var2;
        int i11;
        this.f3612e = ht0Var;
        this.f3609a = i7;
        this.f3613f = j3;
        setOrientation(1);
        if (ht0Var == null) {
            rj0Var = new u61(context, null);
        } else {
            rj0Var = new rj0(context, f6Var, ht0Var);
        }
        u61 u61Var = rj0Var;
        this.f3610b = u61Var;
        bd bdVar = new bd(context, i7, z9, j3, i10, f6Var);
        this.f3611c = bdVar;
        if (ht0Var == null) {
            rj0Var2 = null;
        } else {
            rj0Var2 = (rj0) u61Var;
        }
        bdVar.f3533g = rj0Var2;
        u61Var.setAdapter(bdVar);
        if (ht0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View n10 = u61Var.n(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d7, view, f6Var);
        if (ht0Var == null) {
            this.d = null;
            addView(n10, c8.ha.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(c8.ha.z(-1.0f), c8.ha.z(1.0f / org.telegram.messenger.g0.f22536p)));
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, f6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(n10, c8.ha.e(-1, 48, 48));
        }
        addView(u61Var, c8.ha.o(-1, -1));
    }

    public final void a(boolean z9) {
        int i7;
        bd bdVar = this.f3611c;
        u61 u61Var = this.f3610b;
        ht0 ht0Var = this.f3612e;
        if (ht0Var == null) {
            bdVar.i();
            u61Var.o(z9);
            return;
        }
        ArrayList arrayList = bdVar.f3534i;
        ArrayList arrayList2 = bdVar.f3534i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((w31) arrayList.get(i11)).f39843z;
        }
        View currentView = u61Var.getCurrentView();
        if (currentView instanceof ad) {
            i7 = ((ad) currentView).d;
        } else {
            i7 = 0;
        }
        bdVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((w31) arrayList2.get(i13)).f39843z;
        }
        if (i10 != i12) {
            u61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((w31) arrayList2.get(i14)).f39843z == i7) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            u61Var.setPosition(i14);
            u61Var.J();
            u61Var.o(false);
            ht0Var.p();
        } else if (!z9) {
            u61Var.o(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = qs.f25104z3;
        long j3 = this.f3613f;
        if ((i7 == i11 && j3 == 0) || (i7 == qs.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public pj0 getCurrentListView() {
        View currentView = this.f3610b.getCurrentView();
        if (!(currentView instanceof ad)) {
            return null;
        }
        return ((ad) currentView).f3468a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public u61 getViewPager() {
        return this.f3610b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        qs f10 = qs.f(this.f3609a);
        if (this.f3613f == 0) {
            i7 = qs.f25104z3;
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
            i7 = qs.f25104z3;
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
                u61 u61Var = this.f3610b;
                qVar.c(u61Var);
                for (View view : u61Var.getViewPages()) {
                    if (view instanceof ad) {
                        qVar.b(((ad) view).f3468a);
                    }
                }
            }
        }
    }
}
