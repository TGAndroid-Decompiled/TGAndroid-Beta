package org.telegram.messenger.chromecast;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import q5.i;
import r5.b;
import r5.e;
import s5.a;
public class ChromecastOptionsProvider implements e {
    public static final b f16999a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.F;
        if (aVar != null) {
            f16999a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.D, b.E);
            return;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }

    @Override
    public List<com.google.android.gms.internal.cast.e> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override
    public b getCastOptions(Context context) {
        return f16999a;
    }
}
