package ci;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.qr;
public final class y extends FrameLayout {
    public final v f5796a;
    public t f5797b;
    public Utilities.Callback f5798c;
    public float d;
    public boolean e;
    public ValueAnimator f5799f;

    public y(Activity activity, y2 y2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f5796a = vVar;
        vVar.setAdapter(new w(this, activity, y2Var));
        vVar.setLayoutManager(new s4.c0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.g(this, 2));
        addView(vVar, w7.x5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f5799f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        int i10 = 8;
        float f7 = 0.0f;
        v vVar = this.f5796a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f5799f = ofFloat;
            ofFloat.addUpdateListener(new ai.a(this, 16));
            this.f5799f.addListener(new ai.n(8, this, z10));
            this.f5799f.setInterpolator(qr.h);
            this.f5799f.setDuration(340L);
            this.f5799f.start();
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
        this.f5798c = callback;
    }

    public void setSelected(t tVar) {
        this.f5797b = tVar;
        AndroidUtilities.updateVisibleRows(this.f5796a);
    }
}
