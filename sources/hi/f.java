package hi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.bz;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
public final class f implements Runnable {
    public final int f14610a;
    public final o f14611b;

    public f(o oVar, int i7) {
        this.f14610a = i7;
        this.f14611b = oVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f14610a;
        o oVar = this.f14611b;
        switch (i11) {
            case 0:
                oVar.t();
                return;
            default:
                boolean z10 = oVar.m0;
                FrameLayout frameLayout = oVar.K;
                k kVar = oVar.f15161r;
                h hVar = oVar.f15148f;
                if (oVar.f15159p0 != z10) {
                    oVar.f15159p0 = z10;
                    ValueAnimator valueAnimator = oVar.f15160q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oVar.f15160q0 = null;
                    }
                    x10 x10Var = oVar.f15154k0;
                    if (x10Var != null) {
                        x10Var.a(Boolean.valueOf(z10));
                    }
                    oVar.d(z10);
                    if (z10) {
                        j jVar = oVar.N;
                        if (jVar != null) {
                            jVar.setVisibility(0);
                        }
                        kVar.setVisibility(0);
                    } else {
                        hVar.getEditText().scrollBy(0, -hVar.getEditText().getScrollY());
                    }
                    float f11 = oVar.f15158o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    oVar.f15160q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(oVar, 26));
                    if (!z10) {
                        hVar.getEditText().setAllowDrawCursor(false);
                    }
                    oVar.f15160q0.addListener(new bi.h7(8, oVar, z10));
                    if (z10) {
                        oVar.f15160q0.setInterpolator(org.telegram.ui.ActionBar.i1.f29002w);
                        oVar.f15160q0.setDuration(250L);
                    } else {
                        oVar.f15160q0.setInterpolator(new x1.a());
                        oVar.f15160q0.setDuration(420L);
                    }
                    oVar.f15160q0.start();
                    ot editText = hVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = oVar.f15150g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i7 = hVar.f42542a.length();
                        } else {
                            i7 = 0;
                        }
                        hVar.setSelection(i7);
                        hVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i10 = lineTop - height;
                        } else {
                            i10 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i10);
                        oVar.f15150g0 = ofInt;
                        ofInt.setDuration(360L);
                        oVar.f15150g0.setInterpolator(nr.h);
                        oVar.f15150g0.start();
                    }
                    hVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        hVar.getEditText().j(false, true);
                    }
                    if (z10 && bz.o() >= 1 && !pc.f()) {
                        if (oVar.f15162r0 == null) {
                            oVar.f15162r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        oVar.f15173y0 = true;
                        oVar.i(oVar.f15162r0);
                        oVar.f15173y0 = false;
                        Bitmap bitmap = oVar.f15162r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = oVar.f15162r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            oVar.f15164s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = oVar.f15165t0;
                            if (matrix == null) {
                                oVar.f15165t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            oVar.f15164s0.setLocalMatrix(oVar.f15165t0);
                            if (oVar.f15166u0 == null) {
                                Paint paint = new Paint(3);
                                oVar.f15166u0 = paint;
                                paint.setColor(-1);
                            }
                            oVar.f15166u0.setShader(oVar.f15164s0);
                            return;
                        }
                        oVar.f15162r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
