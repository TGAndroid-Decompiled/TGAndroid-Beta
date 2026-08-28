package kh;

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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.qt;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xu0;
public final class g extends ut {
    public org.telegram.ui.Components.fa R;
    public kg.d S;
    public final org.telegram.ui.ActionBar.b6 T;
    public final org.telegram.ui.Components.ba U;
    public final m V;

    public g(m mVar, Context context, xu0 xu0Var, int i9, ih.b bVar, org.telegram.ui.ActionBar.b6 b6Var, org.telegram.ui.Components.ba baVar) {
        super(context, xu0Var, null, i9, true, bVar);
        this.V = mVar;
        this.T = b6Var;
        this.U = baVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.V;
        if ((mVar instanceof s) && ((s) mVar).K1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        wy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f34442s0 = false;
                emojiView.f34447t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof ad) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f34390c = 3;
                }
                emojiView.T();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.q1(5));
        }
    }

    @Override
    public final void g(Canvas canvas, qt qtVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i9;
        int i10;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        ig.i iVar = mVar.d;
        RectF rectF = mVar.f15651v0;
        rectF.set(0.0f, 0.0f, qtVar.getWidth(), AndroidUtilities.dp(29.0f) + qtVar.getHeight());
        int i11 = 0;
        if (mVar.f15629d0 != null) {
            if (this.S == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i9 = 0;
                    } else {
                        i9 = roundedCorner2.getRadius();
                    }
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                kg.d c10 = mVar.f15629d0.c(qtVar, null, false);
                c10.n(mg.c.i(this.T));
                this.S = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i9, i10);
                kg.d dVar = this.S;
                dVar.f14823k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                kg.d dVar2 = this.S;
                dVar2.h.f14807g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.S.setBounds(rect);
            this.S.draw(canvas);
        } else if (mVar.g()) {
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.fa(this.U, qtVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.f15651v0, AndroidUtilities.dp(29.0f), false, 0.0f, -qtVar.getY(), false);
            iVar.f11197k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = mVar.f15630e;
            FrameLayout frameLayout = mVar.F;
            if (mVar.f15638k0 > 0.0f && mVar.f15644q0 != null && mVar.f15642o0 != null && (bitmap = mVar.f15641n0) != null && !bitmap.isRecycled()) {
                mVar.f15643p0.reset();
                mVar.f15643p0.postScale(frameLayout.getWidth() / mVar.f15641n0.getWidth(), frameLayout.getHeight() / mVar.f15641n0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                qt qtVar2 = qtVar;
                while (i11 < 8 && qtVar2 != null) {
                    f10 += qtVar2.getX();
                    f11 += qtVar2.getY();
                    ViewParent parent = qtVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i11++;
                    qtVar2 = r14;
                }
                mVar.f15643p0.postTranslate(-f10, -f11);
                mVar.f15642o0.setLocalMatrix(mVar.f15643p0);
                mVar.f15644q0.setAlpha((int) (mVar.f15638k0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f15644q0);
            }
            if (mVar.f15644q0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f15638k0) * 0.95f;
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
    public final void q(int i9, int i10) {
        this.V.s(i9, i10);
    }

    @Override
    public final boolean t(int i9) {
        m mVar = this.V;
        g gVar = mVar.f15632f;
        ObjectAnimator objectAnimator = mVar.f15628c0;
        if (objectAnimator != null && objectAnimator.isRunning() && i9 == mVar.U) {
            return false;
        }
        mVar.invalidate();
        if (mVar.S) {
            mVar.S = false;
            if (mVar.T != i9) {
                ObjectAnimator objectAnimator2 = mVar.f15628c0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i9 != mVar.U) {
                    ObjectAnimator objectAnimator3 = mVar.f15628c0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.T);
                    mt editText = gVar.getEditText();
                    int i10 = mVar.T;
                    mVar.U = i9;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i9);
                    mVar.f15628c0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f15628c0.setInterpolator(gr.h);
                    mVar.f15628c0.addListener(new ag.e(this, 20));
                    mVar.f15628c0.start();
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
        this.V.H.f14993e = true;
    }

    @Override
    public final void y() {
        this.V.H.a();
    }
}
