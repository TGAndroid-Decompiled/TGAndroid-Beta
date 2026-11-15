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
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.nt;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.st0;
public final class g extends rt {
    public org.telegram.ui.Components.y9 W;
    public fh.g f14327a0;
    public final org.telegram.ui.ActionBar.e6 f14328b0;
    public final org.telegram.ui.Components.u9 f14329c0;
    public final m f14330d0;

    public g(m mVar, Context context, st0 st0Var, int i7, fi.b bVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.u9 u9Var) {
        super(context, st0Var, null, i7, true, bVar);
        this.f14330d0 = mVar;
        this.f14328b0 = e6Var;
        this.f14329c0 = u9Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f14330d0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        ly emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f14330d0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f37003x0 = false;
                emojiView.f37009y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof pc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.f23604n);
                    emojiView.f36936c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.M2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new bg.p0(2));
        }
    }

    @Override
    public final void g(Canvas canvas, nt ntVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i7;
        int i10;
        WindowInsets rootWindowInsets;
        nt ntVar2 = ntVar;
        m mVar = this.f14330d0;
        dh.j jVar = mVar.d;
        RectF rectF = mVar.f14649z0;
        rectF.set(0.0f, 0.0f, ntVar2.getWidth(), org.telegram.messenger.g0.L(29.0f) + ntVar2.getHeight());
        int i11 = 0;
        if (mVar.f14626h0 != null) {
            if (this.f14327a0 == null) {
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
                fh.g c10 = mVar.f14626h0.c(ntVar2, null, false);
                c10.p(c8.g0.i(this.f14328b0));
                this.f14327a0 = c10;
                c10.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i7, i10, true);
                fh.g gVar = this.f14327a0;
                gVar.T = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                fh.g gVar2 = this.f14327a0;
                gVar2.R.f11324g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.f14327a0.setBounds(rect);
            this.f14327a0.draw(canvas);
        } else if (mVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.y9(this.f14329c0, ntVar2, 7, false);
            }
            mVar.h(this.W, canvas, mVar.f14649z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -ntVar2.getY(), false);
            jVar.f8170m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.f14621e;
            FrameLayout frameLayout = mVar.K;
            if (mVar.f14633o0 > 0.0f && mVar.f14641u0 != null && mVar.f14639s0 != null && (bitmap = mVar.f14637r0) != null && !bitmap.isRecycled()) {
                mVar.f14640t0.reset();
                mVar.f14640t0.postScale(frameLayout.getWidth() / mVar.f14637r0.getWidth(), frameLayout.getHeight() / mVar.f14637r0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                nt ntVar3 = ntVar2;
                while (i11 < 8 && ntVar3 != null) {
                    f10 += ntVar3.getX();
                    f11 += ntVar3.getY();
                    ViewParent parent = ntVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i11++;
                    ntVar3 = r12;
                }
                mVar.f14640t0.postTranslate(-f10, -f11);
                mVar.f14639s0.setLocalMatrix(mVar.f14640t0);
                mVar.f14641u0.setAlpha((int) (mVar.f14633o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f14641u0);
            }
            if (mVar.f14641u0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.g0.W1(mVar.f14633o0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f14330d0.M.a();
    }

    @Override
    public final void q(int i7, int i10) {
        this.f14330d0.s(i7, i10);
    }

    @Override
    public final boolean t(int i7) {
        m mVar = this.f14330d0;
        g gVar = mVar.f14623f;
        ObjectAnimator objectAnimator = mVar.f14625g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i7 == mVar.f14619c0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.f14615a0) {
            mVar.f14615a0 = false;
            if (mVar.f14617b0 != i7) {
                ObjectAnimator objectAnimator2 = mVar.f14625g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i7 != mVar.f14619c0) {
                    ObjectAnimator objectAnimator3 = mVar.f14625g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f14617b0);
                    ft editText = gVar.getEditText();
                    int i10 = mVar.f14617b0;
                    mVar.f14619c0 = i7;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i7);
                    mVar.f14625g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f14625g0.setInterpolator(er.h);
                    mVar.f14625g0.addListener(new ai.i0(this, 18));
                    mVar.f14625g0.start();
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
        this.f14330d0.M.f14845e = true;
    }

    @Override
    public final void y() {
        this.f14330d0.M.a();
    }
}
