package gb;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f13621a;
    public final String f13622b;
    public final String f13623c;
    public final f0 d;
    public final ArrayList f13624e;

    public a(String str, String versionName, String appBuildVersion, f0 f0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13621a = str;
        this.f13622b = versionName;
        this.f13623c = appBuildVersion;
        this.d = f0Var;
        this.f13624e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13621a.equals(aVar.f13621a) && kotlin.jvm.internal.j.a(this.f13622b, aVar.f13622b) && kotlin.jvm.internal.j.a(this.f13623c, aVar.f13623c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13624e.equals(aVar.f13624e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int h = com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h(this.f13621a.hashCode() * 31, 31, this.f13622b), 31, this.f13623c), 31, Build.MANUFACTURER);
        return this.f13624e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13621a + ", versionName=" + this.f13622b + ", appBuildVersion=" + this.f13623c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13624e + ')';
    }
}
