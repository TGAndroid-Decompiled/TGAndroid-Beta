package c8;
public abstract class sd {
    public static void a(StringBuilder sb2, Object obj, rd.l lVar) {
        boolean z9;
        if (lVar != null) {
            sb2.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z9 = true;
        } else {
            z9 = obj instanceof CharSequence;
        }
        if (z9) {
            sb2.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb2.append(((Character) obj).charValue());
        } else {
            sb2.append((CharSequence) obj.toString());
        }
    }
}
