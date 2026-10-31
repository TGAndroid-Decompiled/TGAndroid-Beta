package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class k1 {
    public static k1 f16503m;
    public String f16504a;
    public int f16505b;
    public String f16506c;
    public String d;
    public long e;
    public String f16507f;
    public boolean h;
    public boolean f16510j;
    public float f16511k;
    public HttpGetFileTask f16512l;
    public boolean f16508g = true;
    public final h1 f16509i = new h1(this, 0);

    public k1() {
        SharedPreferences sharedPreferences = w0.f19025b.getSharedPreferences("beta", 0);
        this.f16504a = sharedPreferences.getString("version", null);
        this.f16505b = sharedPreferences.getInt("versionCode", 0);
        this.f16506c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f16505b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f16504a = null;
        this.f16505b = 0;
        this.d = null;
        this.f16506c = null;
        this.e = 0L;
        f();
    }

    public static String c() {
        try {
            return w0.f19025b.getPackageManager().getPackageInfo(w0.f19025b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            f8.g(e, true);
            return "";
        }
    }

    public static int d() {
        try {
            return w0.f19025b.getPackageManager().getPackageInfo(w0.f19025b.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            f8.g(e, true);
            return 0;
        }
    }

    public static k1 e() {
        if (f16503m == null) {
            f16503m = new k1();
        }
        return f16503m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j10;
        if (!this.h) {
            if (this.f16508g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.e;
                if (w0.f19032x) {
                    j10 = 86400000;
                } else {
                    boolean z11 = v2.f18448a;
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
            this.f16508g = false;
            new org.telegram.ui.web.c1(new j1(0, this, runnable)).execute("https://telegram.org/dl/android/apk-public-beta.json");
        }
    }

    public final void b(boolean z10) {
        if (!this.f16510j && TextUtils.isEmpty(this.d)) {
            this.f16510j = true;
            this.f16511k = 0.0f;
            zs.e().k(zs.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f16507f)) {
                if (!z10) {
                    a(new h1(this, 1), true);
                    return;
                } else {
                    this.f16510j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new q20(this) {
                public final k1 f16041b;

                {
                    this.f16041b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            i0.g3(new e4(13, this.f16041b, (File) obj));
                            return;
                        default:
                            this.f16041b.f16511k = ((Float) obj).floatValue();
                            zs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new q20(this) {
                public final k1 f16041b;

                {
                    this.f16041b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            i0.g3(new e4(13, this.f16041b, (File) obj));
                            return;
                        default:
                            this.f16041b.f16511k = ((Float) obj).floatValue();
                            zs.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f16512l = overrideExtension;
            overrideExtension.execute(this.f16507f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = w0.f19025b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f16504a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f16504a);
        }
        if (TextUtils.isEmpty(this.f16506c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f16506c);
        }
        int i10 = this.f16505b;
        if (i10 == 0) {
            edit.remove("versionCode");
        } else {
            edit.putInt("versionCode", i10);
        }
        if (TextUtils.isEmpty(this.d)) {
            edit.remove("path");
        } else {
            edit.putString("path", this.d);
        }
        long j10 = this.e;
        if (j10 == 0) {
            edit.remove("lastCheck");
        } else {
            edit.putLong("lastCheck", j10);
        }
        edit.apply();
    }
}
