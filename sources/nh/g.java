package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.wt;
public final class g extends au {
    public org.telegram.ui.Components.ka R;
    public ng.d S;
    public final org.telegram.ui.ActionBar.c6 T;
    public final org.telegram.ui.Components.ga U;
    public final m V;

    public g(m mVar, Context context, hv0 hv0Var, int i10, lh.b bVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.ga gaVar) {
        super(context, hv0Var, null, i10, true, bVar);
        this.V = mVar;
        this.T = c6Var;
        this.U = gaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.V;
        if ((mVar instanceof r) && ((r) mVar).K1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        fz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f28633s0 = false;
                emojiView.f28638t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof ed) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f28581c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new eg.k1(5));
        }
    }

    @Override
    public final void g(Canvas canvas, wt wtVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        lg.i iVar = mVar.d;
        RectF rectF = mVar.f18095v0;
        rectF.set(0.0f, 0.0f, wtVar.getWidth(), AndroidUtilities.dp(29.0f) + wtVar.getHeight());
        int i12 = 0;
        if (mVar.f18073d0 != null) {
            if (this.S == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i11 = 0;
                    } else {
                        i11 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner2.getRadius();
                    }
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                ng.d c3 = mVar.f18073d0.c(wtVar, null, false);
                c3.n(pg.a.i(this.T));
                this.S = c3;
                c3.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ng.d dVar = this.S;
                dVar.f17347k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                ng.d dVar2 = this.S;
                dVar2.h.f17331g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.S.setBounds(rect);
            this.S.draw(canvas);
        } else if (mVar.g()) {
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.ka(this.U, wtVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.f18095v0, AndroidUtilities.dp(29.0f), false, 0.0f, -wtVar.getY(), false);
            iVar.f15290k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = mVar.f18074e;
            FrameLayout frameLayout = mVar.F;
            if (mVar.f18082k0 > 0.0f && mVar.f18088q0 != null && mVar.f18086o0 != null && (bitmap = mVar.f18085n0) != null && !bitmap.isRecycled()) {
                mVar.f18087p0.reset();
                mVar.f18087p0.postScale(frameLayout.getWidth() / mVar.f18085n0.getWidth(), frameLayout.getHeight() / mVar.f18085n0.getHeight());
                float f9 = 0.0f;
                float f10 = 0.0f;
                wt wtVar2 = wtVar;
                while (i12 < 8 && wtVar2 != null) {
                    f9 += wtVar2.getX();
                    f10 += wtVar2.getY();
                    ViewParent parent = wtVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    wtVar2 = r14;
                }
                mVar.f18087p0.postTranslate(-f9, -f10);
                mVar.f18086o0.setLocalMatrix(mVar.f18087p0);
                mVar.f18088q0.setAlpha((int) (mVar.f18082k0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f18088q0);
            }
            if (mVar.f18088q0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f18082k0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.V.H.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.V.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.V;
        g gVar = mVar.f18076f;
        ObjectAnimator objectAnimator = mVar.f18072c0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.U) {
            return false;
        }
        mVar.invalidate();
        if (mVar.S) {
            mVar.S = false;
            if (mVar.T != i10) {
                ObjectAnimator objectAnimator2 = mVar.f18072c0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.U) {
                    ObjectAnimator objectAnimator3 = mVar.f18072c0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.T);
                    st editText = gVar.getEditText();
                    int i11 = mVar.T;
                    mVar.U = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f18072c0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f18072c0.setInterpolator(jr.h);
                    mVar.f18072c0.addListener(new ag.m0(this, 26));
                    mVar.f18072c0.start();
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
        this.V.H.f18780e = true;
    }

    @Override
    public final void y() {
        this.V.H.a();
    }
}
