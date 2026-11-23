package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
public final class f extends FrameLayout {
    public static final int f5378e = 0;
    public final e f5379a;
    public boolean f5380b;
    public boolean f5381c;
    public y10 d;

    public f(Activity activity, h6 h6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f5379a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232741);
        t6.s(eVar, m6.Jf, h6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(hd.N0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bi.o(5));
        addView(eVar, ma.e(36, 36, 17));
        int x03 = m6.x0(null, m6.f29473i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = m6.f29381d6;
        if (h6Var != null) {
            x02 = h6Var.k(i7);
        } else {
            x02 = m6.x0(null, i7, false);
        }
        org.telegram.ui.Cells.y j02 = m6.j0(L, x02, x03);
        p6 M = t6.M(i7);
        eVar.setBackground(j02);
        t6.j(eVar, j02, M, null, h6Var);
        eVar.setOutlineProvider(new bg.r0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(y10 y10Var) {
        this.d = y10Var;
    }
}
