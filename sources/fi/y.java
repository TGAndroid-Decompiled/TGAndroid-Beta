package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.wq;
public final class y extends FrameLayout {
    public final v f13107a;
    public t f13108b;
    public c20 f13109c;
    public float d;
    public boolean f13110e;
    public ValueAnimator f13111f;

    public y(Activity activity, p2 p2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f13107a = vVar;
        vVar.setAdapter(new w(this, activity, p2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.k(this, 7));
        addView(vVar, c8.ha.c(56.0f, -1));
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f13111f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f13110e == z9) {
            return;
        }
        this.f13110e = z9;
        int i7 = 8;
        float f10 = 0.0f;
        v vVar = this.f13107a;
        if (z10) {
            vVar.setVisibility(0);
            float f11 = this.d;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f13111f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 26));
            this.f13111f.addListener(new ch.y(8, this, z9));
            this.f13111f.setInterpolator(wq.h);
            this.f13111f.setDuration(340L);
            this.f13111f.start();
            return;
        }
        if (z9) {
            f10 = 1.0f;
        }
        this.d = f10;
        vVar.invalidate();
        if (z9) {
            i7 = 0;
        }
        vVar.setVisibility(i7);
    }

    public void setOnLayoutClick(c20 c20Var) {
        this.f13109c = c20Var;
    }

    public void setSelected(t tVar) {
        this.f13108b = tVar;
        org.telegram.messenger.g0.b4(this.f13107a);
    }
}
