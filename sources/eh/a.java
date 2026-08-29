package eh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import nh.d6;
import org.telegram.ui.Components.on;
public final class a implements View.OnClickListener {
    public final int f6208a;
    public final f f6209b;

    public a(f fVar, int i10) {
        this.f6208a = i10;
        this.f6209b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f6208a;
        f fVar = this.f6209b;
        switch (i10) {
            case 0:
                d6 d6Var = fVar.f6225g0;
                if (d6Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f6224f0.keySet());
                    on onVar = (on) d6Var.f17533b;
                    ArrayList arrayList2 = onVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = onVar.H0;
                    if (i11 >= 0) {
                        onVar.f31425r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                d6 d6Var2 = fVar.f6225g0;
                if (d6Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f6224f0.keySet());
                    on onVar2 = (on) d6Var2.f17533b;
                    ArrayList arrayList4 = onVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = onVar2.H0;
                    if (i12 >= 0) {
                        onVar2.f31425r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f6224f0;
                hashMap.clear();
                fVar.f6222d0.b();
                fVar.Z.N(true);
                fVar.f6219a0.c(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f6218n0;
                fVar.S(view);
                return;
        }
    }
}
