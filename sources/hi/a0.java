package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
public final class a0 extends FrameLayout {
    public final x f14205a;
    public v f14206b;
    public y10 f14207c;
    public float d;
    public boolean f14208e;
    public ValueAnimator f14209f;

    public a0(Activity activity, n2 n2Var) {
        super(activity);
        x xVar = new x(this, activity);
        this.f14205a = xVar;
        xVar.setAdapter(new y(this, activity, n2Var, 0));
        xVar.setLayoutManager(new v4.c0(0, false));
        xVar.setClipToPadding(false);
        xVar.setVisibility(8);
        xVar.setWillNotDraw(false);
        xVar.setOnItemClickListener(new bi.k8(this, 8));
        addView(xVar, c8.ma.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14209f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f14208e == z10) {
            return;
        }
        this.f14208e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        x xVar = this.f14205a;
        if (z11) {
            xVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14209f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 27));
            this.f14209f.addListener(new bi.g7(9, this, z10));
            this.f14209f.setInterpolator(nr.h);
            this.f14209f.setDuration(340L);
            this.f14209f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        xVar.invalidate();
        if (!z10) {
            i7 = 8;
        }
        xVar.setVisibility(i7);
    }

    public void setOnLayoutClick(y10 y10Var) {
        this.f14207c = y10Var;
    }

    public void setSelected(v vVar) {
        this.f14206b = vVar;
        org.telegram.messenger.g0.Z3(this.f14205a);
    }
}
