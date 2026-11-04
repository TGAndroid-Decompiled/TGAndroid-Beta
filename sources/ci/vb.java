package ci;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vj0;
public final class vb extends LinearLayout implements cs {
    public final int f6214a;
    public final n61 f6215b;
    public final ub f6216c;
    public final FrameLayout d;
    public final gt0 f6217e;
    public final long f6218f;

    public vb(Context context, int i3, boolean z10, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var, gt0 gt0Var) {
        super(context);
        n61 vj0Var;
        vj0 vj0Var2;
        int i11;
        this.f6217e = gt0Var;
        this.f6214a = i3;
        this.f6218f = j10;
        setOrientation(1);
        if (gt0Var == null) {
            vj0Var = new n61(context, null);
        } else {
            vj0Var = new vj0(context, e6Var, gt0Var);
        }
        n61 n61Var = vj0Var;
        this.f6215b = n61Var;
        ub ubVar = new ub(context, i3, z10, j10, i10, e6Var);
        this.f6216c = ubVar;
        if (gt0Var == null) {
            vj0Var2 = null;
        } else {
            vj0Var2 = (vj0) n61Var;
        }
        ubVar.f6125g = vj0Var2;
        n61Var.setAdapter(ubVar);
        if (gt0Var == null) {
            i11 = 3;
        } else {
            i11 = -2;
        }
        View j11 = n61Var.j(i11, true);
        View view = new View(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27879d7, view, e6Var);
        if (gt0Var == null) {
            this.d = null;
            addView(j11, mf.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(mf.z(-1.0f), mf.z(1.0f / org.telegram.messenger.g0.f22607p)));
            setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, e6Var));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
            frameLayout.addView(j11, mf.e(-1, 48, 48));
        }
        addView(n61Var, mf.o(-1, -1));
    }

    public final void a(boolean z10) {
        int i3;
        ub ubVar = this.f6216c;
        n61 n61Var = this.f6215b;
        gt0 gt0Var = this.f6217e;
        if (gt0Var == null) {
            ubVar.i();
            n61Var.k(z10);
            return;
        }
        ArrayList arrayList = ubVar.f6126i;
        ArrayList arrayList2 = ubVar.f6126i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((r31) arrayList.get(i11)).f37640z;
        }
        View currentView = n61Var.getCurrentView();
        if (currentView instanceof tb) {
            i3 = ((tb) currentView).d;
        } else {
            i3 = 0;
        }
        ubVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((r31) arrayList2.get(i13)).f37640z;
        }
        if (i10 != i12) {
            n61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((r31) arrayList2.get(i14)).f37640z == i3) {
                        break;
                    }
                    i14++;
                } else {
                    i14 = 0;
                    break;
                }
            }
            n61Var.setPosition(i14);
            n61Var.J();
            n61Var.k(false);
            gt0Var.l();
        } else if (!z10) {
            n61Var.k(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = hs.f23350z3;
        long j10 = this.f6218f;
        if ((i3 == i11 && j10 == 0) || (i3 == hs.D3 && j10 != 0 && ((Long) objArr[0]).longValue() == j10)) {
            a(true);
        }
    }

    public tj0 getCurrentListView() {
        View currentView = this.f6215b.getCurrentView();
        if (!(currentView instanceof tb)) {
            return null;
        }
        return ((tb) currentView).f6049a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public n61 getViewPager() {
        return this.f6215b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i3;
        a(false);
        hs f10 = hs.f(this.f6214a);
        if (this.f6218f == 0) {
            i3 = hs.f23350z3;
        } else {
            i3 = hs.D3;
        }
        f10.c(this, i3);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i3;
        hs f10 = hs.f(this.f6214a);
        if (this.f6218f == 0) {
            i3 = hs.f23350z3;
        } else {
            i3 = hs.D3;
        }
        f10.n(this, i3);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(pi.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            ub ubVar = this.f6216c;
            if (ubVar.h != qVar) {
                ubVar.h = qVar;
                n61 n61Var = this.f6215b;
                qVar.c(n61Var);
                for (View view : n61Var.getViewPages()) {
                    if (view instanceof tb) {
                        qVar.b(((tb) view).f6049a);
                    }
                }
            }
        }
    }
}
