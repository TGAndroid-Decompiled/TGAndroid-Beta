package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class dd {
    public String f23066a;
    public String f23067b;
    public String f23068c;
    public String d;
    public String f23069e;
    public String f23070f;
    public boolean f23071g;
    public int h;
    public int f23072i;
    public boolean f23073j;
    public int f23074k;

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
                obj.f23066a = split[0];
                obj.f23067b = split[1];
                obj.f23068c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23069e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23068c;
                }
                obj.f23070f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23071g = z10;
                }
                if (split.length >= 9) {
                    obj.f23072i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23074k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23074k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23069e);
                ddVar = obj;
                if (!isEmpty) {
                    obj.f23069e = obj.f23069e.replace("-", "_");
                    ddVar = obj;
                }
            }
        }
        return ddVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23068c;
        } else if (j()) {
            return "unofficial_" + this.f23068c;
        } else {
            return this.f23068c;
        }
    }

    public final String c() {
        return this.f23068c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23068c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23068c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23068c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23069e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23070f);
        return this.f23066a + "|" + this.f23067b + "|" + this.f23068c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23070f + "|" + (this.f23071g ? 1 : 0) + "|" + this.f23072i + "|" + this.f23074k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23069e) && !this.f23069e.equals(this.f23068c)) {
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
