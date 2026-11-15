package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class dd {
    public String f23058a;
    public String f23059b;
    public String f23060c;
    public String d;
    public String f23061e;
    public String f23062f;
    public boolean f23063g;
    public int h;
    public int f23064i;
    public boolean f23065j;
    public int f23066k;

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
                obj.f23058a = split[0];
                obj.f23059b = split[1];
                obj.f23060c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23061e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23060c;
                }
                obj.f23062f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23063g = z10;
                }
                if (split.length >= 9) {
                    obj.f23064i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23066k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23066k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23061e);
                ddVar = obj;
                if (!isEmpty) {
                    obj.f23061e = obj.f23061e.replace("-", "_");
                    ddVar = obj;
                }
            }
        }
        return ddVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23060c;
        } else if (j()) {
            return "unofficial_" + this.f23060c;
        } else {
            return this.f23060c;
        }
    }

    public final String c() {
        return this.f23060c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23060c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23060c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23060c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23061e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23062f);
        return this.f23058a + "|" + this.f23059b + "|" + this.f23060c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23062f + "|" + (this.f23063g ? 1 : 0) + "|" + this.f23064i + "|" + this.f23066k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23061e) && !this.f23061e.equals(this.f23060c)) {
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
