package eh;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b20;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.zk0;
public final class c implements zk0 {
    public final c6 f6211a;
    public final Context f6212b;
    public final f f6213c;

    public c(Context context, f fVar, c6 c6Var) {
        this.f6213c = fVar;
        this.f6211a = c6Var;
        this.f6212b = context;
    }

    @Override
    public final void c(int i10, View view) {
        TLRPC.TL_help_country tL_help_country;
        f fVar = this.f6213c;
        b20 b20Var = fVar.f6222d0;
        HashMap hashMap = fVar.f6224f0;
        if (i10 == 0 || (tL_help_country = (TLRPC.TL_help_country) fVar.Z.G(i10 - 1).G) == null) {
            return;
        }
        boolean z10 = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            b20Var.c((j30) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i11 = fVar.f6227i0;
            if (size >= i11) {
                new tc(fVar.f6228j0, this.f6211a).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i11)))).j();
                return;
            }
            j30 j30Var = new j30(this.f6212b, tL_help_country);
            j30Var.setOnClickListener(new a(fVar, 4));
            b20Var.a(j30Var);
            hashMap.put(tL_help_country.iso2, j30Var);
            z10 = true;
        }
        if (view instanceof ig.c) {
            ((ig.c) view).c(z10, true);
        }
        fVar.Z.N(true);
        fVar.f6219a0.c(hashMap.size(), true);
    }
}
