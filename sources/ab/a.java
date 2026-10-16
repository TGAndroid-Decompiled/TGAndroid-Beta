package ab;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f364a;
    public final String f365b;
    public final String f366c;
    public final q d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f364a = str;
        this.f365b = versionName;
        this.f366c = appBuildVersion;
        this.d = qVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f364a.equals(aVar.f364a) && kotlin.jvm.internal.i.a(this.f365b, aVar.f365b) && kotlin.jvm.internal.i.a(this.f366c, aVar.f366c)) {
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
        int g10 = a1.g.g(a1.g.g(a1.g.g(this.f364a.hashCode() * 31, 31, this.f365b), 31, this.f366c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + g10) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f364a + ", versionName=" + this.f365b + ", appBuildVersion=" + this.f366c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
