package fi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.messenger.iz;
import org.telegram.messenger.sc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
public final class e implements Runnable {
    public final int f11823a;
    public final m f11824b;

    public e(m mVar, int i7) {
        this.f11823a = i7;
        this.f11824b = mVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f11823a;
        m mVar = this.f11824b;
        switch (i11) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z9 = mVar.f12374l0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.f12380r;
                g gVar = mVar.f12367f;
                if (mVar.f12377o0 != z9) {
                    mVar.f12377o0 = z9;
                    ValueAnimator valueAnimator = mVar.f12378p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f12378p0 = null;
                    }
                    c20 c20Var = mVar.f12372j0;
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(z9));
                    }
                    mVar.d(z9);
                    if (z9) {
                        i iVar = mVar.M;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    float f11 = mVar.f12376n0;
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    mVar.f12378p0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(mVar, 25));
                    if (!z9) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f12378p0.addListener(new ch.y(7, mVar, z9));
                    if (z9) {
                        mVar.f12378p0.setInterpolator(org.telegram.ui.ActionBar.i1.f27527w);
                        mVar.f12378p0.setDuration(250L);
                    } else {
                        mVar.f12378p0.setInterpolator(new x1.a());
                        mVar.f12378p0.setDuration(420L);
                    }
                    mVar.f12378p0.start();
                    ys editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f12368f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z9) {
                            i7 = gVar.f35433a.length();
                        } else {
                            i7 = 0;
                        }
                        gVar.setSelection(i7);
                        gVar.getEditText().setForceCursorEnd(false);
                        int lineTop = editText.getLayout().getLineTop(editText.getLineCount());
                        int height = (editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom();
                        if (z9) {
                            i10 = lineTop - height;
                        } else {
                            i10 = 0;
                        }
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, i10);
                        mVar.f12368f0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f12368f0.setInterpolator(wq.h);
                        mVar.f12368f0.start();
                    }
                    gVar.setSuggestionsEnabled(z9);
                    if (!z9) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z9 && iz.o() >= 1 && !sc.f()) {
                        if (mVar.f12379q0 == null) {
                            mVar.f12379q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f12390x0 = true;
                        mVar.i(mVar.f12379q0);
                        mVar.f12390x0 = false;
                        Bitmap bitmap = mVar.f12379q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f12379q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f12381r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f12383s0;
                            if (matrix == null) {
                                mVar.f12383s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f12381r0.setLocalMatrix(mVar.f12383s0);
                            if (mVar.f12384t0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f12384t0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f12384t0.setShader(mVar.f12381r0);
                            return;
                        }
                        mVar.f12379q0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
