package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class qt4 extends View {
    public int a;
    public final tt4 b;

    public qt4(tt4 tt4Var, Context context) {
        super(context);
        this.b = tt4Var;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        tt4 tt4Var = this.b;
        as0 as0Var = tt4Var.e;
        ArrayList arrayList = tt4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i5 = this.a;
        if (i5 == -1) {
            if (tt4Var.f0 == tt4.k0) {
                i3 = arrayList.size();
            } else {
                ArrayList arrayList2 = tt4Var.g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (tt4Var.d0 ? 1 : 0);
                    if (tt4Var.e0) {
                        i4 = arrayList.size();
                    } else {
                        i4 = 0;
                    }
                    i3 = i4 + size2;
                } else {
                    i3 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (gm.q.y - gm.L(62.0f)) - (((int) (((int) (size / as0Var.J)) * tt4Var.P)) * ((int) Math.ceil(i3 / as0Var.J)))));
            return;
        }
        setMeasuredDimension(size, i5);
    }
}
