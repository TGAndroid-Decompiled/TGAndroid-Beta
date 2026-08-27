package ia;

import android.os.Build;
import java.util.ArrayList;

public final class a {

    public final String f10966a;

    public final String f10967b;

    public final String f10968c;
    public final r d;

    public final ArrayList f10969e;

    public a(String str, String versionName, String appBuildVersion, r rVar, ArrayList arrayList) {
        String deviceManufacturer = Build.MANUFACTURER;
        kotlin.jvm.internal.j.e(versionName, "versionName");
        kotlin.jvm.internal.j.e(appBuildVersion, "appBuildVersion");
        kotlin.jvm.internal.j.e(deviceManufacturer, "deviceManufacturer");
        this.f10966a = str;
        this.f10967b = versionName;
        this.f10968c = appBuildVersion;
        this.d = rVar;
        this.f10969e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f10966a.equals(aVar.f10966a) || !kotlin.jvm.internal.j.a(this.f10967b, aVar.f10967b) || !kotlin.jvm.internal.j.a(this.f10968c, aVar.f10968c)) {
            return false;
        }
        String str = Build.MANUFACTURER;
        return kotlin.jvm.internal.j.a(str, str) && this.d.equals(aVar.d) && this.f10969e.equals(aVar.f10969e);
    }

    public final int hashCode() {
        return this.f10969e.hashCode() + ((this.d.hashCode() + i0.a.g(i0.a.g(i0.a.g(this.f10966a.hashCode() * 31, 31, this.f10967b), 31, this.f10968c), 31, Build.MANUFACTURER)) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f10966a + ", versionName=" + this.f10967b + ", appBuildVersion=" + this.f10968c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.f10969e + ')';
    }
}
