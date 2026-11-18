package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lr;
public final class z extends FrameLayout {
    public final w f15791a;
    public u f15792b;
    public x10 f15793c;
    public float d;
    public boolean f15794e;
    public ValueAnimator f15795f;

    public z(Activity activity, o2 o2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.f15791a = wVar;
        wVar.setAdapter(new x(this, activity, o2Var, 0));
        wVar.setLayoutManager(new v4.c0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new bi.h8(this, 8));
        addView(wVar, c8.ma.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f15795f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f15794e == z10) {
            return;
        }
        this.f15794e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        w wVar = this.f15791a;
        if (z11) {
            wVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15795f = ofFloat;
            ofFloat.addUpdateListener(new ah.g(this, 27));
            this.f15795f.addListener(new bi.d7(9, this, z10));
            this.f15795f.setInterpolator(lr.h);
            this.f15795f.setDuration(340L);
            this.f15795f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        wVar.invalidate();
        if (!z10) {
            i7 = 8;
        }
        wVar.setVisibility(i7);
    }

    public void setOnLayoutClick(x10 x10Var) {
        this.f15793c = x10Var;
    }

    public void setSelected(u uVar) {
        this.f15792b = uVar;
        org.telegram.messenger.g0.Z3(this.f15791a);
    }
}
