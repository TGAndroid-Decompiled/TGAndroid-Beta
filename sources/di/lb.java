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
public final class lb extends LinearLayout implements is {
    public final int f9000a;
    public final w61 f9001b;
    public final kb f9002c;
    public final FrameLayout d;
    public final it0 f9003e;
    public final long f9004f;

    public lb(Context context, int i7, boolean z10, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var, it0 it0Var) {
        super(context);
        w61 wj0Var;
        wj0 wj0Var2;
        int i11;
        this.f9003e = it0Var;
        this.f9000a = i7;
        this.f9004f = j3;
        setOrientation(1);
        if (it0Var == null) {
            wj0Var = new w61(context, null);
        } else {
            wj0Var = new wj0(context, e6Var, it0Var);
        }
        w61 w61Var = wj0Var;
        this.f9001b = w61Var;
        kb kbVar = new kb(context, i7, z10, j3, i10, e6Var);
        this.f9002c = kbVar;
        if (it0Var == null) {
            wj0Var2 = null;
        } else {
            wj0Var2 = (wj0) w61Var;
        }
        kbVar.f8938g = wj0Var2;
        w61Var.setAdapter(kbVar);
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
            addView(view, new LinearLayout.LayoutParams(c8.ja.z(-1.0f), c8.ja.z(1.0f / org.telegram.messenger.g0.f23608p)));
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
        kb kbVar = this.f9002c;
        w61 w61Var = this.f9001b;
        it0 it0Var = this.f9003e;
        if (it0Var == null) {
            kbVar.i();
            w61Var.k(z10);
            return;
        }
        ArrayList arrayList = kbVar.f8939i;
        ArrayList arrayList2 = kbVar.f8939i;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            i10 |= 1 << ((b41) arrayList.get(i11)).f33194z;
        }
        View currentView = w61Var.getCurrentView();
        if (currentView instanceof jb) {
            i7 = ((jb) currentView).d;
        } else {
            i7 = 0;
        }
        kbVar.i();
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            i12 |= 1 << ((b41) arrayList2.get(i13)).f33194z;
        }
        if (i10 != i12) {
            w61Var.onTouchEvent(null);
            int i14 = 0;
            while (true) {
                if (i14 < arrayList2.size()) {
                    if (((b41) arrayList2.get(i14)).f33194z == i7) {
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
        int i11 = ns.f25617z3;
        long j3 = this.f9004f;
        if ((i7 == i11 && j3 == 0) || (i7 == ns.D3 && j3 != 0 && ((Long) objArr[0]).longValue() == j3)) {
            a(true);
        }
    }

    public uj0 getCurrentListView() {
        View currentView = this.f9001b.getCurrentView();
        if (!(currentView instanceof jb)) {
            return null;
        }
        return ((jb) currentView).f8869a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public w61 getViewPager() {
        return this.f9001b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i7;
        a(false);
        ns f10 = ns.f(this.f9000a);
        if (this.f9004f == 0) {
            i7 = ns.f25617z3;
        } else {
            i7 = ns.D3;
        }
        f10.c(this, i7);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i7;
        ns f10 = ns.f(this.f9000a);
        if (this.f9004f == 0) {
            i7 = ns.f25617z3;
        } else {
            i7 = ns.D3;
        }
        f10.n(this, i7);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(ri.q qVar) {
        View[] viewPages;
        if (qVar != null) {
            kb kbVar = this.f9002c;
            if (kbVar.h != qVar) {
                kbVar.h = qVar;
                w61 w61Var = this.f9001b;
                qVar.c(w61Var);
                for (View view : w61Var.getViewPages()) {
                    if (view instanceof jb) {
                        qVar.b(((jb) view).f8869a);
                    }
                }
            }
        }
    }
}
