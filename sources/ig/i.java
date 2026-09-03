package ig;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
public final class i extends FrameLayout {
    public final k5 f7503a;
    public long f7504b;

    public i(Context context, f6 f6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        float f12;
        float f13;
        k5 k5Var = new k5(context);
        k5Var.setTextSize(16);
        k5Var.setTextColor(j6.v0(j6.f19987j5, f6Var));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k5Var.setGravity(i10);
        addView(k5Var);
        k5 k5Var2 = new k5(context);
        this.f7503a = k5Var2;
        k5Var2.setTextSize(16);
        k5Var2.setTextColor(j6.v0(j6.L6, f6Var));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        k5Var2.setGravity(i11);
        addView(k5Var2);
        k5Var.l(LocaleController.formatString("BoostingDateAndTime", R.string.BoostingDateAndTime, new Object[0]), false);
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
        k5Var.setLayoutParams(b6.d(-1, -2.0f, i13, f10, 0.0f, f11, 0.0f));
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
        k5Var2.setLayoutParams(b6.d(-1, -2.0f, i14, f12, 0.0f, f13, 0.0f));
        setBackgroundColor(j6.v0(j6.f19952h5, f6Var));
    }

    public long getSelectedTime() {
        return this.f7504b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f7504b = j10;
        Date date = new Date(j10);
        this.f7503a.l(LocaleController.formatString("formatDateAtTime", R.string.formatDateAtTime, LocaleController.getInstance().getFormatterDayMonth().format(date), LocaleController.getInstance().getFormatterDay().format(date)), false);
    }
}
