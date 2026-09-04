package di;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
public final class e implements Runnable {
    public final int f7116a;
    public final m f7117b;

    public e(m mVar, int i10) {
        this.f7116a = i10;
        this.f7117b = mVar;
    }

    @Override
    public final void run() {
        float f7;
        int i10;
        int i11;
        int i12 = this.f7116a;
        m mVar = this.f7117b;
        switch (i12) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.f7606r;
                g gVar = mVar.f7593f;
                if (mVar.f7604p0 != z10) {
                    mVar.f7604p0 = z10;
                    ValueAnimator valueAnimator = mVar.f7605q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f7605q0 = null;
                    }
                    Utilities.Callback callback = mVar.f7599k0;
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
                    float f10 = mVar.f7603o0;
                    if (z10) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    mVar.f7605q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.d0(mVar, 16));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f7605q0.addListener(new ah.q0(8, mVar, z10));
                    if (z10) {
                        mVar.f7605q0.setInterpolator(org.telegram.ui.ActionBar.p1.f21275w);
                        mVar.f7605q0.setDuration(250L);
                    } else {
                        mVar.f7605q0.setInterpolator(new u1.a());
                        mVar.f7605q0.setDuration(420L);
                    }
                    mVar.f7605q0.start();
                    zt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f7595g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i10 = gVar.f26847a.length();
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
                        mVar.f7595g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f7595g0.setInterpolator(pr.h);
                        mVar.f7595g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.f7607r0 == null) {
                            mVar.f7607r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f7618y0 = true;
                        mVar.i(mVar.f7607r0);
                        mVar.f7618y0 = false;
                        Bitmap bitmap = mVar.f7607r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f7607r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f7609s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f7610t0;
                            if (matrix == null) {
                                mVar.f7610t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f7609s0.setLocalMatrix(mVar.f7610t0);
                            if (mVar.f7611u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f7611u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f7611u0.setShader(mVar.f7609s0);
                            return;
                        }
                        mVar.f7607r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
