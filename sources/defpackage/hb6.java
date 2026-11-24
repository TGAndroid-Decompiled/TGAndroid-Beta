package defpackage;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
public final class hb6 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    public static hb6 a(String str) {
        String str2;
        String str3;
        hb6 hb6Var = null;
        hb6Var = null;
        hb6Var = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z = false;
                obj.a = split[0];
                obj.b = split[1];
                obj.c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.c;
                }
                obj.f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z = true;
                    }
                    obj.g = z;
                }
                if (split.length >= 9) {
                    obj.i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.k = Utilities.z(split[9]).intValue();
                } else {
                    obj.k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.e);
                hb6Var = obj;
                if (!isEmpty) {
                    obj.e = obj.e.replace("-", "_");
                    hb6Var = obj;
                }
            }
        }
        return hb6Var;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.c;
        }
        boolean j = j();
        String str = this.c;
        if (j) {
            return b10.h("unofficial_", str);
        }
        return str;
    }

    public final String c() {
        return this.c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(a.h(), b10.j(new StringBuilder("unofficial_base_"), this.c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(a.h(), b10.j(new StringBuilder("remote_"), this.c, ".xml"));
        }
        if (j()) {
            return new File(a.h(), b10.j(new StringBuilder("unofficial_"), this.c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f);
        return this.a + "|" + this.b + "|" + this.c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f + "|" + (this.g ? 1 : 0) + "|" + this.i + "|" + this.k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.e) && !this.e.equals(this.c)) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (!TextUtils.isEmpty(this.d) && !i() && !j()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        return "remote".equals(this.d);
    }

    public final boolean j() {
        return "unofficial".equals(this.d);
    }
}
