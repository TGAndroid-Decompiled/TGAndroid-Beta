package org.telegram.messenger.video;

public class Sample {
    private long offset;
    private long size;

    public Sample(long j, long j2) {
        this.offset = j;
        this.size = j2;
    }

    public long getOffset() {
        return this.offset;
    }

    public long getSize() {
        return this.size;
    }
}
