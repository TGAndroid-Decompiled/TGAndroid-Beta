package aj;
public final class c {
    public volatile boolean f1645a;
    public volatile int f1646b;

    public final int a() {
        if (!this.f1645a) {
            synchronized (this) {
                try {
                    if (!this.f1645a) {
                        this.f1646b = d.f1647a.getInt("round_video_video_bitrate", 1200000);
                        this.f1645a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1646b;
    }
}
