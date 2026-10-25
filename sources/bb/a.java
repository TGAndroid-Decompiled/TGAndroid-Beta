package bb;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f3720a;
    public final String f3721b;
    public final String f3722c;
    public final q d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f3720a = str;
        this.f3721b = versionName;
        this.f3722c = appBuildVersion;
        this.d = qVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f3720a.equals(aVar.f3720a) && kotlin.jvm.internal.i.a(this.f3721b, aVar.f3721b) && kotlin.jvm.internal.i.a(this.f3722c, aVar.f3722c)) {
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
        int f7 = a1.g.f(a1.g.f(a1.g.f(this.f3720a.hashCode() * 31, 31, this.f3721b), 31, this.f3722c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + f7) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f3720a + ", versionName=" + this.f3721b + ", appBuildVersion=" + this.f3722c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
