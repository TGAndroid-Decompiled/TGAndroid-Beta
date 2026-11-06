package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class ed {
    public String f22181a;
    public String f22182b;
    public String f22183c;
    public String d;
    public String f22184e;
    public String f22185f;
    public boolean f22186g;
    public int h;
    public int f22187i;
    public boolean f22188j;
    public int f22189k;

    public static ed a(String str) {
        String str2;
        String str3;
        ed edVar = null;
        edVar = null;
        edVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z9 = false;
                obj.f22181a = split[0];
                obj.f22182b = split[1];
                obj.f22183c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f22184e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f22183c;
                }
                obj.f22185f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z9 = true;
                    }
                    obj.f22186g = z9;
                }
                if (split.length >= 9) {
                    obj.f22187i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f22189k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f22189k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f22184e);
                edVar = obj;
                if (!isEmpty) {
                    obj.f22184e = obj.f22184e.replace("-", "_");
                    edVar = obj;
                }
            }
        }
        return edVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f22183c;
        } else if (j()) {
            return "unofficial_" + this.f22183c;
        } else {
            return this.f22183c;
        }
    }

    public final String c() {
        return this.f22183c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f22183c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f22183c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f22183c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f22184e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f22185f);
        return this.f22181a + "|" + this.f22182b + "|" + this.f22183c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f22185f + "|" + (this.f22186g ? 1 : 0) + "|" + this.f22187i + "|" + this.f22189k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f22184e) && !this.f22184e.equals(this.f22183c)) {
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
