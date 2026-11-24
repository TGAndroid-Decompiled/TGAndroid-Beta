package defpackage;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.view.Surface;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
public final class tz0 implements Runnable {
    public final byte a;
    public final vz0 b;

    public tz0(vz0 vz0Var, byte b) {
        this.a = b;
        this.b = vz0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        EglBase.Context context = null;
        vz0 vz0Var = this.b;
        switch (b) {
            case 0:
                vz0Var.u = true;
                vz0Var.c.removeCallbacksAndMessages(null);
                MediaExtractor mediaExtractor = vz0Var.n;
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                    vz0Var.n = null;
                }
                vz0Var.m = -1L;
                vz0Var.r.clear();
                MediaCodec mediaCodec = vz0Var.g;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.stop();
                    } catch (Throwable unused) {
                    }
                    vz0Var.g.release();
                    vz0Var.g = null;
                }
                vz0Var.h = null;
                SurfaceTextureHelper surfaceTextureHelper = vz0Var.d;
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.stopListening();
                    vz0Var.d.dispose();
                    vz0Var.d = null;
                }
                Surface surface = vz0Var.e;
                if (surface != null) {
                    surface.release();
                    vz0Var.e = null;
                }
                vz0Var.b.quitSafely();
                return;
            case 1:
                try {
                    EglBase eglBase = VideoCapturerDevice.getEglBase();
                    if (eglBase != null) {
                        context = eglBase.getEglBaseContext();
                    }
                    SurfaceTextureHelper create = SurfaceTextureHelper.create("BroadcastTileTexture", context);
                    vz0Var.d = create;
                    if (create != null) {
                        vz0Var.e = new Surface(vz0Var.d.getSurfaceTexture());
                        vz0Var.d.startListening(new uz0(vz0Var, (byte) 0));
                        return;
                    }
                    throw new IllegalStateException("no SurfaceTextureHelper");
                } catch (Throwable th) {
                    vz0Var.v.b(vz0Var.a, th);
                    return;
                }
            default:
                vz0Var.t = false;
                if (!vz0Var.u && vz0Var.e != null) {
                    try {
                        vz0Var.a();
                        if (!vz0Var.f.isEmpty() && !vz0Var.t && !vz0Var.u) {
                            vz0Var.t = true;
                            vz0Var.c.postDelayed(new tz0(vz0Var, (byte) 2), 16L);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        vz0Var.v.b(vz0Var.a, th2);
                        return;
                    }
                }
                return;
        }
    }
}
