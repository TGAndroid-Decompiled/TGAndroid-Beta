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
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.ld;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.sr;
public final class g extends lu {
    public org.telegram.ui.Components.na V;
    public ch.d W;
    public final org.telegram.ui.ActionBar.e6 f4721a0;
    public final org.telegram.ui.Components.ja f4722b0;
    public final m f4723c0;

    public g(m mVar, Context context, cw0 cw0Var, int i10, ai.d dVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ja jaVar) {
        super(context, cw0Var, null, i10, true, dVar);
        this.f4723c0 = mVar;
        this.f4721a0 = e6Var;
        this.f4722b0 = jaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f4723c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        mz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f4723c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f26636w0 = false;
                emojiView.f26638w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof ld) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f26572c = 3;
                }
                emojiView.S();
            }
        }
        if (emojiView != null) {
            emojiView.F2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new ai.k2(1));
        }
    }

    @Override
    public final void g(Canvas canvas, hu huVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f4723c0;
        ah.l lVar = mVar.d;
        RectF rectF = mVar.f5148z0;
        rectF.set(0.0f, 0.0f, huVar.getWidth(), AndroidUtilities.dp(29.0f) + huVar.getHeight());
        int i12 = 0;
        if (mVar.f5125h0 != null) {
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
                ch.d c10 = mVar.f5125h0.c(huVar, null, false);
                c10.u(eh.b.i(this.f4721a0));
                this.W = c10;
                c10.y(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ch.d dVar = this.W;
                dVar.f4285m = true;
                dVar.z(AndroidUtilities.dp(32.0f));
                ch.d dVar2 = this.W;
                dVar2.f4282j.f4268g = 0.4f;
                dVar2.q();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.na(this.f4722b0, huVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f5148z0, AndroidUtilities.dp(29.0f), false, 0.0f, -huVar.getY(), false);
            lVar.f488k = AndroidUtilities.dp(29.0f);
            lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            lVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f5132o0 > 0.0f && mVar.f5140u0 != null && mVar.f5138s0 != null && (bitmap = mVar.f5136r0) != null && !bitmap.isRecycled()) {
                mVar.f5139t0.reset();
                mVar.f5139t0.postScale(frameLayout.getWidth() / mVar.f5136r0.getWidth(), frameLayout.getHeight() / mVar.f5136r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                hu huVar2 = huVar;
                while (i12 < 8 && huVar2 != null) {
                    f7 += huVar2.getX();
                    f10 += huVar2.getY();
                    ViewParent parent = huVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    huVar2 = r14;
                }
                mVar.f5139t0.postTranslate(-f7, -f10);
                mVar.f5138s0.setLocalMatrix(mVar.f5139t0);
                mVar.f5140u0.setAlpha((int) (mVar.f5132o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f5140u0);
            }
            if (mVar.f5140u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f5132o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f4723c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f4723c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f4723c0;
        g gVar = mVar.f5122f;
        ObjectAnimator objectAnimator = mVar.f5124g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f5117b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f5115a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f5124g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f5117b0) {
                    ObjectAnimator objectAnimator3 = mVar.f5124g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f5115a0);
                    du editText = gVar.getEditText();
                    int i11 = mVar.f5115a0;
                    mVar.f5117b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f5124g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f5124g0.setInterpolator(sr.h);
                    mVar.f5124g0.addListener(new ai.b(this, 11));
                    mVar.f5124g0.start();
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
        this.f4723c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f4723c0.L.a();
    }
}
