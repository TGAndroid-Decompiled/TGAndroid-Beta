package defpackage;

import android.content.res.Configuration;
import android.os.Build;
public abstract class hyd {
    public static qb6 a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new qb6(new tb6(lh0.i(configuration)));
        }
        return qb6.a(configuration.locale);
    }
}
