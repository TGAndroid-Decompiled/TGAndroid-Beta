package g9;

import java.io.IOException;

public final class e implements j {

    public static final za.b f6804c = new za.b(7);

    public final Object f6805a;

    public Object f6806b;

    public e(k9.c cVar) {
        this.f6805a = cVar;
        this.f6806b = f6804c;
    }

    @Override
    public void a(i iVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f6806b;
        try {
            iVar.read((byte[]) this.f6805a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f6805a = bArr;
        this.f6806b = iArr;
    }
}
