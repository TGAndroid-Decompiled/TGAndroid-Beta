package fg;

import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
public final class b {
    public static final b f9477g = new b(a());
    public final int f9478a;
    public final String f9479b;
    public final int f9480c;
    public final String d;
    public final String f9481e;
    public final String f9482f;

    public b(a aVar) {
        int i10 = aVar.f9472a;
        this.f9478a = i10;
        this.f9479b = aVar.f9473b;
        if (i10 == 3) {
            this.f9482f = aVar.f9476f;
            this.f9480c = 0;
            this.d = "";
            this.f9481e = "";
        } else if (i10 == 2) {
            this.f9482f = aVar.f9476f;
            this.f9480c = aVar.f9474c;
            this.d = "";
            this.f9481e = "";
        } else if (i10 == 1) {
            this.f9482f = "";
            this.f9480c = aVar.f9474c;
            this.d = aVar.d;
            this.f9481e = aVar.f9475e;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static a a() {
        ?? obj = new Object();
        obj.f9472a = 1;
        obj.f9473b = "";
        obj.d = "";
        obj.f9475e = "";
        obj.f9476f = "";
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
        a2.f9473b = string;
        if (string2 == null) {
            string2 = "";
        }
        a2.d = string2;
        if (string3 == null) {
            string3 = "";
        }
        a2.f9475e = string3;
        if (string4 != null) {
            str = string4;
        }
        a2.f9476f = str;
        a2.f9474c = i11;
        if (d != 0) {
            i13 = d;
        }
        a2.f9472a = i13;
        return new b(a2);
    }

    public static fg.b c(android.net.Uri r6) {
        throw new UnsupportedOperationException("Method not decompiled: fg.b.c(android.net.Uri):fg.b");
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
        if (!TextUtils.isEmpty(this.f9479b)) {
            if (this.f9478a != 3 && this.f9480c <= 0) {
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
                if (this.f9480c == bVar.f9480c && this.f9478a == bVar.f9478a && Objects.equals(this.f9479b, bVar.f9479b) && Objects.equals(this.d, bVar.d) && Objects.equals(this.f9481e, bVar.f9481e) && Objects.equals(this.f9482f, bVar.f9482f)) {
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
        int i11 = this.f9478a;
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
        editor.putString("proxy_ip", this.f9479b);
        int c11 = m1.j.c(i11);
        int i12 = this.f9480c;
        if (c11 != 0) {
            String str = this.f9482f;
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
        String str2 = this.f9481e;
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
        return Objects.hash(m1.j.a(this.f9478a), this.f9479b, Integer.valueOf(this.f9480c), this.d, this.f9481e, this.f9482f);
    }
}
