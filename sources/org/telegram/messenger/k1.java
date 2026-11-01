package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
import org.telegram.ui.web.HttpGetFileTask;
public final class k1 {
    public static k1 f16537m;
    public String f16538a;
    public int f16539b;
    public String f16540c;
    public String d;
    public long e;
    public String f16541f;
    public boolean h;
    public boolean f16544j;
    public float f16545k;
    public HttpGetFileTask f16546l;
    public boolean f16542g = true;
    public final h1 f16543i = new h1(this, 0);

    public k1() {
        SharedPreferences sharedPreferences = w0.f18945b.getSharedPreferences("beta", 0);
        this.f16538a = sharedPreferences.getString("version", null);
        this.f16539b = sharedPreferences.getInt("versionCode", 0);
        this.f16540c = sharedPreferences.getString("changelog", null);
        this.d = sharedPreferences.getString("path", null);
        this.e = sharedPreferences.getLong("lastCheck", 0L);
        if (d() < this.f16539b && (TextUtils.isEmpty(this.d) || new File(this.d).exists())) {
            return;
        }
        this.f16538a = null;
        this.f16539b = 0;
        this.d = null;
        this.f16540c = null;
        this.e = 0L;
        f();
    }

    public static String c() {
        try {
            return w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 0).versionName;
        } catch (Exception e) {
            f8.g(e, true);
            return "";
        }
    }

    public static int d() {
        try {
            return w0.f18945b.getPackageManager().getPackageInfo(w0.f18945b.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            f8.g(e, true);
            return 0;
        }
    }

    public static k1 e() {
        if (f16537m == null) {
            f16537m = new k1();
        }
        return f16537m;
    }

    public final void a(Runnable runnable, boolean z10) {
        long j10;
        if (!this.h) {
            if (this.f16542g) {
                z10 = true;
            }
            if (!z10) {
                long currentTimeMillis = System.currentTimeMillis() - this.e;
                if (w0.f18952x) {
                    j10 = 86400000;
                } else {
                    boolean z11 = v2.f18578a;
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
            this.f16542g = false;
            new org.telegram.ui.web.c1(new j1(0, this, runnable)).execute("null");
        }
    }

    public final void b(boolean z10) {
        if (!this.f16544j && TextUtils.isEmpty(this.d)) {
            this.f16544j = true;
            this.f16545k = 0.0f;
            at.e().k(at.R4, new Object[0]);
            if (TextUtils.isEmpty(this.f16541f)) {
                if (!z10) {
                    a(new h1(this, 1), true);
                    return;
                } else {
                    this.f16544j = false;
                    return;
                }
            }
            HttpGetFileTask overrideExtension = new HttpGetFileTask(new r20(this) {
                public final k1 f16195b;

                {
                    this.f16195b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            i0.g3(new e4(13, this.f16195b, (File) obj));
                            return;
                        default:
                            this.f16195b.f16545k = ((Float) obj).floatValue();
                            at.e().k(294, new Object[0]);
                            return;
                    }
                }
            }, new r20(this) {
                public final k1 f16195b;

                {
                    this.f16195b = this;
                }

                @Override
                public final void a(Object obj) {
                    switch (r2) {
                        case 0:
                            i0.g3(new e4(13, this.f16195b, (File) obj));
                            return;
                        default:
                            this.f16195b.f16545k = ((Float) obj).floatValue();
                            at.e().k(294, new Object[0]);
                            return;
                    }
                }
            }).setOverrideExtension("apk");
            this.f16546l = overrideExtension;
            overrideExtension.execute(this.f16541f);
        }
    }

    public final void f() {
        SharedPreferences.Editor edit = w0.f18945b.getSharedPreferences("beta", 0).edit();
        if (TextUtils.isEmpty(this.f16538a)) {
            edit.remove("version");
        } else {
            edit.putString("version", this.f16538a);
        }
        if (TextUtils.isEmpty(this.f16540c)) {
            edit.remove("changelog");
        } else {
            edit.putString("changelog", this.f16540c);
        }
        int i10 = this.f16539b;
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
