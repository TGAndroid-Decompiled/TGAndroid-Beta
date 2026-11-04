package cg;
public enum z {
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
    
    public final int f4765a;
    public final String f4766b;
    public final int f4767c;
    public long d;
    public double f4768e;

    z(int i3, String str) {
        this(24, r7, str);
    }

    z(int i3, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.f4768e = 0.0d;
        this.f4765a = r4;
        this.f4766b = str2;
        this.f4767c = i3;
    }
}
