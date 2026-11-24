package defpackage;

import android.os.Bundle;
import java.util.Set;
public abstract class r13 {
    public final String a;
    public final Bundle b;
    public final Bundle c;
    public final Set d;

    public r13(String str, Bundle bundle, Bundle bundle2, boolean z, Set set) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z);
        bundle.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        bundle2.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
