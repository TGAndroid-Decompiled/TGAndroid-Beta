package hi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
public final class b3 extends View {
    public int f14265a;
    public final e3 f14266b;

    public b3(e3 e3Var, Context context) {
        super(context);
        this.f14266b = e3Var;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        int i12;
        e3 e3Var = this.f14266b;
        gi.g gVar = e3Var.f14543e;
        ArrayList arrayList = e3Var.f14541c0;
        int size = View.MeasureSpec.getSize(i7);
        int i13 = this.f14265a;
        if (i13 == -1) {
            if (e3Var.f14546f0 == e3.f14535k0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = e3Var.f14547g0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (e3Var.f14542d0 ? 1 : 0);
                    if (e3Var.f14544e0) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (org.telegram.messenger.g0.f24121q.y - org.telegram.messenger.g0.L(62.0f)) - (((int) (((int) (size / gVar.J)) * e3Var.P)) * ((int) Math.ceil(i11 / gVar.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
