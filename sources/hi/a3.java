package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class a3 extends View {
    public int f14246a;
    public final d3 f14247b;

    public a3(d3 d3Var, Context context) {
        super(context);
        this.f14247b = d3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        d3 d3Var = this.f14247b;
        gi.g gVar = d3Var.f14494e;
        ArrayList arrayList = d3Var.f14492c0;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = this.f14246a;
        if (i13 == -1) {
            if (d3Var.f14497f0 == d3.f14486k0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = d3Var.f14498g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (d3Var.f14493d0 ? 1 : 0);
                    if (d3Var.f14495e0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f24046q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * d3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
