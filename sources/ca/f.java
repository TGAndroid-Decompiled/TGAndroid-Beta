package ca;
public final class f implements l {
    public static final qb.a f4834c = new qb.a(6);
    public final Object f4835a;
    public Object f4836b;

    public f(ga.d dVar) {
        this.f4835a = dVar;
        this.f4836b = f4834c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f4836b;
        try {
            kVar.read((byte[]) this.f4835a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f4835a = bArr;
        this.f4836b = iArr;
    }
}
