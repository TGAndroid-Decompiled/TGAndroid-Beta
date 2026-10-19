package ei;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.bs;
public final class y extends FrameLayout {
    public final v f10121a;
    public t f10122b;
    public Utilities.Callback f10123c;
    public float d;
    public boolean e;
    public ValueAnimator f10124f;

    public y(Activity activity, s2 s2Var) {
        super(activity);
        v vVar = new v(this, activity);
        this.f10121a = vVar;
        vVar.setAdapter(new w(this, activity, s2Var));
        vVar.setLayoutManager(new s4.b0(0, false));
        vVar.setClipToPadding(false);
        vVar.setVisibility(8);
        vVar.setWillNotDraw(false);
        vVar.setOnItemClickListener(new ai.wa(this, 6));
        addView(vVar, w7.z5.c(56.0f, -1));
    }

    public final void a(boolean z10, boolean z11) {
        ValueAnimator valueAnimator = this.f10124f;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        float f7 = 0.0f;
        int i10 = 0;
        v vVar = this.f10121a;
        if (z11) {
            vVar.setVisibility(0);
            float f10 = this.d;
            if (z10) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f10124f = ofFloat;
            ofFloat.addUpdateListener(new ah.c0(this, 24));
            this.f10124f.addListener(new ah.p0(9, this, z10));
            this.f10124f.setInterpolator(bs.h);
            this.f10124f.setDuration(340L);
            this.f10124f.start();
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
        this.f10123c = callback;
    }

    public void setSelected(t tVar) {
        this.f10122b = tVar;
        AndroidUtilities.updateVisibleRows(this.f10121a);
    }
}
