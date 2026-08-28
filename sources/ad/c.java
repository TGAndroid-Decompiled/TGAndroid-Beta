package ad;

import java.util.Random;
import kotlin.jvm.internal.i;
public final class c extends a {
    public final b f146b = new b(0);

    @Override
    public final Random a() {
        Object obj = this.f146b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
