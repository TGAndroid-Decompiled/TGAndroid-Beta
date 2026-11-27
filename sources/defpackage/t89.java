package defpackage;
public final class t89 {
    public static String a(ss4 ss4Var) {
        String obj = ss4Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
