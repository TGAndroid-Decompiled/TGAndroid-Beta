package defpackage;
public final class tef implements dgf {
    public static final tef b = new tef((byte) 0);
    public final byte a;

    public tef(byte b2) {
        this.a = b2;
    }

    @Override
    public final sgf zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (vef.class.isAssignableFrom(cls)) {
                    try {
                        return (sgf) vef.k(cls.asSubclass(vef.class)).h(3, null);
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
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return vef.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
