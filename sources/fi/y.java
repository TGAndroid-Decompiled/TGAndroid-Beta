package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.ui.Components.xq;
public final class y extends FrameLayout {
    public final v f13105a;
    public t f13106b;
    public c20 f13107c;
    public float d;
    public boolean f13108e;
    public ValueAnimator f13109f;

    public y(Activity activity, p2 p2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f13105a = vVar;
        vVar.setAdapter(new w(this, activity, p2Var, 0));
        vVar.setLayoutManager(new v4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.k(this, 7));
        addView(vVar, c8.ha.c(56.0f, -1));
    }

    public final void a(boolean z9, boolean z10) {
        ValueAnimator valueAnimator = this.f13109f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f13108e == z9) {
            return;
        }
        this.f13108e = z9;
        int i7 = 8;
        float f10 = 0.0f;
        v vVar = this.f13105a;
        if (z10) {
            vVar.setVisibility(0);
            float f11 = this.d;
            if (z9) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f13109f = ofFloat;
            ofFloat.addUpdateListener(new ah.h(this, 26));
            this.f13109f.addListener(new ch.y(8, this, z9));
            this.f13109f.setInterpolator(xq.h);
            this.f13109f.setDuration(340L);
            this.f13109f.start();
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
        this.f13107c = c20Var;
    }

    public void setSelected(t tVar) {
        this.f13106b = tVar;
        org.telegram.messenger.g0.b4(this.f13105a);
    }
}
