package defpackage;
public enum mf7 implements lw8 {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    public final byte a;

    mf7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
