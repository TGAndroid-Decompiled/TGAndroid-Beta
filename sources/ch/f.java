package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
public final class f extends FrameLayout {
    public static final int f5346e = 0;
    public final e f5347a;
    public boolean f5348b;
    public boolean f5349c;
    public x10 d;

    public f(Activity activity, i6 i6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f5347a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232741);
        u6.s(eVar, n6.Jf, i6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(gd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bi.o(5));
        addView(eVar, ma.e(36, 36, 17));
        int x03 = n6.x0(null, n6.f29486i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = n6.f29394d6;
        if (i6Var != null) {
            x02 = i6Var.k(i7);
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

    public void setOnBackspace(x10 x10Var) {
        this.d = x10Var;
    }
}
