package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f22781m;
    public String f22782a;
    public int f22783b;
    public String f22784c;
    public String d;
    public long f22785e;
    public String f22786f;
    public boolean h;
    public boolean f22789j;
    public float f22790k;
    public HttpGetFileTask f22791l;
    public boolean f22787g = true;
    public final e1 f22788i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f25566b.getSharedPreferences("beta", 0);
        this.f22782a = sharedPreferences.getString("version", null);
        this.f22783b = sharedPreferences.getInt("versionCode", 0);
        this.f22784c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f22785e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f22783b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f22782a = null;
        this.f22783b = 0;
        this.d = null;
        this.f22784c = null;
        this.f22785e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f25566b.getPackageManager().getPackageInfo(t0.f25566b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f22781m == null) {
            f22781m = new h1();
        }
        return f22781m;
    }

    public final void a(Runnable runnable, boolean z9) {
        long j3;
        if (!this.h) {
            if (this.f22787g) {
                z9 = true;
            }
            if (!z9) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22785e;
                if (t0.f25574x) {
                    j3 = 86400000;
                } else {
                    boolean z10 = r2.f25212a;
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
            this.f22787g = false;
            new org.telegram.ui.web.a1(new g1(0, this, runnable)).execute("null");
        }
    }

    public final void b(boolean z9) {
        if (!this.f22789j && TextUtils.isEmpty(this.d)) {
            this.f22789j = true;
            this.f22790k = 0.0f;
            qs.e().k(qs.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f22786f)) {
                if (!z9) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f22789j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new c20(this) {
                public final h1 f22341b;

                {
                    this.f22341b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22341b, (File) obj));
                            return;
                        default:
                            this.f22341b.f22790k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new c20(this) {
                public final h1 f22341b;

                {
                    this.f22341b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22341b, (File) obj));
                            return;
                        default:
                            this.f22341b.f22790k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f22791l = overrideExtension;
            overrideExtension.execute(this.f22786f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f25566b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f22782a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f22782a);
        }
        if (TextUtils.isEmpty(this.f22784c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f22784c);
        }
        int i7 = this.f22783b;
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
        long j3 = this.f22785e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
