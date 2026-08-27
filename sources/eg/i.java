package eg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import h7.z5;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;

public final class i extends FrameLayout {

    public final h5 f5419a;

    public long f5420b;

    public i(Context context, c6 c6Var) {
        super(context);
        h5 h5Var = new h5(context);
        h5Var.setTextSize(16);
        h5Var.setTextColor(g6.v0(g6.f23161j5, c6Var));
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        h5 h5Var2 = new h5(context);
        this.f5419a = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(g6.v0(g6.L6, c6Var));
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        h5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        h5Var.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 0.0f : 21.0f, 0.0f, z10 ? 21.0f : 0.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        h5Var2.setLayoutParams(z5.d(-1, -2.0f, (z11 ? 3 : 5) | 16, z11 ? 21.0f : 0.0f, 0.0f, z11 ? 0.0f : 21.0f, 0.0f));
        setBackgroundColor(g6.v0(g6.f23124h5, c6Var));
    }

    public long getSelectedTime() {
        return this.f5420b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f5420b = j10;
        Date date = new Date(j10);
        this.f5419a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
