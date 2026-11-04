package gi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.az;
import org.telegram.messenger.lc;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public final class e implements Runnable {
    public final int f12614a;
    public final m f12615b;

    public e(m mVar, int i3) {
        this.f12614a = i3;
        this.f12615b = mVar;
    }

    @Override
    public final void run() {
        float f10;
        int i3;
        int i10;
        int i11 = this.f12614a;
        m mVar = this.f12615b;
        switch (i11) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.K;
                j jVar = mVar.f13157r;
                g gVar = mVar.f13144f;
                if (mVar.f13155p0 != z10) {
                    mVar.f13155p0 = z10;
                    ValueAnimator valueAnimator = mVar.f13156q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f13156q0 = null;
                    }
                    u10 u10Var = mVar.f13150k0;
                    if (u10Var != null) {
                        u10Var.a(Boolean.valueOf(z10));
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
                    float f11 = mVar.f13154o0;
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    mVar.f13156q0 = ofFloat;
                    ofFloat.addUpdateListener(new bh.f(mVar, 26));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f13156q0.addListener(new dh.x(8, mVar, z10));
                    if (z10) {
                        mVar.f13156q0.setInterpolator(org.telegram.ui.ActionBar.h1.f27551w);
                        mVar.f13156q0.setDuration(250L);
                    } else {
                        mVar.f13156q0.setInterpolator(new w1.a());
                        mVar.f13156q0.setDuration(420L);
                    }
                    mVar.f13156q0.start();
                    xs editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f13146g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z10) {
                            i3 = gVar.f35188a.length();
                        } else {
                            i3 = 0;
                        }
                        gVar.setSelection(i3);
                        gVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z10) {
                            i10 = lineTop - height;
                        } else {
                            i10 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i10);
                        mVar.f13146g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f13146g0.setInterpolator(xq.h);
                        mVar.f13146g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z10 && az.o() >= 1 && !lc.f()) {
                        if (mVar.f13158r0 == null) {
                            mVar.f13158r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f13169y0 = true;
                        mVar.i(mVar.f13158r0);
                        mVar.f13169y0 = false;
                        Bitmap bitmap = mVar.f13158r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f13158r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f13160s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f13161t0;
                            if (matrix == null) {
                                mVar.f13161t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f13160s0.setLocalMatrix(mVar.f13161t0);
                            if (mVar.f13162u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f13162u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f13162u0.setShader(mVar.f13160s0);
                            return;
                        }
                        mVar.f13158r0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
