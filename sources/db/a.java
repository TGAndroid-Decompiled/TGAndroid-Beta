package db;

import android.os.Build;
import java.util.ArrayList;
public final class a {
    public final String f8595a;
    public final String f8596b;
    public final String f8597c;
    public final e0 d;
    public final ArrayList f8598e;

    public a(String str, String versionName, String appBuildVersion, e0 e0Var, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f8595a = str;
        this.f8596b = versionName;
        this.f8597c = appBuildVersion;
        this.d = e0Var;
        this.f8598e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f8595a.equals(aVar.f8595a) && kotlin.jvm.internal.j.a(this.f8596b, aVar.f8596b) && kotlin.jvm.internal.j.a(this.f8597c, aVar.f8597c)) {
                    String str = Build.MANUFACTURER;
                    if (!kotlin.jvm.internal.j.a(str, str) || !this.d.equals(aVar.d) || !this.f8598e.equals(aVar.f8598e)) {
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
        int g7 = com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g(com.google.android.recaptcha.internal.a.g(this.f8595a.hashCode() * 31, 31, this.f8596b), 31, this.f8597c), 31, Build.MANUFACTURER);
        return this.f8598e.hashCode() + ((this.d.hashCode() + g7) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f8595a + ", versionName=" + this.f8596b + ", appBuildVersion=" + this.f8597c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f8598e + ')';
    }
}
