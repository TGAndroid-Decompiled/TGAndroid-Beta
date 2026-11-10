package fi;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
public final class g extends kt {
    public org.telegram.ui.Components.ba V;
    public fh.g W;
    public final org.telegram.ui.ActionBar.h6 f12057a0;
    public final org.telegram.ui.Components.x9 f12058b0;
    public final m f12059c0;

    public g(m mVar, Context context, st0 st0Var, int i7, di.b bVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context, st0Var, null, i7, true, bVar);
        this.f12059c0 = mVar;
        this.f12057a0 = h6Var;
        this.f12058b0 = x9Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f12059c0;
        if ((mVar instanceof r) && ((r) mVar).N1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        gy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f12059c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f34077w0 = false;
                emojiView.f34083x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof tc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.f22562n);
                    emojiView.f34014c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q0(2));
        }
    }

    @Override
    public final void g(Canvas canvas, ft ftVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        ft ftVar2 = ftVar;
        m mVar = this.f12059c0;
        dh.j jVar = mVar.d;
        RectF rectF = mVar.f12392y0;
        rectF.set(0.0f, 0.0f, ftVar2.getWidth(), org.telegram.messenger.g0.L(29.0f) + ftVar2.getHeight());
        int i11 = 0;
        if (mVar.f12369g0 != null) {
            if (this.W == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i7 = 0;
                    } else {
                        i7 = roundedCorner2.getRadius();
                    }
                } else {
                    i7 = 0;
                    i10 = 0;
                }
                fh.g c10 = mVar.f12369g0.c(ftVar2, null, false);
                c10.p(c8.g0.i(this.f12057a0));
                this.W = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.W;
                gVar.S = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.W;
                gVar2.Q.f11515g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.ba(this.f12058b0, ftVar2, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f12392y0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -ftVar2.getY(), false);
            jVar.f8786m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.f12365e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f12376n0 > 0.0f && mVar.f12384t0 != null && mVar.f12381r0 != null && (bitmap = mVar.f12379q0) != null && !bitmap.isRecycled()) {
                mVar.f12383s0.reset();
                mVar.f12383s0.postScale(frameLayout.getWidth() / mVar.f12379q0.getWidth(), frameLayout.getHeight() / mVar.f12379q0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                ft ftVar3 = ftVar2;
                while (i11 < 8 && ftVar3 != null) {
                    f10 += ftVar3.getX();
                    f11 += ftVar3.getY();
                    ViewParent parent = ftVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i11++;
                    ftVar3 = r12;
                }
                mVar.f12383s0.postTranslate(-f10, -f11);
                mVar.f12381r0.setLocalMatrix(mVar.f12383s0);
                mVar.f12384t0.setAlpha((int) (mVar.f12376n0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f12384t0);
            }
            if (mVar.f12384t0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.g0.W1(mVar.f12376n0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f12059c0.L.a();
    }

    @Override
    public final void q(int i7, int i10) {
        this.f12059c0.s(i7, i10);
    }

    @Override
    public final boolean t(int i7) {
        m mVar = this.f12059c0;
        g gVar = mVar.f12367f;
        ObjectAnimator objectAnimator = mVar.f12368f0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == mVar.f12361b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f12359a0 != i7) {
                ObjectAnimator objectAnimator2 = mVar.f12368f0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i7 != mVar.f12361b0) {
                    ObjectAnimator objectAnimator3 = mVar.f12368f0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f12359a0);
                    ys editText = gVar.getEditText();
                    int i10 = mVar.f12359a0;
                    mVar.f12361b0 = i7;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
                    mVar.f12368f0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f12368f0.setInterpolator(wq.h);
                    mVar.f12368f0.addListener(new bi.t5(this, 16));
                    mVar.f12368f0.start();
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void u() {
        this.f12059c0.L.f12656e = true;
    }

    @Override
    public final void y() {
        this.f12059c0.L.a();
    }
}
