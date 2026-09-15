package ci;

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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.qr;
public final class e implements Runnable {
    public final int f4546a;
    public final m f4547b;

    public e(m mVar, int i10) {
        this.f4546a = i10;
        this.f4547b = mVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f4546a;
        m mVar = this.f4547b;
        switch (i12) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.f5003r;
                g gVar = mVar.f4990f;
                if (mVar.f5001p0 != z10) {
                    mVar.f5001p0 = z10;
                    ValueAnimator valueAnimator = mVar.f5002q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f5002q0 = null;
                    }
                    Utilities.Callback callback = mVar.f4996k0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.M;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    float f10 = mVar.f5000o0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    mVar.f5002q0 = ofFloat;
                    ofFloat.addUpdateListener(new ai.a(mVar, 15));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f5002q0.addListener(new ai.n(7, mVar, z10));
                    if (z10) {
                        mVar.f5002q0.setInterpolator(org.telegram.ui.ActionBar.p1.f19480w);
                        mVar.f5002q0.setDuration(250L);
                    } else {
                        mVar.f5002q0.setInterpolator(new u1.a());
                        mVar.f5002q0.setDuration(420L);
                    }
                    mVar.f5002q0.start();
                    bu editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f4992g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = gVar.f25422a.length();
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
                        mVar.f4992g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f4992g0.setInterpolator(qr.h);
                        mVar.f4992g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f5004r0 == null) {
                            mVar.f5004r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f5015y0 = true;
                        mVar.i(mVar.f5004r0);
                        mVar.f5015y0 = false;
                        Bitmap bitmap = mVar.f5004r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f5004r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f5006s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f5007t0;
                            if (matrix == null) {
                                mVar.f5007t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f5006s0.setLocalMatrix(mVar.f5007t0);
                            if (mVar.f5008u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f5008u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f5008u0.setShader(mVar.f5006s0);
                            return;
                        }
                        mVar.f5004r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
