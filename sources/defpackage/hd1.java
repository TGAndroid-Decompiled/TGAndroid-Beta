package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import org.telegram.messenger.MediaController;
public final class hd1 extends ContentObserver {
    public final byte a;

    public hd1(Handler handler, byte b) {
        super(handler);
        this.a = b;
    }

    @Override
    public final void onChange(boolean z) {
        switch (this.a) {
            case 0:
                fo.C(fo.g());
                return;
            case 1:
                super.onChange(z);
                Runnable runnable = MediaController.Z1;
                if (runnable != null) {
                    gl.r(runnable);
                }
                am6 am6Var = new am6((byte) 0);
                MediaController.Z1 = am6Var;
                gl.d3(am6Var, 2000L);
                return;
            case 2:
                super.onChange(z);
                Runnable runnable2 = MediaController.Z1;
                if (runnable2 != null) {
                    gl.r(runnable2);
                }
                vl6 vl6Var = new vl6(this, (byte) 1);
                MediaController.Z1 = vl6Var;
                gl.d3(vl6Var, 2000L);
                return;
            default:
                qhf.e.set(true);
                return;
        }
    }
}
