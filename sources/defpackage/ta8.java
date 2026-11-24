package defpackage;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.EglRenderer;
import org.webrtc.GlRectDrawer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class ta8 implements VideoSink {
    public final EglRenderer a;
    public SurfaceTexture b;
    public boolean c;

    public ta8(ya8 ya8Var) {
        EglRenderer eglRenderer = new EglRenderer("pip-egl");
        this.a = eglRenderer;
        eglRenderer.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        ya8Var.setSurfaceTextureListener(new up5(this, (byte) 1));
        SurfaceTexture surfaceTexture = ya8Var.getSurfaceTexture();
        if (surfaceTexture != null && ya8Var.a != null) {
            int width = ya8Var.getWidth();
            int height = ya8Var.getHeight();
            if (!this.c && this.b != surfaceTexture) {
                this.b = surfaceTexture;
                if (width > 0 && height > 0) {
                    eglRenderer.setLayoutAspectRatio(width / height);
                }
                eglRenderer.createEglSurface(surfaceTexture);
            }
        }
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.release();
        this.b = null;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        if (!this.c) {
            this.a.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }
}
