package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class ed {
    public String f22174a;
    public String f22175b;
    public String f22176c;
    public String d;
    public String f22177e;
    public String f22178f;
    public boolean f22179g;
    public int h;
    public int f22180i;
    public boolean f22181j;
    public int f22182k;

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
                obj.f22174a = split[0];
                obj.f22175b = split[1];
                obj.f22176c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.f22177e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f22176c;
                }
                obj.f22178f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z9 = true;
                    }
                    obj.f22179g = z9;
                }
                if (split.length >= 9) {
                    obj.f22180i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f22182k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f22182k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.f22177e);
                edVar = obj;
                if (!isEmpty) {
                    obj.f22177e = obj.f22177e.replace("-", "_");
                    edVar = obj;
                }
            }
        }
        return edVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f22176c;
        } else if (j()) {
            return "unofficial_" + this.f22176c;
        } else {
            return this.f22176c;
        }
    }

    public final String c() {
        return this.f22176c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_base_"), this.f22176c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("remote_"), this.f22176c, ".xml"));
        }
        if (j()) {
            return new File(t0.h(), a8.p0.s(new StringBuilder("unofficial_"), this.f22176c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.f22177e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f22178f);
        return this.f22174a + "|" + this.f22175b + "|" + this.f22176c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f22178f + "|" + (this.f22179g ? 1 : 0) + "|" + this.f22180i + "|" + this.f22182k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.f22177e) && !this.f22177e.equals(this.f22176c)) {
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
