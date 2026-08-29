package ab;

import android.content.Context;
import java.util.UUID;
public final class l {
    public static final a9.b f321b;
    public final Context f322a;

    static {
        a9.a b10 = a9.b.b(l.class);
        b10.a(a9.m.b(h.class));
        b10.a(a9.m.b(Context.class));
        b10.f231g = new b(2);
        f321b = b10.b();
    }

    public l(Context context) {
        this.f322a = context;
    }

    public final synchronized String a() {
        String string = this.f322a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f322a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
