package gi;

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
import b8.cd;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.jt;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public final class g extends jt {
    public org.telegram.ui.Components.ba W;
    public gh.g f12818a0;
    public final org.telegram.ui.ActionBar.e6 f12819b0;
    public final org.telegram.ui.Components.x9 f12820c0;
    public final m f12821d0;

    public g(m mVar, Context context, qt0 qt0Var, int i3, ei.b bVar, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.x9 x9Var) {
        super(context, qt0Var, null, i3, true, bVar);
        this.f12821d0 = mVar;
        this.f12819b0 = e6Var;
        this.f12820c0 = x9Var;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m mVar = this.f12821d0;
        if ((mVar instanceof r) && ((r) mVar).O1) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void f() {
        super.f();
        ey emojiView = getEmojiView();
        if (emojiView != null) {
            m mVar = this.f12821d0;
            if (mVar.getEditTextStyle() == 2 || mVar.getEditTextStyle() == 3) {
                emojiView.f33592x0 = false;
                emojiView.f33598y2 = false;
                emojiView.setShouldDrawBackground(false);
                if (mVar instanceof sc) {
                    emojiView.setPadding(0, 0, 0, org.telegram.messenger.g0.f22603n);
                    emojiView.f33525c = 3;
                }
                emojiView.updateColors();
            }
        }
        if (emojiView != null) {
            emojiView.M2 = true;
            emojiView.setClipToOutline(true);
            emojiView.setOutlineProvider(new cg.p0(3));
        }
    }

    @Override
    public final void g(Canvas canvas, et etVar) {
        float W1;
        Bitmap bitmap;
        ?? r12;
        int i3;
        int i10;
        WindowInsets rootWindowInsets;
        et etVar2 = etVar;
        m mVar = this.f12821d0;
        eh.j jVar = mVar.d;
        RectF rectF = mVar.f13170z0;
        rectF.set(0.0f, 0.0f, etVar2.getWidth(), org.telegram.messenger.g0.L(29.0f) + etVar2.getHeight());
        int i11 = 0;
        if (mVar.f13147h0 != null) {
            if (this.f12818a0 == null) {
                if (Build.VERSION.SDK_INT >= 31 && (rootWindowInsets = getRootWindowInsets()) != null) {
                    RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                    RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                    if (roundedCorner == null) {
                        i10 = 0;
                    } else {
                        i10 = roundedCorner.getRadius();
                    }
                    if (roundedCorner2 == null) {
                        i3 = 0;
                    } else {
                        i3 = roundedCorner2.getRadius();
                    }
                } else {
                    i3 = 0;
                    i10 = 0;
                }
                gh.g c2 = mVar.f13147h0.c(etVar2, null, false);
                c2.p(cd.i(this.f12819b0));
                this.f12818a0 = c2;
                c2.t(org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(29.0f), i3, i10, true);
                gh.g gVar = this.f12818a0;
                gVar.T = true;
                gVar.u(org.telegram.messenger.g0.L(32.0f));
                gh.g gVar2 = this.f12818a0;
                gVar2.R.f12304g = 0.4f;
                gVar2.n();
            }
            Rect rect = org.telegram.messenger.g0.Q;
            rectF.round(rect);
            this.f12818a0.setBounds(rect);
            this.f12818a0.draw(canvas);
        } else if (mVar.g()) {
            if (this.W == null) {
                this.W = new org.telegram.ui.Components.ba(this.f12820c0, etVar2, 7, false);
            }
            mVar.h(this.W, canvas, mVar.f13170z0, org.telegram.messenger.g0.L(29.0f), false, 0.0f, -etVar2.getY(), false);
            jVar.f10061m = org.telegram.messenger.g0.L(29.0f);
            jVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, org.telegram.messenger.g0.L(29.0f) + ((int) rectF.bottom));
            jVar.draw(canvas);
        } else {
            Paint paint = mVar.f13142e;
            FrameLayout frameLayout = mVar.K;
            if (mVar.f13154o0 > 0.0f && mVar.f13162u0 != null && mVar.f13160s0 != null && (bitmap = mVar.f13158r0) != null && !bitmap.isRecycled()) {
                mVar.f13161t0.reset();
                mVar.f13161t0.postScale(frameLayout.getWidth() / mVar.f13158r0.getWidth(), frameLayout.getHeight() / mVar.f13158r0.getHeight());
                float f10 = 0.0f;
                float f11 = 0.0f;
                et etVar3 = etVar2;
                while (i11 < 8 && etVar3 != null) {
                    f10 += etVar3.getX();
                    f11 += etVar3.getY();
                    ViewParent parent = etVar3.getParent();
                    if (parent instanceof View) {
                        r12 = (View) parent;
                    } else {
                        r12 = 0;
                    }
                    i11++;
                    etVar3 = r12;
                }
                mVar.f13161t0.postTranslate(-f10, -f11);
                mVar.f13160s0.setLocalMatrix(mVar.f13161t0);
                mVar.f13162u0.setAlpha((int) (mVar.f13154o0 * 255.0f * 0.95f));
                canvas.drawRoundRect(rectF, 0.0f, 0.0f, mVar.f13162u0);
            }
            if (mVar.f13162u0 == null) {
                W1 = 128.0f;
            } else {
                W1 = org.telegram.messenger.g0.W1(mVar.f13154o0, 128, 153) * 0.95f;
            }
            paint.setAlpha((int) W1);
            canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        }
    }

    @Override
    public final void p() {
        this.f12821d0.M.a();
    }

    @Override
    public final void q(int i3, int i10) {
        this.f12821d0.s(i3, i10);
    }

    @Override
    public final boolean t(int i3) {
        m mVar = this.f12821d0;
        g gVar = mVar.f13144f;
        ObjectAnimator objectAnimator = mVar.f13146g0;
        if (objectAnimator != null && objectAnimator.isRunning() && i3 == mVar.f13140c0) {
            return false;
        }
        mVar.invalidate();
        if (mVar.f13136a0) {
            mVar.f13136a0 = false;
            if (mVar.f13138b0 != i3) {
                ObjectAnimator objectAnimator2 = mVar.f13146g0;
                if (objectAnimator2 == null || !objectAnimator2.isRunning() || i3 != mVar.f13140c0) {
                    ObjectAnimator objectAnimator3 = mVar.f13146g0;
                    if (objectAnimator3 != null) {
                        objectAnimator3.cancel();
                    }
                    gVar.getEditText().setScrollY(mVar.f13138b0);
                    xs editText = gVar.getEditText();
                    int i10 = mVar.f13138b0;
                    mVar.f13140c0 = i3;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", i10, i3);
                    mVar.f13146g0 = ofInt;
                    ofInt.setDuration(240L);
                    mVar.f13146g0.setInterpolator(xq.h);
                    mVar.f13146g0.addListener(new ai.e1(this, 18));
                    mVar.f13146g0.start();
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
        this.f12821d0.M.f13361e = true;
    }

    @Override
    public final void y() {
        this.f12821d0.M.a();
    }
}
