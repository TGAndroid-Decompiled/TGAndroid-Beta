package ca;
public final class f implements l {
    public static final pb.b f6007c = new pb.b(6);
    public final Object f6008a;
    public Object f6009b;

    public f(ga.d dVar) {
        this.f6008a = dVar;
        this.f6009b = f6007c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f6009b;
        try {
            kVar.read((byte[]) this.f6008a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f6008a = bArr;
        this.f6009b = iArr;
    }
}
