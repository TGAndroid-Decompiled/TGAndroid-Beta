package defpackage;
public final class g59 {
    public static String a(oq4 oq4Var) {
        String obj = oq4Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }
}
