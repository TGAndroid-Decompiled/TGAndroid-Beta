package cb;

import android.content.Context;
import java.util.UUID;
public final class l {
    public static final c9.b f2253b;
    public final Context f2254a;

    static {
        c9.a b10 = c9.b.b(l.class);
        b10.a(c9.m.b(h.class));
        b10.a(c9.m.b(Context.class));
        b10.f2170g = new ab.a(4);
        f2253b = b10.b();
    }

    public l(Context context) {
        this.f2254a = context;
    }

    public final synchronized String a() {
        String string = this.f2254a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f2254a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
