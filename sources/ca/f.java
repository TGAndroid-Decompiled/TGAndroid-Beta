package ca;
public final class f implements l {
    public static final qb.a f5119c = new qb.a(6);
    public final Object f5120a;
    public Object f5121b;

    public f(ga.d dVar) {
        this.f5120a = dVar;
        this.f5121b = f5119c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f5121b;
        try {
            kVar.read((byte[]) this.f5120a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5120a = bArr;
        this.f5121b = iArr;
    }
}
