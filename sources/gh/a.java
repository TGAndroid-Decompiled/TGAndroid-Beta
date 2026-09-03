package gh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.pn;
public final class a implements View.OnClickListener {
    public final int f6815a;
    public final f f6816b;

    public a(f fVar, int i10) {
        this.f6815a = i10;
        this.f6816b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f6815a;
        f fVar = this.f6816b;
        switch (i10) {
            case 0:
                o3.c cVar = fVar.f6833h0;
                if (cVar != null) {
                    ArrayList arrayList = new ArrayList(fVar.f6832g0.keySet());
                    pn pnVar = (pn) cVar.f16228b;
                    ArrayList arrayList2 = pnVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = pnVar.I0;
                    if (i11 >= 0) {
                        pnVar.f27958r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                o3.c cVar2 = fVar.f6833h0;
                if (cVar2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f6832g0.keySet());
                    pn pnVar2 = (pn) cVar2.f16228b;
                    ArrayList arrayList4 = pnVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = pnVar2.I0;
                    if (i12 >= 0) {
                        pnVar2.f27958r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f6832g0;
                hashMap.clear();
                fVar.f6830e0.b();
                fVar.f6826a0.N(true);
                fVar.f6827b0.c(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f6825o0;
                fVar.S(view);
                return;
        }
    }
}
