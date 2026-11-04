package ba;
public final class f implements l {
    public static final ra.e f3180c = new ra.e(4);
    public final Object f3181a;
    public Object f3182b;

    public f(fa.f fVar) {
        this.f3181a = fVar;
        this.f3182b = f3180c;
    }

    @Override
    public void a(k kVar, int i3) {
        int[] iArr = (int[]) this.f3182b;
        try {
            kVar.read((byte[]) this.f3181a, iArr[0], i3);
            iArr[0] = iArr[0] + i3;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f3181a = bArr;
        this.f3182b = iArr;
    }
}
