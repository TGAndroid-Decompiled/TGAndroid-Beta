package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.a;
import org.telegram.ui.web.HttpGetFileTask;
public final class ph0 {
    public static ph0 m;
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public String f;
    public boolean h;
    public boolean j;
    public float k;
    public HttpGetFileTask l;
    public boolean g = true;
    public final nh0 i = new nh0(this, (byte) 0);

    public ph0() {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("beta", 0);
        this.a = sharedPreferences.getString("version", null);
        this.b = sharedPreferences.getInt("versionCode", 0);
        this.c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.a = null;
        this.b = 0;
        this.d = null;
        this.c = null;
        this.e = 0L;
        f();
    }

    public static String c() {
        try {
            return a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            cc4.g(e, true);
            return "";
        }
    }

    public static int d() {
        try {
            return a.b.getPackageManager().getPackageInfo(a.b.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            cc4.g(e, true);
            return 0;
        }
    }

    public static ph0 e() {
        ph0 ph0Var = m;
        if (ph0Var == null) {
            ph0 ph0Var2 = new ph0();
            m = ph0Var2;
            return ph0Var2;
        }
        return ph0Var;
    }

    public final void a(Runnable runnable, boolean z) {
        long j;
        if (!this.h) {
            if (this.g) {
                z = true;
            }
            if (!z) {
                long currentTimeMillis = System.currentTimeMillis() - this.e;
                if (a.x) {
                    j = 86400000;
                } else {
                    boolean z2 = f11.a;
                    j = 1200000;
                }
                if (currentTimeMillis < j) {
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            this.h = true;
            this.g = false;
            new oi5(new y0(this, runnable, (byte) 3)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z) {
        if (!this.j && TextUtils.isEmpty(this.d)) {
            this.j = true;
            this.k = 0.0f;
            jn7.e().k(jn7.U4, new Object[0]);
            if (TextUtils.isEmpty(this.f)) {
                if (!z) {
                    a(new nh0(this, (byte) 1), true);
                    return;
                } else {
                    this.j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new pcc(this) {
                public final ph0 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ph0 ph0Var = this.b;
                    switch (b) {
                        case 0:
                            hl.c3(new a30(ph0Var, (File) obj, (byte) 6));
                            return;
                        default:
                            ph0Var.k = ((Float) obj).floatValue();
                            jn7.e().k(298, new Object[0]);
                            return;
                    }
                }
            }, new pcc(this) {
                public final ph0 b;

                {
                    this.b = this;
                }

                @Override
                public final void a(Object obj) {
                    byte b = r2;
                    ph0 ph0Var = this.b;
                    switch (b) {
                        case 0:
                            hl.c3(new a30(ph0Var, (File) obj, (byte) 6));
                            return;
                        default:
                            ph0Var.k = ((Float) obj).floatValue();
                            jn7.e().k(298, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.l = overrideExtension;
            overrideExtension.execute(this.f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = a.b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.a);
        }
        if (TextUtils.isEmpty(this.c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.c);
        }
        int i = this.b;
        if (i == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i);
        }
        if (TextUtils.isEmpty(this.d)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.d);
        }
        long j = this.e;
        if (j == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j);
        }
        edit.apply();
    }
}
