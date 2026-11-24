package defpackage;

import android.os.Build;
public final class ss {
    public final String a;
    public final xk b;

    public ss(String str, xk xkVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = xkVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ss) {
                ss ssVar = (ss) obj;
                if (rr5.a(this.a, ssVar.a)) {
                    String str = Build.MODEL;
                    if (rr5.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!rr5.a(str2, str2) || !this.b.equals(ssVar.b)) {
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
        int j = ts2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.b.hashCode() + ((ud6.LOG_ENVIRONMENT_PROD.hashCode() + j) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + ud6.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
