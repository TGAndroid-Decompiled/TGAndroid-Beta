package c2;

import android.os.Handler;
import android.os.Looper;

public class t0 extends Handler {
    public t0(Looper looper, int i10) {
        super(looper);
        switch (i10) {
            case 4:
                super(looper);
                Looper.getMainLooper();
                break;
            case 5:
            default:
                Looper.getMainLooper();
                break;
            case 6:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }

    public t0(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
