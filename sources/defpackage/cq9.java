package defpackage;

import android.view.Surface;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
public final class cq9 implements aq9 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public SurfaceTextureHelper b;
    public Surface c;

    public cq9() {
        EglBase.Context context;
        EglBase eglBase = VideoCapturerDevice.getEglBase();
        if (eglBase != null) {
            context = eglBase.getEglBaseContext();
        } else {
            context = null;
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create("RtmpStreamTexture", context);
        this.b = create;
        if (create != null) {
            this.c = new Surface(this.b.getSurfaceTexture());
            this.b.startListening(new b11(this, (byte) 1));
        }
    }

    @Override
    public final void a(int i, int i2) {
        SurfaceTextureHelper surfaceTextureHelper = this.b;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.setTextureSize(i, i2);
            this.b.setFrameRotation(0);
        }
    }

    @Override
    public final boolean b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq9.b():boolean");
    }

    @Override
    public final Surface getSurface() {
        return this.c;
    }
}
