package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class j3 extends View {
    public int f14725a;
    public final m3 f14726b;

    public j3(m3 m3Var, Context context) {
        super(context);
        this.f14726b = m3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        m3 m3Var = this.f14726b;
        gi.g gVar = m3Var.f14894e;
        ArrayList arrayList = m3Var.f14892c0;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = this.f14725a;
        if (i13 == -1) {
            if (m3Var.f14897f0 == m3.f14886k0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = m3Var.f14898g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (m3Var.f14893d0 ? 1 : 0);
                    if (m3Var.f14895e0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f24226q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * m3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
