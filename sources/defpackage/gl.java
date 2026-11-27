package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
public final class gl {
    public int c;
    public final ArrayList a = new ArrayList();
    public String b = "";
    public boolean d = true;

    public final String a(boolean z) {
        int indexOf = this.b.indexOf(58);
        if (indexOf >= 0) {
            String substring = this.b.substring(0, indexOf);
            if (this.c == 20) {
                String[] split = substring.substring(2).split(";");
                if (z) {
                    return split[0];
                }
                if (split.length > 1) {
                    return split[split.length - 1];
                }
                return "";
            }
            String[] split2 = substring.split(";");
            for (int i = 0; i < split2.length; i++) {
                if (split2[i].indexOf(61) < 0) {
                    substring = split2[i];
                }
            }
            return substring;
        }
        return "";
    }

    public final String[] b() {
        byte[] H;
        int indexOf = this.b.indexOf(58);
        if (indexOf < 0) {
            return new String[0];
        }
        String substring = this.b.substring(0, indexOf);
        String substring2 = this.b.substring(indexOf + 1);
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
        for (int i = 0; i < split2.length; i++) {
            if (!TextUtils.isEmpty(split2[i]) && str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = hl.H(hl.g1(split2[i]))) != null && H.length != 0) {
                try {
                    split2[i] = new String(H, str2);
                } catch (Exception unused) {
                }
            }
        }
        return split2;
    }

    public final String c(boolean z) {
        byte[] H;
        StringBuilder sb = new StringBuilder();
        int indexOf = this.b.indexOf(58);
        if (indexOf < 0) {
            return "";
        }
        if (sb.length() > 0) {
            sb.append(", ");
        }
        String substring = this.b.substring(0, indexOf);
        String substring2 = this.b.substring(indexOf + 1);
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
        boolean z2 = false;
        for (int i = 0; i < split2.length; i++) {
            if (!TextUtils.isEmpty(split2[i])) {
                if (str != null && str.equalsIgnoreCase("QUOTED-PRINTABLE") && (H = hl.H(hl.g1(split2[i]))) != null && H.length != 0) {
                    try {
                        split2[i] = new String(H, str2);
                    } catch (Exception unused) {
                    }
                }
                if (z2 && sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(split2[i]);
                if (!z2) {
                    if (split2[i].length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (z) {
            int i2 = this.c;
            if (i2 == 0) {
                return f78.f().e(sb.toString());
            }
            if (i2 == 5) {
                String[] split3 = sb.toString().split("T");
                if (split3.length > 0) {
                    String[] split4 = split3[0].split("-");
                    if (split4.length == 3) {
                        Calendar calendar = Calendar.getInstance();
                        calendar.set(1, Utilities.z(split4[0]).intValue());
                        calendar.set(2, Utilities.z(split4[1]).intValue() - 1);
                        calendar.set(5, Utilities.z(split4[2]).intValue());
                        return ob6.D0().C0().format(calendar.getTime());
                    }
                }
            }
        }
        return sb.toString();
    }
}
