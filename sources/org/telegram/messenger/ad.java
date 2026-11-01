package org.telegram.messenger;

import android.text.TextUtils;
import java.io.File;
public final class ad {
    public String f14591a;
    public String f14592b;
    public String f14593c;
    public String d;
    public String e;
    public String f14594f;
    public boolean f14595g;
    public int h;
    public int f14596i;
    public boolean f14597j;
    public int f14598k;

    public static ad a(String str) {
        String str2;
        String str3;
        ad adVar = null;
        adVar = null;
        adVar = null;
        if (str != null && str.length() != 0) {
            String[] split = str.split("\\|");
            if (split.length >= 4) {
                ?? obj = new Object();
                boolean z10 = false;
                obj.f14591a = split[0];
                obj.f14592b = split[1];
                obj.f14593c = split[2].toLowerCase();
                obj.d = split[3];
                if (split.length >= 5) {
                    obj.h = Utilities.z(split[4]).intValue();
                }
                if (split.length >= 6) {
                    str2 = split[5];
                } else {
                    str2 = "";
                }
                obj.e = str2;
                if (split.length >= 7) {
                    str3 = split[6];
                } else {
                    str3 = obj.f14593c;
                }
                obj.f14594f = str3;
                if (split.length >= 8) {
                    if (Utilities.z(split[7]).intValue() == 1) {
                        z10 = true;
                    }
                    obj.f14595g = z10;
                }
                if (split.length >= 9) {
                    obj.f14596i = Utilities.z(split[8]).intValue();
                }
                if (split.length >= 10) {
                    obj.f14598k = Utilities.z(split[9]).intValue();
                } else {
                    obj.f14598k = Integer.MAX_VALUE;
                }
                boolean isEmpty = TextUtils.isEmpty(obj.e);
                adVar = obj;
                if (!isEmpty) {
                    obj.e = obj.e.replace("-", "_");
                    adVar = obj;
                }
            }
        }
        return adVar;
    }

    public final String b() {
        if (this.d != null && !i() && !j()) {
            return "local_" + this.f14593c;
        } else if (j()) {
            return "unofficial_" + this.f14593c;
        } else {
            return this.f14593c;
        }
    }

    public final String c() {
        return this.f14593c.replace("_", "-");
    }

    public final File d() {
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_base_"), this.f14593c, ".xml"));
        }
        return null;
    }

    public final File e() {
        if (i()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("remote_"), this.f14593c, ".xml"));
        }
        if (j()) {
            return new File(w0.h(), a1.g.r(new StringBuilder("unofficial_"), this.f14593c, ".xml"));
        }
        if (!TextUtils.isEmpty(this.d)) {
            return new File(this.d);
        }
        return null;
    }

    public final String f() {
        String str = this.e;
        if (str == null) {
            str = "";
        }
        TextUtils.isEmpty(this.f14594f);
        return this.f14591a + "|" + this.f14592b + "|" + this.f14593c + "|" + this.d + "|" + this.h + "|" + str + "|" + this.f14594f + "|" + (this.f14595g ? 1 : 0) + "|" + this.f14596i + "|" + this.f14598k;
    }

    public final boolean g() {
        if (j() && !TextUtils.isEmpty(this.e) && !this.e.equals(this.f14593c)) {
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
