package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class t1 extends u1 implements gs {
    public final di.b1 f15495b;
    public final r1 f15496c;
    public final d2 d;
    public final s1 f15497e;
    public final q1 f15498f;
    public final ArrayList h;
    public final ArrayList f15499n;
    public final i2 f15500r;

    public t1(i2 i2Var, Context context) {
        super(context);
        this.f15500r = i2Var;
        this.f15498f = new Object();
        this.h = new ArrayList();
        this.f15499n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.f15495b = b1Var;
        r1 r1Var = new r1(this);
        this.f15496c = r1Var;
        b1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f15497e = s1Var;
        b1Var.setLayoutManager(s1Var);
        b1Var.i(new ai.j0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.k8 k8Var = new bi.k8(this, 9);
        b1Var.setOnTouchListener(new p1(0, this, k8Var));
        b1Var.setOnItemClickListener(k8Var);
        b1Var.setOnScrollListener(new bi.u1(this, 14));
        addView(b1Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.f14485x = new bi.b(this, 25);
        d2Var.a(2, false);
        addView(d2Var, c8.ma.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        r1 r1Var = this.f15496c;
        r1.E(r1Var, false);
        if (this.f15499n.isEmpty() && TextUtils.isEmpty(this.f15500r.f14774m1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.f15495b;
            if (i7 < b1Var.getChildCount()) {
                Object tag = b1Var.getChildAt(i7).getTag();
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
        if (i7 == ls.X0) {
            r1.E(this.f15496c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = i2.C1;
        ls.f(this.f15500r.f30173a).c(this, ls.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = i2.C1;
        ls.f(this.f15500r.f30173a).n(this, ls.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = i2.C1;
        int i12 = this.f15500r.f30211u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f24041n);
        super.onMeasure(i7, i10);
    }
}
