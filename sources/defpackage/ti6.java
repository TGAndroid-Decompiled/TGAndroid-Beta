package defpackage;

import java.io.DataInputStream;
import java.io.EOFException;
public final class ti6 extends ui6 {
    public final byte g;

    public ti6(h61 h61Var, ui6 ui6Var, String str, byte b) {
        super(h61Var, ui6Var, str);
        this.g = b;
    }

    public static void h(StringBuffer stringBuffer, ui6 ui6Var) {
        ui6 ui6Var2 = (ui6) ui6Var.c;
        if (ui6Var2 != null) {
            h(stringBuffer, ui6Var2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) ui6Var.d);
    }

    public final long i() {
        return ((a19) ((h61) this.b)).e();
    }

    public final boolean j() {
        long j;
        ti6 ti6Var = (ti6) this.f;
        if (ti6Var != null) {
            j = ti6Var.i();
        } else {
            j = 0;
        }
        if (j < i()) {
            return true;
        }
        return false;
    }

    public final ti6 k(String str) {
        while (i() > 0) {
            ti6 c = c();
            if (((String) c.d).matches(str)) {
                return c;
            }
        }
        wa3.d("atom type mismatch, not found: ".concat(str));
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
                long j = ((h61) ((ui6) this.c).b).b;
                h61 h61Var = (h61) this.b;
                stringBuffer.append(j - h61Var.b);
                stringBuffer.append(",pos=");
                stringBuffer.append(h61Var.b);
                stringBuffer.append(",len=");
                a19 a19Var = (a19) h61Var;
                stringBuffer.append(a19Var.e() + a19Var.b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return kt6.q(new StringBuilder("mp4[pos="), ((h61) this.b).b, "]");
        }
    }
}
