package nh;

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
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
public final class e implements Runnable {
    public final int f17553a;
    public final m f17554b;

    public e(m mVar, int i10) {
        this.f17553a = i10;
        this.f17554b = mVar;
    }

    @Override
    public final void run() {
        float f9;
        int i10;
        int i11;
        int i12 = this.f17553a;
        m mVar = this.f17554b;
        switch (i12) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.f18080i0;
                FrameLayout frameLayout = mVar.F;
                j jVar = mVar.f18089r;
                g gVar = mVar.f18076f;
                if (mVar.f18083l0 != z10) {
                    mVar.f18083l0 = z10;
                    ValueAnimator valueAnimator = mVar.m0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.m0 = null;
                    }
                    Utilities.Callback callback = mVar.f18078g0;
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
                    float f10 = mVar.f18082k0;
                    if (z10) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
                    mVar.m0 = ofFloat;
                    ofFloat.addUpdateListener(new lh.d5(mVar, 4));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.m0.addListener(new bg.z2(11, mVar, z10));
                    if (z10) {
                        mVar.m0.setInterpolator(org.telegram.ui.ActionBar.q1.f23735w);
                        mVar.m0.setDuration(250L);
                    } else {
                        mVar.m0.setInterpolator(new u1.a());
                        mVar.m0.setDuration(420L);
                    }
                    mVar.m0.start();
                    st editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f18072c0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = gVar.f26882a.length();
                        } else {
                            i10 = 0;
                        }
                        gVar.setSelection(i10);
                        gVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i11 = lineTop - height;
                        } else {
                            i11 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i11);
                        mVar.f18072c0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f18072c0.setInterpolator(jr.h);
                        mVar.f18072c0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f18085n0 == null) {
                            mVar.f18085n0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f18094u0 = true;
                        mVar.i(mVar.f18085n0);
                        mVar.f18094u0 = false;
                        Bitmap bitmap = mVar.f18085n0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f18085n0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f18086o0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f18087p0;
                            if (matrix == null) {
                                mVar.f18087p0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f18086o0.setLocalMatrix(mVar.f18087p0);
                            if (mVar.f18088q0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f18088q0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f18088q0.setShader(mVar.f18086o0);
                            return;
                        }
                        mVar.f18085n0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
