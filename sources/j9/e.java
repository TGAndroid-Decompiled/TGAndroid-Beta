package j9;
public final class e implements j {
    public static final cb.b f9325c = new cb.b(10);
    public final Object f9326a;
    public Object f9327b;

    public e(n9.b bVar) {
        this.f9326a = bVar;
        this.f9327b = f9325c;
    }

    @Override
    public void a(i iVar, int i10) {
        int[] iArr = (int[]) this.f9327b;
        try {
            iVar.read((byte[]) this.f9326a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f9326a = bArr;
        this.f9327b = iArr;
    }
}
