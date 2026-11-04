package db;

import android.os.Build;
public final class b {
    public final String f8604a;
    public final a f8605b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        x xVar = x.f8752b;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f8604a = appId;
        this.f8605b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.j.a(this.f8604a, bVar.f8604a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.j.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (kotlin.jvm.internal.j.a(str2, str2)) {
                            x xVar = x.f8752b;
                            if (!this.f8605b.equals(bVar.f8605b)) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int g7 = com.google.android.recaptcha.internal.a.g((((Build.MODEL.hashCode() + (this.f8604a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.f8605b.hashCode() + ((x.f8752b.hashCode() + g7) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f8604a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + x.f8752b + ", androidAppInfo=" + this.f8605b + ')';
    }
}
