package f2;
public final class i1 {
    public int f5731a;
    public int f5732b;
    public int f5733c;
    public int d;
    public int e;
    public boolean f5734f;
    public boolean f5735g;
    public boolean h;
    public boolean f5736i;
    public boolean f5737j;
    public boolean f5738k;
    public int f5739l;
    public long f5740m;
    public int f5741n;

    public final void a(int i10) {
        if ((this.d & i10) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i10) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.f5735g) {
            return this.f5732b - this.f5733c;
        }
        return this.e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f5731a + ", mData=null, mItemCount=" + this.e + ", mIsMeasuring=" + this.f5736i + ", mPreviousLayoutItemCount=" + this.f5732b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5733c + ", mStructureChanged=" + this.f5734f + ", mInPreLayout=" + this.f5735g + ", mRunSimpleAnimations=" + this.f5737j + ", mRunPredictiveAnimations=" + this.f5738k + '}';
    }
}
