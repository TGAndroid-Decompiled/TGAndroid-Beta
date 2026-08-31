package ng;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class f extends FrameLayout {
    public static final int f16058e = 0;
    public final e f16059a;
    public boolean f16060b;
    public boolean f16061c;
    public Utilities.Callback d;

    public f(Activity activity, g6 g6Var) {
        super(activity);
        int w02;
        int w03;
        e eVar = new e(this, activity);
        this.f16059a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = k6.Re;
        if (g6Var != null) {
            w02 = g6Var.B0(i10);
        } else {
            w02 = k6.w0(null, i10, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new eg.m(6));
        addView(eVar, c6.e(36, 36, 17));
        int w04 = k6.w0(null, k6.f21750i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = k6.f21659d6;
        if (g6Var != null) {
            w03 = g6Var.B0(i11);
        } else {
            w03 = k6.w0(null, i11, false);
        }
        eVar.setBackground(k6.h0(dp, w03, w04));
        eVar.setOutlineProvider(new lf.o0(18));
        eVar.setElevation(AndroidUtilities.dp(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.d = callback;
    }
}
