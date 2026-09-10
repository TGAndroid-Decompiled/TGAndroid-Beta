package lf;

import com.google.android.gms.common.api.internal.n1;
import java.io.EOFException;
import java.io.InputStream;
public final class e {
    public static final n1 e = new n1(1);
    public final mf.a f12904a;
    public final i f12905b;
    public final f f12906c;
    public final l2.g d;

    public e(InputStream inputStream, long j3, int i10, i iVar, f fVar) {
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f12904a = aVar;
        this.d = new l2.g(aVar, 1);
        this.f12905b = iVar;
        this.f12906c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f12902b;
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
            String str = new String(bArr, 0, i10, bVar.f12901a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte F = this.d.F();
        if (F != 0) {
            if (F != 1) {
                if (F != 2) {
                    if (F == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(hc.b.j(F, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f12904a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f12903a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f12903a = new byte[length];
            }
            byte[] bArr2 = dVar.f12903a;
            int i11 = 0;
            while (true) {
                l2.g gVar = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) gVar.f12719b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    gVar.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(hc.b.j(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f12904a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f12903a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f12903a = new byte[length];
        }
        byte[] bArr2 = dVar.f12903a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte F = this.d.F();
            bArr2[i12] = F;
            if (F == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f12902b;
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
        mf.a aVar = this.f12904a;
        sb2.append(aVar.f6077b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
