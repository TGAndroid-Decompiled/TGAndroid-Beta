package of;

import com.google.android.gms.common.api.internal.m1;
import java.io.EOFException;
import java.io.InputStream;
import li.e3;
public final class e {
    public static final m1 e = new m1(1);
    public final pf.a f19361a;
    public final h f19362b;
    public final f f19363c;
    public final e3 d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        pf.a aVar = new pf.a(inputStream, j10, i10);
        this.f19361a = aVar;
        this.d = new e3(aVar, 6);
        this.f19362b = hVar;
        this.f19363c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f19359b;
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
            String str = new String(bArr, 0, i10, bVar.f19358a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte z02 = this.d.z0();
        if (z02 != 0) {
            if (z02 != 1) {
                if (z02 != 2) {
                    if (z02 == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(ic.a.i(z02, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f19361a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f19360a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f19360a = new byte[length];
            }
            byte[] bArr2 = dVar.f19360a;
            int i11 = 0;
            while (true) {
                e3 e3Var = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) e3Var.f17209b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    e3Var.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(ic.a.i(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f19361a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f19360a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f19360a = new byte[length];
        }
        byte[] bArr2 = dVar.f19360a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte z02 = this.d.z0();
            bArr2[i12] = z02;
            if (z02 == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f19359b;
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
        pf.a aVar = this.f19361a;
        sb2.append(aVar.f7735b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
