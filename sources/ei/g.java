package ei;

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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.kd;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.tz;
public final class g extends qu {
    public org.telegram.ui.Components.na V;
    public dh.d W;
    public final org.telegram.ui.ActionBar.d6 f9060a0;
    public final org.telegram.ui.Components.ja f9061b0;
    public final m f9062c0;

    public g(m mVar, Context context, kw0 kw0Var, int i10, ci.b bVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ja jaVar) {
        super(context, kw0Var, null, i10, true, bVar);
        this.f9062c0 = mVar;
        this.f9060a0 = d6Var;
        this.f9061b0 = jaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f9062c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        tz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f9062c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f30830w0 = false;
                emojiView.f30832w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof kd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f30766c = 3;
                }
                emojiView.S();
            }
        }
        if (emojiView != null) {
            emojiView.H2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new ci.o1(1));
        }
    }

    @Override
    public final void g(Canvas canvas, mu muVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f9062c0;
        bh.j jVar = mVar.d;
        RectF rectF = mVar.f9425z0;
        rectF.set(0.0f, 0.0f, muVar.getWidth(), AndroidUtilities.dp(29.0f) + muVar.getHeight());
        int i12 = 0;
        if (mVar.f9402h0 != null) {
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
                dh.d c10 = mVar.f9402h0.c(muVar, null, false);
                c10.o(fh.c.i(this.f9060a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                dh.d dVar = this.W;
                dVar.f8017m = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                dh.d dVar2 = this.W;
                dVar2.f8014j.f8000g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.na(this.f9061b0, muVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f9425z0, AndroidUtilities.dp(29.0f), false, 0.0f, -muVar.getY(), false);
            jVar.f4418k = AndroidUtilities.dp(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f9409o0 > 0.0f && mVar.f9417u0 != null && mVar.f9415s0 != null && (bitmap = mVar.f9413r0) != null && !bitmap.isRecycled()) {
                mVar.f9416t0.reset();
                mVar.f9416t0.postScale(frameLayout.getWidth() / mVar.f9413r0.getWidth(), frameLayout.getHeight() / mVar.f9413r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                mu muVar2 = muVar;
                while (i12 < 8 && muVar2 != null) {
                    f7 += muVar2.getX();
                    f10 += muVar2.getY();
                    ViewParent parent = muVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    muVar2 = r14;
                }
                mVar.f9416t0.postTranslate(-f7, -f10);
                mVar.f9415s0.setLocalMatrix(mVar.f9416t0);
                mVar.f9417u0.setAlpha((int) (mVar.f9409o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f9417u0);
            }
            if (mVar.f9417u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f9409o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f9062c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f9062c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f9062c0;
        g gVar = mVar.f9399f;
        ObjectAnimator objectAnimator = mVar.f9401g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f9394b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f9392a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f9401g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f9394b0) {
                    ObjectAnimator objectAnimator3 = mVar.f9401g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f9392a0);
                    iu editText = gVar.getEditText();
                    int i11 = mVar.f9392a0;
                    mVar.f9394b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f9401g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f9401g0.setInterpolator(bs.h);
                    mVar.f9401g0.addListener(new ah.b(this, 16));
                    mVar.f9401g0.start();
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
        this.f9062c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f9062c0.L.a();
    }
}
