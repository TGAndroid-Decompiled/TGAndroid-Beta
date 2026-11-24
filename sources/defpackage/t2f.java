package defpackage;
public abstract class t2f {
    public static void a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            gxc.d(kt6.o("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        gxc.d("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
