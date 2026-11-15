package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f12968a;
    public final String f12969b;
    public final String f12970c;
    public final e0 d;
    public final ArrayList f12971e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f12968a = str;
        this.f12969b = versionName;
        this.f12970c = appBuildVersion;
        this.d = e0Var;
        this.f12971e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f12968a.equals(aVar.f12968a) && kotlin.jvm.internal.j.a(this.f12969b, aVar.f12969b) && kotlin.jvm.internal.j.a(this.f12970c, aVar.f12970c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f12971e.equals(aVar.f12971e)) {
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
        int h = e2.h(e2.h(e2.h(this.f12968a.hashCode() * 31, 31, this.f12969b), 31, this.f12970c), 31, Build.MANUFACTURER);
        return this.f12971e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f12968a + ", versionName=" + this.f12969b + ", appBuildVersion=" + this.f12970c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f12971e + ')';
    }
}
