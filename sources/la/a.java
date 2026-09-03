package la;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f11840a;
    public final String f11841b;
    public final String f11842c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f11840a = str;
        this.f11841b = versionName;
        this.f11842c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f11840a.equals(aVar.f11840a) && kotlin.jvm.internal.j.a(this.f11841b, aVar.f11841b) && kotlin.jvm.internal.j.a(this.f11842c, aVar.f11842c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.e.equals(aVar.e)) {
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
        int e = kf.k0.e(kf.k0.e(kf.k0.e(this.f11840a.hashCode() * 31, 31, this.f11841b), 31, this.f11842c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + e) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f11840a + ", versionName=" + this.f11841b + ", appBuildVersion=" + this.f11842c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
