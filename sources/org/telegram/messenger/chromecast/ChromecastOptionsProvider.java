package org.telegram.messenger.chromecast;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
public class ChromecastOptionsProvider {
    public static final le1 a;

    static {
        ArrayList arrayList = new ArrayList();
        b26 b26Var = new b26();
        ArrayList arrayList2 = new ArrayList();
        je1 je1Var = le1.J;
        if (je1Var != null) {
            a = new le1("CC1AD845", arrayList, false, b26Var, true, je1Var, true, 0.05000000074505806d, false, false, false, arrayList2, true, false, le1.H, le1.I);
        } else {
            gxc.d("use Optional.orNull() instead of Optional.or(null)");
        }
    }

    public List<g9d> getAdditionalSessionProviders(Context context) {
        return null;
    }

    public le1 getCastOptions(Context context) {
        return a;
    }
}
