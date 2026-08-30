package la;

import android.os.Build;
import kh.a2;
public final class b {
    public final String f11736a;
    public final a f11737b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f11736a = appId;
        this.f11737b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.j.a(this.f11736a, bVar.f11736a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.j.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.j.a(str2, str2) || !this.f11737b.equals(bVar.f11737b)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = a2.e((((Build.MODEL.hashCode() + (this.f11736a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f11737b.hashCode() + ((o.LOG_ENVIRONMENT_PROD.hashCode() + e) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f11736a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + o.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f11737b + ')';
    }
}
