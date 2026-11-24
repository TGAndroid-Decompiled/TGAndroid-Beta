package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
public final class hc1 implements Runnable {
    public final byte a;
    public final pc1 b;

    public hc1(pc1 pc1Var, byte b) {
        this.a = b;
        this.b = pc1Var;
    }

    @Override
    public final void run() {
        float f;
        int i;
        int i2;
        byte b = this.a;
        pc1 pc1Var = this.b;
        switch (b) {
            case 0:
                pc1Var.t();
                return;
            default:
                boolean z = pc1Var.m0;
                FrameLayout frameLayout = pc1Var.K;
                mc1 mc1Var = pc1Var.r;
                jc1 jc1Var = pc1Var.f;
                if (pc1Var.p0 != z) {
                    pc1Var.p0 = z;
                    ValueAnimator valueAnimator = pc1Var.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        pc1Var.q0 = null;
                    }
                    qac qacVar = pc1Var.k0;
                    if (qacVar != null) {
                        qacVar.a(Boolean.valueOf(z));
                    }
                    pc1Var.d(z);
                    if (z) {
                        lc1 lc1Var = pc1Var.N;
                        if (lc1Var != null) {
                            lc1Var.setVisibility(0);
                        }
                        mc1Var.setVisibility(0);
                    } else {
                        jc1Var.getEditText().scrollBy(0, -jc1Var.getEditText().getScrollY());
                    }
                    float f2 = pc1Var.o0;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    pc1Var.q0 = ofFloat;
                    ofFloat.addUpdateListener(new f0(pc1Var, (byte) 26));
                    if (!z) {
                        jc1Var.getEditText().setAllowDrawCursor(false);
                    }
                    pc1Var.q0.addListener(new y7((byte) 11, pc1Var, z));
                    ValueAnimator valueAnimator2 = pc1Var.q0;
                    if (z) {
                        valueAnimator2.setInterpolator(gb.w);
                        pc1Var.q0.setDuration(250L);
                    } else {
                        valueAnimator2.setInterpolator(new l94());
                        pc1Var.q0.setDuration(420L);
                    }
                    pc1Var.q0.start();
                    qu3 editText = jc1Var.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = pc1Var.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z) {
                            i = jc1Var.a.length();
                        } else {
                            i = 0;
                        }
                        jc1Var.setSelection(i);
                        jc1Var.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z) {
                            i2 = lineTop - height;
                        } else {
                            i2 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i2);
                        pc1Var.g0 = ofInt;
                        ofInt.setDuration(360L);
                        pc1Var.g0.setInterpolator(d53.h);
                        pc1Var.g0.start();
                    }
                    jc1Var.setSuggestionsEnabled(z);
                    if (!z) {
                        jc1Var.getEditText().j(false, true);
                        return;
                    } else if (gda.o() >= 1 && !e86.f()) {
                        Bitmap bitmap = pc1Var.r0;
                        if (bitmap == null) {
                            bitmap = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                            pc1Var.r0 = bitmap;
                        }
                        pc1Var.y0 = true;
                        pc1Var.i(bitmap);
                        pc1Var.y0 = false;
                        Bitmap bitmap2 = pc1Var.r0;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            Bitmap bitmap3 = pc1Var.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            pc1Var.s0 = new BitmapShader(bitmap3, tileMode, tileMode);
                            Matrix matrix = pc1Var.t0;
                            if (matrix == null) {
                                pc1Var.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            pc1Var.s0.setLocalMatrix(pc1Var.t0);
                            if (pc1Var.u0 == null) {
                                Paint paint = new Paint(3);
                                pc1Var.u0 = paint;
                                paint.setColor(-1);
                            }
                            pc1Var.u0.setShader(pc1Var.s0);
                            return;
                        }
                        pc1Var.r0 = null;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
