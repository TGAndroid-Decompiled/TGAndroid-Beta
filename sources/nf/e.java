package nf;

import com.google.android.gms.common.api.internal.n1;
import java.io.EOFException;
import java.io.InputStream;
import ji.d4;
public final class e {
    public static final n1 e = new n1(1);
    public final of.a f16327a;
    public final h f16328b;
    public final f f16329c;
    public final d4 d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        of.a aVar = new of.a(inputStream, j10, i10);
        this.f16327a = aVar;
        this.d = new d4(aVar, 7);
        this.f16328b = hVar;
        this.f16329c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f16325b;
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
            String str = new String(bArr, 0, i10, bVar.f16324a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte g10 = this.d.g();
        if (g10 != 0) {
            if (g10 != 1) {
                if (g10 != 2) {
                    if (g10 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i2.d.i(g10, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f16327a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f16326a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f16326a = new byte[length];
            }
            byte[] bArr2 = dVar.f16326a;
            int i11 = 0;
            while (true) {
                d4 d4Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) d4Var.f13233b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    d4Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(i2.d.i(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f16327a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f16326a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f16326a = new byte[length];
        }
        byte[] bArr2 = dVar.f16326a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte g10 = this.d.g();
            bArr2[i12] = g10;
            if (g10 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f16325b;
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
        of.a aVar = this.f16327a;
        sb2.append(aVar.f6169b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
