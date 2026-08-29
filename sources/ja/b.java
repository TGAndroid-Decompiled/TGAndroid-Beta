package ja;

import android.os.Build;
import j7.l1;
public final class b {
    public final String f11299a;
    public final a f11300b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f11299a = appId;
        this.f11300b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.j.a(this.f11299a, bVar.f11299a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.j.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.j.a(str2, str2) || !this.f11300b.equals(bVar.f11300b)) {
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
        int f9 = l1.f((((Build.MODEL.hashCode() + (this.f11299a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f11300b.hashCode() + ((p.LOG_ENVIRONMENT_PROD.hashCode() + f9) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f11299a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + p.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f11300b + ')';
    }
}
