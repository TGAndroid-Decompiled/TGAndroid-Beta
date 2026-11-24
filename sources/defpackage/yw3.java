package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class yw3 extends zw3 implements jm7 {
    public final fv b;
    public final ww3 c;
    public final ix3 d;
    public final xw3 e;
    public final vw3 f;
    public final ArrayList h;
    public final ArrayList n;
    public final px3 r;

    public yw3(px3 px3Var, Context context) {
        super(context);
        this.r = px3Var;
        this.f = new Object();
        this.h = new ArrayList();
        this.n = new ArrayList();
        fv fvVar = new fv((byte) 15, context, this);
        this.b = fvVar;
        ww3 ww3Var = new ww3(this);
        this.c = ww3Var;
        fvVar.setAdapter(ww3Var);
        xw3 xw3Var = new xw3(this);
        this.e = xw3Var;
        fvVar.setLayoutManager(xw3Var);
        fvVar.i(new ks(this, (byte) 3));
        fvVar.setClipToPadding(true);
        fvVar.setVerticalScrollBarEnabled(false);
        u uVar = new u(this, (byte) 23);
        fvVar.setOnTouchListener(new f8(this, uVar, (byte) 3));
        fvVar.setOnItemClickListener(uVar);
        fvVar.setOnScrollListener(new ip2(this, (byte) 7));
        addView(fvVar, qoe.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i = px3.C1;
        ix3 ix3Var = new ix3(context, px3Var.J0);
        this.d = ix3Var;
        ix3Var.x = new h92(this, (byte) 22);
        ix3Var.a(2, false);
        addView(ix3Var, qoe.e(-1, -2, 48));
    }

    @Override
    public final void a(int i) {
        ww3 ww3Var = this.c;
        ww3Var.H(false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.l1)) {
            ww3Var.F();
        }
        ww3Var.G(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i = 0;
        while (true) {
            fv fvVar = this.b;
            if (i < fvVar.getChildCount()) {
                Object tag = fvVar.getChildAt(i).getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() == 34) {
                    return Math.max(0, childAt.getBottom());
                }
                i++;
            } else {
                return 0.0f;
            }
        }
    }

    @Override
    public final void c() {
        float max = Math.max(0.0f, b());
        this.d.setTranslationY(gm.L(10.0f) + max);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.X0) {
            this.c.H(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = px3.C1;
        nm7.f(this.r.a).b(this, nm7.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = px3.C1;
        nm7.f(this.r.a).n(this, nm7.X0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = px3.C1;
        int i4 = this.r.u0;
        setPadding(i4, 0, i4, gm.n);
        super.onMeasure(i, i2);
    }
}
