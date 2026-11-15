package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
public final class t1 extends u1 implements is {
    public final di.c1 f15136b;
    public final r1 f15137c;
    public final d2 d;
    public final s1 f15138e;
    public final q1 f15139f;
    public final ArrayList h;
    public final ArrayList f15140n;
    public final i2 f15141r;

    public t1(i2 i2Var, Context context) {
        super(context);
        this.f15141r = i2Var;
        this.f15139f = new Object();
        this.h = new ArrayList();
        this.f15140n = new ArrayList();
        di.c1 c1Var = new di.c1(2, context, this);
        this.f15136b = c1Var;
        r1 r1Var = new r1(this);
        this.f15137c = r1Var;
        c1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f15138e = s1Var;
        c1Var.setLayoutManager(s1Var);
        c1Var.i(new ai.h0(this, 1));
        c1Var.setClipToPadding(true);
        c1Var.setVerticalScrollBarEnabled(false);
        bi.b6 b6Var = new bi.b6(this, 9);
        c1Var.setOnTouchListener(new p1(0, this, b6Var));
        c1Var.setOnItemClickListener(b6Var);
        c1Var.setOnScrollListener(new bi.z4(this, 13));
        addView(c1Var, c8.ja.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.f14097x = new bi.b(this, 26);
        d2Var.a(2, false);
        addView(d2Var, c8.ja.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        r1 r1Var = this.f15137c;
        r1.E(r1Var, false);
        if (this.f15140n.isEmpty() && TextUtils.isEmpty(this.f15141r.f14403m1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            di.c1 c1Var = this.f15136b;
            if (i7 < c1Var.getChildCount()) {
                Object tag = c1Var.getChildAt(i7).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i7++;
            } else {
                return 0.0f;
            }
        }
    }

    @Override
    public final void c() {
        this.d.setTranslationY(org.telegram.messenger.g0.L(10.0f) + Math.max(0.0f, b()));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.X0) {
            r1.E(this.f15137c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = i2.C1;
        ns.f(this.f15141r.f29679a).c(this, ns.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = i2.C1;
        ns.f(this.f15141r.f29679a).n(this, ns.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = i2.C1;
        int i12 = this.f15141r.f29717u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f23604n);
        super.onMeasure(i7, i10);
    }
}
