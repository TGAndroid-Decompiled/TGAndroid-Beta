package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.si;
import org.telegram.ui.Components.nr;
public final class y1 extends u1 {
    public final n1 f15709b;
    public final x1 f15710c;
    public final v4.s d;
    public final w1 f15711e;
    public final d2 f15712f;
    public int h;
    public float f15713n;
    public boolean f15714r;
    public final i2 f15715s;

    public y1(i2 i2Var, Context context) {
        super(context);
        this.f15715s = i2Var;
        this.h = 8;
        this.f15713n = -1.0f;
        this.f15714r = false;
        n1 n1Var = new n1(context);
        this.f15709b = n1Var;
        x1 x1Var = new x1(this);
        this.f15710c = x1Var;
        n1Var.setAdapter(x1Var);
        v4.s sVar = new v4.s(this.h);
        this.d = sVar;
        n1Var.setLayoutManager(sVar);
        n1Var.setClipToPadding(true);
        n1Var.setVerticalScrollBarEnabled(false);
        sVar.O = new bi.y2(this, 6);
        n1Var.setOnItemClickListener(new bi.n8(this, 10));
        n1Var.setOnScrollListener(new bi.v1(this, 15));
        v4.k kVar = new v4.k();
        kVar.f59183c = 220L;
        kVar.f59184e = 220L;
        kVar.f59185f = 160L;
        kVar.f59186g = 160L;
        kVar.f59187i = nr.f37918g;
        n1Var.setItemAnimator(kVar);
        addView(n1Var, c8.na.c(-1.0f, -1));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.f15712f = d2Var;
        d2Var.f14331x = new bi.b(this, 26);
        addView(d2Var, c8.na.e(-1, -2, 48));
        w1 w1Var = new w1(this, context, i2Var.J0);
        this.f15711e = w1Var;
        addView(w1Var, c8.na.c(36.0f, -1));
    }

    @Override
    public final void a(int i7) {
        boolean z10;
        int i10;
        this.f15489a = i7;
        int i11 = 0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15709b.f15040g3 = z10;
        if (i7 == 0) {
            i10 = 8;
        } else {
            i10 = 5;
        }
        this.h = i10;
        this.d.y1(i10);
        boolean z11 = this.f15714r;
        x1 x1Var = this.f15710c;
        if (!z11) {
            x1Var.D(null);
        }
        i2 i2Var = this.f15715s;
        int i12 = i2Var.n1;
        d2 d2Var = this.f15712f;
        if (i12 >= 0) {
            d2Var.f14329s = true;
            d2Var.f14325e.setText("");
            d2Var.f14329s = false;
            c2 c2Var = d2Var.h;
            if (c2Var != null) {
                c2Var.H1(i2Var.n1);
                d2Var.h.F1();
                if (d2Var.h.getSelectedCategory() != null) {
                    x1Var.I = d2Var.h.getSelectedCategory().f35932a;
                    b0 b0Var = x1Var.N;
                    org.telegram.messenger.g0.r(b0Var);
                    org.telegram.messenger.g0.g3(b0Var);
                }
            }
        } else if (!TextUtils.isEmpty(i2Var.f14704m1)) {
            d2Var.f14325e.setText(i2Var.f14704m1);
            c2 c2Var2 = d2Var.h;
            if (c2Var2 != null) {
                c2Var2.I1(null);
                d2Var.h.G1();
            }
            org.telegram.messenger.g0.r(x1Var.N);
            org.telegram.messenger.g0.g3(x1Var.N);
        } else {
            d2Var.b();
        }
        d2Var.a(i7, i2Var.f14711u1);
        si d02 = si.d0(i2Var.f30139a);
        if (i7 == 0) {
            i11 = 5;
        }
        d02.D(i11);
    }

    @Override
    public final float b() {
        View childAt;
        float f10 = this.f15713n;
        if (f10 >= 0.0f) {
            return f10;
        }
        int i7 = 0;
        while (true) {
            n1 n1Var = this.f15709b;
            if (i7 >= n1Var.getChildCount()) {
                return 0.0f;
            }
            Object tag = n1Var.getChildAt(i7).getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                return i5.c.d(102.0f, childAt.getBottom(), 0);
            }
            i7++;
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.f15711e.setTranslationY(org.telegram.messenger.g0.L(16.0f) + max);
        this.f15712f.setTranslationY(org.telegram.messenger.g0.L(52.0f) + max);
        n1 n1Var = this.f15709b;
        n1Var.f15041h3 = max + n1Var.getPaddingTop();
        n1Var.f15042i3 = n1Var.getHeight() - n1Var.getPaddingBottom();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11 = i2.C1;
        i2 i2Var = this.f15715s;
        int i12 = i2Var.f30177u0;
        setPadding(i12, 0, i12, 0);
        this.f15711e.setTranslationY(org.telegram.messenger.g0.L(16.0f));
        this.f15712f.setTranslationY(org.telegram.messenger.g0.L(52.0f));
        int L = org.telegram.messenger.g0.L(5.0f);
        int L2 = org.telegram.messenger.g0.L(102.0f);
        int L3 = org.telegram.messenger.g0.L(5.0f);
        int i13 = org.telegram.messenger.g0.f24005n;
        if (i2Var.f14710t1) {
            f10 = 0.0f;
        } else {
            f10 = 40.0f;
        }
        this.f15709b.setPadding(L, L2, L3, org.telegram.messenger.g0.L(f10) + i13);
        super.onMeasure(i7, i10);
    }
}
