package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
public final class h0 {
    public int f15798c;
    public final ArrayList f15796a = new ArrayList();
    public String f15797b = "";
    public boolean d = true;

    public final String a(boolean z10) {
        int indexOf = this.f15797b.indexOf(58);
        if (indexOf >= 0) {
            String substring = this.f15797b.substring(0, indexOf);
            if (this.f15798c == 20) {
                String[] split = substring.substring(2).split(";");
                if (z10) {
                    return split[0];
                }
                if (split.length > 1) {
                    return split[split.length - 1];
                }
                return "";
            }
            String[] split2 = substring.split(";");
            for (int i10 = 0; i10 < split2.length; i10++) {
                if (split2[i10].indexOf(61) < 0) {
                    substring = split2[i10];
                }
            }
            return substring;
        }
        return "";
    }

    public final String[] b() {
        byte[] H;
        int indexOf = this.f15797b.indexOf(58);
        if (indexOf < 0) {
            return new String[0];
        }
        String substring = this.f15797b.substring(0, indexOf);
        String substring2 = this.f15797b.substring(indexOf + 1);
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
        for (int i10 = 0; i10 < split2.length; i10++) {
            if (!TextUtils.isEmpty(split2[i10]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = i0.H(i0.h1(split2[i10]))) != null && H.length != 0) {
                try {
                    split2[i10] = new String(H, str2);
                } catch (Exception unused) {
                }
            }
        }
        return split2;
    }

    public final String c(boolean z10) {
        byte[] H;
        StringBuilder sb2 = new StringBuilder();
        int indexOf = this.f15797b.indexOf(58);
        if (indexOf < 0) {
            return "";
        }
        if (sb2.length() > 0) {
            sb2.append(", ");
        }
        String substring = this.f15797b.substring(0, indexOf);
        String substring2 = this.f15797b.substring(indexOf + 1);
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
        boolean z11 = false;
        for (int i10 = 0; i10 < split2.length; i10++) {
            if (!TextUtils.isEmpty(split2[i10])) {
                if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = i0.H(i0.h1(split2[i10]))) != null && H.length != 0) {
                    try {
                        split2[i10] = new String(H, str2);
                    } catch (Exception unused) {
                    }
                }
                if (z11 && sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(split2[i10]);
                if (!z11) {
                    if (split2[i10].length() > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
            }
        }
        if (z10) {
            int i11 = this.f15798c;
            if (i11 == 0) {
                return af.b.c().b(sb2.toString());
            }
            if (i11 == 5) {
                String[] split3 = sb2.toString().split("T");
                if (split3.length > 0) {
                    String[] split4 = split3[0].split("-");
                    if (split4.length == 3) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, Utilities.z(split4[0]).intValue());
                        calendar.set(2, Utilities.z(split4[1]).intValue() - 1);
                        calendar.set(5, Utilities.z(split4[2]).intValue());
                        return cd.D0().C0().format(calendar.getTime());
                    }
                }
            }
        }
        return sb2.toString();
    }
}
