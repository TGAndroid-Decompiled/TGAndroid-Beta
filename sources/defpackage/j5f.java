package defpackage;
public abstract class j5f {
    public static void a(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            p3d.h(qd4.y("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        p3d.h("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
