package defpackage;
public final class hr5 {
    public volatile boolean a;
    public volatile int b;

    public final int a() {
        if (!this.a) {
            synchronized (this) {
                if (!this.a) {
                    this.b = jaa.a.getInt("round_video_video_bitrate", 1200000);
                    this.a = true;
                }
            }
        }
        return this.b;
    }
}
