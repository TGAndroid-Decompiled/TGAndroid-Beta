package bb;

import android.os.Build;
public final class b {
    public final String f3725a;
    public final a f3726b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.i.e(appId, "appId");
        kotlin.jvm.internal.i.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.i.e(osVersion, "osVersion");
        this.f3725a = appId;
        this.f3726b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.i.a(this.f3725a, bVar.f3725a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.i.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!kotlin.jvm.internal.i.a(str2, str2) || !this.f3726b.equals(bVar.f3726b)) {
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
        int f7 = a1.g.f((((Build.MODEL.hashCode() + (this.f3725a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE);
        return this.f3726b.hashCode() + ((p.LOG_ENVIRONMENT_PROD.hashCode() + f7) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f3725a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + p.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f3726b + ')';
    }
}
