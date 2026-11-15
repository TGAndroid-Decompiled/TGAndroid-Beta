package hi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
public final class y extends FrameLayout {
    public final v f15400a;
    public t f15401b;
    public z10 f15402c;
    public float d;
    public boolean f15403e;
    public ValueAnimator f15404f;

    public y(Activity activity, n2 n2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f15400a = vVar;
        vVar.setAdapter(new w(this, activity, n2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bi.b6(this, 8));
        addView(vVar, c8.ja.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f15404f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f15403e == z10) {
            return;
        }
        this.f15403e = z10;
        float f10 = 0.0f;
        int i7 = 0;
        v vVar = this.f15400a;
        if (z11) {
            vVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f15404f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 27));
            this.f15404f.addListener(new bi.v4(9, this, z10));
            this.f15404f.setInterpolator(er.h);
            this.f15404f.setDuration(340L);
            this.f15404f.start();
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

    public void setOnLayoutClick(z10 z10Var) {
        this.f15402c = z10Var;
    }

    public void setSelected(t tVar) {
        this.f15401b = tVar;
        org.telegram.messenger.g0.a4(this.f15400a);
    }
}
