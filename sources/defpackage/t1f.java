package defpackage;

import java.util.Iterator;
import java.util.Map;
public abstract class t1f {
    public static final void a(StringBuilder sb, Iterator it, jed jedVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(jed.a(entry.getKey()));
            sb.append(" : ");
            sb.append(jed.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(jed.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(jed.a(entry2.getValue()));
            }
        }
    }
}
