package bh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.q10;
import org.telegram.ui.Components.w20;
public final class d implements mk0 {
    public final b6 f2018a;
    public final Context f2019b;
    public final j f2020c;

    public d(Context context, j jVar, b6 b6Var) {
        this.f2020c = jVar;
        this.f2018a = b6Var;
        this.f2019b = context;
    }

    @Override
    public final void a(int i9, View view) {
        TLRPC.TL_help_country tL_help_country;
        j jVar = this.f2020c;
        q10 q10Var = jVar.f2038d0;
        HashMap hashMap = jVar.f2040f0;
        if (i9 == 0 || (tL_help_country = (TLRPC.TL_help_country) jVar.Z.G(i9 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            q10Var.c((w20) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i10 = jVar.f2043i0;
            if (size >= i10) {
                new oc(jVar.f2044j0, this.f2018a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i10)))).j();
                return;
            }
            w20 w20Var = new w20(this.f2019b, tL_help_country);
            w20Var.setOnClickListener(new a(jVar, 4));
            q10Var.a(w20Var);
            hashMap.put(tL_help_country.iso2, w20Var);
            z10 = true;
        }
        if (view instanceof fg.c) {
            ((fg.c) view).c(z10, true);
        }
        jVar.Z.N(true);
        jVar.f2035a0.c(hashMap.size(), true);
    }
}
