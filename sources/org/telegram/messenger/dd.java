package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class dd {
    public String f23529a;
    public String f23530b;
    public String f23531c;
    public String d;
    public String f23532e;
    public String f23533f;
    public boolean f23534g;
    public int h;
    public int f23535i;
    public boolean f23536j;
    public int f23537k;

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
                obj.f23529a = split[0];
                obj.f23530b = split[1];
                obj.f23531c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23532e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23531c;
                }
                obj.f23533f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23534g = z10;
                }
                if (split.length >= 9) {
                    obj.f23535i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23537k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23537k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23532e);
                ddVar = obj;
                if (!isEmpty) {
                    obj.f23532e = obj.f23532e.replace("-", "_");
                    ddVar = obj;
                }
            }
        }
        return ddVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23531c;
        } else if (j()) {
            return "unofficial_" + this.f23531c;
        } else {
            return this.f23531c;
        }
    }

    public final String c() {
        return this.f23531c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23531c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23531c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23531c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23532e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23533f);
        return this.f23529a + "|" + this.f23530b + "|" + this.f23531c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23533f + "|" + (this.f23534g ? 1 : 0) + "|" + this.f23535i + "|" + this.f23537k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23532e) && !this.f23532e.equals(this.f23531c)) {
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
