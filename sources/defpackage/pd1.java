package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;
public final class pd1 extends ContentObserver {
    public final byte a;

    public pd1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                go.C(go.g());
                return;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    hl.r(runnable);
                }
                pg6 pg6Var = new pg6((byte) 2);
                MediaController.Z1 = pg6Var;
                hl.d3(pg6Var, 2000L);
                return;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    hl.r(runnable2);
                }
                z96 z96Var = new z96(this, (byte) 14);
                MediaController.Z1 = z96Var;
                hl.d3(z96Var, 2000L);
                return;
            default:
                gmf.e.set(true);
                return;
        }
    }
}
