package defpackage;
public enum ff7 implements dv8 {
    UNKNOWN_OS(0),
    ANDROID(1),
    IOS(2),
    WEB(3);
    
    public final byte a;

    ff7(int i) {
        this.a = i;
    }

    @Override
    public final int a() {
        return this.a;
    }
}
