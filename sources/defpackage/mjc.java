package defpackage;

import android.opengl.EGLContext;
import org.webrtc.EglBase14;
public final class mjc implements EglBase14.Context {
    public final EGLContext a;

    public mjc(EGLContext eGLContext) {
        this.a = eGLContext;
    }

    @Override
    public final long getNativeEglContext() {
        return this.a.getNativeHandle();
    }

    @Override
    public final EGLContext getRawContext() {
        return this.a;
    }
}
