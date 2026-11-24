package defpackage;

import java.util.Iterator;
import java.util.Map;
public abstract class rze {
    public static final void a(StringBuilder sb, Iterator it, hcd hcdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(hcd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(hcd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(hcd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(hcd.a(entry2.getValue()));
            }
        }
    }
}
