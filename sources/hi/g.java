package hi;

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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yt;
public final class g extends yt {
    public org.telegram.ui.Components.ga W;
    public fh.g f14622a0;
    public final org.telegram.ui.ActionBar.h6 f14623b0;
    public final org.telegram.ui.Components.ca f14624c0;
    public final m f14625d0;

    public g(m mVar, Context context, du0 du0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.ui.Components.ca caVar) {
        super(context, du0Var, null, i7, true, bVar);
        this.f14625d0 = mVar;
        this.f14623b0 = h6Var;
        this.f14624c0 = caVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f14625d0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        ty emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f14625d0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f40136x0 = false;
                emojiView.f40142y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof yc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.f24005n);
                    emojiView.f40069c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.M2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q0(2));
        }
    }

    @Override
    public final void g(Canvas canvas, ut utVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        ut utVar2 = utVar;
        m mVar = this.f14625d0;
        dh.j jVar = mVar.d;
        RectF rectF = mVar.f14997z0;
        rectF.set(0.0f, 0.0f, utVar2.getWidth(), org.telegram.messenger.g0.L(29.0f) + utVar2.getHeight());
        int i11 = 0;
        if (mVar.f14974h0 != null) {
            if (this.f14622a0 == null) {
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
                fh.g c10 = mVar.f14974h0.c(utVar2, null, false);
                c10.p(c8.j0.j(this.f14623b0));
                this.f14622a0 = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.f14622a0;
                gVar.T = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.f14622a0;
                gVar2.R.f11636g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.f14622a0.setBounds(rect);
            this.f14622a0.draw(canvas);
        } else if (mVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.ga(this.f14624c0, utVar2, 7, false);
            }
            mVar.h(this.W, canvas, mVar.f14997z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -utVar2.getY(), false);
            jVar.f8447m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.f14969e;
            FrameLayout frameLayout = mVar.K;
            if (mVar.f14981o0 > 0.0f && mVar.f14989u0 != null && mVar.f14987s0 != null && (bitmap = mVar.f14985r0) != null && !bitmap.isRecycled()) {
                mVar.f14988t0.reset();
                mVar.f14988t0.postScale(frameLayout.getWidth() / mVar.f14985r0.getWidth(), frameLayout.getHeight() / mVar.f14985r0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                ut utVar3 = utVar2;
                while (i11 < 8 && utVar3 != null) {
                    f10 += utVar3.getX();
                    f11 += utVar3.getY();
                    ViewParent parent = utVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i11++;
                    utVar3 = r12;
                }
                mVar.f14988t0.postTranslate(-f10, -f11);
                mVar.f14987s0.setLocalMatrix(mVar.f14988t0);
                mVar.f14989u0.setAlpha((int) (mVar.f14981o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f14989u0);
            }
            if (mVar.f14989u0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.g0.W1(mVar.f14981o0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f14625d0.M.a();
    }

    @Override
    public final void q(int i7, int i10) {
        this.f14625d0.s(i7, i10);
    }

    @Override
    public final boolean t(int i7) {
        m mVar = this.f14625d0;
        g gVar = mVar.f14971f;
        ObjectAnimator objectAnimator = mVar.f14973g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == mVar.f14967c0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.f14963a0) {
            mVar.f14963a0 = false;
            if (mVar.f14965b0 != i7) {
                ObjectAnimator objectAnimator2 = mVar.f14973g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i7 != mVar.f14967c0) {
                    ObjectAnimator objectAnimator3 = mVar.f14973g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f14965b0);
                    ot editText = gVar.getEditText();
                    int i10 = mVar.f14965b0;
                    mVar.f14967c0 = i7;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
                    mVar.f14973g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f14973g0.setInterpolator(nr.h);
                    mVar.f14973g0.addListener(new ai.f0(this, 18));
                    mVar.f14973g0.start();
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
        this.f14625d0.M.f15108e = true;
    }

    @Override
    public final void y() {
        this.f14625d0.M.a();
    }
}
