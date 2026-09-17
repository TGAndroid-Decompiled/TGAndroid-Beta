package kg;
public final class c extends b {
    public float[] f14960l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long j10 = ((a) this.d.get(i10)).f14947e;
            if (j10 > j3) {
                j3 = j10;
            }
        }
        this.f14960l = new float[size];
        for (int i11 = 0; i11 < size; i11++) {
            long j11 = ((a) this.d.get(i11)).f14947e;
            if (j3 == j11) {
                this.f14960l[i11] = 1.0f;
            } else {
                this.f14960l[i11] = (float) (j3 / j11);
            }
        }
    }
}
