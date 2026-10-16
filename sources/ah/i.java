package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.u5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import w7.z5;
public final class i extends FrameLayout {
    public static final int e = 0;
    public final h f775a;
    public boolean f776b;
    public boolean f777c;
    public Utilities.Callback d;

    public i(Activity activity, c6 c6Var) {
        super(activity);
        int x02;
        int x03;
        h hVar = new h(this, activity);
        this.f775a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = g6.Re;
        if (c6Var != null) {
            x02 = c6Var.E0(i10);
        } else {
            x02 = g6.x0(null, i10, false);
        }
        hVar.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x04 = g6.x0(null, g6.f19690i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = g6.f19601d6;
        if (c6Var != null) {
            x03 = c6Var.E0(i11);
        } else {
            x03 = g6.x0(null, i11, false);
        }
        hVar.setBackground(g6.i0(dp, x03, x04));
        hVar.setOutlineProvider(new u5(18));
        hVar.setElevation(AndroidUtilities.dp(1.0f));
        hVar.setClipToOutline(true);
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
