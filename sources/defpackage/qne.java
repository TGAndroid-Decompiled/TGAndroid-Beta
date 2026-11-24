package defpackage;
public final class qne implements due {
    public static final qne b = new qne((byte) 0);
    public final byte a;

    public qne(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return nne.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final swe zzb(Class cls) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (!nne.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    if (name.length() != 0) {
                        str2 = "Unsupported message type: ".concat(name);
                    } else {
                        str2 = new String("Unsupported message type: ");
                    }
                    throw new IllegalArgumentException(str2);
                }
                try {
                    return (swe) nne.f(cls.asSubclass(nne.class)).d(3);
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
