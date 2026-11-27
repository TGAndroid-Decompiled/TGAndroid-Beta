package defpackage;

import android.app.Activity;
import android.content.Context;
public final class vd implements Runnable {
    public final byte a;
    public final id b;
    public final Context c;

    public vd(id idVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = idVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        id idVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u(context, ob6.M0(2131752876, null));
                return;
            case 1:
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u(context, ob6.M0(2131752876, null));
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        idVar.dismiss();
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
        }
    }

    public vd(id idVar, Context context, byte b) {
        this.a = b;
        this.b = idVar;
        this.c = context;
    }
}
