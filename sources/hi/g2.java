package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.kr;
public final class g2 extends c2 {
    public final w1 f14520b;
    public final f2 f14521c;
    public final v4.t d;
    public final e2 f14522e;
    public final l2 f14523f;
    public int h;
    public float f14524n;
    public boolean f14525r;
    public final r2 f14526s;

    public g2(r2 r2Var, Context context) {
        super(context);
        this.f14526s = r2Var;
        this.h = 8;
        this.f14524n = -1.0f;
        this.f14525r = false;
        w1 w1Var = new w1(context);
        this.f14520b = w1Var;
        f2 f2Var = new f2(this);
        this.f14521c = f2Var;
        w1Var.setAdapter(f2Var);
        v4.t tVar = new v4.t(this.h);
        this.d = tVar;
        w1Var.setLayoutManager(tVar);
        w1Var.setClipToPadding(true);
        w1Var.setVerticalScrollBarEnabled(false);
        tVar.O = new bi.y2(this, 6);
        w1Var.setOnItemClickListener(new bi.n8(this, 10));
        w1Var.setOnScrollListener(new bi.v1(this, 15));
        v4.l lVar = new v4.l();
        lVar.f59318c = 220L;
        lVar.f59319e = 220L;
        lVar.f59320f = 160L;
        lVar.f59321g = 160L;
        lVar.f59322i = kr.f36859g;
        w1Var.setItemAnimator(lVar);
        addView(w1Var, c8.na.c(-1.0f, -1));
        int i7 = r2.D1;
        l2 l2Var = new l2(context, r2Var.J0);
        this.f14523f = l2Var;
        l2Var.f14831x = new bi.b(this, 26);
        addView(l2Var, c8.na.e(-1, -2, 48));
        e2 e2Var = new e2(this, context, r2Var.J0);
        this.f14522e = e2Var;
        addView(e2Var, c8.na.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        this.f14262a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14520b.f15644g3 = z10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f14525r;
        f2 f2Var = this.f14521c;
        if (!z11) {
            f2Var.D(null);
        }
        r2 r2Var = this.f14526s;
        int i12 = r2Var.n1;
        l2 l2Var = this.f14523f;
        if (i12 >= 0) {
            l2Var.f14829s = true;
            l2Var.f14825e.setText("");
            l2Var.f14829s = false;
            k2 k2Var = l2Var.h;
            if (k2Var != null) {
                k2Var.H1(r2Var.n1);
                l2Var.h.F1();
                if (l2Var.h.getSelectedCategory() != null) {
                    f2Var.I = l2Var.h.getSelectedCategory().f35560a;
                    w wVar = f2Var.N;
                    org.telegram.messenger.g0.r(wVar);
                    org.telegram.messenger.g0.g3(wVar);
                }
            }
        } else if (!TextUtils.isEmpty(r2Var.f15276m1)) {
            l2Var.f14825e.setText(r2Var.f15276m1);
            k2 k2Var2 = l2Var.h;
            if (k2Var2 != null) {
                k2Var2.I1(null);
                l2Var.h.G1();
            }
            org.telegram.messenger.g0.r(f2Var.N);
            org.telegram.messenger.g0.g3(f2Var.N);
        } else {
            l2Var.b();
        }
        l2Var.a(i7, r2Var.f15283u1);
        ri d02 = ri.d0(r2Var.f30223a);
        if (i7 == 0) {
            i11 = 5;
        }
        d02.D(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f14524n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            w1 w1Var = this.f14520b;
            if (i7 >= w1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = w1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i5.c.d(102.0f, childAt.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f14522e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f14523f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        w1 w1Var = this.f14520b;
        w1Var.f15645h3 = max + w1Var.getPaddingTop();
        w1Var.f15646i3 = w1Var.getHeight() - w1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = r2.D1;
        r2 r2Var = this.f14526s;
        int i12 = r2Var.f30261u0;
        setPadding(i12, 0, i12, 0);
        this.f14522e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f14523f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f24221n;
        if (r2Var.f15282t1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f14520b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
