package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class fd {
    public String f22400a;
    public String f22401b;
    public String f22402c;
    public String d;
    public String f22403e;
    public String f22404f;
    public boolean f22405g;
    public int h;
    public int f22406i;
    public boolean f22407j;
    public int f22408k;

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
                obj.f22400a = split[0];
                obj.f22401b = split[1];
                obj.f22402c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f22403e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f22402c;
                }
                obj.f22404f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z9 = true;
                    }
                    obj.f22405g = z9;
                }
                if (split.length >= 9) {
                    obj.f22406i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f22408k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f22408k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f22403e);
                fdVar = obj;
                if (!isEmpty) {
                    obj.f22403e = obj.f22403e.replace("-", "_");
                    fdVar = obj;
                }
            }
        }
        return fdVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f22402c;
        } else if (j()) {
            return "unofficial_" + this.f22402c;
        } else {
            return this.f22402c;
        }
    }

    public final String c() {
        return this.f22402c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f22402c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f22402c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f22402c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f22403e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f22404f);
        return this.f22400a + "|" + this.f22401b + "|" + this.f22402c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f22404f + "|" + (this.f22405g ? 1 : 0) + "|" + this.f22406i + "|" + this.f22408k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f22403e) && !this.f22403e.equals(this.f22402c)) {
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
