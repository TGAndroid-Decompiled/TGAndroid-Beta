package bd;

import java.util.Random;
import kotlin.jvm.internal.j;

public final class c extends a {

    public final b f2074b = new b(0);

    @Override
    public final Random a() {
        Object obj = this.f2074b.get();
        j.d(obj, "get(...)");
        return (Random) obj;
    }
}
