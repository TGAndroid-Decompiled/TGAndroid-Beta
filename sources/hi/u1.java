package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class u1 extends v1 implements fs {
    public final di.b1 f15521b;
    public final s1 f15522c;
    public final e2 d;
    public final t1 f15523e;
    public final q1 f15524f;
    public final ArrayList h;
    public final ArrayList f15525n;
    public final j2 f15526r;

    public u1(j2 j2Var, Context context) {
        super(context);
        this.f15526r = j2Var;
        this.f15524f = new Object();
        this.h = new ArrayList();
        this.f15525n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.f15521b = b1Var;
        s1 s1Var = new s1(this);
        this.f15522c = s1Var;
        b1Var.setAdapter(s1Var);
        t1 t1Var = new t1(this);
        this.f15523e = t1Var;
        b1Var.setLayoutManager(t1Var);
        b1Var.i(new ai.i0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.h8 h8Var = new bi.h8(this, 9);
        b1Var.setOnTouchListener(new p1(0, this, h8Var));
        b1Var.setOnItemClickListener(h8Var);
        b1Var.setOnScrollListener(new bi.q1(this, 14));
        addView(b1Var, c8.ma.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = j2.C1;
        e2 e2Var = new e2(context, j2Var.J0);
        this.d = e2Var;
        e2Var.f14531x = new bi.b(this, 25);
        e2Var.a(2, false);
        addView(e2Var, c8.ma.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        s1 s1Var = this.f15522c;
        s1.E(s1Var, false);
        if (this.f15525n.isEmpty() && TextUtils.isEmpty(this.f15526r.f14793m1)) {
            s1Var.G();
        }
        s1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.f15521b;
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
        if (i7 == ks.X0) {
            s1.E(this.f15522c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = j2.C1;
        ks.f(this.f15526r.f30187a).c(this, ks.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = j2.C1;
        ks.f(this.f15526r.f30187a).n(this, ks.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = j2.C1;
        int i12 = this.f15526r.f30225u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f24113n);
        super.onMeasure(i7, i10);
    }
}
