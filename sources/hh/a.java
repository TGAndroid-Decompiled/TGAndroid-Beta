package hh;

import android.view.View;
import androidx.biometric.f0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.sn;
public final class a implements View.OnClickListener {
    public final int f7688a;
    public final f f7689b;

    public a(f fVar, int i10) {
        this.f7688a = i10;
        this.f7689b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f7688a;
        f fVar = this.f7689b;
        switch (i10) {
            case 0:
                f0 f0Var = fVar.f7706h0;
                if (f0Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f7705g0.keySet());
                    sn snVar = (sn) f0Var.f532b;
                    ArrayList arrayList2 = snVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = snVar.I0;
                    if (i11 >= 0) {
                        snVar.f31120r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                f0 f0Var2 = fVar.f7706h0;
                if (f0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f7705g0.keySet());
                    sn snVar2 = (sn) f0Var2.f532b;
                    ArrayList arrayList4 = snVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = snVar2.I0;
                    if (i12 >= 0) {
                        snVar2.f31120r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f7705g0;
                hashMap.clear();
                fVar.f7703e0.b();
                fVar.f7699a0.N(true);
                fVar.f7700b0.c(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f7698o0;
                fVar.S(view);
                return;
        }
    }
}
