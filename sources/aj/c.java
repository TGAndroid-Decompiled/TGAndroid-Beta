package aj;
public final class c {
    public volatile boolean f1616a;
    public volatile int f1617b;

    public final int a() {
        if (!this.f1616a) {
            synchronized (this) {
                try {
                    if (!this.f1616a) {
                        this.f1617b = d.f1618a.getInt("round_video_video_bitrate", 1200000);
                        this.f1616a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1617b;
    }
}
