package ig;

import ag.l2;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public final class f extends FrameLayout {

    public static final int f11293e = 0;

    public final e f11294a;

    public boolean f11295b;

    public boolean f11296c;
    public Utilities.Callback d;

    public f(Activity activity, c6 c6Var) {
        super(activity);
        e eVar = new e(this, activity);
        this.f11294a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = g6.Re;
        eVar.setColorFilter(new PorterDuffColorFilter(c6Var != null ? c6Var.N0(i10) : g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new l2(5));
        addView(eVar, z5.e(36, 36, 17));
        int iW0 = g6.w0(null, g6.f23144i6, false);
        int iDp = AndroidUtilities.dp(36.0f);
        int i11 = g6.f23053d6;
        eVar.setBackground(g6.h0(iDp, c6Var != null ? c6Var.N0(i11) : g6.w0(null, i11, false), iW0));
        eVar.setOutlineProvider(new gf.p0(18));
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
