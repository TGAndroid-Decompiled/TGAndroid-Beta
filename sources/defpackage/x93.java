package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
public final class x93 extends FrameLayout {
    public final lka a;
    public long b;

    public x93(Context context, ylb ylbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        lka lkaVar = new lka(context);
        lkaVar.setTextSize(16);
        anb.W(lkaVar, cmb.i5, ylbVar);
        if (jb6.a0) {
            i = 5;
        } else {
            i = 3;
        }
        lkaVar.setGravity(i);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.a = lkaVar2;
        lkaVar2.setTextSize(16);
        anb.W(lkaVar2, cmb.K6, ylbVar);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        lkaVar2.setGravity(i2);
        addView(lkaVar2);
        lkaVar.l(jb6.a0("BoostingDateAndTime", null, 2131753504, new Object[0]), false);
        boolean z = jb6.a0;
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
        lkaVar.setLayoutParams(qoe.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = jb6.a0;
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
        lkaVar2.setLayoutParams(qoe.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
        anb.h(cmb.g5, ylbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), 1073741824));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(jb6.a0("formatDateAtTime", null, 2131742446, jb6.D0().p0().format(date), jb6.D0().o0().format(date)), false);
    }
}
