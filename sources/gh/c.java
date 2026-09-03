package gh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.hl0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.qc;
public final class c implements hl0 {
    public final f6 f6818a;
    public final Context f6819b;
    public final f f6820c;

    public c(Context context, f fVar, f6 f6Var) {
        this.f6820c = fVar;
        this.f6818a = f6Var;
        this.f6819b = context;
    }

    @Override
    public final void d(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f6820c;
        h20 h20Var = fVar.f6830e0;
        HashMap hashMap = fVar.f6832g0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.f6826a0.G(i10 - 1).G) == null) {
            return;
        }
        boolean z4 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            h20Var.c((o30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.f6835j0;
            if (size >= i11) {
                new qc(fVar.f6836k0, this.f6818a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            o30 o30Var = new o30(this.f6819b, tL_help_country);
            o30Var.setOnClickListener(new a(fVar, 4));
            h20Var.a(o30Var);
            hashMap.put(tL_help_country.iso2, o30Var);
            z4 = true;
        }
        if (view instanceof kg.c) {
            ((kg.c) view).c(z4, true);
        }
        fVar.f6826a0.N(true);
        fVar.f6827b0.c(hashMap.size(), true);
    }
}
