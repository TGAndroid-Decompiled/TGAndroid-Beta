package gb;

import android.content.Context;
import java.io.File;
public final class p implements rd.a {
    public final int f13388a;
    public final Context f13389b;

    public p(Context context, int i7) {
        this.f13388a = i7;
        this.f13389b = context;
    }

    @Override
    public final Object invoke() {
        switch (this.f13388a) {
            case 0:
                File a10 = c8.j1.a(this.f13389b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = c8.j1.a(this.f13389b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
