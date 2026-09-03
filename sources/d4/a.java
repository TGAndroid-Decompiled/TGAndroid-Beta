package d4;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import h5.d0;
public final class a implements MediaCodec.OnFrameRenderedListener {
    public final int f4111a;
    public final i5.i f4112b;

    public a(k kVar, i5.i iVar, int i10) {
        this.f4111a = i10;
        this.f4112b = iVar;
    }

    @Override
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        switch (this.f4111a) {
            case 0:
                i5.i iVar = this.f4112b;
                Handler handler = iVar.f7260a;
                if (d0.f6924a < 30) {
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar.a(j10);
                    return;
                }
            default:
                i5.i iVar2 = this.f4112b;
                Handler handler2 = iVar2.f7260a;
                if (d0.f6924a < 30) {
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                    return;
                } else {
                    iVar2.a(j10);
                    return;
                }
        }
    }
}
