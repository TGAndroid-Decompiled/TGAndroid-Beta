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
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.yc;
public final class g extends wt {
    public org.telegram.ui.Components.ga W;
    public fh.g f14669a0;
    public final org.telegram.ui.ActionBar.i6 f14670b0;
    public final org.telegram.ui.Components.ca f14671c0;
    public final n f14672d0;

    public g(n nVar, Context context, au0 au0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.ui.Components.ca caVar) {
        super(context, au0Var, null, i7, true, bVar);
        this.f14672d0 = nVar;
        this.f14670b0 = i6Var;
        this.f14671c0 = caVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        n nVar = this.f14672d0;
        if ((nVar instanceof s) && ((s) nVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        ry emojiView = getEmojiView();
        if (emojiView != null) {
            n nVar = this.f14672d0;
            if (nVar.getEditTextStyle() == 2 || nVar.getEditTextStyle() == 3) {
                emojiView.f39407x0 = false;
                emojiView.f39413y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (nVar instanceof yc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.f24113n);
                    emojiView.f39340c = 3;
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
    public final void g(Canvas canvas, st stVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        st stVar2 = stVar;
        n nVar = this.f14672d0;
        dh.j jVar = nVar.d;
        RectF rectF = nVar.f15074z0;
        rectF.set(0.0f, 0.0f, stVar2.getWidth(), org.telegram.messenger.g0.L(29.0f) + stVar2.getHeight());
        int i11 = 0;
        if (nVar.f15051h0 != null) {
            if (this.f14669a0 == null) {
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
                fh.g c10 = nVar.f15051h0.c(stVar2, null, false);
                c10.p(c8.i0.j(this.f14670b0));
                this.f14669a0 = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.f14669a0;
                gVar.T = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.f14669a0;
                gVar2.R.f11641g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.f14669a0.setBounds(rect);
            this.f14669a0.draw(canvas);
        } else if (nVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.ga(this.f14671c0, stVar2, 7, false);
            }
            nVar.h(this.W, canvas, nVar.f15074z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -stVar2.getY(), false);
            jVar.f8452m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = nVar.f15046e;
            FrameLayout frameLayout = nVar.K;
            if (nVar.f15058o0 > 0.0f && nVar.f15066u0 != null && nVar.f15064s0 != null && (bitmap = nVar.f15062r0) != null && !bitmap.isRecycled()) {
                nVar.f15065t0.reset();
                nVar.f15065t0.postScale(frameLayout.getWidth() / nVar.f15062r0.getWidth(), frameLayout.getHeight() / nVar.f15062r0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                st stVar3 = stVar2;
                while (i11 < 8 && stVar3 != null) {
                    f10 += stVar3.getX();
                    f11 += stVar3.getY();
                    ViewParent parent = stVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i11++;
                    stVar3 = r12;
                }
                nVar.f15065t0.postTranslate(-f10, -f11);
                nVar.f15064s0.setLocalMatrix(nVar.f15065t0);
                nVar.f15066u0.setAlpha((int) (nVar.f15058o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, nVar.f15066u0);
            }
            if (nVar.f15066u0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.g0.W1(nVar.f15058o0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f14672d0.M.a();
    }

    @Override
    public final void q(int i7, int i10) {
        this.f14672d0.s(i7, i10);
    }

    @Override
    public final boolean t(int i7) {
        n nVar = this.f14672d0;
        g gVar = nVar.f15048f;
        ObjectAnimator objectAnimator = nVar.f15050g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == nVar.f15044c0) {
            return false;
        }
        nVar.invalidate();
        if (nVar.f15040a0) {
            nVar.f15040a0 = false;
            if (nVar.f15042b0 != i7) {
                ObjectAnimator objectAnimator2 = nVar.f15050g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i7 != nVar.f15044c0) {
                    ObjectAnimator objectAnimator3 = nVar.f15050g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(nVar.f15042b0);
                    mt editText = gVar.getEditText();
                    int i10 = nVar.f15042b0;
                    nVar.f15044c0 = i7;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
                    nVar.f15050g0 = ofInt;
                    ofInt.setDuration(240L);
                    nVar.f15050g0.setInterpolator(lr.h);
                    nVar.f15050g0.addListener(new ai.j0(this, 18));
                    nVar.f15050g0.start();
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
        this.f14672d0.M.f15218e = true;
    }

    @Override
    public final void y() {
        this.f14672d0.M.a();
    }
}
