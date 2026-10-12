package ab;

import android.os.Build;
public final class b {
    public final String f365a;
    public final a f366b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.f365a = appId;
        this.f366b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f365a, bVar.f365a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.i.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.i.a(str2, str2) || !this.f366b.equals(bVar.f366b)) {
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
        int g10 = a1.g.g((((Build.MODEL.hashCode() + (this.f365a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f366b.hashCode() + ((p.LOG_ENVIRONMENT_PROD.hashCode() + g10) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f365a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + p.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f366b + ')';
    }
}
