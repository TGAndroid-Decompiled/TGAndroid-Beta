package ca;
public final class f implements l {
    public static final qb.a f5148c = new qb.a(6);
    public final Object f5149a;
    public Object f5150b;

    public f(ga.d dVar) {
        this.f5149a = dVar;
        this.f5150b = f5148c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f5150b;
        try {
            kVar.read((byte[]) this.f5149a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5149a = bArr;
        this.f5150b = iArr;
    }
}
