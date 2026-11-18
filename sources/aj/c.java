package aj;
public final class c {
    public volatile boolean f1646a;
    public volatile int f1647b;

    public final int a() {
        if (!this.f1646a) {
            synchronized (this) {
                try {
                    if (!this.f1646a) {
                        this.f1647b = d.f1648a.getInt("round_video_video_bitrate", 1200000);
                        this.f1646a = true;
                    }
                } finally {
                }
            }
        }
        return this.f1647b;
    }
}
