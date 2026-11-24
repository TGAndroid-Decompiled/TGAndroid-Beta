package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
public abstract class wie {
    public static void a(String str, boolean z) {
        if (z) {
            return;
        }
        km5 km5Var = mm5.b;
        throw new bw4(str, w59.e);
    }

    public static boolean b(String str) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        a("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        a("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            String eglQueryString = EGL14.eglQueryString(eglGetDisplay, 12373);
            if (eglQueryString == null || !eglQueryString.contains(str)) {
                return false;
            }
            return true;
        }
        throw new bw4("Error in getDefaultEglDisplay, error code: 0x" + Integer.toHexString(eglGetError), mm5.u(Integer.valueOf(eglGetError)));
    }
}
