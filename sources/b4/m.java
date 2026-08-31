package b4;
public final class m {
    public final r3.v f1539a;
    public boolean f1540b;
    public boolean f1541c;
    public boolean d;
    public int f1542e;
    public int f1543f;
    public long f1544g;
    public long h;

    public m(r3.v vVar) {
        this.f1539a = vVar;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z4;
        if (this.f1541c) {
            int i12 = this.f1543f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.d = z4;
                this.f1541c = false;
                return;
            }
            this.f1543f = (i11 - i10) + i12;
        }
    }
}
