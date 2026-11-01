package lh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.l10;
import org.telegram.ui.Components.s20;
public final class d implements hk0 {
    public final p6 f12010a;
    public final Context f12011b;
    public final g f12012c;

    public d(Context context, g gVar, p6 p6Var) {
        this.f12012c = gVar;
        this.f12010a = p6Var;
        this.f12011b = context;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        g gVar = this.f12012c;
        l10 l10Var = gVar.Z1;
        HashMap hashMap = gVar.f12018b2;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) gVar.V1.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            l10Var.c((s20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = gVar.f12021e2;
            if (size >= i11) {
                a30.s(dd.a0(null, null, 2131747127, Integer.valueOf(i11)), new cc(gVar.f12022f2, this.f12010a), 2131624066, 36);
                return;
            }
            s20 s20Var = new s20(this.f12011b, tL_help_country);
            s20Var.setOnClickListener(new a(gVar, 4));
            l10Var.a(s20Var);
            hashMap.put(tL_help_country.iso2, s20Var);
            z10 = true;
        }
        if (view instanceof qg.b) {
            ((qg.b) view).c(z10, true);
        }
        gVar.V1.O(true);
        gVar.W1.c(hashMap.size(), true);
    }
}
