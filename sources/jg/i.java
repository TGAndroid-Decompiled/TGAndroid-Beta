package jg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
public final class i extends FrameLayout {
    public final l5 f10042a;
    public long f10043b;

    public i(Context context, g6 g6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        l5 l5Var = new l5(context);
        l5Var.setTextSize(16);
        l5Var.setTextColor(k6.v0(k6.f21766j5, g6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        l5Var.setGravity(i10);
        addView(l5Var);
        l5 l5Var2 = new l5(context);
        this.f10042a = l5Var2;
        l5Var2.setTextSize(16);
        l5Var2.setTextColor(k6.v0(k6.L6, g6Var));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        l5Var2.setGravity(i11);
        addView(l5Var2);
        l5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i13 = i12 | 16;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 21.0f;
        }
        if (z4) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        l5Var.setLayoutParams(c6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
        boolean z10 = LocaleController.isRTL;
        int i14 = (z10 ? 3 : 5) | 16;
        if (z10) {
            f12 = 21.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 21.0f;
        }
        l5Var2.setLayoutParams(c6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        setBackgroundColor(k6.v0(k6.f21731h5, g6Var));
    }

    public long getSelectedTime() {
        return this.f10043b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f10043b = j10;
        Date date = new Date(j10);
        this.f10042a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
