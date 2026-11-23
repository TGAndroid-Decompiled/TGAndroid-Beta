package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
public final class f extends FrameLayout {
    public static final int f5341e = 0;
    public final e f5342a;
    public boolean f5343b;
    public boolean f5344c;
    public w10 d;

    public f(Activity activity, i6 i6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f5342a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232744);
        u6.s(eVar, n6.Jf, i6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(gd.N0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bi.o(5));
        addView(eVar, na.e(36, 36, 17));
        int x03 = n6.x0(null, n6.f29543i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = n6.f29451d6;
        if (i6Var != null) {
            x02 = i6Var.i(i7);
        } else {
            x02 = n6.x0(null, i7, false);
        }
        org.telegram.ui.Cells.y j02 = n6.j0(L, x02, x03);
        q6 M = u6.M(i7);
        eVar.setBackground(j02);
        u6.j(eVar, j02, M, null, i6Var);
        eVar.setOutlineProvider(new bg.r0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(w10 w10Var) {
        this.d = w10Var;
    }
}
