package defpackage;

import android.content.Context;
import java.util.UUID;
public final class lja {
    public static final fq2 b;
    public final Context a;

    static {
        eq2 b2 = fq2.b(lja.class);
        b2.a(qe3.b(jg7.class));
        b2.a(qe3.b(Context.class));
        b2.f = new yad((byte) 4);
        b = b2.b();
    }

    public lja(Context context) {
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
