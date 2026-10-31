package lg;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class v {
    public final w f11985a;
    public final Surface f11986b;
    public volatile boolean d;
    public volatile u e;
    public int f11988f;
    public int f11989g;
    public boolean f11990i;
    public boolean f11991j;
    public volatile boolean f11987c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int f11992k = -1;
    public float f11993l = -1.0f;

    public v(w wVar, Surface surface, int i10) {
        this.f11985a = wVar;
        this.f11986b = surface;
        this.f11989g = i10;
        this.f11988f = i10;
    }
}
