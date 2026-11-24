package defpackage;

import android.os.Build;
public abstract class gi7 {
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
                        if (w01.a) {
                            fa4.d("Unsupported arch: ".concat(str3));
                        }
                    }
                }
                str = "armeabi";
            }
            str2 = str;
        } catch (Exception e) {
            fa4.g(e, true);
        }
        String property = System.getProperty("os.arch");
        if (property != null && property.contains("686")) {
            return "x86";
        }
        return str2;
    }

    public static void b(int i, xu7 xu7Var) {
        xu7Var.K(7);
        byte[] bArr = xu7Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static synchronized void c(android.content.Context r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi7.c(android.content.Context):void");
    }

    public static boolean d(android.content.Context r6, java.io.File r7, java.io.File r8, java.lang.String r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi7.d(android.content.Context, java.io.File, java.io.File, java.lang.String):boolean");
    }

    public static defpackage.i4 e(defpackage.qd1 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi7.e(qd1):i4");
    }

    public static void f(qd1 qd1Var, h4 h4Var) {
        int f = qd1Var.f(5);
        qd1Var.n(2);
        if (qd1Var.e()) {
            qd1Var.n(5);
        }
        if (f >= 7 && f <= 10) {
            qd1Var.m();
        }
        if (qd1Var.e()) {
            int f2 = qd1Var.f(3);
            if (h4Var.b == -1 && f >= 0 && f <= 15 && (f2 == 0 || f2 == 1)) {
                h4Var.b = f;
            }
            if (qd1Var.e()) {
                h(qd1Var);
            }
        }
    }

    public static void g(qd1 qd1Var, h4 h4Var) {
        qd1Var.n(2);
        boolean e = qd1Var.e();
        int f = qd1Var.f(8);
        for (int i = 0; i < f; i++) {
            qd1Var.n(2);
            if (qd1Var.e()) {
                qd1Var.n(5);
            }
            if (e) {
                qd1Var.n(24);
            } else {
                if (qd1Var.e()) {
                    if (!qd1Var.e()) {
                        qd1Var.n(4);
                    }
                    h4Var.c = qd1Var.f(6) + 1;
                }
                qd1Var.n(4);
            }
        }
        if (qd1Var.e()) {
            qd1Var.n(3);
            if (qd1Var.e()) {
                h(qd1Var);
            }
        }
    }

    public static void h(qd1 qd1Var) {
        int f = qd1Var.f(6);
        if (f >= 2 && f <= 42) {
            qd1Var.n(f << 3);
            return;
        }
        throw av7.d(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(f)));
    }
}
