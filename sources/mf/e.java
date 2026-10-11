package mf;

import com.google.android.gms.common.api.internal.n1;
import java.io.EOFException;
import java.io.InputStream;
import k2.g0;
public final class e {
    public static final n1 f16406e = new n1(1);
    public final nf.a f16407a;
    public final h f16408b;
    public final f f16409c;
    public final g0 d;

    public e(InputStream inputStream, long j3, int i10, h hVar, f fVar) {
        nf.a aVar = new nf.a(inputStream, j3, i10);
        this.f16407a = aVar;
        this.d = new g0(aVar, 5);
        this.f16408b = hVar;
        this.f16409c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f16404b;
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
            String str = new String(bArr, 0, i10, bVar.f16403a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte U0 = this.d.U0();
        if (U0 != 0) {
            if (U0 != 1) {
                if (U0 != 2) {
                    if (U0 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(hg.c.h(U0, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f16407a.e()) {
            d dVar = (d) f16406e.get();
            byte[] bArr = dVar.f16405a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f16405a = new byte[length];
            }
            byte[] bArr2 = dVar.f16405a;
            int i11 = 0;
            while (true) {
                g0 g0Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) g0Var.f14469b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    g0Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(hg.c.h(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f16407a.e());
        d dVar = (d) f16406e.get();
        byte[] bArr = dVar.f16405a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f16405a = new byte[length];
        }
        byte[] bArr2 = dVar.f16405a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte U0 = this.d.U0();
            bArr2[i12] = U0;
            if (U0 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f16404b;
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
        nf.a aVar = this.f16407a;
        sb2.append(aVar.f7925b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
