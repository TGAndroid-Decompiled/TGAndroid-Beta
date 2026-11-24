package defpackage;
public final class i79 {
    public static String a(ps4 ps4Var) {
        String obj = ps4Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
