package defpackage;
public final class w03 extends qq4 implements eq4 {
    public final byte a;

    public w03(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((t13) this.receiver).getClass();
                return t13.a((String) obj, (String) obj2);
            case 1:
                ((t13) this.receiver).getClass();
                return t13.b((String) obj, (String) obj2);
            case 2:
                ((t13) this.receiver).getClass();
                return t13.a((String) obj, (String) obj2);
            case 3:
                ((t13) this.receiver).getClass();
                return t13.b((String) obj, (String) obj2);
            default:
                ((t13) this.receiver).getClass();
                return t13.b((String) obj, (String) obj2);
        }
    }
}
