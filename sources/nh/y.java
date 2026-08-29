package nh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jr;
public final class y extends FrameLayout {
    public final v f18845a;
    public t f18846b;
    public Utilities.Callback f18847c;
    public float d;
    public boolean f18848e;
    public ValueAnimator f18849f;

    public y(Activity activity, p2 p2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f18845a = vVar;
        vVar.setAdapter(new w(this, activity, p2Var));
        vVar.setLayoutManager(new f2.j0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new bg.o(this, 13));
        addView(vVar, i7.f6.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f18849f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f18848e == z10) {
            return;
        }
        this.f18848e = z10;
        float f9 = 0.0f;
        int i10 = 0;
        v vVar = this.f18845a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f9 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
            this.f18849f = ofFloat;
            ofFloat.addUpdateListener(new lh.d5(this, 5));
            this.f18849f.addListener(new bg.z2(12, this, z10));
            this.f18849f.setInterpolator(jr.h);
            this.f18849f.setDuration(340L);
            this.f18849f.start();
            return;
        }
        if (z10) {
            f9 = 1.0f;
        }
        this.d = f9;
        vVar.invalidate();
        if (!z10) {
            i10 = 8;
        }
        vVar.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<t> callback) {
        this.f18847c = callback;
    }

    public void setSelected(t tVar) {
        this.f18846b = tVar;
        AndroidUtilities.updateVisibleRows(this.f18845a);
    }
}
