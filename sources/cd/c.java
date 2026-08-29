package cd;

import java.util.Random;
import kotlin.jvm.internal.j;
public final class c extends a {
    public final b f3035b = new b(0);

    @Override
    public final Random a() {
        Object obj = this.f3035b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
