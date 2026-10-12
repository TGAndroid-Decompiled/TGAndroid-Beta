package ab;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f360a;
    public final String f361b;
    public final String f362c;
    public final q d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f360a = str;
        this.f361b = versionName;
        this.f362c = appBuildVersion;
        this.d = qVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f360a.equals(aVar.f360a) && kotlin.jvm.internal.i.a(this.f361b, aVar.f361b) && kotlin.jvm.internal.i.a(this.f362c, aVar.f362c)) {
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
        int g10 = a1.g.g(a1.g.g(a1.g.g(this.f360a.hashCode() * 31, 31, this.f361b), 31, this.f362c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + g10) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f360a + ", versionName=" + this.f361b + ", appBuildVersion=" + this.f362c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
