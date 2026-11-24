package org.telegram.messenger.chromecast;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
public class ChromecastOptionsProvider {
    public static final dd1 a;

    static {
        ArrayList arrayList = new ArrayList();
        b06 b06Var = new b06();
        ArrayList arrayList2 = new ArrayList();
        bd1 bd1Var = dd1.J;
        if (bd1Var != null) {
            a = new dd1("CC1AD845", arrayList, false, b06Var, true, bd1Var, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, dd1.H, dd1.I);
        } else {
            fvc.f("use Optional.orNull() instead of Optional.or(null)");
        }
    }

    public List<e7d> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public dd1 getCastOptions(Context context) {
        return a;
    }
}
