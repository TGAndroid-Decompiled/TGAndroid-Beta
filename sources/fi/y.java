package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
public final class y extends FrameLayout {
    public final v f11977a;
    public t f11978b;
    public Utilities.Callback f11979c;
    public float d;
    public boolean e;
    public ValueAnimator f11980f;

    public y(Activity activity, q2 q2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f11977a = vVar;
        vVar.setAdapter(new w(this, activity, q2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.k(this, 7));
        addView(vVar, gb1.g(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f11980f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        v vVar = this.f11977a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f11980f = ofFloat;
            ofFloat.addUpdateListener(new ai.g0(this, 26));
            this.f11980f.addListener(new bh.f0(9, this, z10));
            this.f11980f.setInterpolator(ds.h);
            this.f11980f.setDuration(340L);
            this.f11980f.start();
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
        this.f11979c = callback;
    }

    public void setSelected(t tVar) {
        this.f11978b = tVar;
        AndroidUtilities.updateVisibleRows(this.f11977a);
    }
}
