package d5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class j extends c {
    public final Pattern d;

    public j() {
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
        int i3;
        PackageInfo packageInfo;
        boolean b10 = super.b();
        if (b10 && (i3 = Build.VERSION.SDK_INT) < 29) {
            boolean z10 = c5.a.f4210a;
            if (i3 >= 26) {
                packageInfo = y6.a.a();
            } else {
                try {
                    packageInfo = c5.a.b();
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
