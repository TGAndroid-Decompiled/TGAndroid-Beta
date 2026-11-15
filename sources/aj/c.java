package aj;
public final class c {
    public volatile boolean f1654a;
    public volatile int f1655b;

    public final int a() {
        if (!this.f1654a) {
            synchronized (this) {
                try {
                    if (!this.f1654a) {
                        this.f1655b = d.f1656a.getInt("round_video_video_bitrate", 1200000);
                        this.f1654a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1655b;
    }
}
