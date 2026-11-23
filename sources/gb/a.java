package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
public final class a {
    public final String f13314a;
    public final String f13315b;
    public final String f13316c;
    public final e0 d;
    public final ArrayList f13317e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f13314a = str;
        this.f13315b = versionName;
        this.f13316c = appBuildVersion;
        this.d = e0Var;
        this.f13317e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f13314a.equals(aVar.f13314a) && kotlin.jvm.internal.j.a(this.f13315b, aVar.f13315b) && kotlin.jvm.internal.j.a(this.f13316c, aVar.f13316c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f13317e.equals(aVar.f13317e)) {
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
        int h = e2.h(e2.h(e2.h(this.f13314a.hashCode() * 31, 31, this.f13315b), 31, this.f13316c), 31, Build.MANUFACTURER);
        return this.f13317e.hashCode() + ((this.d.hashCode() + h) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f13314a + ", versionName=" + this.f13315b + ", appBuildVersion=" + this.f13316c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f13317e + ')';
    }
}
