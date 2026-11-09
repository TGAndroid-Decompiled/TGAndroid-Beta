package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.l1;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
public final class f extends FrameLayout {
    public static final int f6235e = 0;
    public final e f6236a;
    public boolean f6237b;
    public boolean f6238c;
    public c20 d;

    public f(Activity activity, g6 g6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f6236a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232739);
        s6.s(eVar, l6.Gf, g6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(id.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new l1(1));
        addView(eVar, ha.e(36, 36, 17));
        int x03 = l6.x0(null, l6.f27957i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = l6.f27865d6;
        if (g6Var != null) {
            x02 = g6Var.h(i7);
        } else {
            x02 = l6.x0(null, i7, false);
        }
        org.telegram.ui.Cells.y j02 = l6.j0(L, x02, x03);
        o6 M = s6.M(i7);
        eVar.setBackground(j02);
        s6.j(eVar, j02, M, null, g6Var);
        eVar.setOutlineProvider(new bg.r0(18));
        eVar.setElevation(org.telegram.messenger.g0.L(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(42.0f), 1073741824));
    }

    public void setOnBackspace(c20 c20Var) {
        this.d = c20Var;
    }
}
