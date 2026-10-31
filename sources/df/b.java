package df;

import a1.g;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
public final class b extends c {
    public final int f5875g;

    public b(ff.a aVar, c cVar, String str, int i10) {
        super(aVar, cVar, str);
        this.f5875g = i10;
    }

    public static void h(StringBuffer stringBuffer, c cVar) {
        c cVar2 = (c) cVar.f5878c;
        if (cVar2 != null) {
            h(stringBuffer, cVar2);
            stringBuffer.append("/");
        }
        stringBuffer.append((String) cVar.d);
    }

    public long i() {
        return ((ff.b) ((ff.a) this.f5877b)).e();
    }

    public boolean j() {
        long j10;
        b bVar = (b) this.f5879f;
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
        switch (this.f5875g) {
            case 0:
                StringBuffer stringBuffer = new StringBuffer();
                h(stringBuffer, this);
                stringBuffer.append("[off=");
                long j10 = ((ff.a) ((c) this.f5878c).f5877b).f7055b;
                ff.a aVar = (ff.a) this.f5877b;
                stringBuffer.append(j10 - aVar.f7055b);
                stringBuffer.append(",pos=");
                stringBuffer.append(aVar.f7055b);
                stringBuffer.append(",len=");
                ff.b bVar = (ff.b) aVar;
                stringBuffer.append(bVar.e() + bVar.f7055b);
                stringBuffer.append("]");
                return stringBuffer.toString();
            default:
                return g.q(new StringBuilder("mp4[pos="), ((ff.a) this.f5877b).f7055b, "]");
        }
    }
}
