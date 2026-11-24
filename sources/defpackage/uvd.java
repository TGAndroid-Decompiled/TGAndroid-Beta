package defpackage;

import android.content.res.Configuration;
import android.os.Build;
public abstract class uvd {
    public static lb6 a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new lb6(new ob6(ki0.i(configuration)));
        }
        return lb6.a(configuration.locale);
    }
}
