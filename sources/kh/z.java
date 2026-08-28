package kh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.gr;
public final class z extends FrameLayout {
    public final w f16415a;
    public u f16416b;
    public Utilities.Callback f16417c;
    public float d;
    public boolean f16418e;
    public ValueAnimator f16419f;

    public z(Activity activity, s2 s2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.f16415a = wVar;
        wVar.setAdapter(new x(this, activity, s2Var));
        wVar.setLayoutManager(new f2.m0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new eh.j(this, 9));
        addView(wVar, g7.e6.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f16419f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f16418e == z10) {
            return;
        }
        this.f16418e = z10;
        float f10 = 0.0f;
        int i9 = 0;
        w wVar = this.f16415a;
        if (z11) {
            wVar.setVisibility(0);
            float f11 = this.d;
            if (z10) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            this.f16419f = ofFloat;
            ofFloat.addUpdateListener(new bg.b(this, 26));
            this.f16419f.addListener(new hg.b0(9, this, z10));
            this.f16419f.setInterpolator(gr.h);
            this.f16419f.setDuration(340L);
            this.f16419f.start();
            return;
        }
        if (z10) {
            f10 = 1.0f;
        }
        this.d = f10;
        wVar.invalidate();
        if (!z10) {
            i9 = 8;
        }
        wVar.setVisibility(i9);
    }

    public void setOnLayoutClick(Utilities.Callback<u> callback) {
        this.f16417c = callback;
    }

    public void setSelected(u uVar) {
        this.f16416b = uVar;
        AndroidUtilities.updateVisibleRows(this.f16415a);
    }
}
