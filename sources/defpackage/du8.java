package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
public abstract class du8 {
    public static final ec9 a = new Object();
    public static final Object b = new Object();
    public static kg7 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return bu8.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static kg7 b() {
        kg7 kg7Var = new kg7((byte) 24);
        c = kg7Var;
        a.k(kg7Var);
        return c;
    }

    public static void c(Context context, boolean z) {
        boolean z2;
        boolean z3;
        cu8 a2;
        int i;
        if (z || c == null) {
            synchronized (b) {
                if (!z) {
                    if (c != null) {
                        return;
                    }
                }
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 28 && i2 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    int i3 = 0;
                    if (file.exists() && length > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    if (file2.exists() && length2 > 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    try {
                        long a3 = a(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a2 = cu8.a(file3);
                            } catch (IOException unused) {
                                b();
                                return;
                            }
                        } else {
                            a2 = null;
                        }
                        if (a2 != null && a2.c == a3 && (i = a2.b) != 2) {
                            i3 = i;
                        } else if (z2) {
                            i3 = 1;
                        } else if (z3) {
                            i3 = 2;
                        }
                        if (z && z3 && i3 != 1) {
                            i3 = 2;
                        }
                        if (a2 != null && a2.b == 2 && i3 == 1 && length < a2.d) {
                            i3 = 3;
                        }
                        cu8 cu8Var = new cu8(1, i3, a3, length2);
                        if (a2 == null || !a2.equals(cu8Var)) {
                            try {
                                cu8Var.b(file3);
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
