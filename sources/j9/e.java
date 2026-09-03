package j9;
public final class e implements j {
    public static final ab.a f9307c = new ab.a(10);
    public final Object f9308a;
    public Object f9309b;

    public e(n9.b bVar) {
        this.f9308a = bVar;
        this.f9309b = f9307c;
    }

    @Override
    public void a(i iVar, int i10) {
        int[] iArr = (int[]) this.f9309b;
        try {
            iVar.read((byte[]) this.f9308a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f9308a = bArr;
        this.f9309b = iArr;
    }
}
