package ca;
public final class f implements l {
    public static final qb.a f5145c = new qb.a(6);
    public final Object f5146a;
    public Object f5147b;

    public f(ga.d dVar) {
        this.f5146a = dVar;
        this.f5147b = f5145c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f5147b;
        try {
            kVar.read((byte[]) this.f5146a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5146a = bArr;
        this.f5147b = iArr;
    }
}
