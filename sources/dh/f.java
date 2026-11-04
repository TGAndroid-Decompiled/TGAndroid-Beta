package dh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
public final class f extends FrameLayout {
    public static final int f8999e = 0;
    public final e f9000a;
    public boolean f9001b;
    public boolean f9002c;
    public u10 d;

    public f(Activity activity, e6 e6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f9000a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232737);
        r6.t(eVar, k6.Gf, e6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(bd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new ai.t(4));
        addView(eVar, mf.e(36, 36, 17));
        int x03 = k6.x0(null, k6.f27972i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i3 = k6.f27878d6;
        if (e6Var != null) {
            x02 = e6Var.h(i3);
        } else {
            x02 = k6.x0(null, i3, false);
        }
        org.telegram.ui.Cells.y j02 = k6.j0(L, x02, x03);
        n6 N = r6.N(i3);
        eVar.setBackground(j02);
        r6.k(eVar, j02, N, null, e6Var);
        eVar.setOutlineProvider(new cg.q0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(u10 u10Var) {
        this.d = u10Var;
    }
}
