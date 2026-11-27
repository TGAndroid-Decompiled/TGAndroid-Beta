package defpackage;

import android.os.Bundle;
public abstract class b13 {
    public final Bundle a;
    public final Bundle b;
    public final j5 c;

    public b13(Bundle bundle, Bundle bundle2, j5 j5Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = j5Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
