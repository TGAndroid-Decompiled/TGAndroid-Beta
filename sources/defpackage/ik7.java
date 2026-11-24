package defpackage;

import android.os.Build;
public abstract class ik7 {
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
                        if (e21.a) {
                            fc4.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e) {
            fc4.g(e, true);
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("686")) {
            return "x86";
        }
        return str2;
    }

    public static void b(int i, yw7 yw7Var) {
        yw7Var.K(7);
        byte[] bArr = yw7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static synchronized void c(android.content.Context r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik7.c(android.content.Context):void");
    }

    public static boolean d(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik7.d(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static defpackage.i4 e(defpackage.ye1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik7.e(ye1):i4");
    }

    public static void f(ye1 ye1Var, h4 h4Var) {
        int f = ye1Var.f(5);
        ye1Var.n(2);
        if (ye1Var.e()) {
            ye1Var.n(5);
        }
        if (f >= 7 && f <= 10) {
            ye1Var.m();
        }
        if (ye1Var.e()) {
            int f2 = ye1Var.f(3);
            if (h4Var.b == -1 && f >= 0 && f <= 15 && (f2 == 0 || f2 == 1)) {
                h4Var.b = f;
            }
            if (ye1Var.e()) {
                h(ye1Var);
            }
        }
    }

    public static void g(ye1 ye1Var, h4 h4Var) {
        ye1Var.n(2);
        boolean e = ye1Var.e();
        int f = ye1Var.f(8);
        for (int i = 0; i < f; i++) {
            ye1Var.n(2);
            if (ye1Var.e()) {
                ye1Var.n(5);
            }
            if (e) {
                ye1Var.n(24);
            } else {
                if (ye1Var.e()) {
                    if (!ye1Var.e()) {
                        ye1Var.n(4);
                    }
                    h4Var.c = ye1Var.f(6) + 1;
                }
                ye1Var.n(4);
            }
        }
        if (ye1Var.e()) {
            ye1Var.n(3);
            if (ye1Var.e()) {
                h(ye1Var);
            }
        }
    }

    public static void h(ye1 ye1Var) {
        int f = ye1Var.f(6);
        if (f >= 2 && f <= 42) {
            ye1Var.n(f << 3);
            return;
        }
        throw bx7.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(f)));
    }
}
