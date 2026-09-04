package b5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class k extends c {
    public final Pattern d;

    public k() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override
    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        int i10;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (b10 && (i10 = Build.VERSION.SDK_INT) < 29) {
            boolean z10 = a5.c.f287a;
            if (i10 >= 26) {
                packageInfo = w6.a.a();
            } else {
                try {
                    packageInfo = a5.c.b();
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    packageInfo = null;
                }
            }
            if (packageInfo == null) {
                return false;
            }
            Matcher matcher = this.d.matcher(packageInfo.versionName);
            if (!matcher.find() || Integer.parseInt(packageInfo.versionName.substring(matcher.start(), matcher.end())) < 105) {
                return false;
            }
            return true;
        }
        return b10;
    }
}
