package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
public final class za1 implements Runnable {
    public final byte a;
    public final ib1 b;

    public za1(ib1 ib1Var, byte b) {
        this.a = b;
        this.b = ib1Var;
    }

    @Override
    public final void run() {
        float f;
        int i;
        int i2;
        byte b = this.a;
        ib1 ib1Var = this.b;
        switch (b) {
            case 0:
                ib1Var.t();
                return;
            default:
                boolean z = ib1Var.m0;
                FrameLayout frameLayout = ib1Var.K;
                fb1 fb1Var = ib1Var.r;
                cb1 cb1Var = ib1Var.f;
                if (ib1Var.p0 != z) {
                    ib1Var.p0 = z;
                    ValueAnimator valueAnimator = ib1Var.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        ib1Var.q0 = null;
                    }
                    p8c p8cVar = ib1Var.k0;
                    if (p8cVar != null) {
                        p8cVar.a(Boolean.valueOf(z));
                    }
                    ib1Var.d(z);
                    if (z) {
                        eb1 eb1Var = ib1Var.N;
                        if (eb1Var != null) {
                            eb1Var.setVisibility(0);
                        }
                        fb1Var.setVisibility(0);
                    } else {
                        cb1Var.getEditText().scrollBy(0, -cb1Var.getEditText().getScrollY());
                    }
                    float f2 = ib1Var.o0;
                    if (z) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
                    ib1Var.q0 = ofFloat;
                    ofFloat.addUpdateListener(new f0(ib1Var, (byte) 24));
                    if (!z) {
                        cb1Var.getEditText().setAllowDrawCursor(false);
                    }
                    ib1Var.q0.addListener(new y7((byte) 11, ib1Var, z));
                    ValueAnimator valueAnimator2 = ib1Var.q0;
                    if (z) {
                        valueAnimator2.setInterpolator(gb.w);
                        ib1Var.q0.setDuration(250L);
                    } else {
                        valueAnimator2.setInterpolator(new c84());
                        ib1Var.q0.setDuration(420L);
                    }
                    ib1Var.q0.start();
                    gt3 editText = cb1Var.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = ib1Var.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z) {
                            i = cb1Var.a.length();
                        } else {
                            i = 0;
                        }
                        cb1Var.setSelection(i);
                        cb1Var.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z) {
                            i2 = lineTop - height;
                        } else {
                            i2 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i2);
                        ib1Var.g0 = ofInt;
                        ofInt.setDuration(360L);
                        ib1Var.g0.setInterpolator(s33.h);
                        ib1Var.g0.start();
                    }
                    cb1Var.setSuggestionsEnabled(z);
                    if (!z) {
                        cb1Var.getEditText().j(false, true);
                        return;
                    } else if (gba.o() >= 1 && !e66.f()) {
                        Bitmap bitmap = ib1Var.r0;
                        if (bitmap == null) {
                            bitmap = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                            ib1Var.r0 = bitmap;
                        }
                        ib1Var.y0 = true;
                        ib1Var.i(bitmap);
                        ib1Var.y0 = false;
                        Bitmap bitmap2 = ib1Var.r0;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            Bitmap bitmap3 = ib1Var.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            ib1Var.s0 = new BitmapShader(bitmap3, tileMode, tileMode);
                            Matrix matrix = ib1Var.t0;
                            if (matrix == null) {
                                ib1Var.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            ib1Var.s0.setLocalMatrix(ib1Var.t0);
                            if (ib1Var.u0 == null) {
                                Paint paint = new Paint(3);
                                ib1Var.u0 = paint;
                                paint.setColor(-1);
                            }
                            ib1Var.u0.setShader(ib1Var.s0);
                            return;
                        }
                        ib1Var.r0 = null;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
