package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
public final class y extends FrameLayout {
    public final v f15701a;
    public t f15702b;
    public y10 f15703c;
    public float d;
    public boolean f15704e;
    public ValueAnimator f15705f;

    public y(Activity activity, n2 n2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f15701a = vVar;
        vVar.setAdapter(new w(this, activity, n2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bi.n8(this, 8));
        addView(vVar, c8.na.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f15705f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f15704e == z10) {
            return;
        }
        this.f15704e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        v vVar = this.f15701a;
        if (z11) {
            vVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15705f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 27));
            this.f15705f.addListener(new bi.j7(9, this, z10));
            this.f15705f.setInterpolator(nr.h);
            this.f15705f.setDuration(340L);
            this.f15705f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        vVar.invalidate();
        if (!z10) {
            i7 = 8;
        }
        vVar.setVisibility(i7);
    }

    public void setOnLayoutClick(y10 y10Var) {
        this.f15703c = y10Var;
    }

    public void setSelected(t tVar) {
        this.f15702b = tVar;
        org.telegram.messenger.g0.Z3(this.f15701a);
    }
}
