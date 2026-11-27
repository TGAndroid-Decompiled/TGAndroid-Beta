package defpackage;

import android.os.Build;
import java.util.ArrayList;
public final class yj {
    public final String a;
    public final String b;
    public final String c;
    public final mo8 d;
    public final ArrayList e;

    public yj(String str, String str2, String str3, mo8 mo8Var, ArrayList arrayList) {
        String str4 = Build.MANUFACTURER;
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mo8Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof yj) {
                yj yjVar = (yj) obj;
                if (this.a.equals(yjVar.a) && ur5.a(this.b, yjVar.b) && ur5.a(this.c, yjVar.c)) {
                    String str = Build.MANUFACTURER;
                    if (!ur5.a(str, str) || !this.d.equals(yjVar.d) || !this.e.equals(yjVar.e)) {
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
        int j = bs2.j(bs2.j(bs2.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + j) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
