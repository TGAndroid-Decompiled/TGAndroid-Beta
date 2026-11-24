package defpackage;
public final class cs4 implements w17 {
    public static final cs4 b = new cs4((byte) 0);
    public final byte a;

    public cs4(byte b2) {
        this.a = b2;
    }

    @Override
    public final iz8 a(Class cls) {
        switch (this.a) {
            case 0:
                if (fs4.class.isAssignableFrom(cls)) {
                    try {
                        return (iz8) fs4.d(cls.asSubclass(fs4.class)).c(3);
                    } catch (Exception e) {
                        fyb.j("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                w26.j("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return fs4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
