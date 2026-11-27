package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class azc extends eo {
    public final Pattern d;

    public azc() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override
    public final boolean b() {
        int i;
        PackageInfo packageInfo;
        boolean b = super.b();
        if (b && (i = Build.VERSION.SDK_INT) < 29) {
            boolean z = zyc.a;
            if (i >= 26) {
                packageInfo = qq5.c();
            } else {
                try {
                    packageInfo = zyc.b();
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
        return b;
    }
}
