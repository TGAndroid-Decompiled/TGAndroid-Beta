package gb;

import android.os.Build;
public final class b {
    public final String f13629a;
    public final a f13630b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        y yVar = y.f13784b;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f13629a = appId;
        this.f13630b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.j.a(this.f13629a, bVar.f13629a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.j.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (kotlin.jvm.internal.j.a(str2, str2)) {
                            y yVar = y.f13784b;
                            if (!this.f13630b.equals(bVar.f13630b)) {
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
        int h = com.google.android.recaptcha.internal.a.h((((Build.MODEL.hashCode() + (this.f13629a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.f13630b.hashCode() + ((y.f13784b.hashCode() + h) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f13629a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + y.f13784b + ", androidAppInfo=" + this.f13630b + ')';
    }
}
