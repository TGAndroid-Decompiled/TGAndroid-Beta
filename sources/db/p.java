package db;

import android.content.Context;
import b8.md;
import java.io.File;
public final class p implements od.a {
    public final int f8712a;
    public final Context f8713b;

    public p(Context context, int i3) {
        this.f8712a = i3;
        this.f8713b = context;
    }

    @Override
    public final Object invoke() {
        switch (this.f8712a) {
            case 0:
                File a10 = md.a(this.f8713b, "firebaseSessions/sessionConfigsDataStore.data");
                q.b(a10);
                return a10;
            default:
                File a11 = md.a(this.f8713b, "firebaseSessions/sessionDataStore.data");
                q.b(a11);
                return a11;
        }
    }
}
