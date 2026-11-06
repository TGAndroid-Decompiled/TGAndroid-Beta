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
import org.telegram.messenger.rc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
public final class e implements Runnable {
    public final int f11819a;
    public final m f11820b;

    public e(m mVar, int i7) {
        this.f11819a = i7;
        this.f11820b = mVar;
    }

    @Override
    public final void run() {
        float f10;
        int i7;
        int i10;
        int i11 = this.f11819a;
        m mVar = this.f11820b;
        switch (i11) {
            case 0:
                mVar.t();
                return;
            default:
                boolean z9 = mVar.f12372l0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.f12378r;
                g gVar = mVar.f12365f;
                if (mVar.f12375o0 != z9) {
                    mVar.f12375o0 = z9;
                    ValueAnimator valueAnimator = mVar.f12376p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.f12376p0 = null;
                    }
                    c20 c20Var = mVar.f12370j0;
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
                    float f11 = mVar.f12374n0;
                    if (z9) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    mVar.f12376p0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(mVar, 25));
                    if (!z9) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.f12376p0.addListener(new ch.y(7, mVar, z9));
                    if (z9) {
                        mVar.f12376p0.setInterpolator(org.telegram.ui.ActionBar.i1.f27540w);
                        mVar.f12376p0.setDuration(250L);
                    } else {
                        mVar.f12376p0.setInterpolator(new x1.a());
                        mVar.f12376p0.setDuration(420L);
                    }
                    mVar.f12376p0.start();
                    ys editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f12366f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        if (z9) {
                            i7 = gVar.f35416a.length();
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
                        mVar.f12366f0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f12366f0.setInterpolator(xq.h);
                        mVar.f12366f0.start();
                    }
                    gVar.setSuggestionsEnabled(z9);
                    if (!z9) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z9 && iz.o() >= 1 && !rc.f()) {
                        if (mVar.f12377q0 == null) {
                            mVar.f12377q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.f12388x0 = true;
                        mVar.i(mVar.f12377q0);
                        mVar.f12388x0 = false;
                        Bitmap bitmap = mVar.f12377q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.f12377q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.f12379r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.f12381s0;
                            if (matrix == null) {
                                mVar.f12381s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.f12379r0.setLocalMatrix(mVar.f12381s0);
                            if (mVar.f12382t0 == null) {
                                Paint paint = new Paint(3);
                                mVar.f12382t0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.f12382t0.setShader(mVar.f12379r0);
                            return;
                        }
                        mVar.f12377q0 = null;
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
