package lh;

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
import android.view.WindowInsets;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.pt;
import org.telegram.ui.Components.tt;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

public final class g extends tt {
    public org.telegram.ui.Components.da R;
    public lg.d S;
    public final org.telegram.ui.ActionBar.c6 T;
    public final org.telegram.ui.Components.z9 U;
    public final m V;

    public g(m mVar, Context context, zu0 zu0Var, int i10, jh.b bVar, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.z9 z9Var) {
        super(context, zu0Var, null, i10, true, bVar);
        this.V = mVar;
        this.T = c6Var;
        this.U = z9Var;
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
        yy emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.V;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f35035s0 = false;
                emojiView.f35040t2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof xc) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f34983c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.E2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new cg.l1(5));
        }
    }

    @Override
    public final void g(Canvas canvas, pt ptVar) {
        Bitmap bitmap;
        int radius;
        int radius2;
        WindowInsets rootWindowInsets;
        m mVar = this.V;
        jg.i iVar = mVar.d;
        RectF rectF = mVar.f16357v0;
        rectF.set(0.0f, 0.0f, ptVar.getWidth(), AndroidUtilities.dp(29.0f) + ptVar.getHeight());
        int i10 = 0;
        if (mVar.f16335d0 != null) {
            if (this.S == null) {
                if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                    radius = 0;
                    radius2 = 0;
                } else {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    radius2 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                    radius = roundedCorner2 == null ? 0 : roundedCorner2.getRadius();
                }
                lg.d dVarC = mVar.f16335d0.c(ptVar, null, false);
                dVarC.n(ng.c.i(this.T));
                this.S = dVarC;
                dVarC.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), radius, radius2);
                lg.d dVar = this.S;
                dVar.f15601k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                lg.d dVar2 = this.S;
                dVar2.h.f15585g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.S.setBounds(rect);
            this.S.draw(canvas);
            return;
        }
        if (mVar.g()) {
            if (this.R == null) {
                this.R = new org.telegram.ui.Components.da(this.U, ptVar, 7, false);
            }
            mVar.h(this.R, canvas, mVar.f16357v0, AndroidUtilities.dp(29.0f), false, 0.0f, -ptVar.getY(), false);
            iVar.f13009k = AndroidUtilities.dp(29.0f);
            iVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            iVar.draw(canvas);
            return;
        }
        Paint paint = mVar.f16336e;
        FrameLayout frameLayout = mVar.F;
        if (mVar.f16344k0 > 0.0f && mVar.f16350q0 != null && mVar.f16348o0 != null && (bitmap = mVar.f16347n0) != null && !bitmap.isRecycled()) {
            mVar.f16349p0.reset();
            mVar.f16349p0.postScale(frameLayout.getWidth() / mVar.f16347n0.getWidth(), frameLayout.getHeight() / mVar.f16347n0.getHeight());
            float x8 = 0.0f;
            float y10 = 0.0f;
            View view = ptVar;
            while (i10 < 8 && view != null) {
                x8 += view.getX();
                y10 += view.getY();
                Object parent = view.getParent();
                i10++;
                view = parent instanceof View ? (View) parent : null;
            }
            mVar.f16349p0.postTranslate(-x8, -y10);
            mVar.f16348o0.setLocalMatrix(mVar.f16349p0);
            mVar.f16350q0.setAlpha((int) (mVar.f16344k0 * 255.0f * 0.95f));
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f16350q0);
        }
        paint.setAlpha((int) (mVar.f16350q0 == null ? 128.0f : AndroidUtilities.lerp(128, 153, mVar.f16344k0) * 0.95f));
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
    }

    @Override
    public final void p() {
        this.V.H.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.V.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.V;
        g gVar = mVar.f16338f;
        ObjectAnimator objectAnimator = mVar.f16334c0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.U) {
            return false;
        }
        mVar.invalidate();
        if (!mVar.S) {
            return true;
        }
        mVar.S = false;
        if (mVar.T == i10) {
            return true;
        }
        ObjectAnimator objectAnimator2 = mVar.f16334c0;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && i10 == mVar.U) {
            return true;
        }
        ObjectAnimator objectAnimator3 = mVar.f16334c0;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        gVar.getEditText().setScrollY(mVar.T);
        lt editText = gVar.getEditText();
        int i11 = mVar.T;
        mVar.U = i10;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
        mVar.f16334c0 = objectAnimatorOfInt;
        objectAnimatorOfInt.setDuration(240L);
        mVar.f16334c0.setInterpolator(er.h);
        mVar.f16334c0.addListener(new ag.r1(this, 22));
        mVar.f16334c0.start();
        return false;
    }

    @Override
    public final void u() {
        this.V.H.f15636e = true;
    }

    @Override
    public final void y() {
        this.V.H.a();
    }
}
