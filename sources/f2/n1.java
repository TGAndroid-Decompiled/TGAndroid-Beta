package f2;
public final class n1 {
    public int f5469a;
    public int f5470b;
    public int f5471c;
    public int d;
    public int f5472e;
    public boolean f5473f;
    public boolean f5474g;
    public boolean h;
    public boolean f5475i;
    public boolean f5476j;
    public boolean f5477k;
    public int f5478l;
    public long f5479m;
    public int f5480n;

    public final void a(int i9) {
        if ((this.d & i9) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i9) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f5474g) {
            return this.f5470b - this.f5471c;
        }
        return this.f5472e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5469a + ", mData=null, mItemCount=" + this.f5472e + ", mIsMeasuring=" + this.f5475i + ", mPreviousLayoutItemCount=" + this.f5470b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5471c + ", mStructureChanged=" + this.f5473f + ", mInPreLayout=" + this.f5474g + ", mRunSimpleAnimations=" + this.f5476j + ", mRunPredictiveAnimations=" + this.f5477k + '}';
    }
}
