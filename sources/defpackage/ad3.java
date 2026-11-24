package defpackage;
public final class ad3 implements sdb {
    public final byte a;
    public final Object b;

    public ad3(Object obj, byte b) {
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
                    return (qz6) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    dq9.o(e);
                    return null;
                }
            case 1:
                return (xc3) obj;
            case 2:
                return (fe3) obj;
            case 3:
                return (hd3) obj;
            default:
                return (yp9) obj;
        }
    }
}
