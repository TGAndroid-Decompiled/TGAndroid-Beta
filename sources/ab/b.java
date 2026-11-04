package ab;
public enum b implements pa.b {
    UNKNOWN(0),
    DATA_MESSAGE(1),
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);
    
    public final int f294a;

    b(int i3) {
        this.f294a = i3;
    }

    @Override
    public final int a() {
        return this.f294a;
    }
}
