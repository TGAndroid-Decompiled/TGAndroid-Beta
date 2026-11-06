package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f22775m;
    public String f22776a;
    public int f22777b;
    public String f22778c;
    public String d;
    public long f22779e;
    public String f22780f;
    public boolean h;
    public boolean f22783j;
    public float f22784k;
    public HttpGetFileTask f22785l;
    public boolean f22781g = true;
    public final e1 f22782i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f25563b.getSharedPreferences("beta", 0);
        this.f22776a = sharedPreferences.getString("version", null);
        this.f22777b = sharedPreferences.getInt("versionCode", 0);
        this.f22778c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f22779e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f22777b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f22776a = null;
        this.f22777b = 0;
        this.d = null;
        this.f22778c = null;
        this.f22779e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f25563b.getPackageManager().getPackageInfo(t0.f25563b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f25563b.getPackageManager().getPackageInfo(t0.f25563b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f22775m == null) {
            f22775m = new h1();
        }
        return f22775m;
    }

    public final void a(Runnable runnable, boolean z9) {
        long j3;
        if (!this.h) {
            if (this.f22781g) {
                z9 = true;
            }
            if (!z9) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22779e;
                if (t0.f25571x) {
                    j3 = 86400000;
                } else {
                    boolean z10 = r2.f25199a;
                    j3 = 1200000;
                }
                if (currentTimeMillis < j3) {
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            this.h = true;
            this.f22781g = false;
            new org.telegram.ui.web.a1(new g1(0, this, runnable)).execute("null");
        }
    }

    public final void b(boolean z9) {
        if (!this.f22783j && TextUtils.isEmpty(this.d)) {
            this.f22783j = true;
            this.f22784k = 0.0f;
            qs.e().k(qs.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f22780f)) {
                if (!z9) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f22783j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new c20(this) {
                public final h1 f22322b;

                {
                    this.f22322b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22322b, (File) obj));
                            return;
                        default:
                            this.f22322b.f22784k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new c20(this) {
                public final h1 f22322b;

                {
                    this.f22322b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22322b, (File) obj));
                            return;
                        default:
                            this.f22322b.f22784k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f22785l = overrideExtension;
            overrideExtension.execute(this.f22780f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f25563b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f22776a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f22776a);
        }
        if (TextUtils.isEmpty(this.f22778c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f22778c);
        }
        int i7 = this.f22777b;
        if (i7 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i7);
        }
        if (TextUtils.isEmpty(this.d)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.d);
        }
        long j3 = this.f22779e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
