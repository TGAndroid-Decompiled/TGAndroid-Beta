package c2;

import android.os.Handler;
import android.os.Looper;
public class v0 extends Handler {
    public v0(Looper looper, int i10) {
        super(looper);
        switch (i10) {
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

    public v0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
