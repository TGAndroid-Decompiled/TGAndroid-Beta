package gi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class a3 extends View {
    public int f12386a;
    public final d3 f12387b;

    public a3(d3 d3Var, Context context) {
        super(context);
        this.f12387b = d3Var;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        int i12;
        d3 d3Var = this.f12387b;
        fi.g gVar = d3Var.f12566e;
        ArrayList arrayList = d3Var.f12564c0;
        int size = View.MeasureSpec.getSize(i3);
        int i13 = this.f12386a;
        if (i13 == -1) {
            if (d3Var.f12569f0 == d3.f12558k0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = d3Var.f12570g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (d3Var.f12565d0 ? 1 : 0);
                    if (d3Var.f12567e0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * d3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
