package defpackage;

import android.graphics.Color;
public abstract class ddd {
    public static ClassLoader a;
    public static Thread b;
    public static final double[] c = {0.819022437996703d, 0.3619062600528904d, -0.1288737815209879d, 0.0329836539323885d, 0.9292868615863434d, 0.0361446663506424d, 0.0481771893596242d, 0.2642395317527308d, 0.6335478284694309d};
    public static final double[] d = {1.2268798758459243d, -0.5578149944602171d, 0.2813910456659647d, -0.0405757452148008d, 1.112286803280317d, -0.0717110580655164d, -0.0763729366746601d, -0.4214933324022432d, 1.5869240198367816d};
    public static final double[] e = {0.210454268309314d, 0.7936177747023054d, -0.0040720430116193d, 1.9779985324311684d, -2.42859224204858d, 0.450593709617411d, 0.0259040424655478d, 0.7827717124575296d, -0.8086757549230774d};
    public static final double[] f = {1.0d, 0.3963377773761749d, 0.2158037573099136d, 1.0d, -0.1055613458156586d, -0.0638541728258133d, 1.0d, -0.0894841775298119d, -1.2914855480194092d};
    public static final double[] g = {0.41239079926595934d, 0.357584339383878d, 0.1804807884018343d, 0.21263900587151027d, 0.715168678767756d, 0.07219231536073371d, 0.01933081871559182d, 0.11919477979462598d, 0.9505321522496607d};
    public static final double[] h = {3.2409699419045226d, -1.537383177570094d, -0.4986107602930034d, -0.9692436362808796d, 1.8759675015077202d, 0.04155505740717559d, 0.05563007969699366d, -0.20397695888897652d, 1.0569715142428786d};

    public static double[] a(double[] dArr, double[] dArr2) {
        double d2 = dArr[0];
        double d3 = dArr2[0];
        double d4 = dArr[1];
        double d5 = dArr2[1];
        double d6 = dArr[2];
        double d7 = dArr2[2];
        return new double[]{(d6 * d7) + (d4 * d5) + (d2 * d3), (dArr[5] * d7) + (dArr[4] * d5) + (dArr[3] * d3), (dArr[8] * d7) + (dArr[7] * d5) + (dArr[6] * d3)};
    }

    public static double[] b(int i) {
        return new double[]{Color.red(i) / 255.0d, Color.green(i) / 255.0d, Color.blue(i) / 255.0d};
    }

    public static double[] c(double[] dArr) {
        double atan2;
        double[] a2 = a(c, a(g, dArr));
        for (int i = 0; i < 3; i++) {
            a2[i] = Math.cbrt(a2[i]);
        }
        double[] a3 = a(e, a2);
        double d2 = a3[0];
        double d3 = a3[1];
        double d4 = a3[2];
        double sqrt = Math.sqrt(Math.pow(d4, 2.0d) + Math.pow(d3, 2.0d));
        if (Math.abs(d3) < 2.0E-4d && Math.abs(d4) < 2.0E-4d) {
            atan2 = Double.NaN;
        } else {
            atan2 = ((((Math.atan2(d4, d3) * 180.0d) / 3.141592653589793d) % 360.0d) + 360.0d) % 360.0d;
        }
        return new double[]{d2, sqrt, atan2};
    }

    public static double[] d(double[] dArr) {
        int i;
        double pow;
        double[] dArr2 = new double[3];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (Math.abs(dArr[i2]) <= 0.04045d) {
                pow = dArr[i2] / 12.92d;
            } else {
                double d2 = dArr[i2];
                if (d2 < 0.0d) {
                    i = -1;
                } else {
                    i = 1;
                }
                pow = Math.pow((Math.abs(d2) + 0.055d) / 1.055d, 2.4d) * i;
            }
            dArr2[i2] = pow;
        }
        return dArr2;
    }

    public static synchronized java.lang.ClassLoader e() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddd.e():java.lang.ClassLoader");
    }
}
