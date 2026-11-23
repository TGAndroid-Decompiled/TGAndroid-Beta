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
import org.telegram.messenger.w10;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.mt;
public final class f implements Runnable {
    public final int f14413a;
    public final n f14414b;

    public f(n nVar, int i7) {
        this.f14413a = i7;
        this.f14414b = nVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f14413a;
        n nVar = this.f14414b;
        switch (i11) {
            case 0:
                nVar.t();
                return;
            default:
                boolean z10 = nVar.m0;
                FrameLayout frameLayout = nVar.K;
                k kVar = nVar.f14949r;
                h hVar = nVar.f14936f;
                if (nVar.f14947p0 != z10) {
                    nVar.f14947p0 = z10;
                    ValueAnimator valueAnimator = nVar.f14948q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        nVar.f14948q0 = null;
                    }
                    w10 w10Var = nVar.f14942k0;
                    if (w10Var != null) {
                        w10Var.a(Boolean.valueOf(z10));
                    }
                    nVar.d(z10);
                    if (z10) {
                        j jVar = nVar.N;
                        if (jVar != null) {
                            jVar.setVisibility(0);
                        }
                        kVar.setVisibility(0);
                    } else {
                        hVar.getEditText().scrollBy(0, -hVar.getEditText().getScrollY());
                    }
                    float f11 = nVar.f14946o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    nVar.f14948q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(nVar, 26));
                    if (!z10) {
                        hVar.getEditText().setAllowDrawCursor(false);
                    }
                    nVar.f14948q0.addListener(new bi.j7(8, nVar, z10));
                    if (z10) {
                        nVar.f14948q0.setInterpolator(org.telegram.ui.ActionBar.i1.f29066w);
                        nVar.f14948q0.setDuration(250L);
                    } else {
                        nVar.f14948q0.setInterpolator(new x1.a());
                        nVar.f14948q0.setDuration(420L);
                    }
                    nVar.f14948q0.start();
                    mt editText = hVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = nVar.f14938g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i7 = hVar.f41719a.length();
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
                        nVar.f14938g0 = ofInt;
                        ofInt.setDuration(360L);
                        nVar.f14938g0.setInterpolator(kr.h);
                        nVar.f14938g0.start();
                    }
                    hVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        hVar.getEditText().j(false, true);
                    }
                    if (z10 && bz.o() >= 1 && !pc.f()) {
                        if (nVar.f14950r0 == null) {
                            nVar.f14950r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        nVar.f14961y0 = true;
                        nVar.i(nVar.f14950r0);
                        nVar.f14961y0 = false;
                        Bitmap bitmap = nVar.f14950r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = nVar.f14950r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            nVar.f14952s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = nVar.f14953t0;
                            if (matrix == null) {
                                nVar.f14953t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            nVar.f14952s0.setLocalMatrix(nVar.f14953t0);
                            if (nVar.f14954u0 == null) {
                                Paint paint = new Paint(3);
                                nVar.f14954u0 = paint;
                                paint.setColor(-1);
                            }
                            nVar.f14954u0.setShader(nVar.f14952s0);
                            return;
                        }
                        nVar.f14950r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
