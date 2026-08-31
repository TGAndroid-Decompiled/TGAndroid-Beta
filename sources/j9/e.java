package j9;
public final class e implements j {
    public static final cb.b f9959c = new cb.b(10);
    public final Object f9960a;
    public Object f9961b;

    public e(n9.b bVar) {
        this.f9960a = bVar;
        this.f9961b = f9959c;
    }

    @Override
    public void a(i iVar, int i10) {
        int[] iArr = (int[]) this.f9961b;
        try {
            iVar.read((byte[]) this.f9960a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f9960a = bArr;
        this.f9961b = iArr;
    }
}
