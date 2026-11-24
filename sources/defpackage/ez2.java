package defpackage;

import android.content.Context;
import android.view.View;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class ez2 implements f59 {
    public final ylb a;
    public final Context b;
    public final hz2 c;

    public ez2(hz2 hz2Var, ylb ylbVar, Context context) {
        this.c = hz2Var;
        this.a = ylbVar;
        this.b = context;
    }

    @Override
    public final void g(int i, View view) {
        TLRPC.TL_help_country tL_help_country;
        hz2 hz2Var = this.c;
        sq4 sq4Var = hz2Var.c2;
        HashMap hashMap = hz2Var.e2;
        if (i == 0 || (tL_help_country = (TLRPC.TL_help_country) hz2Var.Y1.G(i - 1).H) == null) {
            return;
        }
        boolean z = false;
        if (hashMap.containsKey(tL_help_country.iso2)) {
            sq4Var.c((wc5) hashMap.remove(tL_help_country.iso2));
        } else {
            int size = hashMap.size();
            int i2 = hz2Var.h2;
            if (size >= i2) {
                b10.u(jb6.a0(null, null, 2131746845, Integer.valueOf(i2)), new c41(hz2Var.i2, this.a), 2131624068, 36);
                return;
            }
            wc5 wc5Var = new wc5(this.b, tL_help_country);
            wc5Var.setOnClickListener(new bz2(hz2Var, (byte) 4));
            sq4Var.a(wc5Var);
            hashMap.put(tL_help_country.iso2, wc5Var);
            z = true;
        }
        if (view instanceof d1a) {
            ((d1a) view).c(z, true);
        }
        hz2Var.Y1.O(true);
        hz2Var.Z1.c(hashMap.size(), true);
    }
}
