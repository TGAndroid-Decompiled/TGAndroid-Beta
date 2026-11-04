package ng;
public final class c extends b {
    public float[] f20382l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j10 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            long j11 = ((a) this.d.get(i3)).f20369e;
            if (j11 > j10) {
                j10 = j11;
            }
        }
        this.f20382l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long j12 = ((a) this.d.get(i10)).f20369e;
            if (j10 == j12) {
                this.f20382l[i10] = 1.0f;
            } else {
                this.f20382l[i10] = (float) (j10 / j12);
            }
        }
    }
}
