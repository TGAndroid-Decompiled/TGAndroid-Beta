package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class iva extends LinearLayout implements gk7 {
    public final int a;
    public final wec b;
    public final hva c;
    public final FrameLayout d;
    public final dha e;
    public final long f;

    public iva(Context context, int i, boolean z, long j, int i2, wjb wjbVar, dha dhaVar) {
        super(context);
        wec s39Var;
        s39 s39Var2;
        int i3;
        this.e = dhaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        if (dhaVar == null) {
            s39Var = new wec(context, null);
        } else {
            s39Var = new s39(context, wjbVar, dhaVar);
        }
        wec wecVar = s39Var;
        this.b = wecVar;
        hva hvaVar = new hva(context, i, z, j, i2, wjbVar);
        this.c = hvaVar;
        if (dhaVar == null) {
            s39Var2 = null;
        } else {
            s39Var2 = (s39) wecVar;
        }
        hvaVar.g = s39Var2;
        wecVar.setAdapter(hvaVar);
        if (dhaVar == null) {
            i3 = 3;
        } else {
            i3 = -2;
        }
        View l = wecVar.l(i3, true);
        View view = new View(context);
        zkb.h(bkb.c7, wjbVar, view);
        if (dhaVar == null) {
            this.d = null;
            addView(l, nme.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(nme.z(-1.0f), nme.z(1.0f / gl.p)));
            setBackgroundColor(bkb.v0(bkb.g5, wjbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(gl.L(4.0f), gl.L(4.0f), gl.L(4.0f), gl.L(4.0f));
            frameLayout.addView(l, nme.e(-1, 48, 48));
        }
        addView(wecVar, nme.o(-1, -1));
    }

    public final void a(boolean z) {
        int i;
        wec wecVar = this.b;
        dha dhaVar = this.e;
        hva hvaVar = this.c;
        if (dhaVar == null) {
            hvaVar.i();
            wecVar.m(z);
            return;
        }
        ArrayList arrayList = hvaVar.i;
        ArrayList arrayList2 = hvaVar.i;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 |= 1 << ((c4c) arrayList.get(i3)).A;
        }
        View currentView = wecVar.getCurrentView();
        if (currentView instanceof gva) {
            i = ((gva) currentView).d;
        } else {
            i = 0;
        }
        hvaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((c4c) arrayList2.get(i5)).A;
        }
        if (i2 != i4) {
            wecVar.onTouchEvent(null);
            int i6 = 0;
            while (true) {
                if (i6 < arrayList2.size()) {
                    if (((c4c) arrayList2.get(i6)).A == i) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = 0;
                    break;
                }
            }
            wecVar.setPosition(i6);
            wecVar.J();
            wecVar.m(false);
            dhaVar.s();
        } else if (!z) {
            wecVar.m(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.A3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == kk7.E3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public o39 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (!(currentView instanceof gva)) {
            return null;
        }
        return ((gva) currentView).a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public wec getViewPager() {
        return this.b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        a(false);
        kk7 f = kk7.f(this.a);
        if (this.f == 0) {
            i = kk7.A3;
        } else {
            i = kk7.E3;
        }
        f.b(this, i);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        kk7 f = kk7.f(this.a);
        if (this.f == 0) {
            i = kk7.A3;
        } else {
            i = kk7.E3;
        }
        f.n(this, i);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(qw4 qw4Var) {
        View[] viewPages;
        if (qw4Var != null) {
            hva hvaVar = this.c;
            if (hvaVar.h != qw4Var) {
                hvaVar.h = qw4Var;
                wec wecVar = this.b;
                qw4Var.c(wecVar);
                for (View view : wecVar.getViewPages()) {
                    if (view instanceof gva) {
                        qw4Var.b(((gva) view).a);
                    }
                }
            }
        }
    }
}
