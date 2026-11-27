package defpackage;
public final class hc3 implements mfb {
    public final byte a;
    public final Object b;

    public hc3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                try {
                    return (uz6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    vr9.l(e);
                    return null;
                }
            case 1:
                return (ec3) obj;
            case 2:
                return (ld3) obj;
            case 3:
                return (oc3) obj;
            default:
                return (or9) obj;
        }
    }
}
