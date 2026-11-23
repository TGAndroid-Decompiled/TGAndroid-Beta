package bg;
public enum b0 {
    UNKNOWN_DELAY_DURATION(0, "unknown delay"),
    INPUT_HANDLING_DURATION(1, "input"),
    ANIMATION_DURATION(2, "animation"),
    LAYOUT_MEASURE_DURATION(3, "layout"),
    DRAW_DURATION(4, "draw"),
    SYNC_DURATION(5, "sync"),
    COMMAND_ISSUE_DURATION(6, "cmd issue"),
    SWAP_BUFFERS_DURATION(7, "swap buffers"),
    EF96(31, "GPU_DURATION", "gpu"),
    TOTAL_DURATION(8, "total");
    
    public final int f3210a;
    public final String f3211b;
    public final int f3212c;
    public long d;
    public double f3213e;

    b0(int i7, String str) {
        this(24, r7, str);
    }

    b0(int i7, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.f3213e = 0.0d;
        this.f3210a = r4;
        this.f3211b = str2;
        this.f3212c = i7;
    }
}
