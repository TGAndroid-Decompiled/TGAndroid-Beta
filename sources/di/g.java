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
import org.telegram.ui.Components.du;
import org.telegram.ui.Components.hu;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;
public final class g extends hu {
    public org.telegram.ui.Components.na V;
    public dh.d W;
    public final org.telegram.ui.ActionBar.f6 f7283a0;
    public final org.telegram.ui.Components.ja f7284b0;
    public final m f7285c0;

    public g(m mVar, Context context, ov0 ov0Var, int i10, bi.b bVar, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.ja jaVar) {
        super(context, ov0Var, null, i10, true, bVar);
        this.f7285c0 = mVar;
        this.f7283a0 = f6Var;
        this.f7284b0 = jaVar;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f7285c0;
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
            m mVar = this.f7285c0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f28022w0 = false;
                emojiView.f28028x2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof org.telegram.ui.Components.ld) {
                    emojiView.setPadding(0, 0, 0, AndroidUtilities.navigationBarHeight);
                    emojiView.f27957c = 3;
                }
                emojiView.U();
            }
        }
        if (emojiView != null) {
            emojiView.I2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bi.z1(1));
        }
    }

    @Override
    public final void g(Canvas canvas, du duVar) {
        float lerp;
        Bitmap bitmap;
        ?? r14;
        int i10;
        int i11;
        WindowInsets rootWindowInsets;
        m mVar = this.f7285c0;
        bh.j jVar = mVar.d;
        RectF rectF = mVar.f7647z0;
        rectF.set(0.0f, 0.0f, duVar.getWidth(), AndroidUtilities.dp(29.0f) + duVar.getHeight());
        int i12 = 0;
        if (mVar.f7624h0 != null) {
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
                dh.d c10 = mVar.f7624h0.c(duVar, null, false);
                c10.n(fh.b.i(this.f7283a0));
                this.W = c10;
                c10.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i10, i11);
                dh.d dVar = this.W;
                dVar.f6867k = true;
                dVar.t(AndroidUtilities.dp(32.0f));
                dh.d dVar2 = this.W;
                dVar2.h.f6851g = 0.4f;
                dVar2.j();
            }
            Rect rect = AndroidUtilities.rectTmp2;
            rectF.round(rect);
            this.W.setBounds(rect);
            this.W.draw(canvas);
        } else if (mVar.g()) {
            if (this.V == null) {
                this.V = new org.telegram.ui.Components.na(this.f7284b0, duVar, 7, false);
            }
            mVar.h(this.V, canvas, mVar.f7647z0, AndroidUtilities.dp(29.0f), false, 0.0f, -duVar.getY(), false);
            jVar.f2746k = AndroidUtilities.dp(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, AndroidUtilities.dp(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.f7619e;
            FrameLayout frameLayout = mVar.J;
            if (mVar.f7631o0 > 0.0f && mVar.f7639u0 != null && mVar.f7637s0 != null && (bitmap = mVar.f7635r0) != null && !bitmap.isRecycled()) {
                mVar.f7638t0.reset();
                mVar.f7638t0.postScale(frameLayout.getWidth() / mVar.f7635r0.getWidth(), frameLayout.getHeight() / mVar.f7635r0.getHeight());
                float f7 = 0.0f;
                float f10 = 0.0f;
                du duVar2 = duVar;
                while (i12 < 8 && duVar2 != null) {
                    f7 += duVar2.getX();
                    f10 += duVar2.getY();
                    ViewParent parent = duVar2.getParent();
                    if (parent instanceof View) {
                        r14 = (View) parent;
                    } else {
                        r14 = 0;
                    }
                    i12++;
                    duVar2 = r14;
                }
                mVar.f7638t0.postTranslate(-f7, -f10);
                mVar.f7637s0.setLocalMatrix(mVar.f7638t0);
                mVar.f7639u0.setAlpha((int) (mVar.f7631o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f7639u0);
            }
            if (mVar.f7639u0 == null) {
                lerp = 128.0f;
            } else {
                lerp = AndroidUtilities.lerp(128, 153, mVar.f7631o0) * 0.95f;
            }
            paint.setAlpha((int) lerp);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f7285c0.L.a();
    }

    @Override
    public final void q(int i10, int i11) {
        this.f7285c0.s(i10, i11);
    }

    @Override
    public final boolean t(int i10) {
        m mVar = this.f7285c0;
        g gVar = mVar.f7621f;
        ObjectAnimator objectAnimator = mVar.f7623g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i10 == mVar.f7615b0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.W) {
            mVar.W = false;
            if (mVar.f7613a0 != i10) {
                ObjectAnimator objectAnimator2 = mVar.f7623g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i10 != mVar.f7615b0) {
                    ObjectAnimator objectAnimator3 = mVar.f7623g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f7613a0);
                    zt editText = gVar.getEditText();
                    int i11 = mVar.f7613a0;
                    mVar.f7615b0 = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i11, i10);
                    mVar.f7623g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f7623g0.setInterpolator(pr.h);
                    mVar.f7623g0.addListener(new ah.b(this, 14));
                    mVar.f7623g0.start();
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
        this.f7285c0.L.f7457e = true;
    }

    @Override
    public final void y() {
        this.f7285c0.L.a();
    }
}
