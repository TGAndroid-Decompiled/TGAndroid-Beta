package defpackage;
public final class xp2 implements zw2 {
    public static final xp2 b = new xp2((byte) 0);
    public static final xp2 c = new xp2((byte) 1);
    public final byte a;

    public xp2(byte b2) {
        this.a = b2;
    }

    @Override
    public final mx2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return u24.a;
        }
    }

    @Override
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void a(Object obj) {
    }
}
