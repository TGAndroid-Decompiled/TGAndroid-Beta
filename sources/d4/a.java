package d4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import h5.d0;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f4196a;
    public final i5.i f4197b;

    public a(k kVar, i5.i iVar, int i10) {
        this.f4196a = i10;
        this.f4197b = iVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f4196a) {
            case 0:
                i5.i iVar = this.f4197b;
                Handler handler = iVar.f7829a;
                if (d0.f7237a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar.a(j10);
                    return;
                }
            default:
                i5.i iVar2 = this.f4197b;
                Handler handler2 = iVar2.f7829a;
                if (d0.f7237a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar2.a(j10);
                    return;
                }
        }
    }
}
