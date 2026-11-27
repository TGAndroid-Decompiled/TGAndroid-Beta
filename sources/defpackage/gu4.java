package defpackage;
public final class gu4 implements d47 {
    public static final gu4 b = new gu4((byte) 0);
    public final byte a;

    public gu4(byte b2) {
        this.a = b2;
    }

    @Override
    public final v29 a(Class cls) {
        switch (this.a) {
            case 0:
                if (ju4.class.isAssignableFrom(cls)) {
                    try {
                        return (v29) ju4.d(cls.asSubclass(ju4.class)).c(3);
                    } catch (Exception e) {
                        grb.j("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                lq5.j("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return ju4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
