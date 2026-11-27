package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
public final class px implements MediaCodec.OnFrameRenderedListener {
    public final byte a;
    public final an6 b;

    public px(jm6 jm6Var, an6 an6Var, byte b) {
        this.a = b;
        this.b = an6Var;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        byte b = this.a;
        an6 an6Var = this.b;
        switch (b) {
            case 0:
                Handler handler = an6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    an6Var.a(j);
                    return;
                }
            default:
                Handler handler2 = an6Var.a;
                if (Build.VERSION.SDK_INT < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    an6Var.a(j);
                    return;
                }
        }
    }
}
