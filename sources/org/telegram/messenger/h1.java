package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class h1 {
    public static h1 f22818m;
    public String f22819a;
    public int f22820b;
    public String f22821c;
    public String d;
    public long f22822e;
    public String f22823f;
    public boolean h;
    public boolean f22826j;
    public float f22827k;
    public HttpGetFileTask f22828l;
    public boolean f22824g = true;
    public final e1 f22825i = new e1(this, 0);

    public h1() {
        SharedPreferences sharedPreferences = t0.f25457b.getSharedPreferences("beta", 0);
        this.f22819a = sharedPreferences.getString("version", null);
        this.f22820b = sharedPreferences.getInt("versionCode", 0);
        this.f22821c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.f22822e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f22820b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f22819a = null;
        this.f22820b = 0;
        this.d = null;
        this.f22821c = null;
        this.f22822e = 0L;
        f();
    }

    public static String c() {
        try {
            return t0.f25457b.getPackageManager().getPackageInfo(t0.f25457b.getPackageName(), 0).versionName;
        } catch (Exception e10) {
            a8.g(e10, true);
            return "";
        }
    }

    public static int d() {
        try {
            return t0.f25457b.getPackageManager().getPackageInfo(t0.f25457b.getPackageName(), 0).versionCode;
        } catch (Exception e10) {
            a8.g(e10, true);
            return 0;
        }
    }

    public static h1 e() {
        if (f22818m == null) {
            f22818m = new h1();
        }
        return f22818m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j10;
        if (!this.h) {
            if (this.f22824g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.f22822e;
                if (t0.f25465x) {
                    j10 = 86400000;
                } else {
                    boolean z11 = r2.f25040a;
                    j10 = 1200000;
                }
                if (currentTimeMillis < j10) {
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
            }
            this.h = true;
            this.f22824g = false;
            new org.telegram.ui.web.z0(new g1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f22826j && TextUtils.isEmpty(this.d)) {
            this.f22826j = true;
            this.f22827k = 0.0f;
            hs.e().k(hs.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f22823f)) {
                if (!z10) {
                    a(new e1(this, 1), true);
                    return;
                } else {
                    this.f22826j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new u10(this) {
                public final h1 f22432b;

                {
                    this.f22432b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22432b, (File) obj));
                            return;
                        default:
                            this.f22432b.f22827k = ((Float) obj).floatValue();
                            hs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new u10(this) {
                public final h1 f22432b;

                {
                    this.f22432b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            g0.h3(new b4(15, this.f22432b, (File) obj));
                            return;
                        default:
                            this.f22432b.f22827k = ((Float) obj).floatValue();
                            hs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f22828l = overrideExtension;
            overrideExtension.execute(this.f22823f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = t0.f25457b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f22819a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f22819a);
        }
        if (TextUtils.isEmpty(this.f22821c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f22821c);
        }
        int i3 = this.f22820b;
        if (i3 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i3);
        }
        if (TextUtils.isEmpty(this.d)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.d);
        }
        long j10 = this.f22822e;
        if (j10 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j10);
        }
        edit.apply();
    }
}
