package defpackage;
public final class lq3 extends nl1 {
    public float[] l;

    @Override
    public final void e() {
        super.e();
        int size = this.d.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            long j2 = ((ml1) this.d.get(i)).e;
            if (j2 > j) {
                j = j2;
            }
        }
        this.l = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            long j3 = ((ml1) this.d.get(i2)).e;
            int i3 = (j > j3 ? 1 : (j == j3 ? 0 : -1));
            float[] fArr = this.l;
            if (i3 == 0) {
                fArr[i2] = 1.0f;
            } else {
                fArr[i2] = (float) (j / j3);
            }
        }
    }
}
