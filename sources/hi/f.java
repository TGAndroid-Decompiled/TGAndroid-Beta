package hi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.cz;
import org.telegram.messenger.qc;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
public final class f implements Runnable {
    public final int f14613a;
    public final o f14614b;

    public f(o oVar, int i7) {
        this.f14613a = i7;
        this.f14614b = oVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f14613a;
        o oVar = this.f14614b;
        switch (i11) {
            case 0:
                oVar.t();
                return;
            default:
                boolean z10 = oVar.m0;
                FrameLayout frameLayout = oVar.K;
                k kVar = oVar.f15164r;
                h hVar = oVar.f15151f;
                if (oVar.f15162p0 != z10) {
                    oVar.f15162p0 = z10;
                    ValueAnimator valueAnimator = oVar.f15163q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oVar.f15163q0 = null;
                    }
                    y10 y10Var = oVar.f15157k0;
                    if (y10Var != null) {
                        y10Var.a(Boolean.valueOf(z10));
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
                    float f11 = oVar.f15161o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    oVar.f15163q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(oVar, 26));
                    if (!z10) {
                        hVar.getEditText().setAllowDrawCursor(false);
                    }
                    oVar.f15163q0.addListener(new bi.g7(8, oVar, z10));
                    if (z10) {
                        oVar.f15163q0.setInterpolator(org.telegram.ui.ActionBar.i1.f29005w);
                        oVar.f15163q0.setDuration(250L);
                    } else {
                        oVar.f15163q0.setInterpolator(new x1.a());
                        oVar.f15163q0.setDuration(420L);
                    }
                    oVar.f15163q0.start();
                    ot editText = hVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = oVar.f15153g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i7 = hVar.f42534a.length();
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
                        oVar.f15153g0 = ofInt;
                        ofInt.setDuration(360L);
                        oVar.f15153g0.setInterpolator(nr.h);
                        oVar.f15153g0.start();
                    }
                    hVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        hVar.getEditText().j(false, true);
                    }
                    if (z10 && cz.o() >= 1 && !qc.f()) {
                        if (oVar.f15165r0 == null) {
                            oVar.f15165r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        oVar.f15176y0 = true;
                        oVar.i(oVar.f15165r0);
                        oVar.f15176y0 = false;
                        Bitmap bitmap = oVar.f15165r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = oVar.f15165r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            oVar.f15167s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = oVar.f15168t0;
                            if (matrix == null) {
                                oVar.f15168t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            oVar.f15167s0.setLocalMatrix(oVar.f15168t0);
                            if (oVar.f15169u0 == null) {
                                Paint paint = new Paint(3);
                                oVar.f15169u0 = paint;
                                paint.setColor(-1);
                            }
                            oVar.f15169u0.setShader(oVar.f15167s0);
                            return;
                        }
                        oVar.f15165r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
