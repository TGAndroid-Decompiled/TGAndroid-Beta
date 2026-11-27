package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
public final class e93 extends FrameLayout {
    public final ema a;
    public long b;

    public e93(Context context, vnb vnbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        ema emaVar = new ema(context);
        emaVar.setTextSize(16);
        yob.W(emaVar, aob.j5, vnbVar);
        if (ob6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        emaVar.setGravity(i);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.a = emaVar2;
        emaVar2.setTextSize(16);
        yob.W(emaVar2, aob.L6, vnbVar);
        if (ob6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        emaVar2.setGravity(i2);
        addView(emaVar2);
        emaVar.l(ob6.a0("BoostingDateAndTime", null, 2131753532, new Object[0]), false);
        boolean z = ob6.a0;
        if (z) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i4 = i3 | 16;
        if (z) {
            f = 0.0f;
        } else {
            f = 21.0f;
        }
        if (z) {
            f2 = 21.0f;
        } else {
            f2 = 0.0f;
        }
        emaVar.setLayoutParams(tre.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = ob6.a0;
        int i5 = (z2 ? 3 : 5) | 16;
        if (z2) {
            f3 = 21.0f;
        } else {
            f3 = 0.0f;
        }
        if (z2) {
            f4 = 0.0f;
        } else {
            f4 = 21.0f;
        }
        emaVar2.setLayoutParams(tre.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
        yob.h(aob.h5, vnbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), 1073741824));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(ob6.a0("formatDateAtTime", null, 2131742414, ob6.D0().p0().format(date), ob6.D0().o0().format(date)), false);
    }
}
