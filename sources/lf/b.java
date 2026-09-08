package lf;

import bf.p;
import com.google.firebase.messaging.d;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public final class b extends p {
    public final int f15432g;

    public b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.f15432g = i10;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f2666c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((nf.a) ((d) this.f2665b)).e();
    }

    public boolean j() {
        long j3;
        b bVar = (b) this.f2668f;
        if (bVar != null) {
            j3 = bVar.i();
        } else {
            j3 = 0;
        }
        if (j3 < i()) {
            return true;
        }
        return false;
    }

    public b k(String str) {
        while (i() > 0) {
            b c10 = c();
            if (((String) c10.d).matches(str)) {
                return c10;
            }
        }
        throw new IOException("atom type mismatch, not found: ".concat(str));
    }

    public short l() {
        return ((DataInputStream) this.f2667e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.f2667e).readFully(bArr);
        String str = new String(bArr, "UTF-8");
        int indexOf = str.indexOf(0);
        if (indexOf < 0) {
            return str;
        }
        return str.substring(0, indexOf);
    }

    public void n(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            int skipBytes = ((DataInputStream) this.f2667e).skipBytes(i10 - i11);
            if (skipBytes > 0) {
                i11 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f15432g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j3 = ((d) ((p) this.f2666c).f2665b).f6374b;
                d dVar = (d) this.f2665b;
                stringBuffer.append(j3 - dVar.f6374b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f6374b);
                stringBuffer.append(",len=");
                nf.a aVar = (nf.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f6374b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return a4.a.r(new StringBuilder("mp4[pos="), ((d) this.f2665b).f6374b, "]");
        }
    }
}
