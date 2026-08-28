package f9;
public final class e implements j {
    public static final za.a f6004c = new za.a(7);
    public final Object f6005a;
    public Object f6006b;

    public e(j9.c cVar) {
        this.f6005a = cVar;
        this.f6006b = f6004c;
    }

    @Override
    public void a(i iVar, int i9) {
        int[] iArr = (int[]) this.f6006b;
        try {
            iVar.read((byte[]) this.f6005a, iArr[0], i9);
            iArr[0] = iArr[0] + i9;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f6005a = bArr;
        this.f6006b = iArr;
    }
}
