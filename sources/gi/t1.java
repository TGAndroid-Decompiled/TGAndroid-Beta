package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
public final class t1 extends u1 implements cs {
    public final ci.j1 f13601b;
    public final r1 f13602c;
    public final d2 d;
    public final s1 f13603e;
    public final p1 f13604f;
    public final ArrayList h;
    public final ArrayList f13605n;
    public final i2 f13606r;

    public t1(i2 i2Var, Context context) {
        super(context);
        this.f13606r = i2Var;
        this.f13604f = new Object();
        this.h = new ArrayList();
        this.f13605n = new ArrayList();
        ci.j1 j1Var = new ci.j1(2, context, this);
        this.f13601b = j1Var;
        r1 r1Var = new r1(this);
        this.f13602c = r1Var;
        j1Var.setAdapter(r1Var);
        s1 s1Var = new s1(this);
        this.f13603e = s1Var;
        j1Var.setLayoutManager(s1Var);
        j1Var.i(new o1(this, 0));
        j1Var.setClipToPadding(true);
        j1Var.setVerticalScrollBarEnabled(false);
        ai.j6 j6Var = new ai.j6(this, 9);
        j1Var.setOnTouchListener(new n1(0, this, j6Var));
        j1Var.setOnItemClickListener(j6Var);
        j1Var.setOnScrollListener(new ai.j5(this, 13));
        addView(j1Var, mf.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i3 = i2.f12950z1;
        d2 d2Var = new d2(context, i2Var.J0);
        this.d = d2Var;
        d2Var.f12557x = new ai.c(this, 26);
        d2Var.a(2, false);
        addView(d2Var, mf.e(-1, -2, 48));
    }

    @Override
    public final void a(int i3) {
        r1 r1Var = this.f13602c;
        r1.E(r1Var, false);
        if (this.f13605n.isEmpty() && TextUtils.isEmpty(this.f13606r.f12951j1)) {
            r1Var.G();
        }
        r1Var.H(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i3 = 0;
        while (true) {
            ci.j1 j1Var = this.f13601b;
            if (i3 < j1Var.getChildCount()) {
                Object tag = j1Var.getChildAt(i3).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i3++;
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
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.X0) {
            r1.E(this.f13602c, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = i2.f12950z1;
        hs.f(this.f13606r.f28583a).c(this, hs.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = i2.f12950z1;
        hs.f(this.f13606r.f28583a).n(this, hs.X0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11 = i2.f12950z1;
        int i12 = this.f13606r.f28618u0;
        setPadding(i12, 0, i12, org.telegram.messenger.g0.f22603n);
        super.onMeasure(i3, i10);
    }
}
