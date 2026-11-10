package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ls;
import org.telegram.messenger.qs;
public final class t1 extends u1 implements ls {
    public final bi.q1 f12840b;
    public final r1 f12841c;
    public final e2 d;
    public final s1 f12842e;
    public final p1 f12843f;
    public final ArrayList h;
    public final ArrayList f12844n;
    public final k2 f12845r;

    public t1(k2 k2Var, Context context) {
        super(context);
        this.f12845r = k2Var;
        this.f12843f = new Object();
        this.h = new ArrayList();
        this.f12844n = new ArrayList();
        bi.q1 q1Var = new bi.q1(2, context, this);
        this.f12840b = q1Var;
        r1 r1Var = new r1(this);
        this.f12841c = r1Var;
        q1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f12842e = s1Var;
        q1Var.setLayoutManager(s1Var);
        q1Var.i(new o1(this, 0));
        q1Var.setClipToPadding(true);
        q1Var.setVerticalScrollBarEnabled(false);
        ai.k kVar = new ai.k(this, 8);
        q1Var.setOnTouchListener(new n1(0, this, kVar));
        q1Var.setOnItemClickListener(kVar);
        q1Var.setOnScrollListener(new ai.b(this, 10));
        addView(q1Var, c8.ha.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = k2.B1;
        e2 e2Var = new e2(context, k2Var.I0);
        this.d = e2Var;
        e2Var.f11868x = new ai.e(this, 16);
        e2Var.a(2, false);
        addView(e2Var, c8.ha.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        r1 r1Var = this.f12841c;
        r1.E(r1Var, false);
        if (this.f12844n.isEmpty() && TextUtils.isEmpty(this.f12845r.l1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            bi.q1 q1Var = this.f12840b;
            if (i7 < q1Var.getChildCount()) {
                Object tag = q1Var.getChildAt(i7).getTag();
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
        if (i7 == qs.X0) {
            r1.E(this.f12841c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = k2.B1;
        qs.f(this.f12845r.f28669a).c(this, qs.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = k2.B1;
        qs.f(this.f12845r.f28669a).n(this, qs.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = k2.B1;
        int i12 = this.f12845r.f28705t0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f22562n);
        super.onMeasure(i7, i10);
    }
}
