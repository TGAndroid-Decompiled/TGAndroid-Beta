package mb;

import android.content.Context;
import d2.l0;
import java.util.UUID;
public final class k {
    public static final t9.a f19241b;
    public final Context f19242a;

    static {
        l0 a10 = t9.a.a(k.class);
        a10.a(t9.j.a(g.class));
        a10.a(t9.j.a(Context.class));
        a10.f8177f = new v7.s(14);
        f19241b = a10.b();
    }

    public k(Context context) {
        this.f19242a = context;
    }

    public final synchronized String a() {
        String string = this.f19242a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.f19242a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
