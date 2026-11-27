package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class hw3 extends iw3 implements fn7 {
    public final gu b;
    public final fw3 c;
    public final sw3 d;
    public final gw3 e;
    public final ew3 f;
    public final ArrayList h;
    public final ArrayList n;
    public final zw3 r;

    public hw3(zw3 zw3Var, Context context) {
        super(context);
        this.r = zw3Var;
        this.f = new Object();
        this.h = new ArrayList();
        this.n = new ArrayList();
        gu guVar = new gu((byte) 15, context, this);
        this.b = guVar;
        fw3 fw3Var = new fw3(this);
        this.c = fw3Var;
        guVar.setAdapter(fw3Var);
        gw3 gw3Var = new gw3(this);
        this.e = gw3Var;
        guVar.setLayoutManager(gw3Var);
        guVar.i(new lr(this, (byte) 3));
        guVar.setClipToPadding(true);
        guVar.setVerticalScrollBarEnabled(false);
        u uVar = new u(this, (byte) 22);
        guVar.setOnTouchListener(new g8(this, uVar, (byte) 3));
        guVar.setOnItemClickListener(uVar);
        guVar.setOnScrollListener(new to2(this, (byte) 6));
        addView(guVar, tre.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i = zw3.C1;
        sw3 sw3Var = new sw3(context, zw3Var.J0);
        this.d = sw3Var;
        sw3Var.x = new n82(this, (byte) 22);
        sw3Var.a(2, false);
        addView(sw3Var, tre.e(-1, -2, 48));
    }

    @Override
    public final void a(int i) {
        fw3 fw3Var = this.c;
        fw3Var.H(false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.l1)) {
            fw3Var.F();
        }
        fw3Var.G(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i = 0;
        while (true) {
            gu guVar = this.b;
            if (i < guVar.getChildCount()) {
                Object tag = guVar.getChildAt(i).getTag();
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
        this.d.setTranslationY(hl.L(10.0f) + max);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.X0) {
            this.c.H(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = zw3.C1;
        jn7.f(this.r.a).b(this, jn7.X0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = zw3.C1;
        jn7.f(this.r.a).n(this, jn7.X0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = zw3.C1;
        int i4 = this.r.u0;
        setPadding(i4, 0, i4, hl.n);
        super.onMeasure(i, i2);
    }
}
