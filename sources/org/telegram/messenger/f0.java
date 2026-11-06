package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
public final class f0 {
    public int f22318c;
    public final ArrayList f22316a = new ArrayList();
    public String f22317b = "";
    public boolean d = true;

    public final String a(boolean z9) {
        int indexOf = this.f22317b.indexOf(58);
        if (indexOf >= 0) {
            String substring = this.f22317b.substring(0, indexOf);
            if (this.f22318c == 20) {
                String[] split = substring.substring(2).split(";");
                if (z9) {
                    return split[0];
                }
                if (split.length > 1) {
                    return split[split.length - 1];
                }
                return "";
            }
            String[] split2 = substring.split(";");
            for (int i7 = 0; i7 < split2.length; i7++) {
                if (split2[i7].indexOf(61) < 0) {
                    substring = split2[i7];
                }
            }
            return substring;
        }
        return "";
    }

    public final String[] b() {
        byte[] H;
        int indexOf = this.f22317b.indexOf(58);
        if (indexOf < 0) {
            return new String[0];
        }
        String substring = this.f22317b.substring(0, indexOf);
        String substring2 = this.f22317b.substring(indexOf + 1);
        String str = null;
        String str2 = "UTF-8";
        for (String str3 : substring.split(";")) {
            String[] split = str3.split("=");
            if (split.length == 2) {
                if (split[0].equals("CHARSET")) {
                    str2 = split[1];
                } else if (split[0].equals("ENCODING")) {
                    str = split[1];
                }
            }
        }
        String[] split2 = substring2.split(";");
        for (int i7 = 0; i7 < split2.length; i7++) {
            if (!TextUtils.isEmpty(split2[i7]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1(split2[i7]))) != null && H.length != 0) {
                try {
                    split2[i7] = new String(H, str2);
                } catch (Exception unused) {
                }
            }
        }
        return split2;
    }

    public final String c(boolean z9) {
        byte[] H;
        StringBuilder sb2 = new StringBuilder();
        int indexOf = this.f22317b.indexOf(58);
        if (indexOf < 0) {
            return "";
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        String substring = this.f22317b.substring(0, indexOf);
        String substring2 = this.f22317b.substring(indexOf + 1);
        String str = null;
        String str2 = "UTF-8";
        for (String str3 : substring.split(";")) {
            String[] split = str3.split("=");
            if (split.length == 2) {
                if (split[0].equals("CHARSET")) {
                    str2 = split[1];
                } else if (split[0].equals("ENCODING")) {
                    str = split[1];
                }
            }
        }
        String[] split2 = substring2.split(";");
        boolean z10 = false;
        for (int i7 = 0; i7 < split2.length; i7++) {
            if (!TextUtils.isEmpty(split2[i7])) {
                if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = g0.H(g0.h1(split2[i7]))) != null && H.length != 0) {
                    try {
                        split2[i7] = new String(H, str2);
                    } catch (Exception unused) {
                    }
                }
                if (z10 && sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(split2[i7]);
                if (!z10) {
                    if (split2[i7].length() > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (z9) {
            int i10 = this.f22318c;
            if (i10 == 0) {
                return pf.b.c().b(sb2.toString());
            }
            if (i10 == 5) {
                String[] split3 = sb2.toString().split("T");
                if (split3.length > 0) {
                    String[] split4 = split3[0].split("-");
                    if (split4.length == 3) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, Utilities.z(split4[0]).intValue());
                        calendar.set(2, Utilities.z(split4[1]).intValue() - 1);
                        calendar.set(5, Utilities.z(split4[2]).intValue());
                        return hd.E0().D0().format(calendar.getTime());
                    }
                }
            }
        }
        return sb2.toString();
    }
}
