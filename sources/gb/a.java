package gb;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f13623a;
    public final String f13624b;
    public final String f13625c;
    public final f0 d;
    public final ArrayList f13626e;

    public a(String str, String versionName, String appBuildVersion, f0 f0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13623a = str;
        this.f13624b = versionName;
        this.f13625c = appBuildVersion;
        this.d = f0Var;
        this.f13626e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13623a.equals(aVar.f13623a) && kotlin.jvm.internal.j.a(this.f13624b, aVar.f13624b) && kotlin.jvm.internal.j.a(this.f13625c, aVar.f13625c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13626e.equals(aVar.f13626e)) {
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
        int h = com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h(com.google.android.recaptcha.internal.a.h(this.f13623a.hashCode() * 31, 31, this.f13624b), 31, this.f13625c), 31, Build.MANUFACTURER);
        return this.f13626e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13623a + ", versionName=" + this.f13624b + ", appBuildVersion=" + this.f13625c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13626e + ')';
    }
}
