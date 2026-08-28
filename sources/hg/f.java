package hg;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public final class f extends FrameLayout {
    public static final int f10597e = 0;
    public final e f10598a;
    public boolean f10599b;
    public boolean f10600c;
    public Utilities.Callback d;

    public f(Activity activity, b6 b6Var) {
        super(activity);
        int w02;
        int w03;
        e eVar = new e(this, activity);
        this.f10598a = eVar;
        eVar.setHapticFeedbackEnabled(true);
        eVar.setImageResource(R.drawable.smiles_tab_clear);
        int i9 = f6.Re;
        if (b6Var != null) {
            w02 = b6Var.N0(i9);
        } else {
            w02 = f6.w0(null, i9, false);
        }
        eVar.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        eVar.setScaleType(ImageView.ScaleType.CENTER);
        eVar.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
        eVar.setFocusable(true);
        eVar.setOnClickListener(new fh.n(4));
        addView(eVar, e6.e(36, 36, 17));
        int w04 = f6.w0(null, f6.f23092i6, false);
        int dp = AndroidUtilities.dp(36.0f);
        int i10 = f6.f23001d6;
        if (b6Var != null) {
            w03 = b6Var.N0(i10);
        } else {
            w03 = f6.w0(null, i10, false);
        }
        eVar.setBackground(f6.h0(dp, w03, w04));
        eVar.setOutlineProvider(new ff.p0(18));
        eVar.setElevation(AndroidUtilities.dp(1.0f));
        eVar.setClipToOutline(true);
        setClickable(true);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
    }

    public void setOnBackspace(Utilities.Callback<Boolean> callback) {
        this.d = callback;
    }
}
