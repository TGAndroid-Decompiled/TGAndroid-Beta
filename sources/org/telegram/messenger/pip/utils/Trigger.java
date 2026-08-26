package org.telegram.messenger.pip.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.core.app.ActivityCompat$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.pip.source.PipSourceHandlerState2$$ExternalSyntheticLambda0;

public final class Trigger implements Runnable {
    public final PipSourceHandlerState2$$ExternalSyntheticLambda0 action;
    public final Handler handler;
    public final ClickHelper$$ExternalSyntheticLambda0 timeoutRunnable;
    public final AtomicBoolean triggered = new AtomicBoolean(false);

    public Trigger(Handler handler, PipSourceHandlerState2$$ExternalSyntheticLambda0 pipSourceHandlerState2$$ExternalSyntheticLambda0, long j) {
        this.handler = handler;
        this.action = pipSourceHandlerState2$$ExternalSyntheticLambda0;
        ClickHelper$$ExternalSyntheticLambda0 clickHelper$$ExternalSyntheticLambda0 = new ClickHelper$$ExternalSyntheticLambda0(4, this, pipSourceHandlerState2$$ExternalSyntheticLambda0);
        this.timeoutRunnable = clickHelper$$ExternalSyntheticLambda0;
        if (j > 0) {
            handler.postDelayed(clickHelper$$ExternalSyntheticLambda0, j);
        }
    }

    @Override
    public final void run() {
        if (this.triggered.compareAndSet(false, true)) {
            Handler handler = this.handler;
            handler.removeCallbacks(this.timeoutRunnable);
            if (Looper.myLooper() == handler.getLooper()) {
                this.action.run(false);
            } else {
                handler.post(new ActivityCompat$$ExternalSyntheticLambda0(this, 22));
            }
        }
    }
}
