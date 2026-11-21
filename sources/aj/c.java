package aj;
public final class c {
    public volatile boolean f1658a;
    public volatile int f1659b;

    public final int a() {
        if (!this.f1658a) {
            synchronized (this) {
                try {
                    if (!this.f1658a) {
                        this.f1659b = d.f1660a.getInt("round_video_video_bitrate", 1200000);
                        this.f1658a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1659b;
    }
}
