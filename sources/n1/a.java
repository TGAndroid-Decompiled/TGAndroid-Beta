package n1;

import dd.l;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
public final class a extends k implements l {
    public static final a f15181b = new k(1);

    @Override
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        return "  " + ((d) entry.getKey()).f15187a + " = " + entry.getValue();
    }
}
