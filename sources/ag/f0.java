package ag;
public enum f0 {
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
    
    public final int f1276a;
    public final String f1277b;
    public final int f1278c;
    public long d;
    public double e;

    f0(int i10, String str) {
        this(24, r7, str);
    }

    f0(int i10, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.e = 0.0d;
        this.f1276a = r4;
        this.f1277b = str2;
        this.f1278c = i10;
    }
}
