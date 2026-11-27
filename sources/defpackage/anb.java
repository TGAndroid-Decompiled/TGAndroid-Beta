package defpackage;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.concurrent.CountDownLatch;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
public final class anb extends rjc implements TextureView.SurfaceTextureListener {
    public bnb M;
    public final Object N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;

    public anb(String str) {
        super(str);
        this.N = new Object();
    }

    @Override
    public final void g(float f) {
        boolean z;
        synchronized (this.N) {
            if (f == 0.0f) {
                z = true;
            } else {
                z = false;
            }
            this.O = z;
        }
        super.g(f);
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        synchronized (this.N) {
            if (!this.O) {
                if (this.Q != videoFrame.getRotatedWidth() || this.R != videoFrame.getRotatedHeight() || this.S != videoFrame.getRotation()) {
                    Logging.d("TextureEglRenderer", this.b + ": " + ("Reporting frame resolution changed to " + videoFrame.getBuffer().getWidth() + "x" + videoFrame.getBuffer().getHeight() + " with rotation " + videoFrame.getRotation()));
                    bnb bnbVar = this.M;
                    if (bnbVar != null) {
                        bnbVar.onFrameResolutionChanged(videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation());
                    }
                    this.Q = videoFrame.getRotatedWidth();
                    this.R = videoFrame.getRotatedHeight();
                    this.S = videoFrame.getRotation();
                }
            }
        }
        super.onFrame(videoFrame);
    }

    @Override
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        a(surfaceTexture, false);
    }

    @Override
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        ThreadUtils.checkIsOnMainThread();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        f(new nn3(countDownLatch, (byte) 1), false);
        ThreadUtils.awaitUninterruptibly(countDownLatch);
        return true;
    }

    @Override
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Logging.d("TextureEglRenderer", this.b + ": " + ("surfaceChanged: size: " + i + "x" + i2));
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
