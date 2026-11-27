package defpackage;

import android.os.Build;
public final class tr {
    public final String a;
    public final yj b;

    public tr(String str, yj yjVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = yjVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof tr) {
                tr trVar = (tr) obj;
                if (ur5.a(this.a, trVar.a)) {
                    String str = Build.MODEL;
                    if (ur5.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!ur5.a(str2, str2) || !this.b.equals(trVar.b)) {
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
        int j = bs2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.b.hashCode() + ((zd6.LOG_ENVIRONMENT_PROD.hashCode() + j) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + zd6.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
