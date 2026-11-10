package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class c3 extends View {
    public int f11730a;
    public final f3 f11731b;

    public c3(f3 f3Var, Context context) {
        super(context);
        this.f11731b = f3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        f3 f3Var = this.f11731b;
        ei.h hVar = f3Var.f11967e;
        ArrayList arrayList = f3Var.f11963b0;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = this.f11730a;
        if (i13 == -1) {
            if (f3Var.f11968e0 == f3.f11959j0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = f3Var.f11970f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (f3Var.f11965c0 ? 1 : 0);
                    if (f3Var.f11966d0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f22567q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / hVar.J)) * f3Var.O)) * ((int) Math.ceil(i11 / hVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
