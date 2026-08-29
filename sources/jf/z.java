package jf;
public enum z {
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
    
    public final int f11688a;
    public final String f11689b;
    public final int f11690c;
    public long d;
    public double f11691e;

    z(int i10, String str) {
        this(24, r7, str);
    }

    z(int i10, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.f11691e = 0.0d;
        this.f11688a = r4;
        this.f11689b = str2;
        this.f11690c = i10;
    }
}
