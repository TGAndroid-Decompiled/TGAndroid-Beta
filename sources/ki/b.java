package ki;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
public final class b {
    public static final b f12525g = new b(a());
    public final int f12526a;
    public final String f12527b;
    public final int f12528c;
    public final String d;
    public final String e;
    public final String f12529f;

    public b(a aVar) {
        int i10 = aVar.f12521a;
        this.f12526a = i10;
        this.f12527b = aVar.f12522b;
        if (i10 == 3) {
            this.f12529f = aVar.f12524f;
            this.f12528c = 0;
            this.d = "";
            this.e = "";
        } else if (i10 == 2) {
            this.f12529f = aVar.f12524f;
            this.f12528c = aVar.f12523c;
            this.d = "";
            this.e = "";
        } else if (i10 == 1) {
            this.f12529f = "";
            this.f12528c = aVar.f12523c;
            this.d = aVar.d;
            this.e = aVar.e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static a a() {
        ?? obj = new Object();
        obj.f12521a = 1;
        obj.f12522b = "";
        obj.d = "";
        obj.e = "";
        obj.f12524f = "";
        return obj;
    }

    public static b b(SharedPreferences sharedPreferences) {
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
        int d = d(sharedPreferences.getInt("proxy_type", i12));
        a a2 = a();
        if (string == null) {
            string = "";
        }
        a2.f12522b = string;
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
        a2.f12524f = str;
        a2.f12523c = i11;
        if (d != 0) {
            i13 = d;
        }
        a2.f12521a = i13;
        return new b(a2);
    }

    public static ki.b c(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: ki.b.c(android.net.Uri):ki.b");
    }

    public static int d(int i10) {
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

    public final boolean e() {
        if (!TextUtils.isEmpty(this.f12527b)) {
            if (this.f12526a != 3 && this.f12528c <= 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f12528c == bVar.f12528c && this.f12526a == bVar.f12526a && Objects.equals(this.f12527b, bVar.f12527b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.e, bVar.e) && Objects.equals(this.f12529f, bVar.f12529f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(SharedPreferences.Editor editor) {
        int i10;
        int i11 = this.f12526a;
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
        editor.putString("proxy_ip", this.f12527b);
        int c11 = m1.j.c(i11);
        int i12 = this.f12528c;
        if (c11 != 0) {
            String str = this.f12529f;
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
        return Objects.hash(m1.j.a(this.f12526a), this.f12527b, Integer.valueOf(this.f12528c), this.d, this.e, this.f12529f);
    }
}
