package defpackage;
public final class ep2 implements fw2 {
    public static final ep2 b = new ep2((byte) 0);
    public static final ep2 c = new ep2((byte) 1);
    public final byte a;

    public ep2(byte b2) {
        this.a = b2;
    }

    @Override
    public final sw2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return z14.a;
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
