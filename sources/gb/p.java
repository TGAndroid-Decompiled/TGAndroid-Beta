package gb;

import android.content.Context;
import java.io.File;
public final class p implements rd.a {
    public final int f13396a;
    public final Context f13397b;

    public p(Context context, int i7) {
        this.f13396a = i7;
        this.f13397b = context;
    }

    @Override
    public final Object invoke() {
        switch (this.f13396a) {
            case 0:
                File a10 = c8.g1.a(this.f13397b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = c8.g1.a(this.f13397b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
