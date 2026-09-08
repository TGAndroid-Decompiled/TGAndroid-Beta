package di;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
public final class y extends FrameLayout {
    public final v f8468a;
    public t f8469b;
    public Utilities.Callback f8470c;
    public float d;
    public boolean f8471e;
    public ValueAnimator f8472f;

    public y(Activity activity, y2 y2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f8468a = vVar;
        vVar.setAdapter(new w(this, activity, y2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bi.d(this, 2));
        addView(vVar, w7.x5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f8472f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f8471e == z10) {
            return;
        }
        this.f8471e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        v vVar = this.f8468a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f8472f = ofFloat;
            ofFloat.addUpdateListener(new ah.d0(this, 17));
            this.f8472f.addListener(new ah.q0(9, this, z10));
            this.f8472f.setInterpolator(pr.h);
            this.f8472f.setDuration(340L);
            this.f8472f.start();
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
        this.f8470c = callback;
    }

    public void setSelected(t tVar) {
        this.f8469b = tVar;
        AndroidUtilities.updateVisibleRows(this.f8468a);
    }
}
