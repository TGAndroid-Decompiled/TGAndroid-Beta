package aj;
public final class c {
    public volatile boolean f1665a;
    public volatile int f1666b;

    public final int a() {
        if (!this.f1665a) {
            synchronized (this) {
                try {
                    if (!this.f1665a) {
                        this.f1666b = d.f1667a.getInt("round_video_video_bitrate", 1200000);
                        this.f1665a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1666b;
    }
}
