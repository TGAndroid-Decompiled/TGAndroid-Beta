package h7;

import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;

public abstract class n8 {
    public static void a() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.d("Paint", GLUtils.getEGLErrorString(iGlGetError));
        }
    }
}
