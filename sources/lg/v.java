package lg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class v {
    public final w f11986a;
    public final Surface f11987b;
    public volatile boolean d;
    public volatile u e;
    public int f11989f;
    public int f11990g;
    public boolean f11991i;
    public boolean f11992j;
    public volatile boolean f11988c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f11993k = -1;
    public float f11994l = -1.0f;

    public v(w wVar, Surface surface, int i10) {
        this.f11986a = wVar;
        this.f11987b = surface;
        this.f11990g = i10;
        this.f11989f = i10;
    }
}
