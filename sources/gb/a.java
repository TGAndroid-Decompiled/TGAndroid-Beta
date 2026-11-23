package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13275a;
    public final String f13276b;
    public final String f13277c;
    public final f0 d;
    public final ArrayList f13278e;

    public a(String str, String versionName, String appBuildVersion, f0 f0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13275a = str;
        this.f13276b = versionName;
        this.f13277c = appBuildVersion;
        this.d = f0Var;
        this.f13278e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13275a.equals(aVar.f13275a) && kotlin.jvm.internal.j.a(this.f13276b, aVar.f13276b) && kotlin.jvm.internal.j.a(this.f13277c, aVar.f13277c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13278e.equals(aVar.f13278e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13275a.hashCode() * 31, 31, this.f13276b), 31, this.f13277c), 31, Build.MANUFACTURER);
        return this.f13278e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13275a + ", versionName=" + this.f13276b + ", appBuildVersion=" + this.f13277c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13278e + ')';
    }
}
