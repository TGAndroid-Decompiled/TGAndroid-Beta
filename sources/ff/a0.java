package ff;
public enum a0 {
    UNKNOWN_DELAY_DURATION(0, "unknown delay"),
    INPUT_HANDLING_DURATION(1, "input"),
    ANIMATION_DURATION(2, "animation"),
    LAYOUT_MEASURE_DURATION(3, "layout"),
    DRAW_DURATION(4, "draw"),
    SYNC_DURATION(5, "sync"),
    COMMAND_ISSUE_DURATION(6, "cmd issue"),
    SWAP_BUFFERS_DURATION(7, "swap buffers"),
    EF99(31, "GPU_DURATION", "gpu"),
    TOTAL_DURATION(8, "total");
    
    public final int f6130a;
    public final String f6131b;
    public final int f6132c;
    public long d;
    public double f6133e;

    a0(int i9, String str) {
        this(24, r7, str);
    }

    a0(int i9, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.f6133e = 0.0d;
        this.f6130a = r4;
        this.f6131b = str2;
        this.f6132c = i9;
    }
}
