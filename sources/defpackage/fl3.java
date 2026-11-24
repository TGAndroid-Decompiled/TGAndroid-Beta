package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
public final class fl3 implements GLSurfaceView.Renderer {
    public long a;
    public boolean b;
    public int c;
    public final hl3 d;

    public fl3(hl3 hl3Var) {
        this.d = hl3Var;
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
                    public final fl3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run() {
                        switch (r3) {
                            case 0:
                                fl3 fl3Var = this.b;
                                fl3Var.d.d(i);
                                return;
                            default:
                                fl3 fl3Var2 = this.b;
                                int i2 = i;
                                hl3 hl3Var = fl3Var2.d;
                                if (hl3Var.e && !hl3Var.r && i2 == fl3Var2.d.H) {
                                    hl3 hl3Var2 = fl3Var2.d;
                                    hl3Var2.s = true;
                                    Runnable runnable = hl3Var2.w;
                                    hl3Var2.w = null;
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
                uq4 uq4Var = this.d.a;
                long j = this.a;
                if (j == 0) {
                    min = 0.016666668f;
                } else {
                    min = Math.min(0.1f, ((float) (nanoTime - j)) / 1.0E9f);
                }
                uq4Var.G = min;
                this.a = nanoTime;
                hl3 hl3Var = this.d;
                hl3Var.a.c.A = hl3Var.x;
                this.d.a.onDrawFrame(gl10);
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    if (!this.b) {
                        this.b = true;
                        final int i2 = this.c;
                        this.d.post(new Runnable(this) {
                            public final fl3 b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        fl3 fl3Var = this.b;
                                        fl3Var.d.d(i2);
                                        return;
                                    default:
                                        fl3 fl3Var2 = this.b;
                                        int i22 = i2;
                                        hl3 hl3Var2 = fl3Var2.d;
                                        if (hl3Var2.e && !hl3Var2.r && i22 == fl3Var2.d.H) {
                                            hl3 hl3Var22 = fl3Var2.d;
                                            hl3Var22.s = true;
                                            Runnable runnable = hl3Var22.w;
                                            hl3Var22.w = null;
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
                fa4.g(e, true);
                this.d.r = true;
                this.d.post(new li3(this, (byte) 7));
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
        hl3 hl3Var = this.d;
        int i = hl3Var.H + 1;
        hl3Var.H = i;
        this.c = i;
        this.b = false;
        this.a = 0L;
        this.d.r = false;
        uq4 uq4Var = this.d.a;
        uq4Var.c = null;
        try {
            uq4Var.onSurfaceCreated(gl10, eGLConfig);
        } catch (RuntimeException e) {
            fa4.g(e, true);
            this.d.r = true;
            this.d.post(new li3(this, (byte) 7));
        }
    }
}
