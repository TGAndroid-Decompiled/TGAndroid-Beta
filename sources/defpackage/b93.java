package defpackage;
public abstract class b93 extends n01 {
    public boolean shouldBeSkipped;
    public int skippedOutputBufferCount;
    public long timeUs;

    @Override
    public void clear() {
        super.clear();
        this.timeUs = 0L;
        this.skippedOutputBufferCount = 0;
        this.shouldBeSkipped = false;
    }

    public abstract void release();
}
