package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class mxa extends LinearLayout implements jm7 {
    public final int a;
    public final wgc b;
    public final lxa c;
    public final FrameLayout d;
    public final fja e;
    public final long f;

    public mxa(Context context, int i, boolean z, long j, int i2, ylb ylbVar, fja fjaVar) {
        super(context);
        wgc v59Var;
        v59 v59Var2;
        int i3;
        this.e = fjaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        if (fjaVar == null) {
            v59Var = new wgc(context, null);
        } else {
            v59Var = new v59(context, ylbVar, fjaVar);
        }
        wgc wgcVar = v59Var;
        this.b = wgcVar;
        lxa lxaVar = new lxa(context, i, z, j, i2, ylbVar);
        this.c = lxaVar;
        if (fjaVar == null) {
            v59Var2 = null;
        } else {
            v59Var2 = (v59) wgcVar;
        }
        lxaVar.g = v59Var2;
        wgcVar.setAdapter(lxaVar);
        if (fjaVar == null) {
            i3 = 3;
        } else {
            i3 = -2;
        }
        View l = wgcVar.l(i3, true);
        View view = new View(context);
        anb.h(cmb.c7, ylbVar, view);
        if (fjaVar == null) {
            this.d = null;
            addView(l, qoe.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(qoe.z(-1.0f), qoe.z(1.0f / gm.p)));
            setBackgroundColor(cmb.v0(cmb.g5, ylbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
            frameLayout.addView(l, qoe.e(-1, 48, 48));
        }
        addView(wgcVar, qoe.o(-1, -1));
    }

    public final void a(boolean z) {
        int i;
        wgc wgcVar = this.b;
        fja fjaVar = this.e;
        lxa lxaVar = this.c;
        if (fjaVar == null) {
            lxaVar.i();
            wgcVar.m(z);
            return;
        }
        ArrayList arrayList = lxaVar.i;
        ArrayList arrayList2 = lxaVar.i;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 |= 1 << ((c6c) arrayList.get(i3)).A;
        }
        View currentView = wgcVar.getCurrentView();
        if (currentView instanceof kxa) {
            i = ((kxa) currentView).d;
        } else {
            i = 0;
        }
        lxaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((c6c) arrayList2.get(i5)).A;
        }
        if (i2 != i4) {
            wgcVar.onTouchEvent(null);
            int i6 = 0;
            while (true) {
                if (i6 < arrayList2.size()) {
                    if (((c6c) arrayList2.get(i6)).A == i) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = 0;
                    break;
                }
            }
            wgcVar.setPosition(i6);
            wgcVar.J();
            wgcVar.m(false);
            fjaVar.s();
        } else if (!z) {
            wgcVar.m(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.B3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == nm7.F3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public r59 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (!(currentView instanceof kxa)) {
            return null;
        }
        return ((kxa) currentView).a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public wgc getViewPager() {
        return this.b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        a(false);
        nm7 f = nm7.f(this.a);
        if (this.f == 0) {
            i = nm7.B3;
        } else {
            i = nm7.F3;
        }
        f.b(this, i);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        nm7 f = nm7.f(this.a);
        if (this.f == 0) {
            i = nm7.B3;
        } else {
            i = nm7.F3;
        }
        f.n(this, i);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(sy4 sy4Var) {
        View[] viewPages;
        if (sy4Var != null) {
            lxa lxaVar = this.c;
            if (lxaVar.h != sy4Var) {
                lxaVar.h = sy4Var;
                wgc wgcVar = this.b;
                sy4Var.c(wgcVar);
                for (View view : wgcVar.getViewPages()) {
                    if (view instanceof kxa) {
                        sy4Var.b(((kxa) view).a);
                    }
                }
            }
        }
    }
}
