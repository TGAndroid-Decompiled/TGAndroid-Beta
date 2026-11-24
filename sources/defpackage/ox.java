package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class ox implements MediaCodec.OnFrameRenderedListener {
    public final byte a;
    public final uk6 b;

    public ox(ek6 ek6Var, uk6 uk6Var, byte b) {
        this.a = b;
        this.b = uk6Var;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        uk6 uk6Var = this.b;
        switch (b) {
            case 0:
                Handler handler = uk6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    uk6Var.a(j);
                    return;
                }
            default:
                Handler handler2 = uk6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    uk6Var.a(j);
                    return;
                }
        }
    }
}
