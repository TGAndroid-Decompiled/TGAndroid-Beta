package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class ij5 extends h00 {
    public static final Logger s = Logger.getLogger(ij5.class.getName());
    public byte r;

    public static boolean b(wi6 wi6Var) {
        boolean z;
        wi6Var.mark(3);
        try {
            if (wi6Var.read() == 73 && wi6Var.read() == 68) {
                if (wi6Var.read() == 51) {
                    z = true;
                    return z;
                }
            }
            z = false;
            return z;
        } finally {
            wi6Var.reset();
        }
    }

    public static j5 c(gj5 gj5Var) {
        dj5 b = gj5Var.b();
        gj5Var.c(3, dj5.ISO_8859_1);
        return new j5(gj5Var.d(200, b), gj5Var.c((int) gj5Var.a.e(), b), (byte) 3, false);
    }

    public static String e(gj5 gj5Var) {
        return gj5Var.c((int) gj5Var.a.e(), gj5Var.b());
    }

    public final void d(gj5 gj5Var) {
        int i;
        hj5 hj5Var = gj5Var.c;
        Level level = Level.FINEST;
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, "Parsing frame: " + hj5Var.a);
        }
        String str = hj5Var.a;
        str.getClass();
        int i2 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case 66913:
                if (str.equals("COM")) {
                    c = 0;
                    break;
                }
                break;
            case 79210:
                if (str.equals("PIC")) {
                    c = 1;
                    break;
                }
                break;
            case 82815:
                if (str.equals("TAL")) {
                    c = 2;
                    break;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 3;
                    break;
                }
                break;
            case 82880:
                if (str.equals("TCO")) {
                    c = 4;
                    break;
                }
                break;
            case 82881:
                if (str.equals("TCP")) {
                    c = 5;
                    break;
                }
                break;
            case 82883:
                if (str.equals("TCR")) {
                    c = 6;
                    break;
                }
                break;
            case 83149:
                if (str.equals("TLE")) {
                    c = 7;
                    break;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = '\b';
                    break;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = '\t';
                    break;
                }
                break;
            case 83269:
                if (str.equals("TPA")) {
                    c = '\n';
                    break;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 11;
                    break;
                }
                break;
            case 83377:
                if (str.equals("TT1")) {
                    c = '\f';
                    break;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = '\r';
                    break;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = 14;
                    break;
                }
                break;
            case 84125:
                if (str.equals("ULT")) {
                    c = 15;
                    break;
                }
                break;
            case 2015625:
                if (str.equals("APIC")) {
                    c = 16;
                    break;
                }
                break;
            case 2074380:
                if (str.equals("COMM")) {
                    c = 17;
                    break;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = 18;
                    break;
                }
                break;
            case 2569298:
                if (str.equals("TCMP")) {
                    c = 19;
                    break;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 20;
                    break;
                }
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = 21;
                    break;
                }
                break;
            case 2569360:
                if (str.equals("TCOP")) {
                    c = 22;
                    break;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 23;
                    break;
                }
                break;
            case 2575250:
                if (str.equals("TIT1")) {
                    c = 24;
                    break;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 25;
                    break;
                }
                break;
            case 2577697:
                if (str.equals("TLEN")) {
                    c = 26;
                    break;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 27;
                    break;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 28;
                    break;
                }
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 29;
                    break;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 30;
                    break;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 31;
                    break;
                }
                break;
            case 2614438:
                if (str.equals("USLT")) {
                    c = ' ';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 17:
                j5 c2 = c(gj5Var);
                if (this.i != null && !"".equals(c2.b)) {
                    return;
                }
                this.i = c2.c;
                return;
            case 1:
            case 16:
                if (this.o == null || this.r != 3) {
                    dj5 b = gj5Var.b();
                    xh4 xh4Var = gj5Var.d;
                    if (gj5Var.b.a == 2) {
                        gj5Var.c(3, dj5.ISO_8859_1).toUpperCase().getClass();
                    } else {
                        gj5Var.d(20, dj5.ISO_8859_1);
                    }
                    byte J = xh4Var.J();
                    gj5Var.d(200, b);
                    int e = (int) gj5Var.a.e();
                    byte[] bArr = new byte[e];
                    int i3 = 0;
                    while (i3 < e) {
                        int read = ((i51) xh4Var.b).read(bArr, i3, e - i3);
                        if (read > 0) {
                            i3 += read;
                        } else {
                            throw new EOFException();
                        }
                    }
                    if (this.o == null || J == 3 || J == 0) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            options.inSampleSize = 1;
                            BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            int i4 = options.outWidth;
                            if (i4 > 800 || options.outHeight > 800) {
                                for (int max = Math.max(i4, options.outHeight); max > 800; max /= 2) {
                                    options.inSampleSize <<= 1;
                                }
                            }
                            options.inJustDecodeBounds = false;
                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, e, options);
                            this.o = decodeByteArray;
                            if (decodeByteArray != null) {
                                float max2 = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                int i5 = (max2 > 0.0f ? 1 : (max2 == 0.0f ? 0 : -1));
                                Bitmap bitmap = this.o;
                                if (i5 > 0) {
                                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / max2), (int) (this.o.getHeight() / max2), true);
                                    this.p = bitmap;
                                } else {
                                    this.p = bitmap;
                                }
                                if (bitmap == null) {
                                    this.p = this.o;
                                }
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                        this.r = J;
                        return;
                    }
                    return;
                }
                return;
            case 2:
            case 18:
                this.f = e(gj5Var);
                return;
            case 3:
            case 20:
                this.m = e(gj5Var);
                return;
            case 4:
            case 21:
                String e2 = e(gj5Var);
                if (e2.length() > 0) {
                    this.h = e2;
                    try {
                        if (e2.charAt(0) == '(') {
                            int indexOf = e2.indexOf(41);
                            if (indexOf > 1 && (i2 = qd4.b(Integer.parseInt(e2.substring(1, indexOf)))) == 0 && e2.length() > (i = indexOf + 1)) {
                                this.h = e2.substring(i);
                            }
                        } else {
                            i2 = qd4.b(Integer.parseInt(e2));
                        }
                        if (i2 != 0) {
                            this.h = qd4.d(i2);
                            return;
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        return;
                    }
                }
                return;
            case 5:
            case 19:
                "1".equals(e(gj5Var));
                return;
            case 6:
            case 22:
                this.l = e(gj5Var);
                return;
            case 7:
            case 26:
                String e3 = e(gj5Var);
                try {
                    this.b = Long.valueOf(e3).longValue();
                    return;
                } catch (NumberFormatException unused2) {
                    if (logger.isLoggable(level)) {
                        logger.log(level, "Could not parse track duration: ".concat(e3));
                        return;
                    }
                    return;
                }
            case '\b':
            case 27:
                this.d = e(gj5Var);
                return;
            case '\t':
            case 28:
                this.e = e(gj5Var);
                return;
            case '\n':
            case 29:
                String e4 = e(gj5Var);
                if (e4.length() > 0) {
                    int indexOf2 = e4.indexOf(47);
                    if (indexOf2 < 0) {
                        try {
                            this.k = Short.valueOf(e4).shortValue();
                            return;
                        } catch (NumberFormatException unused3) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse disc number: ".concat(e4));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.k = Short.valueOf(e4.substring(0, indexOf2)).shortValue();
                    } catch (NumberFormatException unused4) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse disc number: ".concat(e4));
                        }
                    }
                    try {
                        Short.valueOf(e4.substring(indexOf2 + 1));
                        return;
                    } catch (NumberFormatException unused5) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of discs: ".concat(e4));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 11:
            case 30:
                String e5 = e(gj5Var);
                if (e5.length() > 0) {
                    int indexOf3 = e5.indexOf(47);
                    if (indexOf3 < 0) {
                        try {
                            this.j = Short.valueOf(e5).shortValue();
                            return;
                        } catch (NumberFormatException unused6) {
                            if (logger.isLoggable(level)) {
                                logger.log(level, "Could not parse track number: ".concat(e5));
                                return;
                            }
                            return;
                        }
                    }
                    try {
                        this.j = Short.valueOf(e5.substring(0, indexOf3)).shortValue();
                    } catch (NumberFormatException unused7) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse track number: ".concat(e5));
                        }
                    }
                    try {
                        Short.valueOf(e5.substring(indexOf3 + 1));
                        return;
                    } catch (NumberFormatException unused8) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse number of tracks: ".concat(e5));
                            return;
                        }
                        return;
                    }
                }
                return;
            case '\f':
            case 24:
                e(gj5Var);
                return;
            case '\r':
            case 25:
                this.c = e(gj5Var);
                return;
            case 14:
            case 31:
                String e6 = e(gj5Var);
                if (e6.length() > 0) {
                    try {
                        this.g = Short.valueOf(e6).shortValue();
                        return;
                    } catch (NumberFormatException unused9) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year: ".concat(e6));
                            return;
                        }
                        return;
                    }
                }
                return;
            case 15:
            case ' ':
                if (this.n == null) {
                    this.n = c(gj5Var).c;
                    return;
                }
                return;
            case 23:
                String e7 = e(gj5Var);
                if (e7.length() >= 4) {
                    try {
                        this.g = Short.valueOf(e7.substring(0, 4)).shortValue();
                        return;
                    } catch (NumberFormatException unused10) {
                        if (logger.isLoggable(level)) {
                            logger.log(level, "Could not parse year from: ".concat(e7));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
