package b4;
public final class m {
    public final r3.v f1436a;
    public boolean f1437b;
    public boolean f1438c;
    public boolean d;
    public int e;
    public int f1439f;
    public long f1440g;
    public long h;

    public m(r3.v vVar) {
        this.f1436a = vVar;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        boolean z4;
        if (this.f1438c) {
            int i12 = this.f1439f;
            int i13 = (i10 + 1) - i12;
            if (i13 < i11) {
                if (((bArr[i13] & 192) >> 6) == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.d = z4;
                this.f1438c = false;
                return;
            }
            this.f1439f = (i11 - i10) + i12;
        }
    }
}
