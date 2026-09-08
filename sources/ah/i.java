package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.s5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import w7.x5;
public final class i extends FrameLayout {
    public static final int f594e = 0;
    public final h f595a;
    public boolean f596b;
    public boolean f597c;
    public Utilities.Callback d;

    public i(Activity activity, f6 f6Var) {
        super(activity);
        int w02;
        int w03;
        h hVar = new h(this, activity);
        this.f595a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        int i10 = j6.Re;
        if (f6Var != null) {
            w02 = f6Var.G0(i10);
        } else {
            w02 = j6.w0(null, i10, false);
        }
        hVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, x5.e(36, 36, 17));
        int w04 = j6.w0(null, j6.f20780i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i11 = j6.f20690d6;
        if (f6Var != null) {
            w03 = f6Var.G0(i11);
        } else {
            w03 = j6.w0(null, i11, false);
        }
        hVar.setBackground(j6.h0(dp, w03, w04));
        hVar.setOutlineProvider(new s5(18));
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
