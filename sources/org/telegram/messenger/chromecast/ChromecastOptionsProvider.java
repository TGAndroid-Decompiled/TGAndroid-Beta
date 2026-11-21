package org.telegram.messenger.chromecast;

import android.content.Context;
import f6.i;
import g6.b;
import g6.e;
import h6.a;
import java.util.ArrayList;
import java.util.List;
public class ChromecastOptionsProvider implements e {
    public static final b f23382a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.J;
        if (aVar != null) {
            f23382a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.H, b.I);
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
        return f23382a;
    }
}
