package kg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public final class f extends FrameLayout {
    public static final int f13706e = 0;
    public final e f13707a;
    public boolean f13708b;
    public boolean f13709c;
    public Utilities.Callback d;

    public f(Activity activity, c6 c6Var) {
        super(activity);
        int w02;
        int w03;
        e eVar = new e(this, activity);
        this.f13707a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = g6.Re;
        if (c6Var != null) {
            w02 = c6Var.C0(i10);
        } else {
            w02 = g6.w0(null, i10, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new bg.n(6));
        addView(eVar, f6.e(36, 36, 17));
        int w04 = g6.w0(null, g6.f23152i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = g6.f23062d6;
        if (c6Var != null) {
            w03 = c6Var.C0(i11);
        } else {
            w03 = g6.w0(null, i11, false);
        }
        eVar.setBackground(g6.h0(dp, w03, w04));
        eVar.setOutlineProvider(new jf.o0(18));
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
