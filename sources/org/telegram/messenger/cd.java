package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class cd {
    public String f23443a;
    public String f23444b;
    public String f23445c;
    public String d;
    public String f23446e;
    public String f23447f;
    public boolean f23448g;
    public int h;
    public int f23449i;
    public boolean f23450j;
    public int f23451k;

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
                obj.f23443a = split[0];
                obj.f23444b = split[1];
                obj.f23445c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f23446e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f23445c;
                }
                obj.f23447f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f23448g = z10;
                }
                if (split.length >= 9) {
                    obj.f23449i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f23451k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f23451k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f23446e);
                cdVar = obj;
                if (!isEmpty) {
                    obj.f23446e = obj.f23446e.replace("-", "_");
                    cdVar = obj;
                }
            }
        }
        return cdVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f23445c;
        } else if (j()) {
            return "unofficial_" + this.f23445c;
        } else {
            return this.f23445c;
        }
    }

    public final String c() {
        return this.f23445c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f23445c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f23445c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f23445c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f23446e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f23447f);
        return this.f23443a + "|" + this.f23444b + "|" + this.f23445c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f23447f + "|" + (this.f23448g ? 1 : 0) + "|" + this.f23449i + "|" + this.f23451k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f23446e) && !this.f23446e.equals(this.f23445c)) {
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
