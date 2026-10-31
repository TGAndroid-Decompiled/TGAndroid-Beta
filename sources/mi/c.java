package mi;
public final class c {
    public volatile boolean f13381a;
    public volatile int f13382b;

    public final int a() {
        if (!this.f13381a) {
            synchronized (this) {
                try {
                    if (!this.f13381a) {
                        this.f13382b = d.f13383a.getInt("round_video_video_bitrate", 1200000);
                        this.f13381a = true;
                    }
                } finally {
                }
            }
        }
        return this.f13382b;
    }
}
