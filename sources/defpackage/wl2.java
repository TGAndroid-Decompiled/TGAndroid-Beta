package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
public final class wl2 extends FrameLayout {
    public final hx a;
    public sl2 b;
    public qac c;
    public float d;
    public boolean e;
    public ValueAnimator f;

    public wl2(Activity activity, rk4 rk4Var) {
        super(activity);
        hx hxVar = new hx(this, activity);
        this.a = hxVar;
        hxVar.setAdapter(new ul2(this, activity, rk4Var, (byte) 0));
        hxVar.setLayoutManager(new u46(0, false));
        hxVar.setClipToPadding(false);
        hxVar.setVisibility(8);
        hxVar.setWillNotDraw(false);
        hxVar.setOnItemClickListener(new u(this, (byte) 15));
        addView(hxVar, qoe.c(56.0f, -1));
    }

    public final void a(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z) {
            return;
        }
        this.e = z;
        float f = 0.0f;
        int i = 0;
        hx hxVar = this.a;
        if (z2) {
            hxVar.setVisibility(0);
            float f2 = this.d;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.f = ofFloat;
            ofFloat.addUpdateListener(new et1(this, (byte) 14));
            this.f.addListener(new y7((byte) 21, this, z));
            this.f.setInterpolator(d53.h);
            this.f.setDuration(340L);
            this.f.start();
            return;
        }
        if (z) {
            f = 1.0f;
        }
        this.d = f;
        hxVar.invalidate();
        if (!z) {
            i = 8;
        }
        hxVar.setVisibility(i);
    }

    public void setOnLayoutClick(qac qacVar) {
        this.c = qacVar;
    }

    public void setSelected(sl2 sl2Var) {
        this.b = sl2Var;
        gm.V3(this.a);
    }
}
