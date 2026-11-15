package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f24016m;
    public String f24017a;
    public int f24018b;
    public String f24019c;
    public String d;
    public long f24020e;
    public String f24021f;
    public boolean h;
    public boolean f24024j;
    public float f24025k;
    public HttpGetFileTask f24026l;
    public boolean f24022g = true;
    public final e1 f24023i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f26609b.getSharedPreferences("beta", 0);
        this.f24017a = sharedPreferences.getString("version", null);
        this.f24018b = sharedPreferences.getInt("versionCode", 0);
        this.f24019c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f24020e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f24018b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f24017a = null;
        this.f24018b = 0;
        this.d = null;
        this.f24019c = null;
        this.f24020e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f26609b.getPackageManager().getPackageInfo(t0.f26609b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f26609b.getPackageManager().getPackageInfo(t0.f26609b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f24016m == null) {
            f24016m = new h1();
        }
        return f24016m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j3;
        if (!this.h) {
            if (this.f24022g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f24020e;
                if (t0.f26617x) {
                    j3 = 86400000;
                } else {
                    boolean z11 = r2.f26206a;
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
            this.f24022g = false;
            new org.telegram.ui.web.y0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f24024j && TextUtils.isEmpty(this.d)) {
            this.f24024j = true;
            this.f24025k = 0.0f;
            ns.e().k(ns.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f24021f)) {
                if (!z10) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f24024j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new z10(this) {
                public final h1 f23413b;

                {
                    this.f23413b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f23413b, (File) obj));
                            return;
                        default:
                            this.f23413b.f24025k = ((Float) obj).floatValue();
                            ns.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new z10(this) {
                public final h1 f23413b;

                {
                    this.f23413b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f23413b, (File) obj));
                            return;
                        default:
                            this.f23413b.f24025k = ((Float) obj).floatValue();
                            ns.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f24026l = overrideExtension;
            overrideExtension.execute(this.f24021f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f26609b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f24017a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f24017a);
        }
        if (TextUtils.isEmpty(this.f24019c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f24019c);
        }
        int i7 = this.f24018b;
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
        long j3 = this.f24020e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
