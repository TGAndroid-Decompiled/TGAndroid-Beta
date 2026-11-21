package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f24367m;
    public String f24368a;
    public int f24369b;
    public String f24370c;
    public String d;
    public long f24371e;
    public String f24372f;
    public boolean h;
    public boolean f24375j;
    public float f24376k;
    public HttpGetFileTask f24377l;
    public boolean f24373g = true;
    public final e1 f24374i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f26941b.getSharedPreferences("beta", 0);
        this.f24368a = sharedPreferences.getString("version", null);
        this.f24369b = sharedPreferences.getInt("versionCode", 0);
        this.f24370c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f24371e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f24369b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f24368a = null;
        this.f24369b = 0;
        this.d = null;
        this.f24370c = null;
        this.f24371e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f26941b.getPackageManager().getPackageInfo(t0.f26941b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f26941b.getPackageManager().getPackageInfo(t0.f26941b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f24367m == null) {
            f24367m = new h1();
        }
        return f24367m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j3;
        if (!this.h) {
            if (this.f24373g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f24371e;
                if (t0.f26949x) {
                    j3 = 86400000;
                } else {
                    boolean z11 = s2.f26749a;
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
            this.f24373g = false;
            new org.telegram.ui.web.y0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f24375j && TextUtils.isEmpty(this.d)) {
            this.f24375j = true;
            this.f24376k = 0.0f;
            ks.e().k(ks.U4, new Object[0]);
            if (TextUtils.isEmpty(this.f24372f)) {
                if (!z10) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f24375j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new x10(this) {
                public final h1 f23842b;

                {
                    this.f23842b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23842b, (File) obj));
                            return;
                        default:
                            this.f23842b.f24376k = ((Float) obj).floatValue();
                            ks.e().k(297, new Object[0]);
                            return;
                    }
                }
            }, new x10(this) {
                public final h1 f23842b;

                {
                    this.f23842b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23842b, (File) obj));
                            return;
                        default:
                            this.f23842b.f24376k = ((Float) obj).floatValue();
                            ks.e().k(297, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f24377l = overrideExtension;
            overrideExtension.execute(this.f24372f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f26941b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f24368a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f24368a);
        }
        if (TextUtils.isEmpty(this.f24370c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f24370c);
        }
        int i7 = this.f24369b;
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
        long j3 = this.f24371e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
