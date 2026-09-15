package ni;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import j$.util.Objects;
import java.net.IDN;
import java.util.Locale;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern f15243g = Pattern.compile("[A-Za-z0-9][A-Za-z0-9_-]*(/[A-Za-z0-9][A-Za-z0-9_-]*)*");
    public static final Pattern h = Pattern.compile("[A-Za-z0-9_-]+");
    public static final b f15244i = a().a();
    public final int f15245a;
    public final String f15246b;
    public final int f15247c;
    public final String d;
    public final String e;
    public final String f15248f;

    public b(a aVar) {
        int i10 = aVar.f15239a;
        this.f15245a = i10;
        this.f15246b = aVar.f15240b;
        if (i10 == 3) {
            this.f15248f = aVar.f15242f;
            this.f15247c = 0;
            this.d = "";
            this.e = "";
        } else if (i10 == 2) {
            this.f15248f = aVar.f15242f;
            this.f15247c = aVar.f15241c;
            this.d = "";
            this.e = "";
        } else if (i10 == 1) {
            this.f15248f = "";
            this.f15247c = aVar.f15241c;
            this.d = aVar.d;
            this.e = aVar.e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static a a() {
        ?? obj = new Object();
        obj.f15239a = 1;
        obj.f15240b = "";
        obj.d = "";
        obj.e = "";
        obj.f15242f = "";
        return obj;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && h.matcher(str).matches()) {
            try {
                byte[] decode = Base64.decode(str, 11);
                if (decode.length >= 17 && (decode[0] & 255) == 112) {
                    char[] cArr = new char[(decode.length - 1) * 2];
                    char[] charArray = "0123456789abcdef".toCharArray();
                    for (int i10 = 1; i10 < decode.length; i10++) {
                        byte b10 = decode[i10];
                        int i11 = (i10 - 1) * 2;
                        cArr[i11] = charArray[(b10 & 255) >>> 4];
                        cArr[i11 + 1] = charArray[b10 & 15];
                    }
                    String str2 = new String(cArr);
                    if (!g(str2)) {
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

    public static b c(SharedPreferences sharedPreferences) {
        int i10;
        String str = "";
        String string = sharedPreferences.getString("proxy_ip", "");
        String string2 = sharedPreferences.getString("proxy_user", "");
        String string3 = sharedPreferences.getString("proxy_pass", "");
        String string4 = sharedPreferences.getString("proxy_secret", "");
        int i11 = sharedPreferences.getInt("proxy_port", 1080);
        int i12 = 2;
        int i13 = 1;
        if (TextUtils.isEmpty(string4)) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        int c10 = m1.j.c(i10);
        if (c10 != 1) {
            if (c10 != 2) {
                i12 = 0;
            }
        } else {
            i12 = 1;
        }
        int e = e(sharedPreferences.getInt("proxy_type", i12));
        a a2 = a();
        if (string == null) {
            string = "";
        }
        a2.f15240b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.e = string3;
        if (string4 != null) {
            str = string4;
        }
        a2.f15242f = str;
        a2.f15241c = i11;
        if (e != 0) {
            i13 = e;
        }
        a2.f15239a = i13;
        return a2.a();
    }

    public static ni.b d(android.net.Uri r9) {
        throw new UnsupportedOperationException("Method not decompiled: ni.b.d(android.net.Uri):ni.b");
    }

    public static int e(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return 2;
            }
            if (i10 == 2) {
                return 3;
            }
        }
        return 1;
    }

    public static boolean g(String str) {
        if (str != null) {
            if (str.length() == 32) {
                for (int i10 = 0; i10 < str.length(); i10++) {
                    if (Character.digit(str.charAt(i10), 16) < 0) {
                        return false;
                    }
                }
                return true;
            } else if (str.length() == 34 && str.regionMatches(true, 0, "dd", 0, 2)) {
                for (int i11 = 2; i11 < str.length(); i11++) {
                    if (Character.digit(str.charAt(i11), 16) < 0) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f15247c == bVar.f15247c && this.f15245a == bVar.f15245a && Objects.equals(this.f15246b, bVar.f15246b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f15248f, bVar.f15248f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        String str;
        String str2;
        boolean equals;
        String str3 = this.f15246b;
        if (!TextUtils.isEmpty(str3)) {
            if (this.f15245a == 3) {
                if (!TextUtils.isEmpty(str3)) {
                    int indexOf = str3.indexOf(47);
                    if (indexOf >= 0) {
                        str = str3.substring(0, indexOf);
                    } else {
                        str = str3;
                    }
                    if (indexOf >= 0) {
                        str2 = str3.substring(indexOf + 1);
                    } else {
                        str2 = null;
                    }
                    if (!TextUtils.isEmpty(str) && str.indexOf(58) < 0 && str.indexOf(63) < 0 && str.indexOf(35) < 0 && (str2 == null || (str2.length() <= 128 && f15243g.matcher(str2).matches()))) {
                        try {
                            equals = str.equals(IDN.toASCII(str, 3).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                        }
                        if (!equals && g(this.f15248f)) {
                            return true;
                        }
                    }
                }
                equals = false;
                return !equals ? false : false;
            } else if (this.f15247c > 0) {
                return true;
            }
        }
        return false;
    }

    public final void h(SharedPreferences.Editor editor) {
        int i10;
        int i11 = this.f15245a;
        int c10 = m1.j.c(i11);
        if (c10 != 1) {
            if (c10 != 2) {
                i10 = 0;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 1;
        }
        editor.putInt("proxy_type", i10);
        editor.putString("proxy_ip", this.f15246b);
        int c11 = m1.j.c(i11);
        int i12 = this.f15247c;
        if (c11 != 0) {
            String str = this.f15248f;
            if (c11 != 1) {
                if (c11 != 2) {
                    return;
                }
                editor.putString("proxy_secret", str);
                editor.remove("proxy_port");
                editor.remove("proxy_pass");
                editor.remove("proxy_user");
                return;
            }
            editor.putString("proxy_secret", str);
            editor.putInt("proxy_port", i12);
            editor.remove("proxy_pass");
            editor.remove("proxy_user");
            return;
        }
        editor.putInt("proxy_port", i12);
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

    public final int hashCode() {
        return Objects.hash(m1.j.a(this.f15245a), this.f15246b, Integer.valueOf(this.f15247c), this.d, this.e, this.f15248f);
    }
}
