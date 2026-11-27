package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLSurface;
import android.view.Surface;
public final class rrc {
    public final src a;
    public final Surface b;
    public volatile boolean d;
    public volatile qrc e;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile boolean c = true;
    public EGLSurface h = EGL14.EGL_NO_SURFACE;
    public int k = -1;
    public float l = -1.0f;

    public rrc(src srcVar, Surface surface, int i) {
        this.a = srcVar;
        this.b = surface;
        this.g = i;
        this.f = i;
    }
}
