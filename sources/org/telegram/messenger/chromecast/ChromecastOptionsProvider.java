package org.telegram.messenger.chromecast;

import android.content.Context;
import com.google.android.gms.internal.cast.f;
import java.util.ArrayList;
import java.util.List;
import m5.i;
import n5.b;
import n5.e;
import o5.a;

public class ChromecastOptionsProvider implements e {

    public static final b f19976a;

    static {
        ArrayList arrayList = new ArrayList();
        i iVar = new i();
        ArrayList arrayList2 = new ArrayList();
        a aVar = b.E;
        if (aVar == null) {
            throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
        }
        f19976a = new b("CC1AD845", arrayList, false, iVar, true, aVar, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, b.C, b.D);
    }

    @Override
    public List<f> getAdditionalSessionProviders(Context context) {
        return null;
    }

    @Override
    public b getCastOptions(Context context) {
        return f19976a;
    }
}
