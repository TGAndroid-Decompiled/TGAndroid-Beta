package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.tr;
public final class y extends FrameLayout {
    public final v f6324a;
    public t f6325b;
    public Utilities.Callback f6326c;
    public float d;
    public boolean f6327e;
    public ValueAnimator f6328f;

    public y(Activity activity, x2 x2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f6324a = vVar;
        vVar.setAdapter(new w(this, activity, x2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.g(this, 2));
        addView(vVar, w7.z5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f6328f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f6327e == z10) {
            return;
        }
        this.f6327e = z10;
        int i10 = 8;
        float f7 = 0.0f;
        v vVar = this.f6324a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f6328f = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 16));
            this.f6328f.addListener(new ai.n(8, this, z10));
            this.f6328f.setInterpolator(tr.h);
            this.f6328f.setDuration(340L);
            this.f6328f.start();
            return;
        }
        if (z10) {
            f7 = 1.0f;
        }
        this.d = f7;
        vVar.invalidate();
        if (z10) {
            i10 = 0;
        }
        vVar.setVisibility(i10);
    }

    public void setOnLayoutClick(Utilities.Callback<t> callback) {
        this.f6326c = callback;
    }

    public void setSelected(t tVar) {
        this.f6325b = tVar;
        AndroidUtilities.updateVisibleRows(this.f6324a);
    }
}
