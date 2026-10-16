package ab;

import android.os.Build;
public final class b {
    public final String f369a;
    public final a f370b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.f369a = appId;
        this.f370b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f369a, bVar.f369a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.i.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.i.a(str2, str2) || !this.f370b.equals(bVar.f370b)) {
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
        int g10 = a1.g.g((((Build.MODEL.hashCode() + (this.f369a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f370b.hashCode() + ((p.LOG_ENVIRONMENT_PROD.hashCode() + g10) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f369a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + p.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f370b + ')';
    }
}
