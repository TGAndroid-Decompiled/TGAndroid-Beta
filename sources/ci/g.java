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
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qv0;
public final class g extends ju {
    public org.telegram.ui.Components.la V;
    public ch.d W;
    public final org.telegram.ui.ActionBar.f6 f4683a0;
    public final org.telegram.ui.Components.ha f4684b0;
    public final m f4685c0;

    public g(m mVar, Context context, qv0 qv0Var, int i10, ai.d dVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ha haVar) {
        super(context, qv0Var, null, i10, true, dVar);
        this.f4685c0 = mVar;
        this.f4683a0 = f6Var;
        this.f4684b0 = haVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f4685c0;
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
            m mVar = this.f4685c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f25778w0 = false;
                emojiView.f25780w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof org.telegram.ui.Components.jd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f25714c = 3;
                }
                emojiView.S();
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
        m mVar = this.f4685c0;
        ah.m mVar2 = mVar.d;
        RectF rectF = mVar.f5021z0;
        rectF.set(0.0f, 0.0f, fuVar.getWidth(), AndroidUtilities.dp(29.0f) + fuVar.getHeight());
        int i12 = 0;
        if (mVar.f4998h0 != null) {
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
                ch.d c10 = mVar.f4998h0.c(fuVar, null, false);
                c10.o(eh.b.i(this.f4683a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ch.d dVar = this.W;
                dVar.f4291m = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                ch.d dVar2 = this.W;
                dVar2.f4288j.f4274g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.la(this.f4684b0, fuVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f5021z0, AndroidUtilities.dp(29.0f), false, 0.0f, -fuVar.getY(), false);
            mVar2.f488k = AndroidUtilities.dp(29.0f);
            mVar2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            mVar2.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f5005o0 > 0.0f && mVar.f5013u0 != null && mVar.f5011s0 != null && (bitmap = mVar.f5009r0) != null && !bitmap.isRecycled()) {
                mVar.f5012t0.reset();
                mVar.f5012t0.postScale(frameLayout.getWidth() / mVar.f5009r0.getWidth(), frameLayout.getHeight() / mVar.f5009r0.getHeight());
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
                mVar.f5012t0.postTranslate(-f7, -f10);
                mVar.f5011s0.setLocalMatrix(mVar.f5012t0);
                mVar.f5013u0.setAlpha((int) (mVar.f5005o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f5013u0);
            }
            if (mVar.f5013u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f5005o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f4685c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f4685c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f4685c0;
        g gVar = mVar.f4995f;
        ObjectAnimator objectAnimator = mVar.f4997g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f4990b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f4988a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f4997g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f4990b0) {
                    ObjectAnimator objectAnimator3 = mVar.f4997g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f4988a0);
                    bu editText = gVar.getEditText();
                    int i11 = mVar.f4988a0;
                    mVar.f4990b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f4997g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f4997g0.setInterpolator(qr.h);
                    mVar.f4997g0.addListener(new ai.b(this, 11));
                    mVar.f4997g0.start();
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
        this.f4685c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f4685c0.L.a();
    }
}
