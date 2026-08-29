package n1;

import bd.l;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements l {
    public static final a f17082b = new k(1);

    @Override
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        return "  " + ((d) entry.getKey()).f17088a + " = " + entry.getValue();
    }
}
