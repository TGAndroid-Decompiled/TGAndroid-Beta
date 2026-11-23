package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.gs;
import org.telegram.messenger.ls;
public final class t1 extends u1 implements gs {
    public final di.b1 f15365b;
    public final r1 f15366c;
    public final d2 d;
    public final s1 f15367e;
    public final p1 f15368f;
    public final ArrayList h;
    public final ArrayList f15369n;
    public final i2 f15370r;

    public t1(i2 i2Var, Context context) {
        super(context);
        this.f15370r = i2Var;
        this.f15368f = new Object();
        this.h = new ArrayList();
        this.f15369n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.f15365b = b1Var;
        r1 r1Var = new r1(this);
        this.f15366c = r1Var;
        b1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f15367e = s1Var;
        b1Var.setLayoutManager(s1Var);
        b1Var.i(new ai.e0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.n8 n8Var = new bi.n8(this, 9);
        b1Var.setOnTouchListener(new o1(0, this, n8Var));
        b1Var.setOnItemClickListener(n8Var);
        b1Var.setOnScrollListener(new bi.v1(this, 14));
        addView(b1Var, c8.na.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = i2.C1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.f14331x = new bi.b(this, 25);
        d2Var.a(2, false);
        addView(d2Var, c8.na.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        r1 r1Var = this.f15366c;
        r1.E(r1Var, false);
        if (this.f15369n.isEmpty() && TextUtils.isEmpty(this.f15370r.f14704m1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.f15365b;
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
            r1.E(this.f15366c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = i2.C1;
        ls.f(this.f15370r.f30139a).c(this, ls.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = i2.C1;
        ls.f(this.f15370r.f30139a).n(this, ls.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = i2.C1;
        int i12 = this.f15370r.f30177u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f24005n);
        super.onMeasure(i7, i10);
    }
}
