package h9;
public final class e implements j {
    public static final x9.d f7951c = new x9.d(8);
    public final Object f7952a;
    public Object f7953b;

    public e(l9.b bVar) {
        this.f7952a = bVar;
        this.f7953b = f7951c;
    }

    @Override
    public void a(i iVar, int i10) {
        int[] iArr = (int[]) this.f7953b;
        try {
            iVar.read((byte[]) this.f7952a, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f7952a = bArr;
        this.f7953b = iArr;
    }
}
