package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class fd {
    public String f22396a;
    public String f22397b;
    public String f22398c;
    public String d;
    public String f22399e;
    public String f22400f;
    public boolean f22401g;
    public int h;
    public int f22402i;
    public boolean f22403j;
    public int f22404k;

    public static fd a(String str) {
        String str2;
        String str3;
        fd fdVar = null;
        fdVar = null;
        fdVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z9 = false;
                obj.f22396a = split[0];
                obj.f22397b = split[1];
                obj.f22398c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f22399e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f22398c;
                }
                obj.f22400f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z9 = true;
                    }
                    obj.f22401g = z9;
                }
                if (split.length >= 9) {
                    obj.f22402i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f22404k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f22404k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f22399e);
                fdVar = obj;
                if (!isEmpty) {
                    obj.f22399e = obj.f22399e.replace("-", "_");
                    fdVar = obj;
                }
            }
        }
        return fdVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f22398c;
        } else if (j()) {
            return "unofficial_" + this.f22398c;
        } else {
            return this.f22398c;
        }
    }

    public final String c() {
        return this.f22398c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f22398c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f22398c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f22398c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f22399e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f22400f);
        return this.f22396a + "|" + this.f22397b + "|" + this.f22398c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f22400f + "|" + (this.f22401g ? 1 : 0) + "|" + this.f22402i + "|" + this.f22404k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f22399e) && !this.f22399e.equals(this.f22398c)) {
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
