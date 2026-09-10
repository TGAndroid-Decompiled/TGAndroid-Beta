package bi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wr;
public final class c0 extends FrameLayout {
    public final z f2392a;
    public x f2393b;
    public Utilities.Callback f2394c;
    public float d;
    public boolean e;
    public ValueAnimator f2395f;

    public c0(Activity activity, m3 m3Var) {
        super(activity);
        z zVar = new z(this, activity);
        this.f2392a = zVar;
        zVar.setAdapter(new a0(this, activity, m3Var));
        zVar.setLayoutManager(new s4.c0(0, false));
        zVar.setClipToPadding(false);
        zVar.setVisibility(8);
        zVar.setWillNotDraw(false);
        zVar.setOnItemClickListener(new ai.g(this, 1));
        addView(zVar, w7.a6.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f2395f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        z zVar = this.f2392a;
        if (z11) {
            zVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f2395f = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 2));
            this.f2395f.addListener(new ai.e(4, this, z10));
            this.f2395f.setInterpolator(wr.h);
            this.f2395f.setDuration(340L);
            this.f2395f.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.d = f7;
        zVar.invalidate();
        if (!z10) {
            i10 = 8;
        }
        zVar.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<x> callback) {
        this.f2394c = callback;
    }

    public void setSelected(x xVar) {
        this.f2393b = xVar;
        AndroidUtilities.updateVisibleRows(this.f2392a);
    }
}
