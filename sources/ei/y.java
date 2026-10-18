package ei;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
public final class y extends FrameLayout {
    public final v f10122a;
    public t f10123b;
    public Utilities.Callback f10124c;
    public float d;
    public boolean e;
    public ValueAnimator f10125f;

    public y(Activity activity, s2 s2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f10122a = vVar;
        vVar.setAdapter(new w(this, activity, s2Var));
        vVar.setLayoutManager(new s4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.wa(this, 6));
        addView(vVar, w7.z5.d(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f10125f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        v vVar = this.f10122a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f10125f = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 24));
            this.f10125f.addListener(new ah.p0(9, this, z10));
            this.f10125f.setInterpolator(bs.h);
            this.f10125f.setDuration(340L);
            this.f10125f.start();
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
        this.f10124c = callback;
    }

    public void setSelected(t tVar) {
        this.f10123b = tVar;
        AndroidUtilities.updateVisibleRows(this.f10122a);
    }
}
