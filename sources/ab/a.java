package ab;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f362a;
    public final String f363b;
    public final String f364c;
    public final q d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f362a = str;
        this.f363b = versionName;
        this.f364c = appBuildVersion;
        this.d = qVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f362a.equals(aVar.f362a) && kotlin.jvm.internal.i.a(this.f363b, aVar.f363b) && kotlin.jvm.internal.i.a(this.f364c, aVar.f364c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.e.equals(aVar.e)) {
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
        int g10 = a1.g.g(a1.g.g(a1.g.g(this.f362a.hashCode() * 31, 31, this.f363b), 31, this.f364c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + g10) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f362a + ", versionName=" + this.f363b + ", appBuildVersion=" + this.f364c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
