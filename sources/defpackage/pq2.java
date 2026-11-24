package defpackage;
public final class pq2 implements px2 {
    public static final pq2 b = new pq2((byte) 0);
    public static final pq2 c = new pq2((byte) 1);
    public final byte a;

    public pq2(byte b2) {
        this.a = b2;
    }

    @Override
    public final cy2 getContext() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return k34.a;
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
