package gh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.qc;
public final class c implements il0 {
    public final f6 f6831a;
    public final Context f6832b;
    public final f f6833c;

    public c(Context context, f fVar, f6 f6Var) {
        this.f6833c = fVar;
        this.f6831a = f6Var;
        this.f6832b = context;
    }

    @Override
    public final void f(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f6833c;
        g20 g20Var = fVar.f6843e0;
        HashMap hashMap = fVar.f6845g0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f6839a0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z4 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            g20Var.c((n30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.f6848j0;
            if (size >= i11) {
                new qc(fVar.f6849k0, this.f6831a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            n30 n30Var = new n30(this.f6832b, tL_help_country);
            n30Var.setOnClickListener(new a(fVar, 4));
            g20Var.a(n30Var);
            hashMap.put(tL_help_country.iso2, n30Var);
            z4 = true;
        }
        if (view instanceof kg.c) {
            ((kg.c) view).c(z4, true);
        }
        fVar.f6839a0.N(true);
        fVar.f6840b0.c(hashMap.size(), true);
    }
}
