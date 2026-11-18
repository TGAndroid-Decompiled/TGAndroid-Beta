package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class cd {
    public String f23331a;
    public String f23332b;
    public String f23333c;
    public String d;
    public String f23334e;
    public String f23335f;
    public boolean f23336g;
    public int h;
    public int f23337i;
    public boolean f23338j;
    public int f23339k;

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
                obj.f23331a = split[0];
                obj.f23332b = split[1];
                obj.f23333c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23334e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23333c;
                }
                obj.f23335f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23336g = z10;
                }
                if (split.length >= 9) {
                    obj.f23337i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23339k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23339k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23334e);
                cdVar = obj;
                if (!isEmpty) {
                    obj.f23334e = obj.f23334e.replace("-", "_");
                    cdVar = obj;
                }
            }
        }
        return cdVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23333c;
        } else if (j()) {
            return "unofficial_" + this.f23333c;
        } else {
            return this.f23333c;
        }
    }

    public final String c() {
        return this.f23333c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23333c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23333c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23333c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23334e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23335f);
        return this.f23331a + "|" + this.f23332b + "|" + this.f23333c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23335f + "|" + (this.f23336g ? 1 : 0) + "|" + this.f23337i + "|" + this.f23339k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23334e) && !this.f23334e.equals(this.f23333c)) {
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
