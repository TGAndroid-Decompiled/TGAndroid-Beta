package cb;

import android.content.Context;
import java.util.UUID;
public final class l {
    public static final c9.b f2421b;
    public final Context f2422a;

    static {
        c9.a b10 = c9.b.b(l.class);
        b10.a(c9.l.b(h.class));
        b10.a(c9.l.b(Context.class));
        b10.f2335g = new b(4);
        f2421b = b10.b();
    }

    public l(Context context) {
        this.f2422a = context;
    }

    public final synchronized String a() {
        String string = this.f2422a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f2422a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
