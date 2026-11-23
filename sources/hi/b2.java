package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.ks;
public final class b2 extends c2 implements fs {
    public final di.b1 f14215b;
    public final z1 f14216c;
    public final l2 d;
    public final a2 f14217e;
    public final y1 f14218f;
    public final ArrayList h;
    public final ArrayList f14219n;
    public final r2 f14220r;

    public b2(r2 r2Var, Context context) {
        super(context);
        this.f14220r = r2Var;
        this.f14218f = new Object();
        this.h = new ArrayList();
        this.f14219n = new ArrayList();
        di.b1 b1Var = new di.b1(2, context, this);
        this.f14215b = b1Var;
        z1 z1Var = new z1(this);
        this.f14216c = z1Var;
        b1Var.setAdapter(z1Var);
        a2 a2Var = new a2(this);
        this.f14217e = a2Var;
        b1Var.setLayoutManager(a2Var);
        b1Var.i(new ai.f0(this, 1));
        b1Var.setClipToPadding(true);
        b1Var.setVerticalScrollBarEnabled(false);
        bi.n8 n8Var = new bi.n8(this, 9);
        b1Var.setOnTouchListener(new x1(0, this, n8Var));
        b1Var.setOnItemClickListener(n8Var);
        b1Var.setOnScrollListener(new bi.v1(this, 14));
        addView(b1Var, c8.na.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i7 = r2.D1;
        l2 l2Var = new l2(context, r2Var.J0);
        this.d = l2Var;
        l2Var.f14831x = new bi.b(this, 25);
        l2Var.a(2, false);
        addView(l2Var, c8.na.e(-1, -2, 48));
    }

    @Override
    public final void a(int i7) {
        z1 z1Var = this.f14216c;
        z1.E(z1Var, false);
        if (this.f14219n.isEmpty() && TextUtils.isEmpty(this.f14220r.f15276m1)) {
            z1Var.G();
        }
        z1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i7 = 0;
        while (true) {
            di.b1 b1Var = this.f14215b;
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
            z1.E(this.f14216c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = r2.D1;
        ks.f(this.f14220r.f30223a).c(this, ks.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = r2.D1;
        ks.f(this.f14220r.f30223a).n(this, ks.X0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11 = r2.D1;
        int i12 = this.f14220r.f30261u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f24221n);
        super.onMeasure(i7, i10);
    }
}
