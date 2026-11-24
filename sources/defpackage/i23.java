package defpackage;
public final class i23 extends rs4 implements fs4 {
    public final byte a;

    public i23(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((e33) this.receiver).getClass();
                return e33.a((String) obj, (String) obj2);
            case 1:
                ((e33) this.receiver).getClass();
                return e33.b((String) obj, (String) obj2);
            case 2:
                ((e33) this.receiver).getClass();
                return e33.a((String) obj, (String) obj2);
            case 3:
                ((e33) this.receiver).getClass();
                return e33.b((String) obj, (String) obj2);
            default:
                ((e33) this.receiver).getClass();
                return e33.b((String) obj, (String) obj2);
        }
    }
}
