package lf;

import com.google.android.gms.common.api.internal.n1;
import java.io.EOFException;
import java.io.InputStream;
import k2.b0;
public final class e {
    public static final n1 e = new n1(1);
    public final mf.a f13997a;
    public final j f13998b;
    public final f f13999c;
    public final b0 d;

    public e(InputStream inputStream, long j3, int i10, j jVar, f fVar) {
        mf.a aVar = new mf.a(inputStream, j3, i10);
        this.f13997a = aVar;
        this.d = new b0(aVar, 3);
        this.f13998b = jVar;
        this.f13999c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f13995b;
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
            String str = new String(bArr, 0, i10, bVar.f13994a.name());
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
                    throw new Exception(hg.c.i(o9, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f13997a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f13996a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f13996a = new byte[length];
            }
            byte[] bArr2 = dVar.f13996a;
            int i11 = 0;
            while (true) {
                b0 b0Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) b0Var.f13222b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    b0Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(hg.c.i(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f13997a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f13996a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f13996a = new byte[length];
        }
        byte[] bArr2 = dVar.f13996a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte o9 = this.d.o();
            bArr2[i12] = o9;
            if (o9 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f13995b;
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
        mf.a aVar = this.f13997a;
        sb2.append(aVar.f7290b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
