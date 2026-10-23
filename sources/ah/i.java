package ah;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.s4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import w7.z5;
public final class i extends FrameLayout {
    public static final int e = 0;
    public final h f776a;
    public boolean f777b;
    public boolean f778c;
    public Utilities.Callback d;

    public i(Activity activity, g6 g6Var) {
        super(activity);
        int x02;
        h hVar = new h(this, activity);
        this.f776a = hVar;
        hVar.setHapticFeedbackEnabled(true);
        hVar.setImageResource(R.drawable.smiles_tab_clear);
        r6.t(hVar, k6.Re, g6Var, PorterDuff.Mode.MULTIPLY);
        hVar.setScaleType(ImageView.ScaleType.CENTER);
        hVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        hVar.setFocusable(true);
        hVar.setOnClickListener(new f(0));
        addView(hVar, z5.e(36, 36, 17));
        int x03 = k6.x0(null, k6.f21272i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = k6.f21183d6;
        if (g6Var != null) {
            x02 = g6Var.g(i10);
        } else {
            x02 = k6.x0(null, i10, false);
        }
        org.telegram.ui.Cells.y i02 = k6.i0(dp, x02, x03);
        n6 O = r6.O(i10);
        hVar.setBackground(i02);
        r6.k(hVar, i02, O, null, g6Var);
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
