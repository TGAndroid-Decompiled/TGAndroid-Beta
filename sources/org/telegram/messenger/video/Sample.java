package org.telegram.messenger.video;
public class Sample {
    private long offset;
    private long size;

    public Sample(long j3, long j10) {
        this.offset = j3;
        this.size = j10;
    }

    public long getOffset() {
        return this.offset;
    }

    public long getSize() {
        return this.size;
    }
}
