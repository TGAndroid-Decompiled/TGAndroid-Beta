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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.jd;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.vw0;
public final class g extends ru {
    public org.telegram.ui.Components.pa V;
    public eh.d W;
    public final org.telegram.ui.ActionBar.u6 f10889a0;
    public final org.telegram.ui.Components.la f10890b0;
    public final m f10891c0;

    public g(m mVar, Context context, vw0 vw0Var, int i10, di.b bVar, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.la laVar) {
        super(context, vw0Var, null, i10, true, bVar);
        this.f10891c0 = mVar;
        this.f10889a0 = u6Var;
        this.f10890b0 = laVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f10891c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        sz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f10891c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f32778w0 = false;
                emojiView.f32784x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof jd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f32714c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.L2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new ag.v0(3));
        }
    }

    @Override
    public final void g(Canvas canvas, nu nuVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f10891c0;
        ch.i iVar = mVar.d;
        RectF rectF = mVar.f11225z0;
        rectF.set(0.0f, 0.0f, nuVar.getWidth(), AndroidUtilities.dp(29.0f) + nuVar.getHeight());
        int i12 = 0;
        if (mVar.f11202h0 != null) {
            if (this.W == null) {
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
                eh.d c10 = mVar.f11202h0.c(nuVar, null, false);
                c10.v(gh.c.i(this.f10889a0));
                this.W = c10;
                c10.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                eh.d dVar = this.W;
                dVar.E = true;
                dVar.A(AndroidUtilities.dp(32.0f));
                eh.d dVar2 = this.W;
                dVar2.f9966x.f9953g = 0.4f;
                dVar2.t();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.pa(this.f10890b0, nuVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f11225z0, AndroidUtilities.dp(29.0f), false, 0.0f, -nuVar.getY(), false);
            iVar.f6359l = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f11209o0 > 0.0f && mVar.f11217u0 != null && mVar.f11215s0 != null && (bitmap = mVar.f11213r0) != null && !bitmap.isRecycled()) {
                mVar.f11216t0.reset();
                mVar.f11216t0.postScale(frameLayout.getWidth() / mVar.f11213r0.getWidth(), frameLayout.getHeight() / mVar.f11213r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                nu nuVar2 = nuVar;
                while (i12 < 8 && nuVar2 != null) {
                    f7 += nuVar2.getX();
                    f10 += nuVar2.getY();
                    ViewParent parent = nuVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    nuVar2 = r14;
                }
                mVar.f11216t0.postTranslate(-f7, -f10);
                mVar.f11215s0.setLocalMatrix(mVar.f11216t0);
                mVar.f11217u0.setAlpha((int) (mVar.f11209o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f11217u0);
            }
            if (mVar.f11217u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f11209o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f10891c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f10891c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f10891c0;
        g gVar = mVar.f11199f;
        ObjectAnimator objectAnimator = mVar.f11201g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f11194b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f11192a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f11201g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f11194b0) {
                    ObjectAnimator objectAnimator3 = mVar.f11201g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f11192a0);
                    ju editText = gVar.getEditText();
                    int i11 = mVar.f11192a0;
                    mVar.f11194b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f11201g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f11201g0.setInterpolator(ds.h);
                    mVar.f11201g0.addListener(new bh.b(this, 17));
                    mVar.f11201g0.start();
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
        this.f10891c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f10891c0.L.a();
    }
}
