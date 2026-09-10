package bi;

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
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.wr;
public final class i extends nu {
    public org.telegram.ui.Components.ma V;
    public bh.d W;
    public final org.telegram.ui.ActionBar.f6 f2822a0;
    public final org.telegram.ui.Components.ia f2823b0;
    public final o f2824c0;

    public i(o oVar, Context context, aw0 aw0Var, int i10, zh.b bVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ia iaVar) {
        super(context, aw0Var, null, i10, true, bVar);
        this.f2824c0 = oVar;
        this.f2822a0 = f6Var;
        this.f2823b0 = iaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o oVar = this.f2824c0;
        if ((oVar instanceof v) && ((v) oVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        rz emojiView = getEmojiView();
        if (emojiView != null) {
            o oVar = this.f2824c0;
            if (oVar.getEditTextStyle() == 2 || oVar.getEditTextStyle() == 3) {
                emojiView.f26867w0 = false;
                emojiView.f26873x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (oVar instanceof org.telegram.ui.Components.jd) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f26803c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.I2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new g(0));
        }
    }

    @Override
    public final void g(Canvas canvas, ju juVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        o oVar = this.f2824c0;
        zg.i iVar = oVar.d;
        RectF rectF = oVar.f3294z0;
        rectF.set(0.0f, 0.0f, juVar.getWidth(), AndroidUtilities.dp(29.0f) + juVar.getHeight());
        int i12 = 0;
        if (oVar.f3271h0 != null) {
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
                bh.d c10 = oVar.f3271h0.c(juVar, null, false);
                c10.n(dh.c.i(this.f2822a0));
                this.W = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                bh.d dVar = this.W;
                dVar.f2276k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                bh.d dVar2 = this.W;
                dVar2.h.f2261g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (oVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.ma(this.f2823b0, juVar, 7, false);
            }
            oVar.h(this.V, canvas, oVar.f3294z0, AndroidUtilities.dp(29.0f), false, 0.0f, -juVar.getY(), false);
            iVar.f48141k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
        } else {
            Paint paint = oVar.e;
            FrameLayout frameLayout = oVar.J;
            if (oVar.f3278o0 > 0.0f && oVar.f3286u0 != null && oVar.f3284s0 != null && (bitmap = oVar.f3282r0) != null && !bitmap.isRecycled()) {
                oVar.f3285t0.reset();
                oVar.f3285t0.postScale(frameLayout.getWidth() / oVar.f3282r0.getWidth(), frameLayout.getHeight() / oVar.f3282r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                ju juVar2 = juVar;
                while (i12 < 8 && juVar2 != null) {
                    f7 += juVar2.getX();
                    f10 += juVar2.getY();
                    ViewParent parent = juVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    juVar2 = r14;
                }
                oVar.f3285t0.postTranslate(-f7, -f10);
                oVar.f3284s0.setLocalMatrix(oVar.f3285t0);
                oVar.f3286u0.setAlpha((int) (oVar.f3278o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, oVar.f3286u0);
            }
            if (oVar.f3286u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, oVar.f3278o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f2824c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f2824c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        o oVar = this.f2824c0;
        i iVar = oVar.f3268f;
        ObjectAnimator objectAnimator = oVar.f3270g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == oVar.f3263b0) {
            return false;
        }
        oVar.invalidate();
        if (oVar.W) {
            oVar.W = false;
            if (oVar.f3261a0 != i10) {
                ObjectAnimator objectAnimator2 = oVar.f3270g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != oVar.f3263b0) {
                    ObjectAnimator objectAnimator3 = oVar.f3270g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    iVar.getEditText().setScrollY(oVar.f3261a0);
                    fu editText = iVar.getEditText();
                    int i11 = oVar.f3261a0;
                    oVar.f3263b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    oVar.f3270g0 = ofInt;
                    ofInt.setDuration(240L);
                    oVar.f3270g0.setInterpolator(wr.h);
                    oVar.f3270g0.addListener(new h(this, 0));
                    oVar.f3270g0.start();
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
        this.f2824c0.L.e = true;
    }

    @Override
    public final void y() {
        this.f2824c0.L.a();
    }
}
