package defpackage;

import android.content.Context;
import j$.util.Objects;
public final class iff {
    public static final xad b = xad.c(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    public final String a;

    public iff(Context context, uha uhaVar) {
        context.getPackageName();
        ao2.a(context);
        synchronized (fgf.class) {
            if (fgf.b == null) {
                fgf.b = new fgf((byte) 0);
            }
        }
        this.a = "common";
        ni6.q();
        ni6.E(new mg7(this, (byte) 8));
        ni6.q();
        Objects.requireNonNull(uhaVar);
        ni6.E(new kze(uhaVar, (byte) 3));
        xad xadVar = b;
        if (xadVar.containsKey("common")) {
            nt3.d(context, (String) xadVar.get("common"), false);
        }
    }
}
