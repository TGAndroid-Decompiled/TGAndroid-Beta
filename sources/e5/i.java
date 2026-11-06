package e5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class i extends c {
    public final Pattern d;

    public i() {
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
        int i7;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (b10 && (i7 = Build.VERSION.SDK_INT) < 29) {
            boolean z9 = d5.b.f8184a;
            if (i7 >= 26) {
                packageInfo = z6.a.b();
            } else {
                try {
                    packageInfo = d5.b.b();
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
