package bh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import n5.a0;
import org.telegram.ui.Components.jn;
public final class a implements View.OnClickListener {
    public final int f2013a;
    public final j f2014b;

    public a(j jVar, int i9) {
        this.f2013a = i9;
        this.f2014b = jVar;
    }

    @Override
    public final void onClick(View view) {
        int i9 = this.f2013a;
        j jVar = this.f2014b;
        switch (i9) {
            case 0:
                a0 a0Var = jVar.f2041g0;
                if (a0Var != null) {
                    ArrayList arrayList = new ArrayList(jVar.f2040f0.keySet());
                    jn jnVar = (jn) a0Var.f18462b;
                    ArrayList arrayList2 = jnVar.L0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i10 = jnVar.H0;
                    if (i10 >= 0) {
                        jnVar.f29789r.m(i10);
                    }
                }
                jVar.dismiss();
                return;
            case 1:
                a0 a0Var2 = jVar.f2041g0;
                if (a0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(jVar.f2040f0.keySet());
                    jn jnVar2 = (jn) a0Var2.f18462b;
                    ArrayList arrayList4 = jnVar2.L0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i11 = jnVar2.H0;
                    if (i11 >= 0) {
                        jnVar2.f29789r.m(i11);
                    }
                }
                jVar.dismiss();
                return;
            case 2:
                HashMap hashMap = jVar.f2040f0;
                hashMap.clear();
                jVar.f2038d0.b();
                jVar.Z.N(true);
                jVar.f2035a0.c(hashMap.size(), true);
                return;
            case 3:
                jVar.R(view);
                return;
            default:
                int i12 = j.f2034n0;
                jVar.R(view);
                return;
        }
    }
}
