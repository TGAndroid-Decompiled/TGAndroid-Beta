package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class cd {
    public String f23328a;
    public String f23329b;
    public String f23330c;
    public String d;
    public String f23331e;
    public String f23332f;
    public boolean f23333g;
    public int h;
    public int f23334i;
    public boolean f23335j;
    public int f23336k;

    public static cd a(String str) {
        String str2;
        String str3;
        cd cdVar = null;
        cdVar = null;
        cdVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.f23328a = split[0];
                obj.f23329b = split[1];
                obj.f23330c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23331e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23330c;
                }
                obj.f23332f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23333g = z10;
                }
                if (split.length >= 9) {
                    obj.f23334i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23336k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23336k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23331e);
                cdVar = obj;
                if (!isEmpty) {
                    obj.f23331e = obj.f23331e.replace("-", "_");
                    cdVar = obj;
                }
            }
        }
        return cdVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23330c;
        } else if (j()) {
            return "unofficial_" + this.f23330c;
        } else {
            return this.f23330c;
        }
    }

    public final String c() {
        return this.f23330c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23330c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23330c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23330c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23331e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23332f);
        return this.f23328a + "|" + this.f23329b + "|" + this.f23330c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23332f + "|" + (this.f23333g ? 1 : 0) + "|" + this.f23334i + "|" + this.f23336k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23331e) && !this.f23331e.equals(this.f23330c)) {
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
