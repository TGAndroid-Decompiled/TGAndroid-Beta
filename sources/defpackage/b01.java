package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
public final class b01 implements Runnable {
    public final byte a;
    public final d01 b;

    public b01(d01 d01Var, byte b) {
        this.a = b;
        this.b = d01Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EglBase.Context context = null;
        d01 d01Var = this.b;
        switch (b) {
            case 0:
                d01Var.u = true;
                d01Var.c.removeCallbacksAndMessages(null);
                MediaExtractor mediaExtractor = d01Var.n;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    d01Var.n = null;
                }
                d01Var.m = -1L;
                d01Var.r.clear();
                MediaCodec mediaCodec = d01Var.g;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    d01Var.g.release();
                    d01Var.g = null;
                }
                d01Var.h = null;
                SurfaceTextureHelper surfaceTextureHelper = d01Var.d;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    d01Var.d.dispose();
                    d01Var.d = null;
                }
                Surface surface = d01Var.e;
                if (surface != null) {
                    surface.release();
                    d01Var.e = null;
                }
                d01Var.b.quitSafely();
                return;
            case 1:
                try {
                    EglBase eglBase = VideoCapturerDevice.getEglBase();
                    if (eglBase != null) {
                        context = eglBase.getEglBaseContext();
                    }
                    SurfaceTextureHelper create = SurfaceTextureHelper.create("BroadcastTileTexture", context);
                    d01Var.d = create;
                    if (create != null) {
                        d01Var.e = new Surface(d01Var.d.getSurfaceTexture());
                        d01Var.d.startListening(new c01(d01Var, (byte) 0));
                        return;
                    }
                    throw new IllegalStateException("no SurfaceTextureHelper");
                } catch (Throwable th) {
                    d01Var.v.b(d01Var.a, th);
                    return;
                }
            default:
                d01Var.t = false;
                if (!d01Var.u && d01Var.e != null) {
                    try {
                        d01Var.a();
                        if (!d01Var.f.isEmpty() && !d01Var.t && !d01Var.u) {
                            d01Var.t = true;
                            d01Var.c.postDelayed(new b01(d01Var, (byte) 2), 16L);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        d01Var.v.b(d01Var.a, th2);
                        return;
                    }
                }
                return;
        }
    }
}
