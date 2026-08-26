package org.telegram.messenger.camera;

import android.opengl.GLUtils;
import javax.microedition.khronos.egl.EGL10;
import org.telegram.messenger.FileLog;

public abstract class CameraView$CameraGLThread$$ExternalSyntheticOutline0 {
    public static void m(EGL10 egl10, StringBuilder sb) {
        sb.append(GLUtils.getEGLErrorString(egl10.eglGetError()));
        FileLog.e(sb.toString());
    }
}
