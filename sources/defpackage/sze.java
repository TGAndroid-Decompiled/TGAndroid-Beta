package defpackage;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
public abstract class sze {
    public static void a() {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.d("Paint", GLUtils.getEGLErrorString(glGetError));
        }
    }
}
