package defpackage;
public final class lq5 implements lv8, l0a {
    public final Object a;

    public lq5(Object obj) {
        this.a = obj;
    }

    public static lq5 a(Object obj) {
        if (obj != null) {
            return new lq5(obj);
        }
        gxc.d("instance cannot be null");
        return null;
    }

    @Override
    public final Object mo8get() {
        return this.a;
    }
}
