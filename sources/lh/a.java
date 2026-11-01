package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.jn;
public final class a implements View.OnClickListener {
    public final int f12005a;
    public final g f12006b;

    public a(g gVar, int i10) {
        this.f12005a = i10;
        this.f12006b = gVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f12005a;
        g gVar = this.f12006b;
        switch (i10) {
            case 0:
                l2.f fVar = gVar.f12019c2;
                if (fVar != null) {
                    ArrayList arrayList = new ArrayList(gVar.f12018b2.keySet());
                    jn jnVar = (jn) fVar.f11588b;
                    ArrayList arrayList2 = jnVar.P0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = jnVar.L0;
                    if (i11 >= 0) {
                        jnVar.f27509r.g(i11);
                    }
                }
                gVar.dismiss();
                return;
            case 1:
                l2.f fVar2 = gVar.f12019c2;
                if (fVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(gVar.f12018b2.keySet());
                    jn jnVar2 = (jn) fVar2.f11588b;
                    ArrayList arrayList4 = jnVar2.P0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = jnVar2.L0;
                    if (i12 >= 0) {
                        jnVar2.f27509r.g(i12);
                    }
                }
                gVar.dismiss();
                return;
            case 2:
                HashMap hashMap = gVar.f12018b2;
                hashMap.clear();
                gVar.Z1.b();
                gVar.V1.O(true);
                gVar.W1.c(hashMap.size(), true);
                return;
            case 3:
                gVar.g1(view);
                return;
            default:
                int i13 = g.f12017j2;
                gVar.g1(view);
                return;
        }
    }
}
