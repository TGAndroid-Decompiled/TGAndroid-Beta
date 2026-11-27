package defpackage;
public final class jjf implements tkf {
    public static final jjf b = new jjf((byte) 0);
    public final byte a;

    public jjf(byte b2) {
        this.a = b2;
    }

    @Override
    public final ilf zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (ljf.class.isAssignableFrom(cls)) {
                    try {
                        return (ilf) ljf.k(cls.asSubclass(ljf.class)).h(3, null);
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
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return ljf.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
