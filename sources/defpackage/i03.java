package defpackage;

import android.os.Bundle;
public abstract class i03 {
    public final Bundle a;
    public final Bundle b;
    public final i5 c;

    public i03(Bundle bundle, Bundle bundle2, i5 i5Var) {
        this.a = bundle;
        this.b = bundle2;
        this.c = i5Var;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
