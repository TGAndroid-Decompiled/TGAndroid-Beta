package b4;
public final class m {
    public final r3.v f1425a;
    public boolean f1426b;
    public boolean f1427c;
    public boolean d;
    public int e;
    public int f1428f;
    public long f1429g;
    public long h;

    public m(r3.v vVar) {
        this.f1425a = vVar;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z4;
        if (this.f1427c) {
            int i12 = this.f1428f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.d = z4;
                this.f1427c = false;
                return;
            }
            this.f1428f = (i11 - i10) + i12;
        }
    }
}
