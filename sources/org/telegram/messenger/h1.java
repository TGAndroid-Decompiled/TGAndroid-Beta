package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f22785m;
    public String f22786a;
    public int f22787b;
    public String f22788c;
    public String d;
    public long f22789e;
    public String f22790f;
    public boolean h;
    public boolean f22793j;
    public float f22794k;
    public HttpGetFileTask f22795l;
    public boolean f22791g = true;
    public final e1 f22792i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f25570b.getSharedPreferences("beta", 0);
        this.f22786a = sharedPreferences.getString("version", null);
        this.f22787b = sharedPreferences.getInt("versionCode", 0);
        this.f22788c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f22789e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f22787b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f22786a = null;
        this.f22787b = 0;
        this.d = null;
        this.f22788c = null;
        this.f22789e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f25570b.getPackageManager().getPackageInfo(t0.f25570b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f25570b.getPackageManager().getPackageInfo(t0.f25570b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f22785m == null) {
            f22785m = new h1();
        }
        return f22785m;
    }

    public final void a(Runnable runnable, boolean z9) {
        long j3;
        if (!this.h) {
            if (this.f22791g) {
                z9 = true;
            }
            if (!z9) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22789e;
                if (t0.f25578x) {
                    j3 = 86400000;
                } else {
                    boolean z10 = r2.f25216a;
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
            this.f22791g = false;
            new org.telegram.ui.web.a1(new g1(0, this, runnable)).execute("null");
        }
    }

    public final void b(boolean z9) {
        if (!this.f22793j && TextUtils.isEmpty(this.d)) {
            this.f22793j = true;
            this.f22794k = 0.0f;
            qs.e().k(qs.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f22790f)) {
                if (!z9) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f22793j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new c20(this) {
                public final h1 f22345b;

                {
                    this.f22345b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22345b, (File) obj));
                            return;
                        default:
                            this.f22345b.f22794k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new c20(this) {
                public final h1 f22345b;

                {
                    this.f22345b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22345b, (File) obj));
                            return;
                        default:
                            this.f22345b.f22794k = ((Float) obj).floatValue();
                            qs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f22795l = overrideExtension;
            overrideExtension.execute(this.f22790f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f25570b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f22786a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f22786a);
        }
        if (TextUtils.isEmpty(this.f22788c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f22788c);
        }
        int i7 = this.f22787b;
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
        long j3 = this.f22789e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
