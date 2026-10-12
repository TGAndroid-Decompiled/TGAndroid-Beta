package di;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.es;
public final class y extends FrameLayout {
    public final v f8112a;
    public t f8113b;
    public Utilities.Callback f8114c;
    public float d;
    public boolean e;
    public ValueAnimator f8115f;

    public y(Activity activity, w2 w2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f8112a = vVar;
        vVar.setAdapter(new w(this, activity, w2Var));
        vVar.setLayoutManager(new s4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bi.d(this, 2));
        addView(vVar, w7.a6.d(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f8115f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        v vVar = this.f8112a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f8115f = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 17));
            this.f8115f.addListener(new ah.p0(9, this, z10));
            this.f8115f.setInterpolator(es.h);
            this.f8115f.setDuration(340L);
            this.f8115f.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.d = f7;
        vVar.invalidate();
        if (!z10) {
            i10 = 8;
        }
        vVar.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<t> callback) {
        this.f8114c = callback;
    }

    public void setSelected(t tVar) {
        this.f8113b = tVar;
        AndroidUtilities.updateVisibleRows(this.f8112a);
    }
}
