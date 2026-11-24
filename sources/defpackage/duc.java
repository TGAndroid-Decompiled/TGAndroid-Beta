package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
public class duc {
    public final String a;
    public final LinkedHashMap b;

    public duc(String str) {
        if (nve.a(str)) {
            this.a = str;
            this.b = new LinkedHashMap();
            return;
        }
        w26.j("'name' is not a valid token.");
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.a);
        for (Map.Entry entry : this.b.entrySet()) {
            sb.append("; ");
            sb.append((String) entry.getKey());
            String str = (String) entry.getValue();
            if (str != null && str.length() != 0) {
                sb.append("=");
                sb.append(str);
            }
        }
        return sb.toString();
    }
}
