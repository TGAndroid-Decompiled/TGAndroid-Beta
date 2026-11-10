package ca;
public final class f implements l {
    public static final pb.b f6012c = new pb.b(6);
    public final Object f6013a;
    public Object f6014b;

    public f(ga.d dVar) {
        this.f6013a = dVar;
        this.f6014b = f6012c;
    }

    @Override
    public void a(k kVar, int i7) {
        int[] iArr = (int[]) this.f6014b;
        try {
            kVar.read((byte[]) this.f6013a, iArr[0], i7);
            iArr[0] = iArr[0] + i7;
        } finally {
            kVar.close();
        }
    }

    public f(byte[] bArr, int[] iArr) {
        this.f6013a = bArr;
        this.f6014b = iArr;
    }
}
