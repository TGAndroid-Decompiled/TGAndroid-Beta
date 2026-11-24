package defpackage;

import android.content.Context;
import j$.util.Objects;
public final class hdf {
    public static final v8d b = v8d.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public hdf(Context context, sfa sfaVar) {
        context.getPackageName();
        om2.a(context);
        synchronized (eef.class) {
            if (eef.b == null) {
                eef.b = new eef((byte) 0);
            }
        }
        this.a = "common";
        l69.x();
        l69.I(new ke7(this, (byte) 8));
        l69.x();
        Objects.requireNonNull(sfaVar);
        l69.I(new ixe(sfaVar, (byte) 3));
        v8d v8dVar = b;
        if (v8dVar.containsKey("common")) {
            ds3.d(context, (String) v8dVar.get("common"), false);
        }
    }
}
