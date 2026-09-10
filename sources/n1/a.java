package n1;

import java.util.Map;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import rd.l;
public final class a extends j implements l {
    public static final a f13683b = new j(1);

    @Override
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "entry");
        return "  " + ((d) entry.getKey()).f13689a + " = " + entry.getValue();
    }
}
