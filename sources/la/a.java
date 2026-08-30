package la;

import android.os.Build;
import java.util.ArrayList;
import kh.a2;
public final class a {
    public final String f11730a;
    public final String f11731b;
    public final String f11732c;
    public final p d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, p pVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f11730a = str;
        this.f11731b = versionName;
        this.f11732c = appBuildVersion;
        this.d = pVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f11730a.equals(aVar.f11730a) && kotlin.jvm.internal.j.a(this.f11731b, aVar.f11731b) && kotlin.jvm.internal.j.a(this.f11732c, aVar.f11732c)) {
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
        int e = a2.e(a2.e(a2.e(this.f11730a.hashCode() * 31, 31, this.f11731b), 31, this.f11732c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + e) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f11730a + ", versionName=" + this.f11731b + ", appBuildVersion=" + this.f11732c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
