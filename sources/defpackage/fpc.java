package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class fpc {
    public final gpc a;
    public final Surface b;
    public volatile boolean d;
    public volatile epc e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public fpc(gpc gpcVar, Surface surface, int i) {
        this.a = gpcVar;
        this.b = surface;
        this.g = i;
        this.f = i;
    }
}
