package defpackage;
public abstract class ibb {
    public static void a(StringBuilder sb, Object obj, rr4 rr4Var) {
        boolean z;
        if (rr4Var != null) {
            sb.append((CharSequence) rr4Var.invoke(obj));
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
