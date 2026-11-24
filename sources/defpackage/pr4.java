package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class pr4 extends View {
    public int a;
    public final sr4 b;

    public pr4(sr4 sr4Var, Context context) {
        super(context);
        this.b = sr4Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        sr4 sr4Var = this.b;
        ar0 ar0Var = sr4Var.e;
        ArrayList arrayList = sr4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i5 = this.a;
        if (i5 == -1) {
            if (sr4Var.f0 == sr4.k0) {
                i3 = arrayList.size();
            } else {
                ArrayList arrayList2 = sr4Var.g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (sr4Var.d0 ? 1 : 0);
                    if (sr4Var.e0) {
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    i3 = i4 + size2;
                } else {
                    i3 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (gl.q.y - gl.L(62.0f)) - (((int) (((int) (size / ar0Var.J)) * sr4Var.P)) * ((int) Math.ceil(i3 / ar0Var.J)))));
            return;
        }
        setMeasuredDimension(size, i5);
    }
}
