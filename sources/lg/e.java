package lg;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.telegram.messenger.f8;
public final class e implements GLSurfaceView.Renderer {
    public long f11862a;
    public boolean f11863b;
    public int f11864c;
    public final g d;

    public e(g gVar) {
        this.d = gVar;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.f11872r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.f11876y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.D) {
                this.d.D = true;
                final int i10 = this.d.E;
                this.d.post(new Runnable(this) {
                    public final e f11860b;

                    {
                        this.f11860b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                e eVar = this.f11860b;
                                g.a(eVar.d, i10);
                                return;
                            default:
                                e eVar2 = this.f11860b;
                                int i11 = i10;
                                g gVar = eVar2.d;
                                if (gVar.e && !gVar.f11872r && i11 == eVar2.d.G) {
                                    g gVar2 = eVar2.d;
                                    gVar2.f11873s = true;
                                    Runnable runnable = gVar2.f11874w;
                                    gVar2.f11874w = null;
                                    if (runnable != null) {
                                        runnable.run();
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
            }
        } else {
            try {
                long nanoTime = System.nanoTime();
                h hVar = this.d.f11867a;
                long j10 = this.f11862a;
                if (j10 == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j10)) / 1.0E9f);
                }
                hVar.G = min;
                this.f11862a = nanoTime;
                g gVar = this.d;
                gVar.f11867a.f11879c.A = gVar.f11875x;
                this.d.f11867a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.f11863b) {
                        this.f11863b = true;
                        final int i11 = this.f11864c;
                        this.d.post(new Runnable(this) {
                            public final e f11860b;

                            {
                                this.f11860b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e eVar = this.f11860b;
                                        g.a(eVar.d, i11);
                                        return;
                                    default:
                                        e eVar2 = this.f11860b;
                                        int i112 = i11;
                                        g gVar2 = eVar2.d;
                                        if (gVar2.e && !gVar2.f11872r && i112 == eVar2.d.G) {
                                            g gVar22 = eVar2.d;
                                            gVar22.f11873s = true;
                                            Runnable runnable = gVar22.f11874w;
                                            gVar22.f11874w = null;
                                            if (runnable != null) {
                                                runnable.run();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Diamond GL error: " + glGetError);
            } catch (RuntimeException e) {
                f8.g(e, true);
                this.d.f11872r = true;
                this.d.post(new gg.c(this, 29));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f11863b = false;
        this.f11864c = this.d.G;
        if (!this.d.f11872r) {
            this.d.f11867a.onSurfaceChanged(gl10, i10, i11);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        g gVar = this.d;
        int i10 = gVar.G + 1;
        gVar.G = i10;
        this.f11864c = i10;
        this.f11863b = false;
        this.f11862a = 0L;
        this.d.f11872r = false;
        h hVar = this.d.f11867a;
        hVar.f11879c = null;
        try {
            hVar.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            f8.g(e, true);
            this.d.f11872r = true;
            this.d.post(new gg.c(this, 29));
        }
    }
}
