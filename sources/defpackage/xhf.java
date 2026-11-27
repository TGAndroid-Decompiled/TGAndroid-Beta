package defpackage;

import android.content.Context;
import j$.util.Objects;
public final class xhf {
    public static final odd b = odd.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public xhf(Context context, lja ljaVar) {
        context.getPackageName();
        in2.a(context);
        synchronized (uif.class) {
            if (uif.b == null) {
                uif.b = new uif((byte) 0);
            }
        }
        this.a = "common";
        ri6.v();
        ri6.G(new tg7(this, (byte) 8));
        ri6.v();
        Objects.requireNonNull(ljaVar);
        ri6.G(new z1f(ljaVar, (byte) 3));
        odd oddVar = b;
        if (oddVar.containsKey("common")) {
            vs3.d(context, (String) oddVar.get("common"), false);
        }
    }
}
