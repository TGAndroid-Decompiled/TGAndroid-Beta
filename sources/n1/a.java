package n1;

import ad.l;
import java.util.Map;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;

public final class a extends k implements l {

    public static final a f18081b = new a(1);

    @Override
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        j.e(entry, "entry");
        return "  " + ((e) entry.getKey()).f18089a + " = " + entry.getValue();
    }
}
