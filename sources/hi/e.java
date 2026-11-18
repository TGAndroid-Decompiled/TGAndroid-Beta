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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
public final class e implements Runnable {
    public final int f14504a;
    public final n f14505b;

    public e(n nVar, int i7) {
        this.f14504a = i7;
        this.f14505b = nVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f14504a;
        n nVar = this.f14505b;
        switch (i11) {
            case 0:
                nVar.t();
                return;
            default:
                boolean z10 = nVar.m0;
                FrameLayout frameLayout = nVar.K;
                j jVar = nVar.f15061r;
                g gVar = nVar.f15048f;
                if (nVar.f15059p0 != z10) {
                    nVar.f15059p0 = z10;
                    ValueAnimator valueAnimator = nVar.f15060q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        nVar.f15060q0 = null;
                    }
                    x10 x10Var = nVar.f15054k0;
                    if (x10Var != null) {
                        x10Var.a(Boolean.valueOf(z10));
                    }
                    nVar.d(z10);
                    if (z10) {
                        i iVar = nVar.N;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    float f11 = nVar.f15058o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    nVar.f15060q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(nVar, 26));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    nVar.f15060q0.addListener(new bi.d7(8, nVar, z10));
                    if (z10) {
                        nVar.f15060q0.setInterpolator(org.telegram.ui.ActionBar.j1.f29017w);
                        nVar.f15060q0.setDuration(250L);
                    } else {
                        nVar.f15060q0.setInterpolator(new x1.a());
                        nVar.f15060q0.setDuration(420L);
                    }
                    nVar.f15060q0.start();
                    mt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = nVar.f15050g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i7 = gVar.f41786a.length();
                        } else {
                            i7 = 0;
                        }
                        gVar.setSelection(i7);
                        gVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i10 = lineTop - height;
                        } else {
                            i10 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i10);
                        nVar.f15050g0 = ofInt;
                        ofInt.setDuration(360L);
                        nVar.f15050g0.setInterpolator(lr.h);
                        nVar.f15050g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z10 && bz.o() >= 1 && !pc.f()) {
                        if (nVar.f15062r0 == null) {
                            nVar.f15062r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        nVar.f15073y0 = true;
                        nVar.i(nVar.f15062r0);
                        nVar.f15073y0 = false;
                        Bitmap bitmap = nVar.f15062r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = nVar.f15062r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            nVar.f15064s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = nVar.f15065t0;
                            if (matrix == null) {
                                nVar.f15065t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            nVar.f15064s0.setLocalMatrix(nVar.f15065t0);
                            if (nVar.f15066u0 == null) {
                                Paint paint = new Paint(3);
                                nVar.f15066u0 = paint;
                                paint.setColor(-1);
                            }
                            nVar.f15066u0.setShader(nVar.f15064s0);
                            return;
                        }
                        nVar.f15062r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
