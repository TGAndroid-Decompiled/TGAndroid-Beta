package defpackage;
public final class p13 extends us4 implements is4 {
    public final byte a;

    public p13(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((l23) this.receiver).getClass();
                return l23.a((String) obj, (String) obj2);
            case 1:
                ((l23) this.receiver).getClass();
                return l23.b((String) obj, (String) obj2);
            case 2:
                ((l23) this.receiver).getClass();
                return l23.a((String) obj, (String) obj2);
            case 3:
                ((l23) this.receiver).getClass();
                return l23.b((String) obj, (String) obj2);
            default:
                ((l23) this.receiver).getClass();
                return l23.b((String) obj, (String) obj2);
        }
    }
}
