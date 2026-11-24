package defpackage;
public final class du4 implements w37 {
    public static final du4 b = new du4((byte) 0);
    public final byte a;

    public du4(byte b2) {
        this.a = b2;
    }

    @Override
    public final j19 a(Class cls) {
        switch (this.a) {
            case 0:
                if (gu4.class.isAssignableFrom(cls)) {
                    try {
                        return (j19) gu4.d(cls.asSubclass(gu4.class)).c(3);
                    } catch (Exception e) {
                        rjb.k("Unable to get message info for ".concat(cls.getName()), e);
                        return null;
                    }
                }
                u36.j("Unsupported message type: ".concat(cls.getName()));
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return gu4.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
