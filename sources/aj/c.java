package aj;
public final class c {
    public volatile boolean f1617a;
    public volatile int f1618b;

    public final int a() {
        if (!this.f1617a) {
            synchronized (this) {
                try {
                    if (!this.f1617a) {
                        this.f1618b = d.f1619a.getInt("round_video_video_bitrate", 1200000);
                        this.f1617a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1618b;
    }
}
