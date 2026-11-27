package defpackage;
public abstract class edb {
    public static void a(StringBuilder sb, Object obj, ur4 ur4Var) {
        boolean z;
        if (ur4Var != null) {
            sb.append((CharSequence) ur4Var.invoke(obj));
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
