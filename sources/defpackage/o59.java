package defpackage;

import android.os.Handler;
import android.os.Looper;
public class o59 extends Handler {
    public o59(Looper looper, byte b) {
        super(looper);
        switch (b) {
            case 3:
                super(looper);
                Looper.getMainLooper();
                return;
            case 4:
                super(looper);
                Looper.getMainLooper();
                return;
            default:
                Looper.getMainLooper();
                return;
        }
    }

    public o59(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
