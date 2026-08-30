package f2;
public final class i1 {
    public int f5742a;
    public int f5743b;
    public int f5744c;
    public int d;
    public int e;
    public boolean f5745f;
    public boolean f5746g;
    public boolean h;
    public boolean f5747i;
    public boolean f5748j;
    public boolean f5749k;
    public int f5750l;
    public long f5751m;
    public int f5752n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f5746g) {
            return this.f5743b - this.f5744c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5742a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f5747i + ", mPreviousLayoutItemCount=" + this.f5743b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5744c + ", mStructureChanged=" + this.f5745f + ", mInPreLayout=" + this.f5746g + ", mRunSimpleAnimations=" + this.f5748j + ", mRunPredictiveAnimations=" + this.f5749k + '}';
    }
}
