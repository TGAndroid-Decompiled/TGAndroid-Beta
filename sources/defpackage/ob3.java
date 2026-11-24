package defpackage;
public final class ob3 implements qbb {
    public final byte a;
    public final Object b;

    public ob3(Object obj, byte b) {
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
                    return (qx6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    ho9.n(e);
                    return null;
                }
            case 1:
                return (lb3) obj;
            case 2:
                return (sc3) obj;
            case 3:
                return (vb3) obj;
            default:
                return (xn9) obj;
        }
    }
}
