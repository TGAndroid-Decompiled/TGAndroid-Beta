package dg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
public final class i extends FrameLayout {
    public final h5 f4528a;
    public long f4529b;

    public i(Context context, b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        h5 h5Var = new h5(context);
        h5Var.setTextSize(16);
        h5Var.setTextColor(f6.v0(f6.f23108j5, b6Var));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        h5Var.setGravity(i9);
        addView(h5Var);
        h5 h5Var2 = new h5(context);
        this.f4528a = h5Var2;
        h5Var2.setTextSize(16);
        h5Var2.setTextColor(f6.v0(f6.L6, b6Var));
        if (LocaleController.isRTL) {
            i10 = 3;
        } else {
            i10 = 5;
        }
        h5Var2.setGravity(i10);
        addView(h5Var2);
        h5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i12 = i11 | 16;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 21.0f;
        }
        if (z10) {
            f11 = 21.0f;
        } else {
            f11 = 0.0f;
        }
        h5Var.setLayoutParams(e6.d(-1, -2.0f, i12, f10, 0.0f, f11, 0.0f));
        boolean z11 = LocaleController.isRTL;
        int i13 = (z11 ? 3 : 5) | 16;
        if (z11) {
            f12 = 21.0f;
        } else {
            f12 = 0.0f;
        }
        if (z11) {
            f13 = 0.0f;
        } else {
            f13 = 21.0f;
        }
        h5Var2.setLayoutParams(e6.d(-1, -2.0f, i13, f12, 0.0f, f13, 0.0f));
        setBackgroundColor(f6.v0(f6.f23072h5, b6Var));
    }

    public long getSelectedTime() {
        return this.f4529b;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f4529b = j10;
        Date date = new Date(j10);
        this.f4528a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
