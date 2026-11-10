package gb;

import android.content.Context;
import java.io.File;
public final class q implements rd.a {
    public final int f13744a;
    public final Context f13745b;

    public q(Context context, int i7) {
        this.f13744a = i7;
        this.f13745b = context;
    }

    @Override
    public final Object invoke() {
        switch (this.f13744a) {
            case 0:
                File a10 = c8.c1.a(this.f13745b, "firebaseSessions/sessionConfigsDataStore.data");
                r.b(a10);
                return a10;
            default:
                File a11 = c8.c1.a(this.f13745b, "firebaseSessions/sessionDataStore.data");
                r.b(a11);
                return a11;
        }
    }
}
