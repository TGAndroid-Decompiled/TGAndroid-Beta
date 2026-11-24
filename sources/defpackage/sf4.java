package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.FloatBuffer;
public final class sf4 implements Runnable {
    public final byte a;
    public final uf4 b;

    public sf4(uf4 uf4Var, byte b) {
        this.a = b;
        this.b = uf4Var;
    }

    @Override
    public final void run() {
        wf4 wf4Var;
        byte b = this.a;
        uf4 uf4Var = this.b;
        switch (b) {
            case 0:
                uf4Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                if (uf4Var.f) {
                    uf4Var.a();
                    if (uf4Var.y) {
                        uf4Var.x.updateTexImage();
                        uf4Var.x.getTransformMatrix(uf4Var.E);
                        uf4Var.d();
                        uf4Var.y = false;
                        xf4 xf4Var = uf4Var.K;
                        xf4Var.P0 = uf4Var.E;
                        xf4Var.W0 = false;
                        uf4Var.G = true;
                    }
                    if (uf4Var.a0) {
                        if (uf4Var.h && ((wf4Var = uf4Var.K.f1) == null || wf4Var.e())) {
                            GLES20.glViewport(0, 0, uf4Var.n, uf4Var.r);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(uf4Var.P);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, uf4Var.F[0]);
                            GLES20.glUniform1i(uf4Var.T, 0);
                            GLES20.glEnableVertexAttribArray(uf4Var.S);
                            int i = uf4Var.S;
                            FloatBuffer floatBuffer = uf4Var.Z;
                            if (floatBuffer == null) {
                                floatBuffer = uf4Var.K.a1;
                            }
                            GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
                            GLES20.glEnableVertexAttribArray(uf4Var.Q);
                            GLES20.glVertexAttribPointer(uf4Var.Q, 2, 5126, false, 8, (Buffer) uf4Var.K.b1);
                            GLES20.glUniformMatrix4fv(uf4Var.R, 1, false, uf4Var.E, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            uf4Var.b.eglSwapBuffers(uf4Var.c, uf4Var.e);
                            xm0 xm0Var = uf4Var.J;
                            if (xm0Var != null) {
                                xm0Var.a(uf4Var.F[0], uf4Var.X, uf4Var.Y, uf4Var.E);
                                return;
                            }
                            return;
                        }
                        if (uf4Var.c0 == null || uf4Var.G) {
                            GLES20.glViewport(0, 0, uf4Var.V, uf4Var.W);
                            uf4Var.K.f();
                            uf4Var.K.d();
                            if (uf4Var.c0 == null) {
                                uf4Var.K.e();
                            }
                            uf4Var.K.c();
                            uf4Var.U = uf4Var.K.b();
                            uf4Var.d0 = true;
                        }
                        if (uf4Var.d0) {
                            GLES20.glViewport(0, 0, uf4Var.n, uf4Var.r);
                            GLES20.glBindFramebuffer(36160, 0);
                            int g = uf4Var.K.g(!uf4Var.U ? 1 : 0);
                            GLES20.glUseProgram(uf4Var.L);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, g);
                            GLES20.glUniform1i(uf4Var.O, 0);
                            GLES20.glEnableVertexAttribArray(uf4Var.N);
                            int i2 = uf4Var.N;
                            FloatBuffer floatBuffer2 = uf4Var.Z;
                            if (floatBuffer2 == null) {
                                floatBuffer2 = uf4Var.K.a1;
                            }
                            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) floatBuffer2);
                            GLES20.glEnableVertexAttribArray(uf4Var.M);
                            GLES20.glVertexAttribPointer(uf4Var.M, 2, 5126, false, 8, (Buffer) uf4Var.K.Z0);
                            GLES20.glDrawArrays(5, 0, 4);
                            uf4Var.b.eglSwapBuffers(uf4Var.c, uf4Var.e);
                            xm0 xm0Var2 = uf4Var.J;
                            if (xm0Var2 != null) {
                                xm0Var2.a(g, uf4Var.V, uf4Var.W, null);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                lcc lccVar = uf4Var.c0;
                SurfaceTexture surfaceTexture = uf4Var.x;
                ncc nccVar = (ncc) lccVar.b;
                if (nccVar.a != null) {
                    nccVar.a.x0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
