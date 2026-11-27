package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class tt4 extends View {
    public int a;
    public final wt4 b;

    public tt4(wt4 wt4Var, Context context) {
        super(context);
        this.b = wt4Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        wt4 wt4Var = this.b;
        ar0 ar0Var = wt4Var.e;
        ArrayList arrayList = wt4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i5 = this.a;
        if (i5 == -1) {
            if (wt4Var.f0 == wt4.k0) {
                i3 = arrayList.size();
            } else {
                ArrayList arrayList2 = wt4Var.g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (wt4Var.d0 ? 1 : 0);
                    if (wt4Var.e0) {
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    i3 = i4 + size2;
                } else {
                    i3 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (hl.q.y - hl.L(62.0f)) - (((int) (((int) (size / ar0Var.J)) * wt4Var.P)) * ((int) Math.ceil(i3 / ar0Var.J)))));
            return;
        }
        setMeasuredDimension(size, i5);
    }
}
