package org.telegram.messenger.video;
public class Sample {
    private long offset;
    private long size;

    public Sample(long j10, long j11) {
        this.offset = j10;
        this.size = j11;
    }

    public long getOffset() {
        return this.offset;
    }

    public long getSize() {
        return this.size;
    }
}
