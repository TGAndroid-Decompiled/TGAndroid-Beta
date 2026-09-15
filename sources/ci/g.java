package ci;

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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qr;
public final class g extends ju {
    public org.telegram.ui.Components.la V;
    public ch.d W;
    public final org.telegram.ui.ActionBar.e6 f4678a0;
    public final org.telegram.ui.Components.ha f4679b0;
    public final m f4680c0;

    public g(m mVar, Context context, pv0 pv0Var, int i10, ai.d dVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ha haVar) {
        super(context, pv0Var, null, i10, true, dVar);
        this.f4680c0 = mVar;
        this.f4678a0 = e6Var;
        this.f4679b0 = haVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f4680c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        kz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f4680c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f25765w0 = false;
                emojiView.f25767w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof org.telegram.ui.Components.jd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f25701c = 3;
                }
                emojiView.T();
            }
        }
        if (emojiView != null) {
            emojiView.H2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new ai.k2(1));
        }
    }

    @Override
    public final void g(Canvas canvas, fu fuVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f4680c0;
        ah.l lVar = mVar.d;
        RectF rectF = mVar.f5016z0;
        rectF.set(0.0f, 0.0f, fuVar.getWidth(), AndroidUtilities.dp(29.0f) + fuVar.getHeight());
        int i12 = 0;
        if (mVar.f4993h0 != null) {
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
                ch.d c10 = mVar.f4993h0.c(fuVar, null, false);
                c10.o(eh.b.i(this.f4678a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ch.d dVar = this.W;
                dVar.f4286m = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                ch.d dVar2 = this.W;
                dVar2.f4283j.f4269g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.la(this.f4679b0, fuVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f5016z0, AndroidUtilities.dp(29.0f), false, 0.0f, -fuVar.getY(), false);
            lVar.f483k = AndroidUtilities.dp(29.0f);
            lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            lVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f5000o0 > 0.0f && mVar.f5008u0 != null && mVar.f5006s0 != null && (bitmap = mVar.f5004r0) != null && !bitmap.isRecycled()) {
                mVar.f5007t0.reset();
                mVar.f5007t0.postScale(frameLayout.getWidth() / mVar.f5004r0.getWidth(), frameLayout.getHeight() / mVar.f5004r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                fu fuVar2 = fuVar;
                while (i12 < 8 && fuVar2 != null) {
                    f7 += fuVar2.getX();
                    f10 += fuVar2.getY();
                    ViewParent parent = fuVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    fuVar2 = r14;
                }
                mVar.f5007t0.postTranslate(-f7, -f10);
                mVar.f5006s0.setLocalMatrix(mVar.f5007t0);
                mVar.f5008u0.setAlpha((int) (mVar.f5000o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f5008u0);
            }
            if (mVar.f5008u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f5000o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f4680c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f4680c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f4680c0;
        g gVar = mVar.f4990f;
        ObjectAnimator objectAnimator = mVar.f4992g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f4985b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f4983a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f4992g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f4985b0) {
                    ObjectAnimator objectAnimator3 = mVar.f4992g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f4983a0);
                    bu editText = gVar.getEditText();
                    int i11 = mVar.f4983a0;
                    mVar.f4985b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f4992g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f4992g0.setInterpolator(qr.h);
                    mVar.f4992g0.addListener(new ai.b(this, 11));
                    mVar.f4992g0.start();
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
        this.f4680c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f4680c0.L.a();
    }
}
