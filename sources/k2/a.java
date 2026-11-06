package k2;
public abstract class a {
    private int flags;

    public final void addFlag(int i7) {
        this.flags = i7 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int i7) {
        this.flags = (~i7) & this.flags;
    }

    public final boolean getFlag(int i7) {
        if ((this.flags & i7) == i7) {
            return true;
        }
        return false;
    }

    public final boolean hasSupplementalData() {
        return getFlag(268435456);
    }

    public final boolean isEndOfStream() {
        return getFlag(4);
    }

    public final boolean isFirstSample() {
        return getFlag(134217728);
    }

    public final boolean isKeyFrame() {
        return getFlag(1);
    }

    public final boolean isLastSample() {
        return getFlag(536870912);
    }

    public final boolean notDependedOn() {
        return getFlag(67108864);
    }

    public final void setFlags(int i7) {
        this.flags = i7;
    }
}
