package di;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.wz;
public final class g extends vu {
    public org.telegram.ui.Components.pa V;
    public dh.d W;
    public final org.telegram.ui.ActionBar.c6 f6963a0;
    public final org.telegram.ui.Components.la f6964b0;
    public final m f6965c0;

    public g(m mVar, Context context, ow0 ow0Var, int i10, bi.b bVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.la laVar) {
        super(context, ow0Var, null, i10, true, bVar);
        this.f6965c0 = mVar;
        this.f6963a0 = c6Var;
        this.f6964b0 = laVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f6965c0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        wz emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f6965c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f31076w0 = false;
                emojiView.f31078w2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof md) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f31012c = 3;
                }
                emojiView.S();
            }
        }
        if (emojiView != null) {
            emojiView.H2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bi.a2(1));
        }
    }

    @Override
    public final void g(Canvas canvas, ru ruVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f6965c0;
        bh.j jVar = mVar.d;
        RectF rectF = mVar.f7408z0;
        rectF.set(0.0f, 0.0f, ruVar.getWidth(), AndroidUtilities.dp(29.0f) + ruVar.getHeight());
        int i12 = 0;
        if (mVar.f7385h0 != null) {
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
                dh.d c10 = mVar.f7385h0.c(ruVar, null, false);
                c10.o(fh.b.i(this.f6963a0));
                this.W = c10;
                c10.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                dh.d dVar = this.W;
                dVar.f6561m = true;
                dVar.u(AndroidUtilities.dp(32.0f));
                dh.d dVar2 = this.W;
                dVar2.f6558j.f6544g = 0.4f;
                dVar2.k();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.pa(this.f6964b0, ruVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f7408z0, AndroidUtilities.dp(29.0f), false, 0.0f, -ruVar.getY(), false);
            jVar.f2805k = AndroidUtilities.dp(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f7392o0 > 0.0f && mVar.f7400u0 != null && mVar.f7398s0 != null && (bitmap = mVar.f7396r0) != null && !bitmap.isRecycled()) {
                mVar.f7399t0.reset();
                mVar.f7399t0.postScale(frameLayout.getWidth() / mVar.f7396r0.getWidth(), frameLayout.getHeight() / mVar.f7396r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                ru ruVar2 = ruVar;
                while (i12 < 8 && ruVar2 != null) {
                    f7 += ruVar2.getX();
                    f10 += ruVar2.getY();
                    ViewParent parent = ruVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    ruVar2 = r14;
                }
                mVar.f7399t0.postTranslate(-f7, -f10);
                mVar.f7398s0.setLocalMatrix(mVar.f7399t0);
                mVar.f7400u0.setAlpha((int) (mVar.f7392o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f7400u0);
            }
            if (mVar.f7400u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f7392o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f6965c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f6965c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f6965c0;
        g gVar = mVar.f7382f;
        ObjectAnimator objectAnimator = mVar.f7384g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f7377b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f7375a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f7384g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f7377b0) {
                    ObjectAnimator objectAnimator3 = mVar.f7384g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f7375a0);
                    nu editText = gVar.getEditText();
                    int i11 = mVar.f7375a0;
                    mVar.f7377b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f7384g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f7384g0.setInterpolator(es.h);
                    mVar.f7384g0.addListener(new ah.b(this, 14));
                    mVar.f7384g0.start();
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
        this.f6965c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f6965c0.L.a();
    }
}
