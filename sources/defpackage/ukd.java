package defpackage;
public final class ukd implements ssd {
    public static final ukd b = new ukd((byte) 0);
    public final byte a;

    public ukd(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return xkd.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final iwd zzb(Class cls) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (!xkd.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    if (name.length() != 0) {
                        str2 = "Unsupported message type: ".concat(name);
                    } else {
                        str2 = new String("Unsupported message type: ");
                    }
                    throw new IllegalArgumentException(str2);
                }
                try {
                    return (iwd) xkd.d(cls.asSubclass(xkd.class)).a(3);
                } catch (Exception e) {
                    String name2 = cls.getName();
                    if (name2.length() != 0) {
                        str = "Unable to get message info for ".concat(name2);
                    } else {
                        str = new String("Unable to get message info for ");
                    }
                    throw new RuntimeException(str, e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
