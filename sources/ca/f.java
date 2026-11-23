package ca;
public final class f implements l {
    public static final qb.a f5111c = new qb.a(6);
    public final Object f5112a;
    public Object f5113b;

    public f(ga.d dVar) {
        this.f5112a = dVar;
        this.f5113b = f5111c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f5113b;
        try {
            kVar.read((byte[]) this.f5112a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5112a = bArr;
        this.f5113b = iArr;
    }
}
