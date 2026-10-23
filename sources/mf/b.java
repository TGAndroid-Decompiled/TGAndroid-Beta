package mf;

import a1.g;
import com.google.firebase.messaging.d;
import df.p;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public final class b extends p {
    public final int f16919g;

    public b(d dVar, p pVar, String str, int i10) {
        super(dVar, pVar, str);
        this.f16919g = i10;
    }

    public static void h(StringBuffer stringBuffer, p pVar) {
        p pVar2 = (p) pVar.f7997c;
        if (pVar2 != null) {
            h(stringBuffer, pVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) pVar.d);
    }

    public long i() {
        return ((of.a) ((d) this.f7996b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f7998f;
        if (bVar != null) {
            j10 = bVar.i();
        } else {
            j10 = 0;
        }
        if (j10 < i()) {
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
        return ((DataInputStream) this.e).readShort();
    }

    public String m() {
        byte[] bArr = new byte[(int) i()];
        ((DataInputStream) this.e).readFully(bArr);
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
            int skipBytes = ((DataInputStream) this.e).skipBytes(i10 - i11);
            if (skipBytes > 0) {
                i11 += skipBytes;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override
    public final String toString() {
        switch (this.f16919g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((d) ((p) this.f7997c).f7996b).f7638b;
                d dVar = (d) this.f7996b;
                stringBuffer.append(j10 - dVar.f7638b);
                stringBuffer.append(",pos=");
                stringBuffer.append(dVar.f7638b);
                stringBuffer.append(",len=");
                of.a aVar = (of.a) dVar;
                stringBuffer.append(aVar.e() + aVar.f7638b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return g.r(new StringBuilder("mp4[pos="), ((d) this.f7996b).f7638b, "]");
        }
    }
}
