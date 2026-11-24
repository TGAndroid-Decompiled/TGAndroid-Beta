package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.util.ArrayList;
public final class fjb {
    public final int[] A;
    public final int[] B;
    public Bitmap C;
    public final boolean D;
    public final gjb E;
    public final ArrayList a;
    public long b;
    public float c;
    public boolean d;
    public final Runnable e;
    public Runnable f;
    public float g;
    public float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public boolean n;
    public final boolean o;
    public final float[] p;
    public final float[] q;
    public final Matrix r;
    public int s;
    public final int t;
    public final int u;
    public int v;
    public int w;
    public float x;
    public final float y;
    public int z;

    public fjb(defpackage.gjb r32, java.util.ArrayList r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjb.<init>(gjb, java.util.ArrayList, java.lang.Runnable):void");
    }

    public static void b(Canvas canvas, gb2 gb2Var, int i, float f, float f2) {
        float f3;
        canvas.save();
        if (gb2Var.a()) {
            f3 = gb2Var.getAlpha();
        } else {
            f3 = 1.0f;
        }
        canvas.translate(f, f2);
        boolean z = true;
        gb2Var.setInvalidatesParent(true);
        if (i == 0) {
            gb2Var.A1(f3, canvas, true);
        } else if (i == 1) {
            gb2Var.h1(canvas, f3);
        } else if (i == 2) {
            if (gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) {
                z = false;
            }
            gb2Var.Q0(f3, canvas, z);
        } else if (gb2Var.getCurrentPosition() == null || (gb2Var.getCurrentPosition().l & 1) != 0) {
            gb2Var.q1(canvas, f3, null);
            gb2Var.V0(canvas, f3);
        }
        gb2Var.setInvalidatesParent(false);
        canvas.restore();
    }

    public final void a() {
        try {
            GLES20.glDeleteBuffers(2, this.B, 0);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        gjb gjbVar = this.E;
        int i = gjbVar.x;
        if (i != 0) {
            try {
                GLES20.glDeleteProgram(i);
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            gjbVar.x = 0;
        }
        try {
            GLES20.glDeleteTextures(1, this.A, 0);
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        Runnable runnable = this.f;
        if (runnable != null) {
            ijb.b(runnable);
            this.f = null;
        }
    }

    public final void c() {
        Matrix matrix = this.r;
        float[] fArr = this.q;
        matrix.getValues(fArr);
        float f = fArr[0];
        float[] fArr2 = this.p;
        fArr2[0] = f;
        fArr2[1] = fArr[3];
        fArr2[2] = fArr[6];
        fArr2[3] = fArr[1];
        fArr2[4] = fArr[4];
        fArr2[5] = fArr[7];
        fArr2[6] = fArr[2];
        fArr2[7] = fArr[5];
        fArr2[8] = fArr[8];
        this.n = false;
    }

    public fjb(gjb gjbVar, Matrix matrix, Bitmap bitmap, Runnable runnable, Runnable runnable2) {
        this.E = gjbVar;
        this.a = new ArrayList();
        this.b = -1L;
        this.c = 0.0f;
        this.d = true;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = gl.p;
        this.l = 1.5f;
        this.m = 1.15f;
        this.n = true;
        this.o = false;
        this.p = new float[9];
        this.q = new float[9];
        Matrix matrix2 = new Matrix();
        this.r = matrix2;
        this.y = (float) (Math.random() * 2.0d);
        this.A = new int[1];
        this.B = new int[2];
        this.D = true;
        float[] fArr = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        matrix.mapPoints(fArr);
        this.i = fArr[0];
        this.j = fArr[1];
        this.t = (int) loe.a(fArr[2], fArr[3], fArr[6], fArr[7]);
        this.u = (int) loe.a(fArr[4], fArr[5], fArr[6], fArr[7]);
        this.o = true;
        matrix2.set(matrix);
        c();
        this.e = runnable;
        this.f = runnable2;
        this.l = 4.0f;
        this.c = -0.1f;
        this.C = bitmap;
    }

    public fjb(defpackage.gjb r11, android.view.View r12, float r13, java.lang.Runnable r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fjb.<init>(gjb, android.view.View, float, java.lang.Runnable):void");
    }
}
