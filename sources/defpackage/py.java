package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class py implements MediaCodec.OnFrameRenderedListener {
    public final byte a;
    public final xm6 b;

    public py(hm6 hm6Var, xm6 xm6Var, byte b) {
        this.a = b;
        this.b = xm6Var;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        xm6 xm6Var = this.b;
        switch (b) {
            case 0:
                Handler handler = xm6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    xm6Var.a(j);
                    return;
                }
            default:
                Handler handler2 = xm6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    xm6Var.a(j);
                    return;
                }
        }
    }
}
