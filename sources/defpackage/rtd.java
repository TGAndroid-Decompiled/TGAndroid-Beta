package defpackage;

import android.content.res.Configuration;
import android.os.Build;
public abstract class rtd {
    public static m96 a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new m96(new p96(kh0.i(configuration)));
        }
        return m96.a(configuration.locale);
    }
}
