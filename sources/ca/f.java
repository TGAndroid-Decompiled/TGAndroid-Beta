package ca;
public final class f implements l {
    public static final qb.a f5116c = new qb.a(6);
    public final Object f5117a;
    public Object f5118b;

    public f(ga.d dVar) {
        this.f5117a = dVar;
        this.f5118b = f5116c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f5118b;
        try {
            kVar.read((byte[]) this.f5117a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f5117a = bArr;
        this.f5118b = iArr;
    }
}
