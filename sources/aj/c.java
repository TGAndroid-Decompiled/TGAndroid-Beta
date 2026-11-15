package aj;
public final class c {
    public volatile boolean f1647a;
    public volatile int f1648b;

    public final int a() {
        if (!this.f1647a) {
            synchronized (this) {
                try {
                    if (!this.f1647a) {
                        this.f1648b = d.f1649a.getInt("round_video_video_bitrate", 1200000);
                        this.f1647a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1648b;
    }
}
