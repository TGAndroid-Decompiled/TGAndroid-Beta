package bi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wr;
public final class e implements Runnable {
    public final int f2574a;
    public final o f2575b;

    public e(o oVar, int i10) {
        this.f2574a = i10;
        this.f2575b = oVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f2574a;
        o oVar = this.f2575b;
        switch (i12) {
            case 0:
                oVar.t();
                return;
            default:
                boolean z10 = oVar.m0;
                FrameLayout frameLayout = oVar.J;
                l lVar = oVar.f3281r;
                i iVar = oVar.f3268f;
                if (oVar.f3279p0 != z10) {
                    oVar.f3279p0 = z10;
                    ValueAnimator valueAnimator = oVar.f3280q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oVar.f3280q0 = null;
                    }
                    Utilities.Callback callback = oVar.f3274k0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    oVar.d(z10);
                    if (z10) {
                        k kVar = oVar.M;
                        if (kVar != null) {
                            kVar.setVisibility(0);
                        }
                        lVar.setVisibility(0);
                    } else {
                        iVar.getEditText().scrollBy(0, -iVar.getEditText().getScrollY());
                    }
                    float f10 = oVar.f3278o0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    oVar.f3280q0 = ofFloat;
                    ofFloat.addUpdateListener(new ai.a(oVar, 1));
                    if (!z10) {
                        iVar.getEditText().setAllowDrawCursor(false);
                    }
                    oVar.f3280q0.addListener(new ai.e(3, oVar, z10));
                    if (z10) {
                        oVar.f3280q0.setInterpolator(org.telegram.ui.ActionBar.r1.f18592w);
                        oVar.f3280q0.setDuration(250L);
                    } else {
                        oVar.f3280q0.setInterpolator(new u1.a());
                        oVar.f3280q0.setDuration(420L);
                    }
                    oVar.f3280q0.start();
                    fu editText = iVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = oVar.f3270g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = iVar.f25595a.length();
                        } else {
                            i10 = 0;
                        }
                        iVar.setSelection(i10);
                        iVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i11 = lineTop - height;
                        } else {
                            i11 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i11);
                        oVar.f3270g0 = ofInt;
                        ofInt.setDuration(360L);
                        oVar.f3270g0.setInterpolator(wr.h);
                        oVar.f3270g0.start();
                    }
                    iVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        iVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (oVar.f3282r0 == null) {
                            oVar.f3282r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        oVar.f3293y0 = true;
                        oVar.i(oVar.f3282r0);
                        oVar.f3293y0 = false;
                        Bitmap bitmap = oVar.f3282r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = oVar.f3282r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            oVar.f3284s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = oVar.f3285t0;
                            if (matrix == null) {
                                oVar.f3285t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            oVar.f3284s0.setLocalMatrix(oVar.f3285t0);
                            if (oVar.f3286u0 == null) {
                                Paint paint = new Paint(3);
                                oVar.f3286u0 = paint;
                                paint.setColor(-1);
                            }
                            oVar.f3286u0.setShader(oVar.f3284s0);
                            return;
                        }
                        oVar.f3282r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
