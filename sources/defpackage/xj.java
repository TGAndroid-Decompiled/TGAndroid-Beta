package defpackage;

import android.os.Build;
import java.util.ArrayList;
public final class xj {
    public final String a;
    public final String b;
    public final String c;
    public final zk8 d;
    public final ArrayList e;

    public xj(String str, String str2, String str3, zk8 zk8Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zk8Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xj) {
                xj xjVar = (xj) obj;
                if (this.a.equals(xjVar.a) && rp5.a(this.b, xjVar.b) && rp5.a(this.c, xjVar.c)) {
                    String str = Build.MANUFACTURER;
                    if (!rp5.a(str, str) || !this.d.equals(xjVar.d) || !this.e.equals(xjVar.e)) {
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
        int j = ir2.j(ir2.j(ir2.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + j) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
