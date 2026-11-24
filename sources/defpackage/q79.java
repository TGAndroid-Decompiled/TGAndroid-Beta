package defpackage;

import android.os.Handler;
import android.os.Looper;
public class q79 extends Handler {
    public q79(Looper looper, byte b) {
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

    public q79(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
