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
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nd;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.tr;
public final class g extends mu {
    public org.telegram.ui.Components.oa V;
    public ch.d W;
    public final org.telegram.ui.ActionBar.d6 f4722a0;
    public final org.telegram.ui.Components.ka f4723b0;
    public final m f4724c0;

    public g(m mVar, Context context, dw0 dw0Var, int i10, ai.d dVar, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.ka kaVar) {
        super(context, dw0Var, null, i10, true, dVar);
        this.f4724c0 = mVar;
        this.f4722a0 = d6Var;
        this.f4723b0 = kaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f4724c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        nz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f4724c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f26880w0 = false;
                emojiView.f26882w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof nd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f26816c = 3;
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
    public final void g(Canvas canvas, iu iuVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f4724c0;
        ah.l lVar = mVar.d;
        RectF rectF = mVar.f5154z0;
        rectF.set(0.0f, 0.0f, iuVar.getWidth(), AndroidUtilities.dp(29.0f) + iuVar.getHeight());
        int i12 = 0;
        if (mVar.f5131h0 != null) {
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
                ch.d c10 = mVar.f5131h0.c(iuVar, null, false);
                c10.o(eh.b.i(this.f4722a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                ch.d dVar = this.W;
                dVar.f4290m = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                ch.d dVar2 = this.W;
                dVar2.f4287j.f4273g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.oa(this.f4723b0, iuVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f5154z0, AndroidUtilities.dp(29.0f), false, 0.0f, -iuVar.getY(), false);
            lVar.f485k = AndroidUtilities.dp(29.0f);
            lVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            lVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f5138o0 > 0.0f && mVar.f5146u0 != null && mVar.f5144s0 != null && (bitmap = mVar.f5142r0) != null && !bitmap.isRecycled()) {
                mVar.f5145t0.reset();
                mVar.f5145t0.postScale(frameLayout.getWidth() / mVar.f5142r0.getWidth(), frameLayout.getHeight() / mVar.f5142r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                iu iuVar2 = iuVar;
                while (i12 < 8 && iuVar2 != null) {
                    f7 += iuVar2.getX();
                    f10 += iuVar2.getY();
                    ViewParent parent = iuVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    iuVar2 = r14;
                }
                mVar.f5145t0.postTranslate(-f7, -f10);
                mVar.f5144s0.setLocalMatrix(mVar.f5145t0);
                mVar.f5146u0.setAlpha((int) (mVar.f5138o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f5146u0);
            }
            if (mVar.f5146u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f5138o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f4724c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f4724c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f4724c0;
        g gVar = mVar.f5128f;
        ObjectAnimator objectAnimator = mVar.f5130g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f5123b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f5121a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f5130g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f5123b0) {
                    ObjectAnimator objectAnimator3 = mVar.f5130g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f5121a0);
                    eu editText = gVar.getEditText();
                    int i11 = mVar.f5121a0;
                    mVar.f5123b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f5130g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f5130g0.setInterpolator(tr.h);
                    mVar.f5130g0.addListener(new ai.b(this, 11));
                    mVar.f5130g0.start();
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
        this.f4724c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f4724c0.L.a();
    }
}
