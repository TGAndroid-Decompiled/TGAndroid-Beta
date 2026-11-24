package defpackage;

import android.app.Activity;
import android.content.Context;
public final class of implements Runnable {
    public final byte a;
    public final he b;
    public final Context c;

    public of(he heVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = heVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        he heVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u(context, jb6.M0(2131752848, null));
                return;
            case 1:
                if (heVar != null) {
                    heVar.dismiss();
                }
                l11.u(context, jb6.M0(2131752848, null));
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        heVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                return;
        }
    }

    public of(he heVar, Context context, byte b) {
        this.a = b;
        this.b = heVar;
        this.c = context;
    }
}
