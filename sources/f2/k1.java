package f2;
public final class k1 {
    public int f6392a;
    public int f6393b;
    public int f6394c;
    public int d;
    public int f6395e;
    public boolean f6396f;
    public boolean f6397g;
    public boolean h;
    public boolean f6398i;
    public boolean f6399j;
    public boolean f6400k;
    public int f6401l;
    public long f6402m;
    public int f6403n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f6397g) {
            return this.f6393b - this.f6394c;
        }
        return this.f6395e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f6392a + ", mData=null, mItemCount=" + this.f6395e + ", mIsMeasuring=" + this.f6398i + ", mPreviousLayoutItemCount=" + this.f6393b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f6394c + ", mStructureChanged=" + this.f6396f + ", mInPreLayout=" + this.f6397g + ", mRunSimpleAnimations=" + this.f6399j + ", mRunPredictiveAnimations=" + this.f6400k + '}';
    }
}
