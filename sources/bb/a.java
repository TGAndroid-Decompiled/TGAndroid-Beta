package bb;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f2520a;
    public final String f2521b;
    public final String f2522c;
    public final q d;
    public final ArrayList e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f2520a = str;
        this.f2521b = versionName;
        this.f2522c = appBuildVersion;
        this.d = qVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f2520a.equals(aVar.f2520a) && kotlin.jvm.internal.i.a(this.f2521b, aVar.f2521b) && kotlin.jvm.internal.i.a(this.f2522c, aVar.f2522c)) {
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
        int f7 = a1.g.f(a1.g.f(a1.g.f(this.f2520a.hashCode() * 31, 31, this.f2521b), 31, this.f2522c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + f7) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f2520a + ", versionName=" + this.f2521b + ", appBuildVersion=" + this.f2522c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
