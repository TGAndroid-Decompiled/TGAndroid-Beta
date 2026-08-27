package lh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;

public final class z extends FrameLayout {

    public final w f17134a;

    public u f17135b;

    public Utilities.Callback f17136c;
    public float d;

    public boolean f17137e;

    public ValueAnimator f17138f;

    public z(Activity activity, r2 r2Var) {
        super(activity);
        w wVar = new w(this, activity);
        this.f17134a = wVar;
        wVar.setAdapter(new x(this, activity, r2Var));
        wVar.setLayoutManager(new f2.k0(0, false));
        wVar.setClipToPadding(false);
        wVar.setVisibility(8);
        wVar.setWillNotDraw(false);
        wVar.setOnItemClickListener(new ag.p0(this, 11));
        addView(wVar, h7.z5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f17138f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f17137e == z10) {
            return;
        }
        this.f17137e = z10;
        w wVar = this.f17134a;
        if (!z11) {
            this.d = z10 ? 1.0f : 0.0f;
            wVar.invalidate();
            wVar.setVisibility(z10 ? 0 : 8);
            return;
        }
        wVar.setVisibility(0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.d, z10 ? 1.0f : 0.0f);
        this.f17138f = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 29));
        this.f17138f.addListener(new ag.x(11, this, z10));
        this.f17138f.setInterpolator(er.h);
        this.f17138f.setDuration(340L);
        this.f17138f.start();
    }

    public void setOnLayoutClick(Utilities.Callback<u> callback) {
        this.f17136c = callback;
    }

    public void setSelected(u uVar) {
        this.f17135b = uVar;
        AndroidUtilities.updateVisibleRows(this.f17134a);
    }
}
