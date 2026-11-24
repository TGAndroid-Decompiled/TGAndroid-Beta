package defpackage;

import android.os.Build;
import java.util.ArrayList;
public final class xk {
    public final String a;
    public final String b;
    public final String c;
    public final bn8 d;
    public final ArrayList e;

    public xk(String str, String str2, String str3, bn8 bn8Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bn8Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xk) {
                xk xkVar = (xk) obj;
                if (this.a.equals(xkVar.a) && rr5.a(this.b, xkVar.b) && rr5.a(this.c, xkVar.c)) {
                    String str = Build.MANUFACTURER;
                    if (!rr5.a(str, str) || !this.d.equals(xkVar.d) || !this.e.equals(xkVar.e)) {
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
        int j = ts2.j(ts2.j(ts2.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + j) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
