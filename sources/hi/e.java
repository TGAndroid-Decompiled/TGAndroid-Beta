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
public final class e implements Runnable {
    public final int f14481a;
    public final m f14482b;

    public e(m mVar, int i7) {
        this.f14481a = i7;
        this.f14482b = mVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f14481a;
        m mVar = this.f14482b;
        switch (i11) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.K;
                j jVar = mVar.f14984r;
                g gVar = mVar.f14971f;
                if (mVar.f14982p0 != z10) {
                    mVar.f14982p0 = z10;
                    ValueAnimator valueAnimator = mVar.f14983q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f14983q0 = null;
                    }
                    y10 y10Var = mVar.f14977k0;
                    if (y10Var != null) {
                        y10Var.a(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.N;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    float f11 = mVar.f14981o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    mVar.f14983q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(mVar, 26));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f14983q0.addListener(new bi.j7(8, mVar, z10));
                    if (z10) {
                        mVar.f14983q0.setInterpolator(org.telegram.ui.ActionBar.i1.f28971w);
                        mVar.f14983q0.setDuration(250L);
                    } else {
                        mVar.f14983q0.setInterpolator(new x1.a());
                        mVar.f14983q0.setDuration(420L);
                    }
                    mVar.f14983q0.start();
                    ot editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f14973g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i7 = gVar.f42495a.length();
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
                        mVar.f14973g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f14973g0.setInterpolator(nr.h);
                        mVar.f14973g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z10 && cz.o() >= 1 && !qc.f()) {
                        if (mVar.f14985r0 == null) {
                            mVar.f14985r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f14996y0 = true;
                        mVar.i(mVar.f14985r0);
                        mVar.f14996y0 = false;
                        Bitmap bitmap = mVar.f14985r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f14985r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f14987s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f14988t0;
                            if (matrix == null) {
                                mVar.f14988t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f14987s0.setLocalMatrix(mVar.f14988t0);
                            if (mVar.f14989u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f14989u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f14989u0.setShader(mVar.f14987s0);
                            return;
                        }
                        mVar.f14985r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
