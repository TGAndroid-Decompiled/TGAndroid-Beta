package defpackage;
public final class tpe implements gwe {
    public static final tpe b = new tpe((byte) 0);
    public final byte a;

    public tpe(byte b2) {
        this.a = b2;
    }

    @Override
    public final boolean zza(Class cls) {
        switch (this.a) {
            case 0:
                return qpe.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override
    public final uye zzb(Class cls) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                if (!qpe.class.isAssignableFrom(cls)) {
                    String name = cls.getName();
                    if (name.length() != 0) {
                        str2 = "Unsupported message type: ".concat(name);
                    } else {
                        str2 = new String("Unsupported message type: ");
                    }
                    throw new IllegalArgumentException(str2);
                }
                try {
                    return (uye) qpe.f(cls.asSubclass(qpe.class)).d(3);
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
