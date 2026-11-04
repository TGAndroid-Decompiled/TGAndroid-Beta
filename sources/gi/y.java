package gi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
public final class y extends FrameLayout {
    public final v f13875a;
    public t f13876b;
    public u10 f13877c;
    public float d;
    public boolean f13878e;
    public ValueAnimator f13879f;

    public y(Activity activity, n2 n2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f13875a = vVar;
        vVar.setAdapter(new w(this, activity, n2Var, 0));
        vVar.setLayoutManager(new u4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.j6(this, 8));
        addView(vVar, mf.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f13879f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f13878e == z10) {
            return;
        }
        this.f13878e = z10;
        float f10 = 0.0f;
        int i3 = 0;
        v vVar = this.f13875a;
        if (z11) {
            vVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f13879f = ofFloat;
            ofFloat.addUpdateListener(new bh.f(this, 27));
            this.f13879f.addListener(new dh.x(9, this, z10));
            this.f13879f.setInterpolator(xq.h);
            this.f13879f.setDuration(340L);
            this.f13879f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        vVar.invalidate();
        if (!z10) {
            i3 = 8;
        }
        vVar.setVisibility(i3);
    }

    public void setOnLayoutClick(u10 u10Var) {
        this.f13877c = u10Var;
    }

    public void setSelected(t tVar) {
        this.f13876b = tVar;
        org.telegram.messenger.g0.b4(this.f13875a);
    }
}
