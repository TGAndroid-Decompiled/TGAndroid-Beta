package gg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import i7.f6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
public final class i extends FrameLayout {
    public final h5 f7312a;
    public long f7313b;

    public i(Context context, c6 c6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f9;
        float f10;
        float f11;
        float f12;
        h5 h5Var = new h5(context);
        h5Var.setTextSize(16);
        h5Var.setTextColor(g6.v0(g6.f23169j5, c6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        h5Var.setGravity(i10);
        addView(h5Var);
        h5 h5Var2 = new h5(context);
        this.f7312a = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(g6.v0(g6.L6, c6Var));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        h5Var2.setGravity(i11);
        addView(h5Var2);
        h5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i13 = i12 | 16;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 21.0f;
        }
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 0.0f;
        }
        h5Var.setLayoutParams(f6.d(-1, -2.0f, i13, f9, 0.0f, f10, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i14 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 21.0f;
        }
        h5Var2.setLayoutParams(f6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        setBackgroundColor(g6.v0(g6.f23133h5, c6Var));
    }

    public long getSelectedTime() {
        return this.f7313b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f7313b = j10;
        Date date = new Date(j10);
        this.f7312a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
