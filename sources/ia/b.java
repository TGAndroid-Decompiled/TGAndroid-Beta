package ia;

import android.os.Build;

public final class b {

    public final String f10973a;

    public final a f10974b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f10973a = appId;
        this.f10974b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!kotlin.jvm.internal.j.a(this.f10973a, bVar.f10973a)) {
            return false;
        }
        String str = Build.MODEL;
        if (!kotlin.jvm.internal.j.a(str, str)) {
            return false;
        }
        String str2 = Build.VERSION.RELEASE;
        return kotlin.jvm.internal.j.a(str2, str2) && this.f10974b.equals(bVar.f10974b);
    }

    public final int hashCode() {
        return this.f10974b.hashCode() + ((q.LOG_ENVIRONMENT_PROD.hashCode() + i0.a.g((((Build.MODEL.hashCode() + (this.f10973a.hashCode() * 31)) * 31) + 46672439) * 31, 31, Build.VERSION.RELEASE)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f10973a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=1.2.0, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + q.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.f10974b + ')';
    }
}
