package a4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import f5.d0;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f50a;
    public final g5.i f51b;

    public a(n nVar, g5.i iVar, int i10) {
        this.f50a = i10;
        this.f51b = iVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f50a) {
            case 0:
                g5.i iVar = this.f51b;
                Handler handler = iVar.f7046a;
                if (d0.f6579a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar.a(j10);
                    return;
                }
            default:
                g5.i iVar2 = this.f51b;
                Handler handler2 = iVar2.f7046a;
                if (d0.f6579a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar2.a(j10);
                    return;
                }
        }
    }
}
