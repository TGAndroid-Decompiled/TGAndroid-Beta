package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FilterInputStream;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class li6 extends h00 {
    public static final Logger s = Logger.getLogger(li6.class.getName());
    public final Level r;

    public li6(BufferedInputStream bufferedInputStream) {
        xi6 c;
        char c2;
        int i;
        long readInt;
        DataInputStream dataInputStream;
        int i2;
        long readInt2;
        int i3;
        Level level = Level.FINEST;
        this.r = level;
        ?? r6 = 1;
        xi6 xi6Var = new xi6(new i51((FilterInputStream) bufferedInputStream), null, "", (byte) 1);
        Logger logger = s;
        if (logger.isLoggable(level)) {
            logger.log(level, xi6Var.toString());
        }
        xi6 d = xi6Var.d("ftyp");
        DataInputStream dataInputStream2 = (DataInputStream) d.e;
        if (logger.isLoggable(level)) {
            logger.log(level, d.toString());
        }
        int i4 = 4;
        byte[] bArr = new byte[4];
        dataInputStream2.readFully(bArr);
        String str = new String(bArr, "ISO8859_1");
        int indexOf = str.indexOf(0);
        String trim = (indexOf >= 0 ? str.substring(0, indexOf) : str).trim();
        this.a = trim;
        if (trim.matches("M4V|MP4|mp42|isom")) {
            StringBuilder sb = new StringBuilder();
            StringBuffer stringBuffer = new StringBuffer();
            xi6.h(stringBuffer, d);
            sb.append(stringBuffer.toString());
            sb.append(": brand=");
            sb.append(this.a);
            sb.append(" (experimental)");
            logger.warning(sb.toString());
        } else if (!this.a.matches("M4A|M4P")) {
            StringBuilder sb2 = new StringBuilder();
            StringBuffer stringBuffer2 = new StringBuffer();
            xi6.h(stringBuffer2, d);
            sb2.append(stringBuffer2.toString());
            sb2.append(": brand=");
            sb2.append(this.a);
            sb2.append(" (expected M4A or M4P)");
            logger.warning(sb2.toString());
        }
        String.valueOf(dataInputStream2.readInt());
        do {
            c = xi6Var.c();
        } while (!((String) c.d).matches("moov"));
        Level level2 = this.r;
        if (logger.isLoggable(level2)) {
            logger.log(level2, c.toString());
        }
        while (c.j()) {
            xi6 c3 = c.c();
            DataInputStream dataInputStream3 = (DataInputStream) c3.e;
            String str2 = (String) c3.d;
            int i5 = 2;
            switch (str2.hashCode()) {
                case 3363941:
                    if (str2.equals("mvhd")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3568424:
                    if (str2.equals("trak")) {
                        c2 = r6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3585340:
                    if (str2.equals("udta")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c3.toString());
                    }
                    byte readByte = dataInputStream3.readByte();
                    c3.n(3);
                    if (readByte == r6) {
                        i = 16;
                    } else {
                        i = 8;
                    }
                    c3.n(i);
                    int readInt3 = dataInputStream3.readInt();
                    if (readByte == r6) {
                        readInt = dataInputStream3.readLong();
                    } else {
                        readInt = dataInputStream3.readInt();
                    }
                    if (this.b == 0) {
                        this.b = (readInt * 1000) / readInt3;
                    } else if (logger.isLoggable(level2)) {
                        dataInputStream = dataInputStream3;
                        long j = (readInt * 1000) / readInt3;
                        if (Math.abs(this.b - j) > 2) {
                            logger.log(level2, "mvhd: duration " + this.b + " -> " + j);
                        }
                        short readShort = dataInputStream.readShort();
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        new BigDecimal(String.valueOf((int) readShort) + "" + String.valueOf(readUnsignedShort));
                        byte readByte2 = dataInputStream.readByte();
                        int readUnsignedByte = dataInputStream.readUnsignedByte();
                        new BigDecimal(String.valueOf((int) readByte2) + "" + String.valueOf(readUnsignedByte));
                        break;
                    }
                    dataInputStream = dataInputStream3;
                    short readShort2 = dataInputStream.readShort();
                    int readUnsignedShort2 = dataInputStream.readUnsignedShort();
                    new BigDecimal(String.valueOf((int) readShort2) + "" + String.valueOf(readUnsignedShort2));
                    byte readByte22 = dataInputStream.readByte();
                    int readUnsignedByte2 = dataInputStream.readUnsignedByte();
                    new BigDecimal(String.valueOf((int) readByte22) + "" + String.valueOf(readUnsignedByte2));
                case 1:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c3.toString());
                    }
                    xi6 k = c3.k("mdia");
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, k.toString());
                    }
                    xi6 d2 = k.d("mdhd");
                    DataInputStream dataInputStream4 = (DataInputStream) d2.e;
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, d2.toString());
                    }
                    byte readByte3 = dataInputStream4.readByte();
                    d2.n(3);
                    if (readByte3 == r6) {
                        i2 = 16;
                    } else {
                        i2 = 8;
                    }
                    d2.n(i2);
                    int readInt4 = dataInputStream4.readInt();
                    if (readByte3 == r6) {
                        readInt2 = dataInputStream4.readLong();
                    } else {
                        readInt2 = dataInputStream4.readInt();
                    }
                    if (this.b == 0) {
                        this.b = (readInt2 * 1000) / readInt4;
                        break;
                    } else if (logger.isLoggable(level2)) {
                        long j2 = (readInt2 * 1000) / readInt4;
                        if (Math.abs(this.b - j2) > 2) {
                            logger.log(level2, "mdhd: duration " + this.b + " -> " + j2);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case 2:
                    if (logger.isLoggable(level2)) {
                        logger.log(level2, c3.toString());
                    }
                    while (true) {
                        if (c3.j()) {
                            xi6 c4 = c3.c();
                            if ("meta".equals((String) c4.d)) {
                                if (logger.isLoggable(level2)) {
                                    logger.log(level2, c4.toString());
                                }
                                c4.n(i4);
                                while (true) {
                                    if (c4.j()) {
                                        xi6 c5 = c4.c();
                                        if ("ilst".equals((String) c5.d)) {
                                            if (logger.isLoggable(level2)) {
                                                logger.log(level2, c5.toString());
                                            }
                                            while (c5.j()) {
                                                xi6 c6 = c5.c();
                                                if (logger.isLoggable(level2)) {
                                                    logger.log(level2, c6.toString());
                                                }
                                                if (c6.i() == 0) {
                                                    if (logger.isLoggable(level2)) {
                                                        StringBuilder sb3 = new StringBuilder();
                                                        StringBuffer stringBuffer3 = new StringBuffer();
                                                        xi6.h(stringBuffer3, c6);
                                                        sb3.append(stringBuffer3.toString());
                                                        sb3.append(": contains no value");
                                                        logger.log(level2, sb3.toString());
                                                    }
                                                } else {
                                                    xi6 k2 = c6.k("data");
                                                    DataInputStream dataInputStream5 = (DataInputStream) k2.e;
                                                    if (logger.isLoggable(level2)) {
                                                        logger.log(level2, k2.toString());
                                                    }
                                                    k2.n(i4);
                                                    k2.n(i4);
                                                    String str3 = (String) ((yi6) k2.c).d;
                                                    switch (str3.hashCode()) {
                                                        case 2954818:
                                                            if (str3.equals("aART")) {
                                                                i3 = 0;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3059752:
                                                            if (str3.equals("covr")) {
                                                                i3 = r6;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3060304:
                                                            if (str3.equals("cpil")) {
                                                                i3 = i5;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3060591:
                                                            if (str3.equals("cprt")) {
                                                                i3 = 3;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3083677:
                                                            if (str3.equals("disk")) {
                                                                i3 = i4;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3177818:
                                                            if (str3.equals("gnre")) {
                                                                i3 = 5;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3511163:
                                                            if (str3.equals("rtng")) {
                                                                i3 = 6;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3564088:
                                                            if (str3.equals("tmpo")) {
                                                                i3 = 7;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 3568737:
                                                            if (str3.equals("trkn")) {
                                                                i3 = 8;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5099770:
                                                            if (str3.equals("©ART")) {
                                                                i3 = 9;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5131342:
                                                            if (str3.equals("©alb")) {
                                                                i3 = 10;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5133313:
                                                            if (str3.equals("©cmt")) {
                                                                i3 = 11;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5133368:
                                                            if (str3.equals("©com")) {
                                                                i3 = 12;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5133411:
                                                            if (str3.equals("©cpy")) {
                                                                i3 = 13;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5133907:
                                                            if (str3.equals("©day")) {
                                                                i3 = 14;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5136903:
                                                            if (str3.equals("©gen")) {
                                                                i3 = 15;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5137308:
                                                            if (str3.equals("©grp")) {
                                                                i3 = 16;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5142332:
                                                            if (str3.equals("©lyr")) {
                                                                i3 = 17;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5143505:
                                                            if (str3.equals("©nam")) {
                                                                i3 = 18;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        case 5152688:
                                                            if (str3.equals("©wrt")) {
                                                                i3 = 19;
                                                                break;
                                                            }
                                                            i3 = -1;
                                                            break;
                                                        default:
                                                            i3 = -1;
                                                            break;
                                                    }
                                                    switch (i3) {
                                                        case 0:
                                                            this.e = k2.m();
                                                            break;
                                                        case 1:
                                                            try {
                                                                int i6 = (int) k2.i();
                                                                byte[] bArr2 = new byte[i6];
                                                                dataInputStream5.readFully(bArr2);
                                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                                options.inJustDecodeBounds = r6;
                                                                options.inSampleSize = r6;
                                                                BitmapFactory.decodeByteArray(bArr2, 0, i6, options);
                                                                int i7 = options.outWidth;
                                                                if (i7 > 800 || options.outHeight > 800) {
                                                                    for (int max = Math.max(i7, options.outHeight); max > 800; max /= 2) {
                                                                        options.inSampleSize <<= r6;
                                                                    }
                                                                }
                                                                options.inJustDecodeBounds = false;
                                                                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr2, 0, i6, options);
                                                                this.o = decodeByteArray;
                                                                if (decodeByteArray != null) {
                                                                    float max2 = Math.max(decodeByteArray.getWidth(), this.o.getHeight()) / 120.0f;
                                                                    int i8 = (max2 > 0.0f ? 1 : (max2 == 0.0f ? 0 : -1));
                                                                    Bitmap bitmap = this.o;
                                                                    if (i8 > 0) {
                                                                        bitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / max2), (int) (this.o.getHeight() / max2), r6);
                                                                        this.p = bitmap;
                                                                    } else {
                                                                        this.p = bitmap;
                                                                    }
                                                                    if (bitmap == null) {
                                                                        this.p = this.o;
                                                                        break;
                                                                    }
                                                                }
                                                            } catch (Exception e) {
                                                                e.printStackTrace();
                                                                break;
                                                            }
                                                            break;
                                                        case 2:
                                                            dataInputStream5.readBoolean();
                                                            break;
                                                        case 3:
                                                        case 13:
                                                            String str4 = this.l;
                                                            if (str4 == null || str4.trim().length() == 0) {
                                                                this.l = k2.m();
                                                                break;
                                                            }
                                                            break;
                                                        case 4:
                                                            k2.n(i5);
                                                            this.k = dataInputStream5.readShort();
                                                            k2.l();
                                                            break;
                                                        case 5:
                                                            String str5 = this.h;
                                                            if (str5 == null || str5.trim().length() == 0) {
                                                                if (k2.i() == 2) {
                                                                    int b = qd4.b(dataInputStream5.readShort() - r6);
                                                                    if (b != 0) {
                                                                        this.h = qd4.d(b);
                                                                        break;
                                                                    }
                                                                } else {
                                                                    this.h = k2.m();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        case 6:
                                                            dataInputStream5.readByte();
                                                            break;
                                                        case 7:
                                                            k2.l();
                                                            break;
                                                        case 8:
                                                            k2.n(i5);
                                                            this.j = dataInputStream5.readShort();
                                                            k2.l();
                                                            break;
                                                        case 9:
                                                            this.d = k2.m();
                                                            break;
                                                        case 10:
                                                            this.f = k2.m();
                                                            break;
                                                        case 11:
                                                            this.i = k2.m();
                                                            break;
                                                        case 12:
                                                        case 19:
                                                            String str6 = this.m;
                                                            if (str6 == null || str6.trim().length() == 0) {
                                                                this.m = k2.m();
                                                                break;
                                                            }
                                                            break;
                                                        case 14:
                                                            String trim2 = k2.m().trim();
                                                            if (trim2.length() >= i4) {
                                                                try {
                                                                    this.g = Short.valueOf(trim2.substring(0, i4)).shortValue();
                                                                    break;
                                                                } catch (NumberFormatException unused) {
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                        case 15:
                                                            String str7 = this.h;
                                                            if (str7 == null || str7.trim().length() == 0) {
                                                                this.h = k2.m();
                                                                break;
                                                            }
                                                            break;
                                                        case 16:
                                                            k2.m();
                                                            break;
                                                        case 17:
                                                            this.n = k2.m();
                                                            break;
                                                        case 18:
                                                            this.c = k2.m();
                                                            break;
                                                    }
                                                    i4 = 4;
                                                    i5 = 2;
                                                }
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
            r6 = 1;
            i4 = 4;
        }
    }
}
