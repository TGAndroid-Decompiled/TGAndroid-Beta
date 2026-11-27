package defpackage;

import java.util.Iterator;
import java.util.Map;
public abstract class j4f {
    public static final void a(StringBuilder sb, Iterator it, ahd ahdVar) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(ahd.a(entry.getKey()));
            sb.append(" : ");
            sb.append(ahd.a(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(ahd.a(entry2.getKey()));
                sb.append(" : ");
                sb.append(ahd.a(entry2.getValue()));
            }
        }
    }
}
