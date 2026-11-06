package mg;
public final class c extends b {
    public float[] f20029l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j3 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            long j10 = ((a) this.d.get(i7)).f20016e;
            if (j10 > j3) {
                j3 = j10;
            }
        }
        this.f20029l = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            long j11 = ((a) this.d.get(i10)).f20016e;
            if (j3 == j11) {
                this.f20029l[i10] = 1.0f;
            } else {
                this.f20029l[i10] = (float) (j3 / j11);
            }
        }
    }
}
