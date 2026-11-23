package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13277a;
    public final String f13278b;
    public final String f13279c;
    public final e0 d;
    public final ArrayList f13280e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13277a = str;
        this.f13278b = versionName;
        this.f13279c = appBuildVersion;
        this.d = e0Var;
        this.f13280e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13277a.equals(aVar.f13277a) && kotlin.jvm.internal.j.a(this.f13278b, aVar.f13278b) && kotlin.jvm.internal.j.a(this.f13279c, aVar.f13279c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13280e.equals(aVar.f13280e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13277a.hashCode() * 31, 31, this.f13278b), 31, this.f13279c), 31, Build.MANUFACTURER);
        return this.f13280e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13277a + ", versionName=" + this.f13278b + ", appBuildVersion=" + this.f13279c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13280e + ')';
    }
}
