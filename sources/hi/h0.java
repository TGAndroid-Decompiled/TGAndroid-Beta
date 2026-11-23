package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
public final class h0 extends FrameLayout {
    public final e0 f14567a;
    public c0 f14568b;
    public w10 f14569c;
    public float d;
    public boolean f14570e;
    public ValueAnimator f14571f;

    public h0(Activity activity, w2 w2Var) {
        super(activity);
        e0 e0Var = new e0(this, activity);
        this.f14567a = e0Var;
        e0Var.setAdapter(new f0(this, activity, w2Var, 0));
        e0Var.setLayoutManager(new v4.c0(0, false));
        e0Var.setClipToPadding(false);
        e0Var.setVisibility(8);
        e0Var.setWillNotDraw(false);
        e0Var.setOnItemClickListener(new bi.n8(this, 8));
        addView(e0Var, c8.na.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14571f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f14570e == z10) {
            return;
        }
        this.f14570e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        e0 e0Var = this.f14567a;
        if (z11) {
            e0Var.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14571f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 27));
            this.f14571f.addListener(new bi.j7(9, this, z10));
            this.f14571f.setInterpolator(kr.h);
            this.f14571f.setDuration(340L);
            this.f14571f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        e0Var.invalidate();
        if (!z10) {
            i7 = 8;
        }
        e0Var.setVisibility(i7);
    }

    public void setOnLayoutClick(w10 w10Var) {
        this.f14569c = w10Var;
    }

    public void setSelected(c0 c0Var) {
        this.f14568b = c0Var;
        org.telegram.messenger.g0.Z3(this.f14567a);
    }
}
