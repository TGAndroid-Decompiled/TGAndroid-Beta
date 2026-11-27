package defpackage;

import android.os.Build;
public abstract class pk7 {
    public static volatile boolean a = false;
    public static final StringBuilder b = new StringBuilder();
    public static final int[] c = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static String a() {
        String str = "mips";
        String str2 = "armeabi";
        try {
            String str3 = Build.CPU_ABI;
            if (str3.equalsIgnoreCase("x86_64")) {
                str = "x86_64";
            } else if (str3.equalsIgnoreCase("arm64-v8a")) {
                str = "arm64-v8a";
            } else if (str3.equalsIgnoreCase("armeabi-v7a")) {
                str = "armeabi-v7a";
            } else {
                if (!str3.equalsIgnoreCase("armeabi")) {
                    if (str3.equalsIgnoreCase("x86")) {
                        str = "x86";
                    } else if (!str3.equalsIgnoreCase("mips")) {
                        if (f11.a) {
                            cc4.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e) {
            cc4.g(e, true);
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("686")) {
            return "x86";
        }
        return str2;
    }

    public static void b(int i, ey7 ey7Var) {
        ey7Var.K(7);
        byte[] bArr = ey7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static synchronized void c(android.content.Context r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk7.c(android.content.Context):void");
    }

    public static boolean d(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk7.d(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static defpackage.j4 e(defpackage.zd1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk7.e(zd1):j4");
    }

    public static void f(zd1 zd1Var, i4 i4Var) {
        int f = zd1Var.f(5);
        zd1Var.n(2);
        if (zd1Var.e()) {
            zd1Var.n(5);
        }
        if (f >= 7 && f <= 10) {
            zd1Var.m();
        }
        if (zd1Var.e()) {
            int f2 = zd1Var.f(3);
            if (i4Var.b == -1 && f >= 0 && f <= 15 && (f2 == 0 || f2 == 1)) {
                i4Var.b = f;
            }
            if (zd1Var.e()) {
                h(zd1Var);
            }
        }
    }

    public static void g(zd1 zd1Var, i4 i4Var) {
        zd1Var.n(2);
        boolean e = zd1Var.e();
        int f = zd1Var.f(8);
        for (int i = 0; i < f; i++) {
            zd1Var.n(2);
            if (zd1Var.e()) {
                zd1Var.n(5);
            }
            if (e) {
                zd1Var.n(24);
            } else {
                if (zd1Var.e()) {
                    if (!zd1Var.e()) {
                        zd1Var.n(4);
                    }
                    i4Var.c = zd1Var.f(6) + 1;
                }
                zd1Var.n(4);
            }
        }
        if (zd1Var.e()) {
            zd1Var.n(3);
            if (zd1Var.e()) {
                h(zd1Var);
            }
        }
    }

    public static void h(zd1 zd1Var) {
        int f = zd1Var.f(6);
        if (f >= 2 && f <= 42) {
            zd1Var.n(f << 3);
            return;
        }
        throw hy7.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(f)));
    }
}
