package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
public final class e implements Runnable {
    public final int f8915a;
    public final m f8916b;

    public e(m mVar, int i10) {
        this.f8915a = i10;
        this.f8916b = mVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f8915a;
        m mVar = this.f8916b;
        switch (i12) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.f9414r;
                g gVar = mVar.f9401f;
                if (mVar.f9412p0 != z10) {
                    mVar.f9412p0 = z10;
                    ValueAnimator valueAnimator = mVar.f9413q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f9413q0 = null;
                    }
                    Utilities.Callback callback = mVar.f9407k0;
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
                    float f10 = mVar.f9411o0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    mVar.f9413q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.c0(mVar, 23));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f9413q0.addListener(new ah.p0(8, mVar, z10));
                    if (z10) {
                        mVar.f9413q0.setInterpolator(org.telegram.ui.ActionBar.o1.f21631w);
                        mVar.f9413q0.setDuration(250L);
                    } else {
                        mVar.f9413q0.setInterpolator(new u1.a());
                        mVar.f9413q0.setDuration(420L);
                    }
                    mVar.f9413q0.start();
                    iu editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f9403g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = gVar.f29699a.length();
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
                        mVar.f9403g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f9403g0.setInterpolator(bs.h);
                        mVar.f9403g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f9415r0 == null) {
                            mVar.f9415r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f9426y0 = true;
                        mVar.i(mVar.f9415r0);
                        mVar.f9426y0 = false;
                        Bitmap bitmap = mVar.f9415r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f9415r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f9417s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f9418t0;
                            if (matrix == null) {
                                mVar.f9418t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f9417s0.setLocalMatrix(mVar.f9418t0);
                            if (mVar.f9419u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f9419u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f9419u0.setShader(mVar.f9417s0);
                            return;
                        }
                        mVar.f9415r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
