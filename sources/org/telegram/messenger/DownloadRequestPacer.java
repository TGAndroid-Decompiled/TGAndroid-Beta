package org.telegram.messenger;
final class DownloadRequestPacer {
    private double intervalMs = 50.0d;
    private long nextRequestAt;

    public void onRequestSent(long j3) {
        this.nextRequestAt = j3 + ((long) Math.ceil(this.intervalMs));
        this.intervalMs = Math.max(3.0d, this.intervalMs * 0.8d);
    }

    public long remainingDelay(long j3) {
        return Math.max(0L, this.nextRequestAt - j3);
    }
}
