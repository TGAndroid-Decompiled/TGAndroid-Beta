package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13311a;
    public final String f13312b;
    public final String f13313c;
    public final e0 d;
    public final ArrayList f13314e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13311a = str;
        this.f13312b = versionName;
        this.f13313c = appBuildVersion;
        this.d = e0Var;
        this.f13314e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13311a.equals(aVar.f13311a) && kotlin.jvm.internal.j.a(this.f13312b, aVar.f13312b) && kotlin.jvm.internal.j.a(this.f13313c, aVar.f13313c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13314e.equals(aVar.f13314e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13311a.hashCode() * 31, 31, this.f13312b), 31, this.f13313c), 31, Build.MANUFACTURER);
        return this.f13314e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13311a + ", versionName=" + this.f13312b + ", appBuildVersion=" + this.f13313c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13314e + ')';
    }
}
