package ch;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n2.b0;
import org.telegram.ui.Components.in;

public final class a implements View.OnClickListener {

    public final int f2901a;

    public final h f2902b;

    public a(h hVar, int i10) {
        this.f2901a = i10;
        this.f2902b = hVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f2901a;
        h hVar = this.f2902b;
        switch (i10) {
            case 0:
                b0 b0Var = hVar.f2922g0;
                if (b0Var != null) {
                    ArrayList arrayList = new ArrayList(hVar.f2921f0.keySet());
                    in inVar = (in) b0Var.f18130b;
                    ArrayList arrayList2 = inVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = inVar.H0;
                    if (i11 >= 0) {
                        inVar.f29435r.m(i11);
                    }
                }
                hVar.dismiss();
                break;
            case 1:
                b0 b0Var2 = hVar.f2922g0;
                if (b0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(hVar.f2921f0.keySet());
                    in inVar2 = (in) b0Var2.f18130b;
                    ArrayList arrayList4 = inVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = inVar2.H0;
                    if (i12 >= 0) {
                        inVar2.f29435r.m(i12);
                    }
                }
                hVar.dismiss();
                break;
            case 2:
                HashMap map = hVar.f2921f0;
                map.clear();
                hVar.f2919d0.b();
                hVar.Z.N(true);
                hVar.f2916a0.c(map.size(), true);
                break;
            case 3:
                hVar.S(view);
                break;
            default:
                int i13 = h.f2915n0;
                hVar.S(view);
                break;
        }
    }
}
