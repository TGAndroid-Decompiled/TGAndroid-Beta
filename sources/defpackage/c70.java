package defpackage;
public final class c70 implements cq7 {
    public static final c70 a = new Object();
    public static final wa4 b = wa4.c("baseAddress");
    public static final wa4 c = wa4.c("size");
    public static final wa4 d = wa4.c("name");
    public static final wa4 e = wa4.c("uuid");

    @Override
    public final void a(Object obj, Object obj2) {
        byte[] bArr;
        b03 b03Var = (b03) obj;
        dq7 dq7Var = (dq7) obj2;
        dq7Var.g(b, ((v90) b03Var).a);
        v90 v90Var = (v90) b03Var;
        dq7Var.g(c, v90Var.b);
        dq7Var.a(d, v90Var.c);
        String str = v90Var.d;
        if (str != null) {
            bArr = str.getBytes(s03.a);
        } else {
            bArr = null;
        }
        dq7Var.a(e, bArr);
    }
}
