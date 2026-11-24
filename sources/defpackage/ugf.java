package defpackage;
public final class ugf implements eif {
    public static final ugf b = new ugf((byte) 0);
    public final byte a;

    public ugf(byte b2) {
        this.a = b2;
    }

    @Override
    public final tif zzb(Class cls) {
        switch (this.a) {
            case 0:
                if (wgf.class.isAssignableFrom(cls)) {
                    try {
                        return (tif) wgf.k(cls.asSubclass(wgf.class)).h(3, null);
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
    public final boolean zzc(Class cls) {
        switch (this.a) {
            case 0:
                return wgf.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
