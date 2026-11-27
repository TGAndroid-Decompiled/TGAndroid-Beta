package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
public final class xl3 implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final zl3 d;

    public xl3(zl3 zl3Var) {
        this.d = zl3Var;
    }

    @Override
    public final void onDrawFrame(GL10 gl10) {
        float min;
        if (this.d.r) {
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
        } else if (!this.d.y) {
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            if (!this.d.E) {
                this.d.E = true;
                final int i = this.d.F;
                this.d.post(new Runnable(this) {
                    public final xl3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                xl3 xl3Var = this.b;
                                xl3Var.d.d(i);
                                return;
                            default:
                                xl3 xl3Var2 = this.b;
                                int i2 = i;
                                zl3 zl3Var = xl3Var2.d;
                                if (zl3Var.e && !zl3Var.r && i2 == xl3Var2.d.H) {
                                    zl3 zl3Var2 = xl3Var2.d;
                                    zl3Var2.s = true;
                                    Runnable runnable = zl3Var2.w;
                                    zl3Var2.w = null;
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
                ys4 ys4Var = this.d.a;
                long j = this.a;
                if (j == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j)) / 1.0E9f);
                }
                ys4Var.G = min;
                this.a = nanoTime;
                zl3 zl3Var = this.d;
                zl3Var.a.c.A = zl3Var.x;
                this.d.a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.b) {
                        this.b = true;
                        final int i2 = this.c;
                        this.d.post(new Runnable(this) {
                            public final xl3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        xl3 xl3Var = this.b;
                                        xl3Var.d.d(i2);
                                        return;
                                    default:
                                        xl3 xl3Var2 = this.b;
                                        int i22 = i2;
                                        zl3 zl3Var2 = xl3Var2.d;
                                        if (zl3Var2.e && !zl3Var2.r && i22 == xl3Var2.d.H) {
                                            zl3 zl3Var22 = xl3Var2.d;
                                            zl3Var22.s = true;
                                            Runnable runnable = zl3Var22.w;
                                            zl3Var22.w = null;
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
                cc4.g(e, true);
                this.d.r = true;
                this.d.post(new zg3(this, (byte) 13));
            }
        }
    }

    @Override
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.b = false;
        this.c = this.d.H;
        if (!this.d.r) {
            this.d.a.onSurfaceChanged(gl10, i, i2);
        }
    }

    @Override
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        zl3 zl3Var = this.d;
        int i = zl3Var.H + 1;
        zl3Var.H = i;
        this.c = i;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        ys4 ys4Var = this.d.a;
        ys4Var.c = null;
        try {
            ys4Var.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            cc4.g(e, true);
            this.d.r = true;
            this.d.post(new zg3(this, (byte) 13));
        }
    }
}
