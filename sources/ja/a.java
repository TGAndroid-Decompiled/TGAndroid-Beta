package ja;

import android.os.Build;
import j7.l1;
import java.util.ArrayList;
public final class a {
    public final String f11293a;
    public final String f11294b;
    public final String f11295c;
    public final q d;
    public final ArrayList f11296e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f11293a = str;
        this.f11294b = versionName;
        this.f11295c = appBuildVersion;
        this.d = qVar;
        this.f11296e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f11293a.equals(aVar.f11293a) && kotlin.jvm.internal.j.a(this.f11294b, aVar.f11294b) && kotlin.jvm.internal.j.a(this.f11295c, aVar.f11295c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f11296e.equals(aVar.f11296e)) {
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
        int f9 = l1.f(l1.f(l1.f(this.f11293a.hashCode() * 31, 31, this.f11294b), 31, this.f11295c), 31, Build.MANUFACTURER);
        return this.f11296e.hashCode() + ((this.d.hashCode() + f9) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f11293a + ", versionName=" + this.f11294b + ", appBuildVersion=" + this.f11295c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f11296e + ')';
    }
}
