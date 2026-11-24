package defpackage;

import java.io.DataInputStream;
import java.io.EOFException;
public final class sg6 extends tg6 {
    public final byte g;

    public sg6(a51 a51Var, tg6 tg6Var, String str, byte b) {
        super(a51Var, tg6Var, str);
        this.g = b;
    }

    public static void h(StringBuffer stringBuffer, tg6 tg6Var) {
        tg6 tg6Var2 = (tg6) tg6Var.c;
        if (tg6Var2 != null) {
            h(stringBuffer, tg6Var2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) tg6Var.d);
    }

    public final long i() {
        return ((zy8) ((a51) this.b)).e();
    }

    public final boolean j() {
        long j;
        sg6 sg6Var = (sg6) this.f;
        if (sg6Var != null) {
            j = sg6Var.i();
        } else {
            j = 0;
        }
        if (j < i()) {
            return true;
        }
        return false;
    }

    public final sg6 k(String str) {
        while (i() > 0) {
            sg6 c = c();
            if (((String) c.d).matches(str)) {
                return c;
            }
        }
        k93.f("atom type mismatch, not found: ".concat(str));
        return null;
    }

    public final short l() {
        return ((DataInputStream) this.e).readShort();
    }

    public final String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public final void n(int i) {
        int i2 = 0;
        while (i2 < i) {
            int skipBytes = ((DataInputStream) this.e).skipBytes(i - i2);
            if (skipBytes > 0) {
                i2 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j = ((a51) ((tg6) this.c).b).b;
                a51 a51Var = (a51) this.b;
                stringBuffer.append(j - a51Var.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(a51Var.b);
                stringBuffer.append(",len=");
                zy8 zy8Var = (zy8) a51Var;
                stringBuffer.append(zy8Var.e() + zy8Var.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return ls6.p(new StringBuilder("mp4[pos="), ((a51) this.b).b, "]");
        }
    }
}
