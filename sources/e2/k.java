package e2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;

public abstract class k {

    public static final c0.l f5181a = new c0.l();

    public static final Object f5182b = new Object();

    public static w9.d f5183c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? i.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static w9.d b() {
        w9.d dVar = new w9.d(5);
        f5183c = dVar;
        f5181a.k(dVar);
        return f5183c;
    }

    public static void c(Context context, boolean z10) {
        j jVarA;
        int i10;
        if (z10 || f5183c == null) {
            synchronized (f5182b) {
                if (!z10) {
                    try {
                        if (f5183c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i12 = 0;
                    boolean z11 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z12 = file2.exists() && length2 > 0;
                    try {
                        long jA = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                jVarA = j.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            jVarA = null;
                        }
                        if (jVarA != null && jVarA.f5180c == jA && (i10 = jVarA.f5179b) != 2) {
                            i12 = i10;
                        } else if (z11) {
                            i12 = 1;
                        } else if (z12) {
                            i12 = 2;
                        }
                        if (z10 && z12 && i12 != 1) {
                            i12 = 2;
                        }
                        j jVar = new j(jA, 1, (jVarA == null || jVarA.f5179b != 2 || i12 != 1 || length >= jVarA.d) ? i12 : 3, length2);
                        if (jVarA == null || !jVarA.equals(jVar)) {
                            try {
                                jVar.b(file3);
                            } catch (IOException unused2) {
                            }
                        }
                        b();
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        b();
                        return;
                    }
                }
                b();
            }
        }
    }
}
