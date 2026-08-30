package ed;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.j;
public final class b extends a {
    public final o1 f5185b = new o1(1);

    @Override
    public final Random a() {
        Object obj = this.f5185b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
