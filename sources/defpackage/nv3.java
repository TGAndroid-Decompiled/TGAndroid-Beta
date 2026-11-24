package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
public final class nv3 extends ov3 implements gk7 {
    public final fu b;
    public final lv3 c;
    public final xv3 d;
    public final mv3 e;
    public final kv3 f;
    public final ArrayList h;
    public final ArrayList n;
    public final ew3 r;

    public nv3(ew3 ew3Var, Context context) {
        super(context);
        this.r = ew3Var;
        this.f = new Object();
        this.h = new ArrayList();
        this.n = new ArrayList();
        fu fuVar = new fu((byte) 15, context, this);
        this.b = fuVar;
        lv3 lv3Var = new lv3(this);
        this.c = lv3Var;
        fuVar.setAdapter(lv3Var);
        mv3 mv3Var = new mv3(this);
        this.e = mv3Var;
        fuVar.setLayoutManager(mv3Var);
        fuVar.i(new kr(this, (byte) 3));
        fuVar.setClipToPadding(true);
        fuVar.setVerticalScrollBarEnabled(false);
        u uVar = new u(this, (byte) 22);
        fuVar.setOnTouchListener(new f8(this, uVar, (byte) 3));
        fuVar.setOnItemClickListener(uVar);
        fuVar.setOnScrollListener(new ao2(this, (byte) 6));
        addView(fuVar, nme.d(-1, -1.0f, 119, 0.0f, 58.0f, 0.0f, 40.0f));
        int i = ew3.C1;
        xv3 xv3Var = new xv3(context, ew3Var.J0);
        this.d = xv3Var;
        xv3Var.x = new w72(this, (byte) 22);
        xv3Var.a(2, false);
        addView(xv3Var, nme.e(-1, -2, 48));
    }

    @Override
    public final void a(int i) {
        lv3 lv3Var = this.c;
        lv3Var.H(false);
        if (this.n.isEmpty() && TextUtils.isEmpty(this.r.l1)) {
            lv3Var.F();
        }
        lv3Var.G(null);
    }

    @Override
    public final float b() {
        View childAt;
        int i = 0;
        while (true) {
            fu fuVar = this.b;
            if (i < fuVar.getChildCount()) {
                Object tag = fuVar.getChildAt(i).getTag();
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
        this.d.setTranslationY(gl.L(10.0f) + max);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.W0) {
            this.c.H(true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = ew3.C1;
        kk7.f(this.r.a).b(this, kk7.W0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = ew3.C1;
        kk7.f(this.r.a).n(this, kk7.W0);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3 = ew3.C1;
        int i4 = this.r.u0;
        setPadding(i4, 0, i4, gl.n);
        super.onMeasure(i, i2);
    }
}
