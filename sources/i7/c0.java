package i7;

import android.content.res.Configuration;
import android.os.Build;
public abstract class c0 {
    public static n0.c a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new n0.c(new n0.f(androidx.emoji2.text.v.f(configuration)));
        }
        return n0.c.a(configuration.locale);
    }
}
