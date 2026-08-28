package kh;

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
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
public final class e implements Runnable {
    public final int f15127a;
    public final m f15128b;

    public e(m mVar, int i9) {
        this.f15127a = i9;
        this.f15128b = mVar;
    }

    @Override
    public final void run() {
        float f10;
        int i9;
        int i10;
        int i11 = this.f15127a;
        m mVar = this.f15128b;
        switch (i11) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.f15636i0;
                FrameLayout frameLayout = mVar.F;
                j jVar = mVar.f15645r;
                g gVar = mVar.f15632f;
                if (mVar.f15639l0 != z10) {
                    mVar.f15639l0 = z10;
                    ValueAnimator valueAnimator = mVar.m0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.m0 = null;
                    }
                    Utilities.Callback callback = mVar.f15634g0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.I;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    float f11 = mVar.f15638k0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    mVar.m0 = ofFloat;
                    ofFloat.addUpdateListener(new bg.b(mVar, 25));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.m0.addListener(new hg.b0(8, mVar, z10));
                    if (z10) {
                        mVar.m0.setInterpolator(org.telegram.ui.ActionBar.q1.f23713w);
                        mVar.m0.setDuration(250L);
                    } else {
                        mVar.m0.setInterpolator(new u1.a());
                        mVar.m0.setDuration(420L);
                    }
                    mVar.m0.start();
                    mt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f15628c0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i9 = gVar.f33121a.length();
                        } else {
                            i9 = 0;
                        }
                        gVar.setSelection(i9);
                        gVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i10 = lineTop - height;
                        } else {
                            i10 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i10);
                        mVar.f15628c0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f15628c0.setInterpolator(gr.h);
                        mVar.f15628c0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f15641n0 == null) {
                            mVar.f15641n0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f15650u0 = true;
                        mVar.i(mVar.f15641n0);
                        mVar.f15650u0 = false;
                        Bitmap bitmap = mVar.f15641n0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f15641n0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f15642o0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f15643p0;
                            if (matrix == null) {
                                mVar.f15643p0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f15642o0.setLocalMatrix(mVar.f15643p0);
                            if (mVar.f15644q0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f15644q0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f15644q0.setShader(mVar.f15642o0);
                            return;
                        }
                        mVar.f15641n0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
