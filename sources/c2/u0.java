package c2;

import android.os.Handler;
import android.os.Looper;
public class u0 extends Handler {
    public u0(Looper looper, int i9) {
        super(looper);
        switch (i9) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                return;
            case 5:
            default:
                Looper.getMainLooper();
                return;
            case 6:
                super(looper);
                Looper.getMainLooper();
                return;
        }
    }

    public u0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
