package ch;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.t10;

public final class d implements pk0 {

    public final c6 f2906a;

    public final Context f2907b;

    public final h f2908c;

    public d(Context context, h hVar, c6 c6Var) {
        this.f2908c = hVar;
        this.f2906a = c6Var;
        this.f2907b = context;
    }

    @Override
    public final void a(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        h hVar = this.f2908c;
        t10 t10Var = hVar.f2919d0;
        HashMap map = hVar.f2921f0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) hVar.Z.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (map.containsKey(tL_help_country.iso2)) {
            t10Var.c((a30) map.remove(tL_help_country.iso2));
        } else {
            int size = map.size();
            int i11 = hVar.f2924i0;
            if (size >= i11) {
                new mc(hVar.f2925j0, this.f2906a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            a30 a30Var = new a30(this.f2907b, tL_help_country);
            a30Var.setOnClickListener(new a(hVar, 4));
            t10Var.a(a30Var);
            map.put(tL_help_country.iso2, a30Var);
            z10 = true;
        }
        if (view instanceof gg.c) {
            ((gg.c) view).c(z10, true);
        }
        hVar.Z.N(true);
        hVar.f2916a0.c(map.size(), true);
    }
}
