package defpackage;

import android.content.Context;
import java.util.UUID;
public final class uha {
    public static final xq2 b;
    public final Context a;

    static {
        wq2 b2 = xq2.b(uha.class);
        b2.a(if3.b(cg7.class));
        b2.a(if3.b(Context.class));
        b2.f = new h8d((byte) 4);
        b = b2.b();
    }

    public uha(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
