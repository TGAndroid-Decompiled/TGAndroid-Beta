package defpackage;
public final class hse implements uye {
    public static final hse b = new hse((byte) 0);
    public final byte a;

    public hse(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return ese.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final j1f zzb(Class cls) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (!ese.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    if (name.length() != 0) {
                        str2 = "Unsupported message type: ".concat(name);
                    } else {
                        str2 = new String("Unsupported message type: ");
                    }
                    throw new IllegalArgumentException(str2);
                }
                try {
                    return (j1f) ese.f(cls.asSubclass(ese.class)).d(3);
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
