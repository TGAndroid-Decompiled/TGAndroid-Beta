package defpackage;

import android.app.Activity;
import android.content.Context;
public final class oe implements Runnable {
    public final byte a;
    public final hd b;
    public final Context c;

    public oe(hd hdVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = hdVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd hdVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t(context, k96.M0(2131752883, null));
                return;
            case 1:
                if (hdVar != null) {
                    hdVar.dismiss();
                }
                d01.t(context, k96.M0(2131752883, null));
                return;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        hdVar.dismiss();
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                return;
        }
    }

    public oe(hd hdVar, Context context, byte b) {
        this.a = b;
        this.b = hdVar;
        this.c = context;
    }
}
