package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Looper;
import android.view.Surface;
import java.nio.Buffer;
import java.nio.FloatBuffer;
public final class rd4 implements Runnable {
    public final byte a;
    public final td4 b;

    public rd4(td4 td4Var, byte b) {
        this.a = b;
        this.b = td4Var;
    }

    @Override
    public final void run() {
        vd4 vd4Var;
        byte b = this.a;
        td4 td4Var = this.b;
        switch (b) {
            case 0:
                td4Var.finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 1:
                if (td4Var.f) {
                    td4Var.a();
                    if (td4Var.y) {
                        td4Var.x.updateTexImage();
                        td4Var.x.getTransformMatrix(td4Var.E);
                        td4Var.d();
                        td4Var.y = false;
                        wd4 wd4Var = td4Var.K;
                        wd4Var.P0 = td4Var.E;
                        wd4Var.W0 = false;
                        td4Var.G = true;
                    }
                    if (td4Var.a0) {
                        if (td4Var.h && ((vd4Var = td4Var.K.f1) == null || vd4Var.m())) {
                            GLES20.glViewport(0, 0, td4Var.n, td4Var.r);
                            GLES20.glBindFramebuffer(36160, 0);
                            GLES20.glUseProgram(td4Var.P);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(36197, td4Var.F[0]);
                            GLES20.glUniform1i(td4Var.T, 0);
                            GLES20.glEnableVertexAttribArray(td4Var.S);
                            int i = td4Var.S;
                            FloatBuffer floatBuffer = td4Var.Z;
                            if (floatBuffer == null) {
                                floatBuffer = td4Var.K.a1;
                            }
                            GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) floatBuffer);
                            GLES20.glEnableVertexAttribArray(td4Var.Q);
                            GLES20.glVertexAttribPointer(td4Var.Q, 2, 5126, false, 8, (Buffer) td4Var.K.b1);
                            GLES20.glUniformMatrix4fv(td4Var.R, 1, false, td4Var.E, 0);
                            GLES20.glDrawArrays(5, 0, 4);
                            td4Var.b.eglSwapBuffers(td4Var.c, td4Var.e);
                            xl0 xl0Var = td4Var.J;
                            if (xl0Var != null) {
                                xl0Var.a(td4Var.F[0], td4Var.X, td4Var.Y, td4Var.E);
                                return;
                            }
                            return;
                        }
                        if (td4Var.c0 == null || td4Var.G) {
                            GLES20.glViewport(0, 0, td4Var.V, td4Var.W);
                            td4Var.K.f();
                            td4Var.K.d();
                            if (td4Var.c0 == null) {
                                td4Var.K.e();
                            }
                            td4Var.K.c();
                            td4Var.U = td4Var.K.b();
                            td4Var.d0 = true;
                        }
                        if (td4Var.d0) {
                            GLES20.glViewport(0, 0, td4Var.n, td4Var.r);
                            GLES20.glBindFramebuffer(36160, 0);
                            int g = td4Var.K.g(!td4Var.U ? 1 : 0);
                            GLES20.glUseProgram(td4Var.L);
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, g);
                            GLES20.glUniform1i(td4Var.O, 0);
                            GLES20.glEnableVertexAttribArray(td4Var.N);
                            int i2 = td4Var.N;
                            FloatBuffer floatBuffer2 = td4Var.Z;
                            if (floatBuffer2 == null) {
                                floatBuffer2 = td4Var.K.a1;
                            }
                            GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, (Buffer) floatBuffer2);
                            GLES20.glEnableVertexAttribArray(td4Var.M);
                            GLES20.glVertexAttribPointer(td4Var.M, 2, 5126, false, 8, (Buffer) td4Var.K.Z0);
                            GLES20.glDrawArrays(5, 0, 4);
                            td4Var.b.eglSwapBuffers(td4Var.c, td4Var.e);
                            xl0 xl0Var2 = td4Var.J;
                            if (xl0Var2 != null) {
                                xl0Var2.a(g, td4Var.V, td4Var.W, null);
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
                hza hzaVar = td4Var.c0;
                SurfaceTexture surfaceTexture = td4Var.x;
                kac kacVar = (kac) hzaVar.b;
                if (kacVar.a != null) {
                    kacVar.a.x0(new Surface(surfaceTexture));
                    return;
                }
                return;
        }
    }
}
