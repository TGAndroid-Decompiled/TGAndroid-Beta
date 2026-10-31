package md;

import com.google.android.gms.common.api.internal.o1;
import java.util.Random;
import kotlin.jvm.internal.i;
public final class b extends a {
    public final o1 f13053b = new o1(2);

    @Override
    public final Random a() {
        Object obj = this.f13053b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
