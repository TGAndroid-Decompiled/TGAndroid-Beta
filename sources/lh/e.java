package lh;

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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;

public final class e implements Runnable {

    public final int f15886a;

    public final m f15887b;

    public e(m mVar, int i10) {
        this.f15886a = i10;
        this.f15887b = mVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15886a;
        m mVar = this.f15887b;
        switch (i10) {
            case 0:
                mVar.t();
                break;
            default:
                boolean z10 = mVar.f16342i0;
                FrameLayout frameLayout = mVar.F;
                j jVar = mVar.f16351r;
                g gVar = mVar.f16338f;
                if (mVar.f16345l0 != z10) {
                    mVar.f16345l0 = z10;
                    ValueAnimator valueAnimator = mVar.m0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.m0 = null;
                    }
                    Utilities.Callback callback = mVar.f16340g0;
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
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(mVar.f16344k0, z10 ? 1.0f : 0.0f);
                    mVar.m0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ag.u(mVar, 28));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.m0.addListener(new ag.x(10, mVar, z10));
                    if (z10) {
                        mVar.m0.setInterpolator(org.telegram.ui.ActionBar.p1.f23706w);
                        mVar.m0.setDuration(250L);
                    } else {
                        mVar.m0.setInterpolator(new u1.a());
                        mVar.m0.setDuration(420L);
                    }
                    mVar.m0.start();
                    lt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f16334c0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        gVar.setSelection(z10 ? gVar.f32875a.length() : 0);
                        gVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        mVar.f16334c0 = objectAnimatorOfInt;
                        objectAnimatorOfInt.setDuration(360L);
                        mVar.f16334c0.setInterpolator(er.h);
                        mVar.f16334c0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f16347n0 == null) {
                            mVar.f16347n0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f16356u0 = true;
                        mVar.i(mVar.f16347n0);
                        mVar.f16356u0 = false;
                        Bitmap bitmap = mVar.f16347n0;
                        if (bitmap == null || bitmap.isRecycled()) {
                            mVar.f16347n0 = null;
                        } else {
                            Bitmap bitmap2 = mVar.f16347n0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f16348o0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f16349p0;
                            if (matrix == null) {
                                mVar.f16349p0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f16348o0.setLocalMatrix(mVar.f16349p0);
                            if (mVar.f16350q0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f16350q0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f16350q0.setShader(mVar.f16348o0);
                        }
                        break;
                    }
                }
                break;
        }
    }
}
