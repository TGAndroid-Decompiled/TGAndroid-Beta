package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13285a;
    public final String f13286b;
    public final String f13287c;
    public final e0 d;
    public final ArrayList f13288e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13285a = str;
        this.f13286b = versionName;
        this.f13287c = appBuildVersion;
        this.d = e0Var;
        this.f13288e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13285a.equals(aVar.f13285a) && kotlin.jvm.internal.j.a(this.f13286b, aVar.f13286b) && kotlin.jvm.internal.j.a(this.f13287c, aVar.f13287c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13288e.equals(aVar.f13288e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13285a.hashCode() * 31, 31, this.f13286b), 31, this.f13287c), 31, Build.MANUFACTURER);
        return this.f13288e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13285a + ", versionName=" + this.f13286b + ", appBuildVersion=" + this.f13287c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13288e + ')';
    }
}
