package defpackage;
public abstract class g9b {
    public static void a(StringBuilder sb, Object obj, qp4 qp4Var) {
        boolean z;
        if (qp4Var != null) {
            sb.append((CharSequence) qp4Var.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }
}
