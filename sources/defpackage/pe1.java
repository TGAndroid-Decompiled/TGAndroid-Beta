package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;
public final class pe1 extends ContentObserver {
    public final byte a;

    public pe1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                fp.C(fp.g());
                return;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    gm.r(runnable);
                }
                bo6 bo6Var = new bo6((byte) 0);
                MediaController.Z1 = bo6Var;
                gm.d3(bo6Var, 2000L);
                return;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    gm.r(runnable2);
                }
                pg6 pg6Var = new pg6(this, (byte) 8);
                MediaController.Z1 = pg6Var;
                gm.d3(pg6Var, 2000L);
                return;
            default:
                rjf.e.set(true);
                return;
        }
    }
}
