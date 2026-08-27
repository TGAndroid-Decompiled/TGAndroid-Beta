package f2;

public final class l1 {

    public int f5757a;

    public int f5758b;

    public int f5759c;
    public int d;

    public int f5760e;

    public boolean f5761f;

    public boolean f5762g;
    public boolean h;

    public boolean f5763i;

    public boolean f5764j;

    public boolean f5765k;

    public int f5766l;

    public long f5767m;

    public int f5768n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f5762g ? this.f5758b - this.f5759c : this.f5760e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5757a + ", mData=null, mItemCount=" + this.f5760e + ", mIsMeasuring=" + this.f5763i + ", mPreviousLayoutItemCount=" + this.f5758b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5759c + ", mStructureChanged=" + this.f5761f + ", mInPreLayout=" + this.f5762g + ", mRunSimpleAnimations=" + this.f5764j + ", mRunPredictiveAnimations=" + this.f5765k + '}';
    }
}
