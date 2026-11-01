package mi;
public final class c {
    public volatile boolean f13382a;
    public volatile int f13383b;

    public final int a() {
        if (!this.f13382a) {
            synchronized (this) {
                try {
                    if (!this.f13382a) {
                        this.f13383b = d.f13384a.getInt("round_video_video_bitrate", 1200000);
                        this.f13382a = true;
                    }
                } finally {
                }
            }
        }
        return this.f13383b;
    }
}
