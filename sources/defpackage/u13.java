package defpackage;

import android.os.Bundle;
public abstract class u13 {
    public final Bundle a;
    public final Bundle b;
    public final s13 c;

    public u13(Bundle bundle, Bundle bundle2, s13 s13Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = s13Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
