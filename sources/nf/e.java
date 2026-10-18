package nf;

import com.google.android.gms.common.api.internal.m1;
import java.io.EOFException;
import java.io.InputStream;
public final class e {
    public static final m1 e = new m1(1);
    public final of.a f17421a;
    public final h f17422b;
    public final f f17423c;
    public final k0.b d;

    public e(InputStream inputStream, long j10, int i10, h hVar, f fVar) {
        of.a aVar = new of.a(inputStream, j10, i10);
        this.f17421a = aVar;
        this.d = new k0.b(aVar, 9);
        this.f17422b = hVar;
        this.f17423c = fVar;
    }

    public static String a(byte[] bArr, int i10, b bVar, boolean z10) {
        if (z10) {
            int i11 = 0;
            for (int i12 = 0; i12 < i10; i12++) {
                if (bArr[i12] == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                    i11++;
                    int i13 = bVar.f17419b;
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
            String str = new String(bArr, 0, i10, bVar.f17418a.name());
            if (str.length() > 0 && str.charAt(0) == 65279) {
                return str.substring(1);
            }
            return str;
        } catch (Exception unused) {
            return "";
        }
    }

    public final b b() {
        byte Z = this.d.Z();
        if (Z != 0) {
            if (Z != 1) {
                if (Z != 2) {
                    if (Z == 3) {
                        return b.UTF_8;
                    }
                    throw new Exception(i2.d.j(Z, "Invalid encoding: "));
                }
                return b.UTF_16BE;
            }
            return b.UTF_16;
        }
        return b.ISO_8859_1;
    }

    public final String c(int i10, b bVar) {
        if (i10 <= this.f17421a.e()) {
            d dVar = (d) e.get();
            byte[] bArr = dVar.f17420a;
            if (i10 > bArr.length) {
                int length = bArr.length;
                do {
                    length *= 2;
                } while (i10 > length);
                dVar.f17420a = new byte[length];
            }
            byte[] bArr2 = dVar.f17420a;
            int i11 = 0;
            while (true) {
                k0.b bVar2 = this.d;
                if (i11 < i10) {
                    int read = ((com.google.firebase.messaging.d) bVar2.f14566b).read(bArr2, i11, i10 - i11);
                    if (read > 0) {
                        i11 += read;
                    } else {
                        throw new EOFException();
                    }
                } else {
                    bVar2.getClass();
                    return a(bArr2, i10, bVar, true);
                }
            }
        } else {
            throw new Exception(i2.d.j(i10, "Could not read fixed-length string of length: "));
        }
    }

    public final String d(int i10, b bVar) {
        int min = Math.min(i10, (int) this.f17421a.e());
        d dVar = (d) e.get();
        byte[] bArr = dVar.f17420a;
        if (min > bArr.length) {
            int length = bArr.length;
            do {
                length *= 2;
            } while (min > length);
            dVar.f17420a = new byte[length];
        }
        byte[] bArr2 = dVar.f17420a;
        int i11 = 0;
        for (int i12 = 0; i12 < min; i12++) {
            byte Z = this.d.Z();
            bArr2[i12] = Z;
            if (Z == 0 && (bVar != b.UTF_16 || i11 != 0 || i12 % 2 == 0)) {
                i11++;
                int i13 = bVar.f17419b;
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
        of.a aVar = this.f17421a;
        sb2.append(aVar.f7629b);
        sb2.append(", ");
        sb2.append(aVar.e());
        sb2.append(" left]");
        return sb2.toString();
    }
}
