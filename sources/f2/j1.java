package f2;
public final class j1 {
    public int f5827a;
    public int f5828b;
    public int f5829c;
    public int d;
    public int f5830e;
    public boolean f5831f;
    public boolean f5832g;
    public boolean h;
    public boolean f5833i;
    public boolean f5834j;
    public boolean f5835k;
    public int f5836l;
    public long f5837m;
    public int f5838n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f5832g) {
            return this.f5828b - this.f5829c;
        }
        return this.f5830e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5827a + ", mData=null, mItemCount=" + this.f5830e + ", mIsMeasuring=" + this.f5833i + ", mPreviousLayoutItemCount=" + this.f5828b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5829c + ", mStructureChanged=" + this.f5831f + ", mInPreLayout=" + this.f5832g + ", mRunSimpleAnimations=" + this.f5834j + ", mRunPredictiveAnimations=" + this.f5835k + '}';
    }
}
