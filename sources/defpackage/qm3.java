package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
public final class qm3 implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final sm3 d;

    public qm3(sm3 sm3Var) {
        this.d = sm3Var;
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
                    public final qm3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                qm3 qm3Var = this.b;
                                qm3Var.d.d(i);
                                return;
                            default:
                                qm3 qm3Var2 = this.b;
                                int i2 = i;
                                sm3 sm3Var = qm3Var2.d;
                                if (sm3Var.e && !sm3Var.r && i2 == qm3Var2.d.H) {
                                    sm3 sm3Var2 = qm3Var2.d;
                                    sm3Var2.s = true;
                                    Runnable runnable = sm3Var2.w;
                                    sm3Var2.w = null;
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
                vs4 vs4Var = this.d.a;
                long j = this.a;
                if (j == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j)) / 1.0E9f);
                }
                vs4Var.G = min;
                this.a = nanoTime;
                sm3 sm3Var = this.d;
                sm3Var.a.c.A = sm3Var.x;
                this.d.a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.b) {
                        this.b = true;
                        final int i2 = this.c;
                        this.d.post(new Runnable(this) {
                            public final qm3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        qm3 qm3Var = this.b;
                                        qm3Var.d.d(i2);
                                        return;
                                    default:
                                        qm3 qm3Var2 = this.b;
                                        int i22 = i2;
                                        sm3 sm3Var2 = qm3Var2.d;
                                        if (sm3Var2.e && !sm3Var2.r && i22 == qm3Var2.d.H) {
                                            sm3 sm3Var22 = qm3Var2.d;
                                            sm3Var22.s = true;
                                            Runnable runnable = sm3Var22.w;
                                            sm3Var22.w = null;
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
                fc4.g(e, true);
                this.d.r = true;
                this.d.post(new bi3(this, (byte) 12));
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
        sm3 sm3Var = this.d;
        int i = sm3Var.H + 1;
        sm3Var.H = i;
        this.c = i;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        vs4 vs4Var = this.d.a;
        vs4Var.c = null;
        try {
            vs4Var.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            fc4.g(e, true);
            this.d.r = true;
            this.d.post(new bi3(this, (byte) 12));
        }
    }
}
