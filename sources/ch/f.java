package ch;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.l1;
import c8.ha;
import org.telegram.messenger.c20;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
public final class f extends FrameLayout {
    public static final int f6237e = 0;
    public final e f6238a;
    public boolean f6239b;
    public boolean f6240c;
    public c20 d;

    public f(Activity activity, f6 f6Var) {
        super(activity);
        int x02;
        e eVar = new e(this, activity);
        this.f6238a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(2131232739);
        r6.t(eVar, k6.Gf, f6Var, PorterDuff.Mode.MULTIPLY);
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(hd.M0(2131754920, null));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new l1(1));
        addView(eVar, ha.e(36, 36, 17));
        int x03 = k6.x0(null, k6.f27941i6, false);
        int L = org.telegram.messenger.g0.L(36.0f);
        int i7 = k6.f27849d6;
        if (f6Var != null) {
            x02 = f6Var.h(i7);
        } else {
            x02 = k6.x0(null, i7, false);
        }
        org.telegram.ui.Cells.y j02 = k6.j0(L, x02, x03);
        n6 N = r6.N(i7);
        eVar.setBackground(j02);
        r6.k(eVar, j02, N, null, f6Var);
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
