package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
public final class f extends FrameLayout {
    public static final int f5063e = 0;
    public final e f5064a;
    public boolean f5065b;
    public boolean f5066c;
    public z10 d;

    public f(Activity activity, e6 e6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f5064a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232740);
        q6.s(eVar, j6.Jf, e6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(hd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bi.o(3));
        addView(eVar, ja.e(36, 36, 17));
        int x03 = j6.x0(null, j6.f28941i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = j6.f28849d6;
        if (e6Var != null) {
            x02 = e6Var.h(i7);
        } else {
            x02 = j6.x0(null, i7, false);
        }
        org.telegram.ui.Cells.y j02 = j6.j0(L, x02, x03);
        m6 M = q6.M(i7);
        eVar.setBackground(j02);
        q6.j(eVar, j02, M, null, e6Var);
        eVar.setOutlineProvider(new bg.q0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(z10 z10Var) {
        this.d = z10Var;
    }
}
