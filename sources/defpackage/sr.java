package defpackage;

import android.os.Build;
public final class sr {
    public final String a;
    public final xj b;

    public sr(String str, xj xjVar) {
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = xjVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sr) {
                sr srVar = (sr) obj;
                if (rp5.a(this.a, srVar.a)) {
                    String str = Build.MODEL;
                    if (rp5.a(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!rp5.a(str2, str2) || !this.b.equals(srVar.b)) {
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
        int j = ir2.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517567) * 31, 31, Build.VERSION.RELEASE);
        return this.b.hashCode() + ((vb6.LOG_ENVIRONMENT_PROD.hashCode() + j) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.8, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + vb6.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
