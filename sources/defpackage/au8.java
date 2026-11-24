package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.io.UnsupportedEncodingException;
import java.net.IDN;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.regex.Pattern;
public final class au8 {
    public static final Pattern g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final au8 i = a().c();
    public final int a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;

    public au8(i46 i46Var) {
        int i2 = i46Var.a;
        this.a = i2;
        this.b = (String) i46Var.c;
        if (i2 == 3) {
            this.f = (String) i46Var.f;
            this.c = 0;
            this.d = "";
            this.e = "";
        } else if (i2 == 2) {
            this.f = (String) i46Var.f;
            this.c = i46Var.b;
            this.d = "";
            this.e = "";
        } else if (i2 == 1) {
            this.f = "";
            this.c = i46Var.b;
            this.d = (String) i46Var.d;
            this.e = (String) i46Var.e;
        } else {
            sc8.e();
            throw null;
        }
    }

    public static i46 a() {
        ?? obj = new Object();
        obj.a = 1;
        obj.c = "";
        obj.d = "";
        obj.e = "";
        obj.f = "";
        return obj;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) << 1];
                    char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                    for (int i2 = 1; i2 < decode.length; i2++) {
                        byte b = decode[i2];
                        int i3 = (i2 - 1) << 1;
                        cArr[i3] = cArr2[(b & 255) >>> 4];
                        cArr[i3 + 1] = cArr2[b & 15];
                    }
                    String str2 = new String(cArr);
                    if (!h(str2)) {
                        return null;
                    }
                    if (Base64.encodeToString(decode, 11).equals(str)) {
                        return str2;
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static au8 c(SharedPreferences sharedPreferences) {
        int i2;
        String str = "";
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i3 = sharedPreferences.getInt("proxy_port", 1080);
        int i4 = 2;
        if (TextUtils.isEmpty(string4)) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        int F = ug8.F(i2);
        if (F != 1) {
            if (F != 2) {
                i4 = 0;
            }
        } else {
            i4 = 1;
        }
        int f = f(sharedPreferences.getInt("proxy_type", i4));
        i46 a = a();
        if (string == null) {
            string = "";
        }
        a.c = string;
        if (string2 == null) {
            string2 = "";
        }
        a.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a.e = string3;
        if (string4 != null) {
            str = string4;
        }
        a.f = str;
        a.b = i3;
        a.o(f);
        return a.c();
    }

    public static defpackage.au8 d(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.au8.d(android.net.Uri):au8");
    }

    public static int f(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return 2;
            }
            if (i2 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean h(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (Character.digit(str.charAt(i2), 16) < 0) {
                        return false;
                    }
                }
                return true;
            } else if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i3 = 2; i3 < str.length(); i3++) {
                    if (Character.digit(str.charAt(i3), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String e() {
        StringBuilder sb;
        boolean z;
        String str = this.e;
        String str2 = this.d;
        String str3 = this.b;
        String str4 = this.f;
        int i2 = this.a;
        int F = ug8.F(i2);
        if (F != 1) {
            if (F != 2) {
                sb = new StringBuilder("https://t.me/socks?");
            } else {
                sb = new StringBuilder("https://t.me/webproxy?");
            }
        } else {
            sb = new StringBuilder("https://t.me/proxy?");
        }
        try {
            sb.append("server=");
            sb.append(URLEncoder.encode(str3, "UTF-8"));
            if (i2 != 3) {
                sb.append("&port=");
                sb.append(this.c);
            }
            if (!TextUtils.isEmpty(str2)) {
                sb.append("&user=");
                sb.append(URLEncoder.encode(str2, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str)) {
                sb.append("&pass=");
                sb.append(URLEncoder.encode(str, "UTF-8"));
            }
            if (!TextUtils.isEmpty(str4)) {
                if (i2 == 3) {
                    if (str3 != null && str3.indexOf(47) >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && h(str4)) {
                        int length = str4.length() / 2;
                        byte[] bArr = new byte[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            int i4 = i3 << 1;
                            bArr[i3] = (byte) ((Character.digit(str4.charAt(i4), 16) << 4) | Character.digit(str4.charAt(i4 + 1), 16));
                        }
                        byte[] bArr2 = new byte[length + 1];
                        bArr2[0] = 112;
                        System.arraycopy(bArr, 0, bArr2, 1, length);
                        str4 = Base64.encodeToString(bArr2, 11);
                    }
                }
                sb.append("&secret=");
                sb.append(URLEncoder.encode(str4, "UTF-8"));
            }
        } catch (UnsupportedEncodingException unused) {
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof au8) {
                au8 au8Var = (au8) obj;
                if (this.c == au8Var.c && this.a == au8Var.a && Objects.equals(this.b, au8Var.b) && Objects.equals(this.d, au8Var.d) && Objects.equals(this.e, au8Var.e) && Objects.equals(this.f, au8Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean g() {
        boolean z;
        String str;
        String str2;
        String str3 = this.b;
        if (!TextUtils.isEmpty(str3)) {
            if (this.a == 3) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = str3.indexOf(47);
                    if (indexOf >= 0) {
                        str = str3.substring(0, indexOf);
                        str2 = str3.substring(indexOf + 1);
                    } else {
                        str = str3;
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && g.matcher(str2).matches()))) {
                        try {
                            z = str.equals(IDN.toASCII(str, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        if (!z && h(this.f)) {
                            return true;
                        }
                    }
                }
                z = false;
                return !z ? false : false;
            } else if (this.c > 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(ug8.b(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f);
    }

    public final void i(SharedPreferences.Editor editor) {
        int i2;
        int i3 = this.a;
        int F = ug8.F(i3);
        if (F != 1) {
            if (F != 2) {
                i2 = 0;
            } else {
                i2 = 2;
            }
        } else {
            i2 = 1;
        }
        editor.putInt("proxy_type", i2);
        editor.putString("proxy_ip", this.b);
        int F2 = ug8.F(i3);
        int i4 = this.c;
        if (F2 != 0) {
            String str = this.f;
            if (F2 != 1) {
                if (F2 != 2) {
                    return;
                }
                editor.putString("proxy_secret", str);
                editor.remove("proxy_port");
                editor.remove("proxy_pass");
                editor.remove("proxy_user");
                return;
            }
            editor.putString("proxy_secret", str);
            editor.putInt("proxy_port", i4);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        editor.putInt("proxy_port", i4);
        editor.remove("proxy_secret");
        String str2 = this.e;
        if (TextUtils.isEmpty(str2)) {
            editor.remove("proxy_pass");
        } else {
            editor.putString("proxy_pass", str2);
        }
        String str3 = this.d;
        if (TextUtils.isEmpty(str3)) {
            editor.remove("proxy_user");
        } else {
            editor.putString("proxy_user", str3);
        }
    }
}
