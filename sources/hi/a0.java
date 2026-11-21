package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
public final class a0 extends FrameLayout {
    public final x f14202a;
    public v f14203b;
    public x10 f14204c;
    public float d;
    public boolean f14205e;
    public ValueAnimator f14206f;

    public a0(Activity activity, n2 n2Var) {
        super(activity);
        x xVar = new x(this, activity);
        this.f14202a = xVar;
        xVar.setAdapter(new y(this, activity, n2Var, 0));
        xVar.setLayoutManager(new v4.c0(0, false));
        xVar.setClipToPadding(false);
        xVar.setVisibility(8);
        xVar.setWillNotDraw(false);
        xVar.setOnItemClickListener(new bi.l8(this, 8));
        addView(xVar, c8.ma.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f14206f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f14205e == z10) {
            return;
        }
        this.f14205e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        x xVar = this.f14202a;
        if (z11) {
            xVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f14206f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 27));
            this.f14206f.addListener(new bi.h7(9, this, z10));
            this.f14206f.setInterpolator(nr.h);
            this.f14206f.setDuration(340L);
            this.f14206f.start();
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

    public void setOnLayoutClick(x10 x10Var) {
        this.f14204c = x10Var;
    }

    public void setSelected(v vVar) {
        this.f14203b = vVar;
        org.telegram.messenger.g0.Z3(this.f14202a);
    }
}
