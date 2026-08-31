package la;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f12137a;
    public final String f12138b;
    public final String f12139c;
    public final p d;
    public final ArrayList f12140e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f12137a = str;
        this.f12138b = versionName;
        this.f12139c = appBuildVersion;
        this.d = pVar;
        this.f12140e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f12137a.equals(aVar.f12137a) && kotlin.jvm.internal.j.a(this.f12138b, aVar.f12138b) && kotlin.jvm.internal.j.a(this.f12139c, aVar.f12139c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f12140e.equals(aVar.f12140e)) {
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
        int e6 = l.d.e(l.d.e(l.d.e(this.f12137a.hashCode() * 31, 31, this.f12138b), 31, this.f12139c), 31, Build.MANUFACTURER);
        return this.f12140e.hashCode() + ((this.d.hashCode() + e6) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f12137a + ", versionName=" + this.f12138b + ", appBuildVersion=" + this.f12139c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f12140e + ')';
    }
}
