package j7;
public abstract class r8 {
    public static void a(StringBuilder sb, Object obj, dd.l lVar) {
        boolean z4;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z4 = true;
        } else {
            z4 = obj instanceof CharSequence;
        }
        if (z4) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }
}
