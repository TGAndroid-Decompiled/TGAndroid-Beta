package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13282a;
    public final String f13283b;
    public final String f13284c;
    public final e0 d;
    public final ArrayList f13285e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13282a = str;
        this.f13283b = versionName;
        this.f13284c = appBuildVersion;
        this.d = e0Var;
        this.f13285e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13282a.equals(aVar.f13282a) && kotlin.jvm.internal.j.a(this.f13283b, aVar.f13283b) && kotlin.jvm.internal.j.a(this.f13284c, aVar.f13284c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13285e.equals(aVar.f13285e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13282a.hashCode() * 31, 31, this.f13283b), 31, this.f13284c), 31, Build.MANUFACTURER);
        return this.f13285e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13282a + ", versionName=" + this.f13283b + ", appBuildVersion=" + this.f13284c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13285e + ')';
    }
}
