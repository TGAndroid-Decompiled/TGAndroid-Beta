package org.telegram.messenger.chromecast;

import android.content.Context;
import d6.i;
import e6.b;
import e6.e;
import f6.a;
import java.util.ArrayList;
import java.util.List;
public class ChromecastOptionsProvider implements e {
    public static final b f19834a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.I;
        if (aVar != null) {
            f19834a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.G, b.H);
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
        return f19834a;
    }
}
