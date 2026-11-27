package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
public final class mza extends LinearLayout implements fn7 {
    public final int a;
    public final vic b;
    public final lza c;
    public final FrameLayout d;
    public final wka e;
    public final long f;

    public mza(Context context, int i, boolean z, long j, int i2, vnb vnbVar, wka wkaVar) {
        super(context);
        vic h79Var;
        h79 h79Var2;
        int i3;
        this.e = wkaVar;
        this.a = i;
        this.f = j;
        setOrientation(1);
        if (wkaVar == null) {
            h79Var = new vic(context, null);
        } else {
            h79Var = new h79(context, vnbVar, wkaVar);
        }
        vic vicVar = h79Var;
        this.b = vicVar;
        lza lzaVar = new lza(context, i, z, j, i2, vnbVar);
        this.c = lzaVar;
        if (wkaVar == null) {
            h79Var2 = null;
        } else {
            h79Var2 = (h79) vicVar;
        }
        lzaVar.g = h79Var2;
        vicVar.setAdapter(lzaVar);
        if (wkaVar == null) {
            i3 = 3;
        } else {
            i3 = -2;
        }
        View l = vicVar.l(i3, true);
        View view = new View(context);
        yob.h(aob.d7, vnbVar, view);
        if (wkaVar == null) {
            this.d = null;
            addView(l, tre.o(-1, 48));
            addView(view, new LinearLayout.LayoutParams(tre.z(-1.0f), tre.z(1.0f / hl.p)));
            setBackgroundColor(aob.v0(aob.h5, vnbVar));
        } else {
            setClipChildren(false);
            setClipToPadding(false);
            FrameLayout frameLayout = new FrameLayout(context);
            this.d = frameLayout;
            frameLayout.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            frameLayout.addView(l, tre.e(-1, 48, 48));
        }
        addView(vicVar, tre.o(-1, -1));
    }

    public final void a(boolean z) {
        int i;
        vic vicVar = this.b;
        wka wkaVar = this.e;
        lza lzaVar = this.c;
        if (wkaVar == null) {
            lzaVar.i();
            vicVar.m(z);
            return;
        }
        ArrayList arrayList = lzaVar.i;
        ArrayList arrayList2 = lzaVar.i;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            i2 |= 1 << ((b8c) arrayList.get(i3)).A;
        }
        View currentView = vicVar.getCurrentView();
        if (currentView instanceof kza) {
            i = ((kza) currentView).d;
        } else {
            i = 0;
        }
        lzaVar.i();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            i4 |= 1 << ((b8c) arrayList2.get(i5)).A;
        }
        if (i2 != i4) {
            vicVar.onTouchEvent(null);
            int i6 = 0;
            while (true) {
                if (i6 < arrayList2.size()) {
                    if (((b8c) arrayList2.get(i6)).A == i) {
                        break;
                    }
                    i6++;
                } else {
                    i6 = 0;
                    break;
                }
            }
            vicVar.setPosition(i6);
            vicVar.K();
            vicVar.m(false);
            wkaVar.s();
        } else if (!z) {
            vicVar.m(false);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.B3;
        long j = this.f;
        if ((i == i3 && j == 0) || (i == jn7.F3 && j != 0 && ((Long) objArr[0]).longValue() == j)) {
            a(true);
        }
    }

    public d79 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (!(currentView instanceof kza)) {
            return null;
        }
        return ((kza) currentView).a;
    }

    public FrameLayout getTabsContainer() {
        return this.d;
    }

    public vic getViewPager() {
        return this.b;
    }

    @Override
    public final void onAttachedToWindow() {
        int i;
        a(false);
        jn7 f = jn7.f(this.a);
        if (this.f == 0) {
            i = jn7.B3;
        } else {
            i = jn7.F3;
        }
        f.b(this, i);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        int i;
        jn7 f = jn7.f(this.a);
        if (this.f == 0) {
            i = jn7.B3;
        } else {
            i = jn7.F3;
        }
        f.n(this, i);
        super.onDetachedFromWindow();
    }

    public void setGlassEngine(vy4 vy4Var) {
        View[] viewPages;
        if (vy4Var != null) {
            lza lzaVar = this.c;
            if (lzaVar.h != vy4Var) {
                lzaVar.h = vy4Var;
                vic vicVar = this.b;
                vy4Var.c(vicVar);
                for (View view : vicVar.getViewPages()) {
                    if (view instanceof kza) {
                        vy4Var.b(((kza) view).a);
                    }
                }
            }
        }
    }
}
