package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f24311m;
    public String f24312a;
    public int f24313b;
    public String f24314c;
    public String d;
    public long f24315e;
    public String f24316f;
    public boolean h;
    public boolean f24319j;
    public float f24320k;
    public HttpGetFileTask f24321l;
    public boolean f24317g = true;
    public final e1 f24318i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f26895b.getSharedPreferences("beta", 0);
        this.f24312a = sharedPreferences.getString("version", null);
        this.f24313b = sharedPreferences.getInt("versionCode", 0);
        this.f24314c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f24315e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f24313b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f24312a = null;
        this.f24313b = 0;
        this.d = null;
        this.f24314c = null;
        this.f24315e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f26895b.getPackageManager().getPackageInfo(t0.f26895b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f26895b.getPackageManager().getPackageInfo(t0.f26895b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f24311m == null) {
            f24311m = new h1();
        }
        return f24311m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j3;
        if (!this.h) {
            if (this.f24317g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f24315e;
                if (t0.f26903x) {
                    j3 = 86400000;
                } else {
                    boolean z11 = s2.f26694a;
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
            this.f24317g = false;
            new org.telegram.ui.web.y0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f24319j && TextUtils.isEmpty(this.d)) {
            this.f24319j = true;
            this.f24320k = 0.0f;
            ls.e().k(ls.U4, new Object[0]);
            if (TextUtils.isEmpty(this.f24316f)) {
                if (!z10) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f24319j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new y10(this) {
                public final h1 f23780b;

                {
                    this.f23780b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23780b, (File) obj));
                            return;
                        default:
                            this.f23780b.f24320k = ((Float) obj).floatValue();
                            ls.e().k(297, new Object[0]);
                            return;
                    }
                }
            }, new y10(this) {
                public final h1 f23780b;

                {
                    this.f23780b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23780b, (File) obj));
                            return;
                        default:
                            this.f23780b.f24320k = ((Float) obj).floatValue();
                            ls.e().k(297, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f24321l = overrideExtension;
            overrideExtension.execute(this.f24316f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f26895b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f24312a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f24312a);
        }
        if (TextUtils.isEmpty(this.f24314c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f24314c);
        }
        int i7 = this.f24313b;
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
        long j3 = this.f24315e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
