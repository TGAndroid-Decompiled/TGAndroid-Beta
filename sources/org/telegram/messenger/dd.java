package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class dd {
    public String f23493a;
    public String f23494b;
    public String f23495c;
    public String d;
    public String f23496e;
    public String f23497f;
    public boolean f23498g;
    public int h;
    public int f23499i;
    public boolean f23500j;
    public int f23501k;

    public static dd a(String str) {
        String str2;
        String str3;
        dd ddVar = null;
        ddVar = null;
        ddVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.f23493a = split[0];
                obj.f23494b = split[1];
                obj.f23495c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23496e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23495c;
                }
                obj.f23497f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23498g = z10;
                }
                if (split.length >= 9) {
                    obj.f23499i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23501k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23501k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23496e);
                ddVar = obj;
                if (!isEmpty) {
                    obj.f23496e = obj.f23496e.replace("-", "_");
                    ddVar = obj;
                }
            }
        }
        return ddVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23495c;
        } else if (j()) {
            return "unofficial_" + this.f23495c;
        } else {
            return this.f23495c;
        }
    }

    public final String c() {
        return this.f23495c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23495c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23495c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23495c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23496e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23497f);
        return this.f23493a + "|" + this.f23494b + "|" + this.f23495c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23497f + "|" + (this.f23498g ? 1 : 0) + "|" + this.f23499i + "|" + this.f23501k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23496e) && !this.f23496e.equals(this.f23495c)) {
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
