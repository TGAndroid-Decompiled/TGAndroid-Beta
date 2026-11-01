package og;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import w7.b6;
public final class i extends FrameLayout {
    public final u5 f14203a;
    public long f14204b;

    public i(Context context, p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        float f7;
        float f10;
        float f11;
        float f12;
        u5 u5Var = new u5(context);
        u5Var.setTextSize(16);
        a7.Y(u5Var, t6.f21038j5, p6Var);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        addView(u5Var);
        u5 u5Var2 = new u5(context);
        this.f14203a = u5Var2;
        u5Var2.setTextSize(16);
        a7.Y(u5Var2, t6.L6, p6Var);
        if (dd.X) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        u5Var2.setGravity(i11);
        addView(u5Var2);
        u5Var.l(dd.a0("BoostingDateAndTime", null, 2131753539, new Object[0]), false);
        boolean z10 = dd.X;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i13 = i12 | 16;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 21.0f;
        }
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 0.0f;
        }
        u5Var.setLayoutParams(b6.d(-1, -2.0f, i13, f7, 0.0f, f10, 0.0f));
        boolean z11 = dd.X;
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
        u5Var2.setLayoutParams(b6.d(-1, -2.0f, i14, f11, 0.0f, f12, 0.0f));
        a7.i(t6.f21002h5, this, p6Var);
    }

    public long getSelectedTime() {
        return this.f14204b;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i0.L(50.0f), 1073741824));
    }

    public void setDate(long j10) {
        this.f14204b = j10;
        Date date = new Date(j10);
        this.f14203a.l(dd.a0("formatDateAtTime", null, 2131742808, dd.D0().p0().format(date), dd.D0().o0().format(date)), false);
    }
}
