package ca;
public final class f implements l {
    public static final qb.a f4837c = new qb.a(6);
    public final Object f4838a;
    public Object f4839b;

    public f(ga.d dVar) {
        this.f4838a = dVar;
        this.f4839b = f4837c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f4839b;
        try {
            kVar.read((byte[]) this.f4838a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f4838a = bArr;
        this.f4839b = iArr;
    }
}
