package ef;

import com.google.android.gms.common.api.internal.o1;
import java.io.EOFException;
import java.io.InputStream;
public final class e {
    public static final o1 e = new o1(1);
    public final ff.b f6495a;
    public final h f6496b;
    public final f f6497c;
    public final k6.h d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        ff.b bVar = new ff.b(inputStream, j10, i10);
        this.f6495a = bVar;
        this.d = new k6.h(bVar, 22);
        this.f6496b = hVar;
        this.f6497c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f6493b;
                    if (i11 == i13) {
                        i10 = (i12 + 1) - i13;
                        break;
                    }
                } else {
                    i11 = 0;
                }
            }
        }
        try {
            String str = new String(bArr, 0, i10, bVar.f6492a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte v = this.d.v();
        if (v != 0) {
            if (v != 1) {
                if (v != 2) {
                    if (v == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i0.a.i(v, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f6495a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f6494a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f6494a = new byte[length];
            }
            byte[] bArr2 = dVar.f6494a;
            int i11 = 0;
            while (true) {
                k6.h hVar = this.d;
                if (i11 < i10) {
                    int read = ((ff.a) hVar.f10944b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    hVar.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(i0.a.i(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f6495a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f6494a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f6494a = new byte[length];
        }
        byte[] bArr2 = dVar.f6494a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte v = this.d.v();
            bArr2[i12] = v;
            if (v == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f6493b;
                if (i11 == i13) {
                    return a(bArr2, (i12 + 1) - i13, bVar, false);
                }
            } else {
                i11 = 0;
            }
        }
        throw new Exception("Could not read zero-termiated string");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("id3v2frame[pos=");
        ff.b bVar = this.f6495a;
        sb2.append(bVar.f7056b);
        sb2.append(", ");
        sb2.append(bVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
