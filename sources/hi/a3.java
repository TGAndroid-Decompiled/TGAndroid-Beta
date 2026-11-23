package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class a3 extends View {
    public int f14178a;
    public final d3 f14179b;

    public a3(d3 d3Var, Context context) {
        super(context);
        this.f14179b = d3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        d3 d3Var = this.f14179b;
        gi.g gVar = d3Var.f14340e;
        ArrayList arrayList = d3Var.f14338c0;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = this.f14178a;
        if (i13 == -1) {
            if (d3Var.f14343f0 == d3.f14332k0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = d3Var.f14344g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (d3Var.f14339d0 ? 1 : 0);
                    if (d3Var.f14341e0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f24010q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * d3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
