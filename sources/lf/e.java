package lf;

import com.google.android.gms.common.api.internal.n1;
import hg.k0;
import java.io.EOFException;
import java.io.InputStream;
import k2.c0;
public final class e {
    public static final n1 e = new n1(1);
    public final mf.a f14009a;
    public final i f14010b;
    public final f f14011c;
    public final c0 d;

    public e(InputStream inputStream, long j3, int i10, i iVar, f fVar) {
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f14009a = aVar;
        this.d = new c0(aVar, 3);
        this.f14010b = iVar;
        this.f14011c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f14007b;
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
            String str = new String(bArr, 0, i10, bVar.f14006a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte o9 = this.d.o();
        if (o9 != 0) {
            if (o9 != 1) {
                if (o9 != 2) {
                    if (o9 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(k0.i(o9, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f14009a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f14008a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f14008a = new byte[length];
            }
            byte[] bArr2 = dVar.f14008a;
            int i11 = 0;
            while (true) {
                c0 c0Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) c0Var.f13234b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    c0Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(k0.i(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f14009a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f14008a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f14008a = new byte[length];
        }
        byte[] bArr2 = dVar.f14008a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte o9 = this.d.o();
            bArr2[i12] = o9;
            if (o9 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f14007b;
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
        mf.a aVar = this.f14009a;
        sb2.append(aVar.f7302b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
