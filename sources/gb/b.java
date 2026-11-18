package gb;

import android.os.Build;
import com.google.android.gms.internal.vision.e2;
public final class b {
    public final String f13289a;
    public final a f13290b;

    public b(String appId, a aVar) {
        String deviceModel = Build.MODEL;
        String osVersion = Build.VERSION.RELEASE;
        y yVar = y.f13437b;
        kotlin.jvm.internal.j.e(appId, "appId");
        kotlin.jvm.internal.j.e(deviceModel, "deviceModel");
        kotlin.jvm.internal.j.e(osVersion, "osVersion");
        this.f13289a = appId;
        this.f13290b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (kotlin.jvm.internal.j.a(this.f13289a, bVar.f13289a)) {
                    String str = Build.MODEL;
                    if (kotlin.jvm.internal.j.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (kotlin.jvm.internal.j.a(str2, str2)) {
                            y yVar = y.f13437b;
                            if (!this.f13290b.equals(bVar.f13290b)) {
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
        int h = e2.h((((Build.MODEL.hashCode() + (this.f13289a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.f13290b.hashCode() + ((y.f13437b.hashCode() + h) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f13289a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + y.f13437b + ", androidAppInfo=" + this.f13290b + ')';
    }
}
