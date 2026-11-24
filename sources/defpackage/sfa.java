package defpackage;

import android.content.Context;
import java.util.UUID;
public final class sfa {
    public static final mp2 b;
    public final Context a;

    static {
        lp2 b2 = mp2.b(sfa.class);
        b2.a(wd3.b(ae7.class));
        b2.a(wd3.b(Context.class));
        b2.f = new f6d((byte) 4);
        b = b2.b();
    }

    public sfa(Context context) {
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
