package bh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
public final class h extends FrameLayout {
    public static final int e = 0;
    public final g f4034a;
    public boolean f4035b;
    public boolean f4036c;
    public Utilities.Callback d;

    public h(Activity activity, u6 u6Var) {
        super(activity);
        int x02;
        g gVar = new g(this, activity);
        this.f4034a = gVar;
        gVar.setHapticFeedbackEnabled(true);
        gVar.setImageResource(R.drawable.smiles_tab_clear);
        f7.t(gVar, y6.Re, u6Var, PorterDuff.Mode.MULTIPLY);
        gVar.setScaleType(ImageView.ScaleType.CENTER);
        gVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        gVar.setFocusable(true);
        gVar.setOnClickListener(new f(0));
        addView(gVar, gb1.i(36, 36, 17));
        int x03 = y6.x0(null, y6.f23446i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = y6.f23354d6;
        if (u6Var != null) {
            x02 = u6Var.g(i10);
        } else {
            x02 = y6.x0(null, i10, false);
        }
        org.telegram.ui.Cells.y i02 = y6.i0(dp, x02, x03);
        b7 N = f7.N(i10);
        gVar.setBackground(i02);
        f7.k(gVar, i02, N, null, u6Var);
        gVar.setOutlineProvider(new ag.w0(18));
        gVar.setElevation(AndroidUtilities.dp(1.0f));
        gVar.setClipToOutline(true);
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
