package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f24342m;
    public String f24343a;
    public int f24344b;
    public String f24345c;
    public String d;
    public long f24346e;
    public String f24347f;
    public boolean h;
    public boolean f24350j;
    public float f24351k;
    public HttpGetFileTask f24352l;
    public boolean f24348g = true;
    public final e1 f24349i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f26915b.getSharedPreferences("beta", 0);
        this.f24343a = sharedPreferences.getString("version", null);
        this.f24344b = sharedPreferences.getInt("versionCode", 0);
        this.f24345c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f24346e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f24344b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f24343a = null;
        this.f24344b = 0;
        this.d = null;
        this.f24345c = null;
        this.f24346e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f26915b.getPackageManager().getPackageInfo(t0.f26915b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f26915b.getPackageManager().getPackageInfo(t0.f26915b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f24342m == null) {
            f24342m = new h1();
        }
        return f24342m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j3;
        if (!this.h) {
            if (this.f24348g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f24346e;
                if (t0.f26923x) {
                    j3 = 86400000;
                } else {
                    boolean z11 = s2.f26723a;
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
            this.f24348g = false;
            new org.telegram.ui.web.y0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f24350j && TextUtils.isEmpty(this.d)) {
            this.f24350j = true;
            this.f24351k = 0.0f;
            ks.e().k(ks.T4, new Object[0]);
            if (TextUtils.isEmpty(this.f24347f)) {
                if (!z10) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f24350j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new x10(this) {
                public final h1 f23817b;

                {
                    this.f23817b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23817b, (File) obj));
                            return;
                        default:
                            this.f23817b.f24351k = ((Float) obj).floatValue();
                            ks.e().k(296, new Object[0]);
                            return;
                    }
                }
            }, new x10(this) {
                public final h1 f23817b;

                {
                    this.f23817b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.g3(new w3(15, this.f23817b, (File) obj));
                            return;
                        default:
                            this.f23817b.f24351k = ((Float) obj).floatValue();
                            ks.e().k(296, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f24352l = overrideExtension;
            overrideExtension.execute(this.f24347f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f26915b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f24343a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f24343a);
        }
        if (TextUtils.isEmpty(this.f24345c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f24345c);
        }
        int i7 = this.f24344b;
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
        long j3 = this.f24346e;
        if (j3 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j3);
        }
        edit.apply();
    }
}
