package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.s4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.z5;
public final class i extends FrameLayout {
    public static final int e = 0;
    public final h f777a;
    public boolean f778b;
    public boolean f779c;
    public Utilities.Callback d;

    public i(Activity activity, d6 d6Var) {
        super(activity);
        int x02;
        int x03;
        h hVar = new h(this, activity);
        this.f777a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = h6.Re;
        if (d6Var != null) {
            x02 = d6Var.u(i10);
        } else {
            x02 = h6.x0(null, i10, false);
        }
        hVar.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x04 = h6.x0(null, h6.f21075i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = h6.f20986d6;
        if (d6Var != null) {
            x03 = d6Var.u(i11);
        } else {
            x03 = h6.x0(null, i11, false);
        }
        hVar.setBackground(h6.i0(dp, x03, x04));
        hVar.setOutlineProvider(new s4(18));
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
