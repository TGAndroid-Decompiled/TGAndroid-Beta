package ha;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f10258a;
    public final String f10259b;
    public final String f10260c;
    public final q d;
    public final ArrayList f10261e;

    public a(String str, String versionName, String appBuildVersion, q qVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.i.e(versionName, "versionName");
        kotlin.jvm.internal.i.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.i.e(deviceManufacturer, "deviceManufacturer");
        this.f10258a = str;
        this.f10259b = versionName;
        this.f10260c = appBuildVersion;
        this.d = qVar;
        this.f10261e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f10258a.equals(aVar.f10258a) && kotlin.jvm.internal.i.a(this.f10259b, aVar.f10259b) && kotlin.jvm.internal.i.a(this.f10260c, aVar.f10260c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.i.a(str, str) || !this.d.equals(aVar.d) || !this.f10261e.equals(aVar.f10261e)) {
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
        int f10 = j3.r0.f(j3.r0.f(j3.r0.f(this.f10258a.hashCode() * 31, 31, this.f10259b), 31, this.f10260c), 31, Build.MANUFACTURER);
        return this.f10261e.hashCode() + ((this.d.hashCode() + f10) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f10258a + ", versionName=" + this.f10259b + ", appBuildVersion=" + this.f10260c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f10261e + ')';
    }
}
