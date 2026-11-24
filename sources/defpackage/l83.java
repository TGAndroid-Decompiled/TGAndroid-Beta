package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Date;
public final class l83 extends FrameLayout {
    public final jia a;
    public long b;

    public l83(Context context, wjb wjbVar) {
        super(context);
        int i;
        int i2;
        int i3;
        float f;
        float f2;
        float f3;
        float f4;
        jia jiaVar = new jia(context);
        jiaVar.setTextSize(16);
        zkb.W(jiaVar, bkb.i5, wjbVar);
        if (k96.a0) {
            i = 5;
        } else {
            i = 3;
        }
        jiaVar.setGravity(i);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.a = jiaVar2;
        jiaVar2.setTextSize(16);
        zkb.W(jiaVar2, bkb.K6, wjbVar);
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        jiaVar2.setGravity(i2);
        addView(jiaVar2);
        jiaVar.l(k96.a0("BoostingDateAndTime", null, 2131753536, new Object[0]), false);
        boolean z = k96.a0;
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
        jiaVar.setLayoutParams(nme.d(-1, -2.0f, i4, f, 0.0f, f2, 0.0f));
        boolean z2 = k96.a0;
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
        jiaVar2.setLayoutParams(nme.d(-1, -2.0f, i5, f3, 0.0f, f4, 0.0f));
        zkb.h(bkb.g5, wjbVar, this);
    }

    public long getSelectedTime() {
        return this.b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), 1073741824));
    }

    public void setDate(long j) {
        this.b = j;
        Date date = new Date(j);
        this.a.l(k96.a0("formatDateAtTime", null, 2131742520, k96.D0().p0().format(date), k96.D0().o0().format(date)), false);
    }
}
